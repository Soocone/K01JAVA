package ex21jdbc.shopping;

import java.sql.SQLException;
import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl
{
	public InsertShop() {	
		super("kosmo", "1234");
	}
	
	public void execute()
	{
		String sql = "INSERT INTO sh_goods "
				+ "(seq_total_idx.nextval, ?, ?, SYSDATE, ?)";
		try {
			psmt = con.prepareStatement(sql);
			
			while(true) {
				psmt.setString(1, scanValue("상품명"));
				psmt.setString(2, scanValue("상품가격"));
				psmt.setString(3, scanValue("상품코드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected + "행이 업데이트되었습니다.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args)
	{
		new InsertShop().execute();
	}

}
