import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X = 10;
		int Y = 5;
		double N = 3.7;
		double M = 6.2;
		int r;
		double r2;
		
		//valores de variables
		System.out.println("valor de X =" +X);
		System.out.println("valor de Y =" +Y);
		System.out.println("valor de N =" +N);
		System.out.println("valor de M =" +M);
		
		//operaciones
		System.out.println("suma X + Y = " + (r=X+Y));
		System.out.println("diferencia de X - Y = " + (r=X-Y));
		System.out.println("producto de X * Y = " + (r=X*Y));
		System.out.println("cociente de X / Y = " + (r=X/Y));
		System.out.println("resto de X%Y = " + (r=X%Y));
		System.out.println("suma N + M = " + (r2=N+M));
		System.out.println("diferencia de N - M = " +(r2=N+M));
		System.out.println("producto de N * M = " + (r2=N*M));
		System.out.println("cociente de N / M = " + (r2=N/M));
		System.out.println("resto de N%M = " + (r2=N%M));
		System.out.println("suma de X + N = " +(r2=X+N));
		System.out.println("cociente de Y / M = " +(r2=Y/M));
		System.out.println("resto de Y % M = " +(r2=Y%M));
		System.out.println("doble de X= " + (r=X*2));
		System.out.println("doble de Y= " + (r=Y*2));
		System.out.println("doble de N= " + (r2=N*2));
		System.out.println("doble de M= " + (r2=M*2));
		System.out.println("suma de todas las variables = " +(r2=X+Y+N+M));
		System.out.println("producto de todas las variables = " + (r2=X*Y*N*M));
		

	}

}
