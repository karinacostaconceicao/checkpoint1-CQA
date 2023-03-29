package triangulo;

public class Triangulos {

	private int lado1;
	private int lado2;
	private int lado3;

	public Triangulos() {

	}

	public Triangulos(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public String defineTipoTriangulo(int lado1, int lado2, int lado3) {
		if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
			return "Triângulo com lados negativos ou nulos não são possíveis.";
		}

		if (lado1 == lado2 && lado2 == lado3) {
			return "Triângulo equilátero.";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "Triângulo isósceles.";
		} else {
			return "Triângulo escaleno.";
		}
	}

}
