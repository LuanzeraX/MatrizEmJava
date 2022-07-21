import java.text.DecimalFormat;
import java.util.Scanner;

public class LuanSantos {

	public static void main(String[] args) {
		// RM: 87153
		// Luan de Lima Santos

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		DecimalFormat numIntFormatado = new DecimalFormat("#,##0");
		
		String[] revistas = new String[] {"Veja","QuatroRodas","VC s/a"};
		String[] estados = new String[] {"São Paulo", "Minas Gerais","Rio de Janeiro"," Espírito Santo"};
		double[][] qtdVenda = new double[4][3];
		int indMelhor=0, indPior=0,indColuna=0,valorMaior=0, valorMenor=0, maiorCir=0,somaColuna=0;
		
		
		
		
		
		for(int i=0;i<4;i++) {
			System.out.println("");
			System.out.println("Estado : "+ estados[i]);
			System.out.println("");
			for(int j=0;j<3;j++) {
				System.out.println("Quantidade de Vendas da Revista "+ revistas[j]+": ");
				qtdVenda[i][j]=entrada.nextDouble();
						
				
				
			}
		}
		
		
		
		//A)
		System.out.println("Percentual de Vendas por Revista no Mês");
		
		
		
		
		
		
		

		
		
		
		
		
		
		//B)
		System.out.println("");
		System.out.println("Região Sudeste:");
		System.out.println("");
		for(int i=0; i<4;i++) {
		for(int j=0;j<4;j++) {
			
			
			if (i ==0) {
				indMelhor=i;
				indPior=i;
				valorMaior = (int) qtdVenda[4][j];
				valorMenor = (int)qtdVenda[4][j];
				
				
			}else {
				if(qtdVenda[i][j]>valorMaior) {
					indMelhor=i;
					valorMaior = (int) qtdVenda[4][j];
				}
				if(qtdVenda[i][j]<valorMenor) {
					indPior=i;
					valorMenor = (int) qtdVenda[4][j];
			}


			}	

			}

		
		System.out.println("Região Sudeste");
		System.out.println("Estado com melhor venda:" + estados[indMelhor]);
		
		}
		
		
		
		
		
		//C)
		System.out.println("Por revista o estado com melhor circulação");
		
		for( int j=0;j<4;j++) {
			for(int i=0;i<4;i++) {
				qtdVenda[j][i]+=qtdVenda[i][j];
				System.out.println(qtdVenda[j][i]);
				
			}
		}
		
		
		
		
		}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}


