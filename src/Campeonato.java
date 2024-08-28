
public class Campeonato {

	Clube[] clubes;
	
	Campeonato(Clube[] times) {
		clubes = times;
	}
	
	public void jogarPartida(Clube a, Clube b) {
		int pontA = (int)(Math.random() * 6);
		int pontB = (int)(Math.random() * 6);
		System.out.println(a.nome + " " + pontA + ":" + pontB + " " + b.nome);
		if (pontA > pontB) {
			a.ganhar(pontA - pontB);
			b.perder(pontB - pontA);
		} else if (pontA < pontB) {
			a.perder(pontA - pontB);
			b.ganhar(pontB - pontA);
		} else {
			a.empatar();
			b.empatar();
		}
	}
	
	public void jogarCampeonato() {
		for (Clube clube1 : clubes) {
			for (Clube clube2 : clubes) {
				if (clube1 != clube2) {
					jogarPartida(clube1, clube2);
				}
			}
		}
	}
	
	public void getClassificacao() {
		for (int i = clubes.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (clubes[j].pontos > clubes[j+1].pontos) {
					Clube temp = clubes[j];
					clubes[j] = clubes[j+1];
					clubes[j+1] = temp;
				} else if (clubes[j].pontos == clubes[j+1].pontos) {
					if (clubes[j].saldoGols > clubes[j+1].saldoGols) {
						Clube temp = clubes[j];
						clubes[j] = clubes[j+1];
						clubes[j+1] = temp;
					}
				}
			}
		}
		System.out.println("--------------");
		System.out.println("Classificação:");
		System.out.println("--------------");
		for (int i = 0; i < clubes.length; i++) {
			System.out.println(i+1 + ") " + clubes[i].nome);
		}
	}
	
	public void getCampeao() {
		System.out.println("Parabéns ao clube " + clubes[0].nome + " pela vitória!!!!");
	}
	
}
