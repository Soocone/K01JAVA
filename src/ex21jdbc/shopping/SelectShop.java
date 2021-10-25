package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Statement;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl
{
	public SelectShop() {
		super("kosmo", "1234");
	}
	

	@Override
	public void execute()
	{
		try {
			Statement stmt;
			stmt= con.createStatement();
			
			String query = "SELECT g_idx, goods_name, "
					+ " to_char(goods_price,  '9,999,000'), "
					+ " to_char(regidate, 'yyyy-mm-dd hh:mi'), p_code "
					+ " FROM sh_goods";
			
			String searchStr = scanValue("검색할 상품명");
			if(searchStr!=null) {
				query = query + " AND goods_name LIKE '%" + searchStr + "%' ";
			}
			
			query = query + " ORDER BY g_idx DESC";
			
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int g_idx = rs.getInt("g_idx"); 
				String goods_name = rs.getString("goods_name"); 
				String goods_price = rs.getString(3);
				//java.sql.Date regidate = rs.getDate(4);
				String regidate = rs.getString(4).substring(0,13);
				String p_code = rs.getString(5);
				
				System.out.printf("%s %s %s %s %s \n",
						g_idx, goods_name, goods_price, regidate, p_code);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리 오류 발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args)
	{
		new SelectShop().execute();
	}
}
