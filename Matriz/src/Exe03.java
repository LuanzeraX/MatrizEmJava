import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMedia = new DecimalFormat("#0.0");
		
		
		double [][] notas= new double [3][4];
		
		for(int i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1));
			
		
		
		
		for(int j=0;j<3;j++) {
			System.out.println("Nota Prova "+(j+1)+":");
			
			notas[i][j]=entrada.nextDouble();
			
			notas[i][3]+=notas[i][j];
		
		
		}
		notas[i][3]=notas[i][3]/3;
		}
		for(int i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1)+":"+formataMedia.format(notas[i][3]));
		}
	}

}
