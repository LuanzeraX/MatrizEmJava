import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		String[] arrayProduto = new String[] {"Notebook","Computadores","Tablets","Servidores"};
		double[][] trimestre = new double[7][4];
		int indMaior=0, indMenor=0, valorMaior=0, valorMenor=0, indColuna=0;
		
		
			
			
			
			for(int tri=0;tri<4;tri++) {
		System.out.println("Vendas "+(tri+1)+"º tri:");
		for(int prod=0;prod<4;prod++) {
			System.out.println("Linha de Produtos: "+ arrayProduto[prod]);
		
		
		trimestre[tri][prod]=entrada.nextDouble();
						
				
			}
		System.out.println("");
		
		
		}
		for(int i=0;i<4;i++) {
			System.out.println("Meta de venda "+(i+1)+": ");
			trimestre[6][i]=entrada.nextDouble();
		}
		
		
		
		
		//A Soma das vendas por linha de produto "trava a coluna" 
		System.out.println("");
		for(int j=0;j<4;j++) {
		for(int i=0;i<4;i++) {		
		
				//Soma de linha de produto
				trimestre[5][j]+= trimestre[i][j];
						
			}
		System.out.println("Total de "+ arrayProduto[j] + "vendidos anualmente foi de" + trimestre[5][j]);
		
		}
		//B Soma as vendas por trimestre(coluna) "trava a linha
		for(int i=0;i<4;i++) {	
			for(int j=0;j<4;j++) {
				trimestre[4][i]+= trimestre[i][j];
								
			}
			System.out.println((i+1)+"º Tri: "+ trimestre[4][i]);
			
			
		}
		System.out.println("");
		//C Indentifique a melhor e a pior linha de produto no período;
		System.out.println("Identifique a Melhor e a Pior Linha");
		for(int j=0;j<4;j++) {
			if (indColuna ==0) {
				indMaior=indColuna;
				indMenor=indColuna;
				valorMaior = (int) trimestre[5][j];
				valorMenor = (int) trimestre[5][j];
				
				
			}else {
				if(trimestre[5][j]>valorMaior) {
					indMaior=indColuna;
					valorMaior = (int) trimestre[5][j];
				}
				if(trimestre[5][j]<valorMenor) {
					indMenor=indColuna;
					valorMenor = (int) trimestre[5][j];
			}
			
			
		}	
			
	}
		
		System.out.println("Linha "+ arrayProduto[indMaior] + " quantidade "+ valorMaior);
		System.out.println("Linha "+ arrayProduto[indMenor] + " quantidade "+ valorMenor);
		
		
//D Exibir uma lista identificando se o tri atingiu sua meta;
		
		System.out.println("Metas por tri");
		for (int j=0;j<4;j++) {
			if(trimestre[4][j] >= trimestre[6][j]) {
				System.out.println((j+1) + " Trimestre");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}}
