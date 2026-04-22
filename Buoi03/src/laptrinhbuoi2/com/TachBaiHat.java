package laptrinhbuoi2.com;

public class TachBaiHat {

	public static void main(String[] args) {
		String s = "D:/music/bolero/longme.mp3";
		String s1 = s.substring(16);
		String s2 = s.substring(16,22);
		try
		{	
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println(s1);
			System.out.println(s2);
		}
	}

}
