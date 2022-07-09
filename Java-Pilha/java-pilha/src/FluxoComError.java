//try = tentar  (tente executar este código);
//catch = pegar;
//try e catch podem ser feitos em qualquer lugar;
// o "msg" apareceu para saber qual é a msg do ArithmeticException;
// o "printStackTrace" aparece para descobrir os rastros;
// pode criar qnts catchs quiser, desde que seja específico
public class FluxoComError {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
	        } catch (ArithmeticException | NullPointerException ex) {
	        	String msg = ex.getMessage();
	        	System.out.println("Exception " + msg);
	        	ex.printStackTrace();
	        } 

	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();     
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("chamando metódo 2");
	        metodo2();
	        System.out.println("Fim do metodo2");
	    }
	    
}
