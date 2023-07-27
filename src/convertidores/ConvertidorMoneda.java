package convertidores;

public class ConvertidorMoneda {

	//Tasas 
	private static final double tasaCambioMXNtoUSD = 0.059; 
	private static final double tasaCambioUSDtoMXN = 16.93;
	private static final double tasaCambioMXNtoGBP = 0.046;
	private static final double tasaCambioGBPtoMXN = 21.84;
	private static final double tasaCambioMXNtoEUR = 0.053;
	private static final double tasaCambioEURtoMXN = 18.71;
	private static final double tasaCambioUSDtoGBP = 0.78;
	private static final double tasaCambioGBPtoUSD = 1.29;
	private static final double tasaCambioUSDtoEUR = 0.90;
	private static final double tasaCambioEURtoUSD = 1.11;
	private static final double tasaCambioGBPtoEUR = 1.17;
	private static final double tasaCambioEURtoGBP = 0.86;
	
	//Metodo para convertir de MXN a USD
	public static double convertirMXNtoUSD(double cantidad) {
		return cantidad * tasaCambioMXNtoUSD;
	}
	
	//Metodo para convertir de USD a MXN
	public static double convertirUSDtoMXN(double cantidad) {
		return cantidad * tasaCambioUSDtoMXN;
	}
	
	//Metodo para convertir de MXN a GBP
	public static double convertirMXNtoGBP(double cantidad) {
		return cantidad * tasaCambioMXNtoGBP;
	}
	
	//Metodo para convertir de GBP a MXN
	public static double convertirGBPtoMXN(double cantidad) {
		return cantidad * tasaCambioGBPtoMXN;
	}
	
	//Metodo para convertir de MXN a EUR
	public static double convertirMXNtoEUR(double cantidad) {
		return cantidad  * tasaCambioMXNtoEUR;
	}
	
	//Metodo para convertir de EUR a MXN
	public static double convertirEURtoMXN(double cantidad) {
		return cantidad * tasaCambioEURtoMXN;
	}
	
	//Metodo para convertir de USD a GBP 
	public static double convertirUSDtoGBP(double cantidad) {
		return cantidad * tasaCambioUSDtoGBP;
	}
	
	//Metodo para convertir de GBP a USD
	public static double convertirGBPtoUSD(double cantidad) {
		return cantidad * tasaCambioGBPtoUSD;
	}
	
	//Metodo para convertir de USD a EUR
	public static double convertirUSDtoEUR(double cantidad) {
		return cantidad * tasaCambioUSDtoEUR;
	}
	
	//Metodo para convertir de EUR a USD
	public static double convertirEURtoUSD(double cantidad) {
		return cantidad * tasaCambioEURtoUSD;
	}
	
	//Metodo para convertir de GBP a EUR
	public static double convertirGBPtoEUR(double cantidad) {
		return cantidad * tasaCambioGBPtoEUR;
	}
	
	//Metodo para convertir de EUR a GBP
	public static double convertirEURtoGBP(double cantidad) {
		return cantidad * tasaCambioEURtoGBP;
	}
	
	
	
	
}
