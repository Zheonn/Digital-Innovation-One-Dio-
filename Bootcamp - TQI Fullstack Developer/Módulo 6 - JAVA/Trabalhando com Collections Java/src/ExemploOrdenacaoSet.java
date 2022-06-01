import java.util.*;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("--\tOrdem Aleatória\t--");
		
		Set<Serie> minhasSeries = new HashSet<>(){{
			
		add(new Serie("Flash", "Fantasia", 40));
		add(new Serie("Arrow", "Ação", 40));
		add(new Serie("Stranger Things", "Terror", 70));
		
		}};
		
		for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
		+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem de Inserção\t--");
		
		Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
			
		add(new Serie("Flash", "Fantasia", 40));
		add(new Serie("Arrow", "Ação", 40));
		add(new Serie("Stranger Things", "Terror", 70));
		
		}};
		
		for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
		+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Natural (Tempo de Episodio)\t--");
		
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		
		for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
		+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Nome/Gênero/Tempo de Episódiot\t--");
		
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		
		minhasSeries3.addAll(minhasSeries);
		
		for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
		+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
	}

}

class Serie implements Comparable<Serie>{
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public String getGenero() {
		
		return genero;
		
	}

	public Integer getTempoEpisodio() {
	
	return tempoEpisodio;
	
	}
	
	@Override
	public String toString() {
		
		return "{" +
		"nome='" + nome + '\'' +
		", genero='" + genero + '\'' +
		", tempoEpisodio=" + tempoEpisodio +
		'}';
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	
	@Override
	public int compareTo(Serie serie) {
		
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		
		if(tempoEpisodio != 0) return tempoEpisodio;
		
		return this.getGenero().compareTo(serie.getGenero());

		
	}
	
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		
		int nome = s1.getNome().compareTo(s2.getNome());	
		
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());	
		
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	
	}
}
