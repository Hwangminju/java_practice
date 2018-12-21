package myJava;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] old_arr = new int[]{1, 2, 3, 4, 5};
		
		arraycopy_arr(old_arr);
		Arrays_copyOf(old_arr);
		Objects_clone_arr(old_arr);
		for_index_arr(old_arr);
		
	}
	
	// 1. System.arraycopy() 메소드
	public static void arraycopy_arr(int[] old_arr) {
	
		int arr_len = old_arr.length;
		int[] new_arr = new int[arr_len];
		
		System.arraycopy(old_arr, 0, new_arr, 0, arr_len);
		
		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i] + " ");
		}
		System.out.println();
	}
	
	// 2. Arrays.copyOf() 메소드
	public static void Arrays_copyOf(int[] old_arr) {
		
		int arr_len = old_arr.length;
		int[] new_arr = Arrays.copyOf(old_arr, arr_len);
		
		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i] + " ");
		}
		System.out.println();
	}
	
	// 3. Object 클래스의 clone() 메소드
	public static void Objects_clone_arr(int[] old_arr) {
		
		int[] new_arr = (int[])old_arr.clone();
		
		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i] + " ");
		}
		System.out.println();
	}
	
	// 4. for,인덱스 사용 
	public static void for_index_arr(int[] old_arr) {
		
		int arr_len = old_arr.length;
		int[] new_arr = new int[arr_len];
		
		for (int i = 0; i < old_arr.length; i++) {
			new_arr[i] = old_arr[i];
		}
		
		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i] + " ");
		}
	}
}