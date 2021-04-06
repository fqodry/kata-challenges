public class Solusi {
	public static int squareSum(int[] n) {
    int result = 0;
    int i = 0;
    while (i < n.length) {
      result += (int) Math.pow(n[i], 2);
      i++;
    }
    
    return result;
  }
}