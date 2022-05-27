package one.digitalinnovation.basecamp;

public class Mensagem {
	
		public static void obterMensagem(int hora) {
			
			if(hora > 5 && hora < 12) {
				mensagemBomDia();
			} else if (hora > 11 && hora < 18) {
				mensagemBoaTarde();
			}else if (hora > 18 || hora < 5) {
				mensagemBoaNoite();
			}else {
				System.out.println("Horário Inválido");
			}
		
		}
		
		public static void mensagemBomDia() {
			
			System.out.println("Bom Dia!");
			
		}

		public static void mensagemBoaTarde() {
			
			System.out.println("Boa Tarde!");
			
		}

		public static void mensagemBoaNoite() {
			
			System.out.println("Boa Noite!");
			
		}
	
}


