
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int temporal; // Variable temporal para almacenar un valor

        temporal = a;
        a = d;
        d = b;
        b = c;
        c = temporal;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

	}

}
