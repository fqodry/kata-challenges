public class Solusi {
	public static String maskify(String str) {
    return (str.length() <= 4) ? str : str.replace(str.substring(0, str.length()-4), "#".repeat(str.length()-4));
  }
}