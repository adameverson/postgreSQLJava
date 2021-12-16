import java.sql.ResultSet;

public class Principal {
	public static void main(String[] args) {
		conexao con = new conexao();
		
		/*
		String sql = "INSERT INTO public.categoria(descricao)"
				+ " VALUES ('Padaria');";
		int res = con.executaSQL(sql);
		if(res > 0) {
			System.out.println("Cadastrado com Sucesso!!!");
		}else {
			System.out.println("Erro durente o Cadastro!!!");
		}
		*/
		
		
		String sql = "SELECT * FROM public.categoria";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				String descricao = rs.getString("descricao");
				int status = rs.getInt("status");
				System.out.println(id+" - "+descricao+" - "+status);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
