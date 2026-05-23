package domain;

public class Person {
	private int idperson;
	private String name;
	
	public int getIdperson()
	{
		return idperson;
	}
	
	public void setIdPerson(int idperson)
	{
		this.idperson = idperson;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	//@override
	public String toString()
	{
		return "person{"+ "idperson=" + idperson + ", name =" + name + '}';
	}

}