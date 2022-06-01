import java.util.*;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{

			add(new Gato("Bolota", 14, "preto"));
			add(new Gato("Mia", 19, "branca"));
			add(new Gato("Bela", 25, "marrom"));
			
		}};

		System.out.println("---\tOrdem de Inserção\t---");
		System.out.println(meusGatos);
		System.out.println("---\tOrdem Aleatória\t---");
		
		Collections.shuffle(meusGatos);
		
		System.out.println(meusGatos);
		System.out.println("---\tOrdem Natural (Nome)\t---");
		
		Collections.sort(meusGatos);
		
		System.out.println(meusGatos);
		System.out.println("---\tOrdem Idade\t---");
		
		Collections.sort(meusGatos, new ComparatorIdade());

		System.out.println(meusGatos);
		System.out.println("---\tOrdem Cor\t---");
		
		Collections.sort(meusGatos, new ComparatorCor());
		
		System.out.println(meusGatos);
		System.out.println("---\tOrdem Nome/Cor/Idade\t---");
		
		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		
		System.out.println(meusGatos);
		
	}
		
}

class Gato implements Comparable<Gato>{
	
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public Integer getIdade() {
		
		return idade;
		
	}
	

	public String getCor() {
	
	return cor;
	
	}

	@Override
	public String toString() {
		
		return "{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", cor='" + cor + '\'' + 
				'}';
		
	}

	@Override
	public int compareTo(Gato gato) {
	
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
		
	}
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return g1.getCor().compareToIgnoreCase(g2.getCor());
		
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		
		if (cor != 0) return nome;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
		
	}
	
}