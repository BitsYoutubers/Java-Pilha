// o finally far� com que o c�digo seja executado com ou sem erro
// try precisa de catch ou finally
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalAccessError ex) {
			System.out.println("Deu erro na conex�o");
		}
		
		//------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			System.out.println("Finally");
//			if(con != null) {
//			  con.fecha();
//			}
//		}

	}

}
