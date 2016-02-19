package bd2.tests;

import junit.framework.TestCase;
import bd2.model.*;
import java.util.Calendar;
import java.util.Date;

public class ModeradorTest extends TestCase {

	private Moderador sven, kurt, jens;
	private Date hoy, ayer, hace1Anho;
	private Documento manualIkea;
	private Parrafo manualIkeaIntro;
	private Traduccion suecoAIngles;
	private Idioma sueco, ingles;

	protected void setUp() throws Exception {
		super.setUp();
		// Fechas
		Calendar cal = Calendar.getInstance();
		hoy = cal.getTime();
		cal.add(Calendar.DATE, -1);
		ayer = cal.getTime();
		cal.add(Calendar.YEAR, -1);
		hace1Anho = cal.getTime();
		sueco = new Idioma("Sueco");
		ingles = new Idioma("Inglés");
		manualIkea = new Documento("Manual de Ikea", sueco);
		manualIkeaIntro = new Parrafo(
				"Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Nullam quis risus eget urna mollis ornare vel eu leo. Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.",
				manualIkea);
		suecoAIngles = new Traduccion(ayer, "Sueco a Inglés", true, "Furniture is good", manualIkeaIntro, ingles);
		Moderador sven = new Moderador("sven@polyglot.com", "Sven Knutsen", hace1Anho);
	}

	public void testAgregarIdioma() {
		this.assertTrue(sven.getIdiomas().isEmpty());
		this.assertFalse(sven.manejaIdioma(sueco));
		sven.agregarIdioma(sueco);
		this.assertTrue(sven.manejaIdioma(sueco));
		sven.agregarIdioma(ingles);
		this.assertTrue(sven.manejaIdioma(sueco));
		this.assertTrue(sven.manejaIdioma(ingles));
		this.assertEquals(sven.getIdiomas().size(), 2);
	}

	public void testEvaluar() {
		int reputacionPrevia = sven.reputacion();
		try {
			sven.evaluar(suecoAIngles, 8);
			fail("Evaluar documentos de idiomas que el moderador no maneja debería fallar.");
		} catch (Exception e) {
			this.assertEquals("No se pueden evaluar traducciones de idiomas que el moderador no maneja.",
					e.getMessage());
			this.assertEquals(reputacionPrevia, sven.reputacion());
			this.assertTrue(sven.getEvaluaciones().isEmpty());
		}
		sven.agregarIdioma(sueco);
		try {
			sven.evaluar(suecoAIngles, 8);
			fail("Evaluar documentos de idiomas que el moderador no maneja debería fallar.");
		} catch (Exception e) {
			this.assertEquals("No se pueden evaluar traducciones de idiomas que el moderador no maneja.",
					e.getMessage());
			this.assertEquals(reputacionPrevia, sven.reputacion());
			this.assertTrue(sven.getEvaluaciones().isEmpty());
		}
		sven.agregarIdioma(ingles);
		sven.evaluar(suecoAIngles, 8);
		this.assertEquals(sven.reputacion(), reputacionPrevia + 1);
		this.assertEquals(sven.getEvaluaciones().size(), 1);
	}

}
