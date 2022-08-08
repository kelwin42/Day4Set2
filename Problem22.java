package com.trenser.training;

public class Problem22 {
	
	public static boolean checkMirrorInverse(int[] arr) {
		for(int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
			int currentEle = arr[currentIndex];
			if(arr[currentEle] != currentIndex)
				return false;
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 0};
		
		boolean isMirrorInverse = checkMirrorInverse(arr);
	
		System.out.println(isMirrorInverse);
	}
}
