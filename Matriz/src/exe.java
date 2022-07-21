import java.util.Scanner;

public class exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int[][] arrayNumero =new int[2][2];
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int somaLinha = 1, somaMatriz = 0, somaColuna=1,maiorElemento=5;
		
	
		for(int i=0; i <2;i++) {
			for(int j=0; j <2;j++) {
				System.out.println("Informe um número M[" + (i+1)+ ","+(j+1)+"]=");
			arrayNumero[i][j]=entrada.nextInt();
				
				if(arrayNumero[i][j] < maiorElemento) {
				maiorElemento= arrayNumero[i][j];
			}
			System.out.println(maiorElemento);
			}
		
		
	}
	}
}
