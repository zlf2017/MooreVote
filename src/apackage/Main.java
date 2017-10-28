/**
 * 
 */
package apackage;


/**
 * @author zlf
 * To find the element which appear more than a half of the array
 */
public class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4,4,5,6,6,6,6,6,6,6,6};
		generate(arr);

	}
	private static void generate(int[] arr) {
		int e = 0;
		int count=0;
		for(int i:arr) {
			if(count == 0) {
				e = i;
				count = 1;
				continue;
			}
			count += e==i? 1 : -1 ;
		}
		System.out.println("arrayLength:" + arr.length);
		System.out.println(e + " times:" + count);
	}
}
