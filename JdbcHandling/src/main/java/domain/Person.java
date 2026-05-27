package domain;

public class Person {
	private int idPerson;
	private String name;
	
	public int getIdperson()
	{
		return idPerson;
	}
	
	public void setIdPerson(int idperson)
	{
		this.idPerson = idperson;
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
		return "person{"+ "idperson=" + idPerson + ", name =" + name + '}';
	}

}