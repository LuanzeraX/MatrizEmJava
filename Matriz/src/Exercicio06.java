import java.text.DecimalFormat;
import java.util.Scanner;


//1SIF 
//Sala 2
//Luan de Lima Santos RM:87153
//Lucas Min Han RM:89075
//Yasmim Rodrigues Bussoni RM:88655





public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		
		String nomeProd[] = new String[5];
		int precoProd[][]= new int [5][4];
		int custoTrans[]= new int[5];
		int[][] impostoProd = new int[5][4];
		int precoFinal=0;
		
		
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Informe o nome do produto "+(i+1)+": ");
			nomeProd[i]=entrada.next();
			System.out.println("Informe o custo do transporte do produto "+(i+1)+": ");
			custoTrans[i]=entrada.nextInt();
			
			for(int j=0;j<4;j++) {
				
				
			
				
			}
			}
		
		for(int i=0;i<5;i++) {
			
			
			System.out.println("---------------------------------------------");
			System.out.println("Informe o preço do produto: "+nomeProd[i]);
			System.out.println("---------------------------------------------");
			
			for(int j=0;j<4;j++) {
				
				System.out.println("-Preço do Produto na loja "+(j+1)+": ");
				precoProd[i][j]=entrada.nextInt();
						
			}
			
			}
		System.out.println("---------------------------------------------");
		
		
		
		
		
		for(int i=0;i<5;i++) {
			
			
			for(int j=0;j<4;j++) {
				
				if(precoProd[i][j] <=50) {
					impostoProd[i][j]= (int) (precoProd[i][j] * 0.05);
					
				
				}else {
					if((precoProd[i][j] >50) && (precoProd[i][j] <=100)) {
						impostoProd[i][j] = (int) (precoProd[i][j] * 0.10);
					}else {
						impostoProd[i][j] = (int) (precoProd[i][j] * 0.20);
					}
				}
			}
		}
				for(int i=0;i<5;i++) {
					System.out.println("Nome do produto: "+ nomeProd[i]+" - "+"Custo do transporte: "+ numFormatado.format(custoTrans[i]));
					
				for(int j=0;j<4;j++) {
					
					precoFinal= precoProd[i][j] + impostoProd[i][j] + custoTrans[i];
				
				
				System.out.println("----------Loja: "+ (j+1)+"----------");
				System.out.println("--------Imposto: " + numFormatado.format(impostoProd[i][j]));
				System.out.println("Preço: "+ numFormatado.format(precoProd[i][j]));
				System.out.println("Preço total"+ numFormatado.format(precoFinal));
				
				
				
				
				
				
				
				
				
			}}
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


