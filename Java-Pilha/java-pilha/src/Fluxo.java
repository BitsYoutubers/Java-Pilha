//try = tentar  (tente executar este c�digo);
//catch = pegar;
//try e catch podem ser feitos em qualquer lugar;
// o "msg" apareceu para saber qual � a msg do ArithmeticException;
// o "printStackTrace" aparece para descobrir os rastros;
// pode criar qnts catchs quiser, desde que seja espec�fico
//unchecked e checked
// unchecked n�o s�o verificadas pelo compilador
// checked s�o verificadas
public class Fluxo {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
	        } catch (Exception ex) {
	        	String msg = ex.getMessage();
	        	System.out.println("Exception " + msg);
	        	ex.printStackTrace();
	        } 

	        System.out.println("Fim do main");
	    }

	    private static void metodo1() throws MinhaExcecao {
	        System.out.println("Ini do metodo1");
	        metodo2();     
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() throws MinhaExcecao {
	    	// agora com throws o m�todo � verificado
	        System.out.println("Ini do metodo2");
	        
	        throw new MinhaExcecao("deu errado");
	        
	        //System.out.println("Fim do metodo2");
	    }
	    
}
