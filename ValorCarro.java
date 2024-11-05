package avaliativa;
import java.util.Scanner;

public class ValorCarro {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	double valorFabrica;
	int Imposto;
	double valorVeiculo;
	
	System.out.println("digite o valor do carro para caucular o valor do imposto");
	valorFabrica = scanner.nextDouble();
	
	System.out.println("o valor do imposto sera de");
	Imposto =  scanner.nextInt();
	
	System.out.println("agora iremos caucular o imposto sobre o seu veiculo");
	
	valorVeiculo = (int) (valorFabrica * Imposto / 100);
	
	System.out.print("o valor do seu veiculo sera de: " + valorVeiculo);
	
	scanner.close();
	
	
	
	
	
	
	
	
	
	

	
	
	
    
    		
	
	
		
		

	}

}
