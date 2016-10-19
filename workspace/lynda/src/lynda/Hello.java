package lynda;

public class Hello {
	private String greeter="Hello";
	public void greetEveryone(){
		System.out.println("hello how are you?");
		int a=1;
		int b=0;
		int c=a+b;
		System.out.println("sum of members"+c);
		
	}
	public String getGreeter() {
		return greeter;
	}
	public void setGreeter(String greeter) {
		this.greeter = greeter;
	}

}
