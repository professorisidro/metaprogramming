import java.lang.reflect.Field;

public class XMLGenerator {
	
	public static String toXML(Object o) throws Exception {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<xml>\n");
		for (Field f: o.getClass().getDeclaredFields()) {
			strBuilder.append("<"+f.getName()+">");
			f.setAccessible(true);
			strBuilder.append(f.get(o));
			f.setAccessible(false);
			strBuilder.append("</"+f.getName()+">\n");
		}
		strBuilder.append("</xml>\n");
		return strBuilder.toString();
	}

}
