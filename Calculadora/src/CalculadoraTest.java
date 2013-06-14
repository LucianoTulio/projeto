import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculadoraTest {
	
	Calculadora calculadora; 
	
	@BeforeClass
	public static void init(){

			System.out.println("Método executa antes da classe, parecido como contrutor.");
	}
	
	@Before
	public void executaAntesDeCadaMetodo(){
		calculadora = new Calculadora();
		System.out.println("Antes de executar os métodos, zerando as variaveis");
	}
	

	
	@After
	public void executaDepoisDeCadaMetodo(){
		System.out.println("\n\nDepois que executa os métodos\n\n");
	}
	
	@AfterClass
	public static void executaDepoisDaClasse(){
		System.out.println("Metodo executado depois de toda a classe de teste");
	}
	
	@Test
	public void somar() {
		assertEquals("Passou com sucesso", 4, calculadora.somar(2, 2));
		
		System.out.println("\n\n método de soma\n\n");
	}
	
	@Test
	public void subtrair() {
		assertEquals("Passou com sucesso", 0, calculadora.subtrair(2, 2));
		
		System.out.println("\n\n método de subtrair \n\n");
	}
	
	@Test
	public void multiplicar() {
		assertEquals("Passou com sucesso", 4, calculadora.multiplicar(2, 2));
		
		System.out.println("\n\n método de multiplicar \n\n");
	}
	
	@Test
	public void dividir() {
		assertEquals("Passou com sucesso", 1 , calculadora.dividir(2, 2));
		
		System.out.println("\n\n método de dividir \n\n");
	}
	
	@Test(timeout=1) 
	public void tempodeexecussao(){
		assertEquals("tempo certo",1, calculadora.tempodeexecussao());
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void dividirComException() {
		assertEquals("Passou com sucesso", 3 , calculadora.dividir(2, 0));
		
		System.out.println("\n\n método de dividir \n\n");
	}
	
	
	@Ignore
    @Test
    public void testeIgnorado() {
        System.out.println("Método Não Executara por causa do metadados @Ignore");
        fail("@Ignore não executara JUnit4");
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
