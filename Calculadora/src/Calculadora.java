
public class Calculadora {

	
	public int somar(int x , int y){
		return x+y;
	}
	
	public int subtrair(int x,int y){
		return x-y;
	}
	
	public int multiplicar(int x, int y){
		return x*y;
	}
	
	public int dividir (int x, int y){
		return  x/y;
	}
	
	public int tempodeexecussao (){
		int contador=0; 
		while(contador<1000000000){
			contador++;
		}
		
		return 1;
	}

}

