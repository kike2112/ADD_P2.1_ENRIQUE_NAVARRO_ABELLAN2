package dam2.add.p21.utiles;

public class Ruta {
	
//	"C:/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ADD_P2.1_ENRIQUE_NAVARRO_ABELLAN2/properties/
	public static String WEB_CONTENT; 
	public static String FICHERO_BBDD; 
	public static String FICHERO_CONF; 
	public static String FICHERO_LOG4; 
	
	public static final String PARAM_IDIOMA = "config.idioma";
	public static final String PARAM_PERSIS = "config.persistencia";
	public static final String PARAM_BD_NOM = "bd.nombre";
	public static final String PARAM_BD_LGN = "bd.login";
	public static final String PARAM_BD_PSW = "bd.pass";
	public static final String PARAM_BD_HST = "bd.host";
	
	
//	public static String getRutaReal() {
//		return WEB_CONTENT;
//	}
	public static void setRutaReal(String ruta) {
		WEB_CONTENT = ruta; //La capturo desde el index.jsp
		FICHERO_BBDD = WEB_CONTENT + "/properties/bbdd.properties"; 
		FICHERO_CONF = WEB_CONTENT + "/properties/config.properties"; 
		FICHERO_LOG4 = WEB_CONTENT + "/properties/log4j.properties";
	}
}
