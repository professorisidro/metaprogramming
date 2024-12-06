
public class MainClass {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.setAddress("1234 St");
		c.setNumber(9876);
		c.setName("John Doe");
		c.setEmail("john@doe.com");
		
		System.out.println(XMLGenerator.toXML(c));
		
		Product p = new Product();
		p.setId(1001);
		p.setName("Computer");
		p.setPicture("computer.png");
		p.setPrice(1500.0);
		
		System.out.println(XMLGenerator.toXML(p));
	}
}
