package ejrcicio1;

public class Serie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 0;
        int valor2 = 1;
        
        int suma = 0;

        int ciclos = 10;
        
        for (int i = 0; i < ciclos; i++) {
            System.out.println(valor1);
            suma = valor1 + valor2;
            valor1 = valor2;
            valor2 = suma;    
        }
	}

}
