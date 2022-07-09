//try = tentar  (tente executar este código);
//catch = pegar;
//try e catch podem ser feitos em qualquer lugar;
// o "msg" apareceu para saber qual é a msg do ArithmeticException;
// o "printStackTrace" aparece para descobrir os rastros;
// pode criar qnts catchs quiser, desde que seja específico
//unchecked e checked
// unchecked não são verificadas pelo compilador
// checked são verificadas
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
	    	// agora com throws o método é verificado
	        System.out.println("Ini do metodo2");
	        
	        throw new MinhaExcecao("deu errado");
	        
	        //System.out.println("Fim do metodo2");
	    }
	    
}
