package triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteTriangulos {
	
	Triangulos triangulo = new Triangulos();

	@Test
	public void TesteTrianguloEquilatero() {
		int lado1 = 2;
		int lado2 = 2;
		int lado3 = 2;
		
		String resultado = triangulo.defineTipoTriangulo(lado1, lado2, lado3);
		assertEquals("Triângulo equilátero.", resultado);
	}
	
	@Test
	public void TesteTrianguloIsosceles() {
		int lado1 = 2;
		int lado2 = 4;
		int lado3 = 2;
		
		String resultado = triangulo.defineTipoTriangulo(lado1, lado2, lado3);
		assertEquals("Triângulo isósceles.", resultado);
	}
	
	@Test
	public void TesteTrianguloEscaleno() {
		int lado1 = 10;
		int lado2 = 4;
		int lado3 = 8;
		
		String resultado = triangulo.defineTipoTriangulo(lado1, lado2, lado3);
		assertEquals("Triângulo escaleno.", resultado);
	}
	
	@Test
	public void TesteTrainguloLadosNegativos() {
		int lado1 = -10;
		int lado2 = 4;
		int lado3 = 8;
		
		String resultado = triangulo.defineTipoTriangulo(lado1, lado2, lado3);
		assertEquals("Triângulo com lados negativos ou nulos não são possíveis.", resultado);
	}
}
