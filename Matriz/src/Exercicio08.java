import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		DecimalFormat numIntFormatado = new DecimalFormat("#,##0");
		
		double[][] arrayEstoqueProduto = new double [5][3];
		double totArmazem=0, maiorEstoque=0, menorEstoque=0, maiorArmazem=0, menorArmazem=0;
		double qtdeTotalProduto =0, custoTotalProduto=0, custoTotalArmazem=0;
		
		
		
		
		//Entrada de Dados - Estoque atual de produtos
		
		for(int i=0; i<4; i++) {
			System.out.println("--- Estoque no armazém ( "+(i+1)+" ) ---");
			
			for(int j=0;j<3;j++) {
				System.out.println("-- Informe a quantidade em estoque do Produto ( " +(j+1)+ " ) :");
				arrayEstoqueProduto[i][j] = entrada.nextDouble();
			}
		}
	
		System.out.println("");
		System.out.println("--------------Custo de cada produto-------------");
		System.out.println("");
		
		//Entrada de Dados - Custo de cada Produto - armazenado na 5ª linha da matriz
		
		for(int i=0;i<3;i++) {
			System.out.println("--- Informe o custo do Produto ( "+(i+1)+" ) : ");
			arrayEstoqueProduto[4][i] = entrada.nextDouble();
		}
		
		//Saida de Dados - A quantidade de itens armazenados em cada armazém
		System.out.println("");
		System.out.println("----------------- Quantidade de itens em cada armazém --------------");
		System.out.println("");
		
		for(int i=0;i<4;i++) {
			
			totArmazem =0;
			
			for(int j=0; j<3; j++) {
				totArmazem = totArmazem + arrayEstoqueProduto[i][j];
			}
			
			System.out.println("--- Estoque no armazém ( "+(i+1)+" ) : \t" + numIntFormatado.format(totArmazem));
			
		}
		
		//Saída de Dados -  Qual armazém possui maior estoque do produto 2
		System.out.println("");
		System.out.println("----------------- Armazém com maior estoque do produto 2 ---------------");
		System.out.println("");
		
		for(int i=0; i<4; i++) {
			if(i==0) {
				
				maiorEstoque = arrayEstoqueProduto[i][1];
				maiorArmazem = i+1;
			}else {
				if(arrayEstoqueProduto[i][1]> maiorEstoque) {
					
					maiorEstoque = arrayEstoqueProduto[i][1];
					maiorArmazem = i+1;
				}
			}
		}
		
		System.out.println("--- Armazém ( "+ numIntFormatado.format(maiorArmazem) + " ) - Quantidade em estoque: " + numIntFormatado.format(maiorEstoque));
		
		
		//Saída de Dados - Qual armazém possui menor estoque
		System.out.println("");
		System.out.println("----------------Armazém com menor estoque-------------");
		System.out.println("");
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<3;j++) {
				
				if(i==0 && j==0) {
					
					menorEstoque = arrayEstoqueProduto[i][j];
					menorArmazem = i+1;
				}else {
					if(arrayEstoqueProduto[i][j] < menorEstoque) {
						menorEstoque = arrayEstoqueProduto[i][j];
						menorArmazem = i+1;
					}
				}
			}
		}
		
		System.out.println("--- Armazém ( "+ numIntFormatado.format(menorArmazem)+ " ) - Quantidade em estoque: "+ numIntFormatado.format(menorEstoque));
		
		// Saída de Dados - Qual o custo total de cada produto
		System.out.println("");
		System.out.println("----------- Custo total de cada produto ----------");
		System.out.println("");
		
		for(int i=0; i<3; i++) {
			qtdeTotalProduto=0;
			for(int j=0; j<4;j++) {
				qtdeTotalProduto = qtdeTotalProduto + arrayEstoqueProduto[j][i];
			}
			
			
				custoTotalProduto = qtdeTotalProduto * arrayEstoqueProduto[4][i];
				System.out.println(" Custo total do produto ( "+(i+1)+ " ): "+ numFormatado.format(custoTotalProduto));
				
		}
		
		//Saída de Dados - Qual o custo total de cada armazém
		System.out.println("");
		System.out.println("-------------------- Custo total de cada armazém ---------------");
		System.out.println("");
		
		
		for(int i=0; i<4; i++) {
			custoTotalArmazem=0;
			for(int j=0; j<3; j++) {
				
				custoTotalArmazem = custoTotalArmazem + (arrayEstoqueProduto[i][j] * arrayEstoqueProduto[4][j]);
				
			}
			
			System.out.println(" Custo total no armazém ( "+(i+1)+ " ): "+ numFormatado.format(custoTotalArmazem));
			
			
		}
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		

		

	}

}






















