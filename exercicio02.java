package loopings;
import java.util.StringTokenizer;
public class exercicio02 {

	public static void main(String[] args) {
		String str = "Hello World World2";
		String resultado = str.substring(3,8);
		
		System.out.println(resultado);
		
		String resultado2 = str.toUpperCase();
		System.out.println(resultado2);
		
		String resultado3 = str.toLowerCase();
		System.out.println(resultado3);
		
		String resultado4 = str.trim();
		System.out.println(resultado4);
		
		char resultado5 = str.charAt(1);
		System.out.println(resultado5);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
		
		int pos = str.indexOf("l");
		System.out.println(pos);
		
		int pos2 = str.lastIndexOf("l");
		System.out.println(pos2);
		
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true:false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true:false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true:false);
		
		String valor1 = "CDD - Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
	}

}
