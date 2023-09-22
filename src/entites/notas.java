package entites;

public class notas {

	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaMedia() {
		return nota1 + nota2 + nota3;
	}
	
	public double missing() {
		if (notaMedia() < 60.0) {
			return 60 -notaMedia();
		}
		else {
			return 0.00;
		}
	}
}
