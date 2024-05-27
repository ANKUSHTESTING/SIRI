package LOCAL_VARIABLES;

public class local {
	public static void main(String[]siri) {
		int i=10;//we can reinitialize the local variable//if we use the keyword final we can not reinitialize
		i=20;
		i=30;
		i=40;
		System.out.println(i);//here 40 will print because the previous data will delete automatically
	}

}
