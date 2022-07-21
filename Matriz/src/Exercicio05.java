import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int [][]anual=new int[5][3];
		int[][] priSem=new int[5][3];
		int[][] segSem=new int[5][3];
		int[] vetorUni = new int[3];
		int curso = 0;
		int somaUni=0;
		
		
		System.out.println("---------------1º Semestre---------------");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
			System.out.println("Digite o número de inscritos 1º Semestre do curso "+(i+1)+" na unidade "+(j+1)+":");
			priSem[i][j]=entrada.nextInt();
			
			
		}
			
			
		}
		
System.out.println("---------------2º Semestre---------------");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
			System.out.println("Digite o número de inscritos 2º Semestre do curso "+(i+1)+" na unidade "+(j+1)+":");
			segSem[i][j]=entrada.nextInt();
			
			
		}
			
			
		}
		
		
		
			
			
			
		//a	
			
			System.out.println("Quantidade de alunos por curso e unidade no ano");
			for(int i=0;i<5;i++) {
				for(int j=0;j<3;j++) {
					System.out.println("Curso:"+(j+1));
					System.out.println("Quantidade de matrículas unidade:"+(j+1));
					anual[i][j]=priSem[i][j]+segSem[i][j];
			}
				
			}
			
			for(int i=0;i<5;i++) {
				System.out.println(" ");
				System.out.println("Curso "+(i+1));
				for(int j=0;j<3;j++) {
					System.out.println("Quantidade de matrículas unidade "+(j+1)+" : "+anual[i][j]);
					
							}
				
				}
			
			//b
			System.out.println("------------------------------------------");
			System.out.println("quantidade de matrículas por unidade");
			System.out.println("------------------------------------------");
			for(int i=0;i<3;i++) {	
				
				for(int j=0;j<5;j++) {
					vetorUni[i]+=anual[j][i];	
				
			}
				System.out.println("Quantidade de matriculas da unidade "+vetorUni[i]);
			}
		
			//c
			
			System.out.println("------------------------------------------");
			System.out.println("quantidade de matrículas por curso");
			System.out.println("------------------------------------------");
			
			
			
			
for(int i=0;i<5;i++) {	
				
				for(int j=0;j<3;j++) {
			curso+=anual[i][j];
			
					
					
					
					
				}
				
				System.out.println("quantidade de matrículas por curso"+(i+1)+": "+curso);
				

}
		
		
	}

}
