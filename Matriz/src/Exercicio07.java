import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		
		String nomeCid[]= new String[5];
		int distCid[][]= new int[5][5];
		double consumoV=0, qtdCombus=0;
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("Nomes das Cidades");
		System.out.println("---------------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.println("Informe o nome da "+(i+1)+"º Cidade: ");
			nomeCid[i]=entrada.next().toUpperCase();
			
			
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Distância entre as cidades");
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<5;i++) {
					
			for(int j=0;j<5;j++) {
				if (i==j) {
					distCid[i][j]=0;
				}else {
				
				System.out.println("Informe a distância entre a cidade ("+nomeCid[i]+") e a cidade ("+(nomeCid[j])+") :");
				distCid[i][j]=entrada.nextInt();
			}
		}
		
		
	}
		System.out.println("---------------------------------------------");
		System.out.println("Consumo de combustivel por um veiculo");
		System.out.println("---------------------------------------------");
		
		
		System.out.println("Informe o consumo de um veículo:");
		consumoV= entrada.nextDouble();
		
		
		System.out.println("---------------------------------------------");
		System.out.println("Percursos inferiores a 250km");
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				if( distCid[i][j] <= 250) {
					System.out.println("--Distancia:" + distCid[i][j]+"  km - entre a cidade ("+nomeCid[i]+") e ("+nomeCid[j]+")" );	
				}
			}
			}
			System.out.println("---------------------------------------------");
			System.out.println("Consumos por percurso");
			System.out.println("---------------------------------------------");
		
			
			
			
			
			for(int i=0;i<5;i++) {
				
				for(int j=0;j<5;j++) {
					qtdCombus= distCid[i][j] / consumoV;
					
					System.out.println("consumo entre a cidade (" + nomeCid[i]+") e (" + nomeCid[j] + ")   é:"+ numFormatado.format(qtdCombus));
					
				}
					
				}
				
				
				
				entrada.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
		
		
	}


