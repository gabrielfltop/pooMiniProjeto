
public class Clube {

	String nome;
	int pontos;
	int saldoGols;
	
	Clube(String n) {
		nome = n;
		pontos = 0;
		saldoGols = 0;
	}
	
	public void ganhar(int s) {
		pontos += 3;
		saldoGols += s;
	}
	
	public void empatar() {
		pontos += 1;
	}
	
	public void perder(int s) {
		saldoGols += s;
	}
	
}
