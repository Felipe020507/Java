package principal;

public class Exercicio1 {
	 public static void metodo1() {
	        System.out.println("In�cio do m�todo1.");
	        int[] vetor = new int[5];
	        try {
	            for (int i = 0; i < 10; i++) {
	                vetor[i] = i;
	                System.out.println(i);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Inicio do metodo 2");
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("In�cio da main.");
	        metodo1();
	        System.out.println("Fim da main.");
	    }
	}


