
public class Teste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clube flamengo = new Clube("Flamengo");
		Clube palmeiras = new Clube("Palmeiras");
		Clube saopaulo = new Clube("São Paulo");
		Clube corinthians = new Clube("Corinthians");
		Clube ceara = new Clube("Ceará");
		
		Clube[] clubes = new Clube[5];
		clubes[0] = flamengo;
		clubes[1] = palmeiras;
		clubes[2] = saopaulo;
		clubes[3] = corinthians;
		clubes[4] = ceara;
		
		Campeonato brasileirao = new Campeonato(clubes);
		brasileirao.jogarCampeonato();
		brasileirao.getClassificacao();
		brasileirao.getCampeao();
	}

}