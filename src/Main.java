import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println("ola mundo");
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		/**"%.2f" serve para delimitar casas decimais 
		 * %n serve para quebrar linha
		 * para tirar a virgula é só usar Locale.setDefault(Locale.US);
		 * 
		 */
		System.out.println("Resultado :" + x + "Metros");
		/**
		 * para concatenar é só usar o + (no caso de print e println)
		 */
		System.out.printf("RESULTADO : %.2f metros%n",x);
	}

}
