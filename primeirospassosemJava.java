package cursojava;

public class Fundamentos {

	public static void main(String[] args) {
		int idade = 26;
		char sexo = 'M';
		double temperatura = 16;
		boolean arCondicionado = false;
		String nome = "João Lyncoln Rodrigues";
		System.out.println("Uso de variaveis na linguagem Java");
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("idade :" + idade);
		System.out.println("sexo :" + sexo );
		System.out.println("temperatura: " + temperatura);
		System.out.println("ar condicionado:" + arCondicionado);
		System.out.println("___________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores aritimeticos e atribuições");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i =" + i + " + 5 | i = " + (i + 5));
		System.out.println("i =" + i + " - 5 | i = " + (i - 5));
		System.out.println("i =" + i + " / 5 | i = " + (i / 5));
		System.out.println("i =" + i + " % 5 | i = " + (i % 5));
		System.out.println("i =" + i + " * 5 | i = " + (i * 5));
		System.out.println("i += 5             |i = " + (i += 5));
		System.out.println("i -= 5             |i = " + (i -= 5));
		System.out.println("i *= 5             |i = " + (i *= 5));
		System.out.println("i /= 5             |i = " + (i /= 5));
		i++;
		System.out.println("i++                | i = " +i);
		i--;
		System.out.println("i--                | i = " +i);
		System.out.println(" ");
		System.out.println("Operadores controles condicionais");
		System.out.println("");
		System.out.println("Exemplo 1");
		System.out.println("Uso do if");
		if (sexo == 'M');{
			System.out.println("Alistamento mititar obrigadotio");
		}
		System.out.println("");
		System.out.println("Exemplo 2");
		System.out.println("'if - else'");
		if (idade < 18){
			System.out.println("Menor de idade");
		}else {
			System.out.println("Maior de idade");
		}
		System.out.println("Exemplo 3");
		System.out.println("Uso do 'else - if'");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade > 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATORIO");
		} else if (idade == 16 || idade == 17 ||idade > 70) {
			System.out.println("VOTO FACULTATIVO");
		}
		System.out.println("");
		System.out.println("Exemplo 4");
		System.out.println(" switch case");
		System.out.println("1 Cadastro clientes");
		System.out.println("2 cadastro usuarios");
		System.out.println("3 Relatorios");
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUARIOS");
			break;
		case 3:
			System.out.println("RELATORIOS");
			break;
		default:
			System.out.println("INVALIDO");
			break;
		}
		System.out.println("");
		System.out.println("Estrutura de repetições");
		System.out.println("");
		System.out.println("Exemplo 5");
		System.out.println("Uso do 'for'");
		for (int j = 10; j > 0; j --) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 6");
		System.out.println("tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + "x" + valor + "=" + (tabuada * valor));	
			}
		}
		System.out.println("");
		System.out.println("Exemplo 7");
		System.out.println("Uso do 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8");
		System.out.println("Uso das estruturas while");
		char novoJogo;
		do {
			System.out.println("Deseja jogar agora? (S/N)");
			novoJogo = 'N';	
		} while (novoJogo == 'S');
		System.out.println("se fudeu");
		}
	}
