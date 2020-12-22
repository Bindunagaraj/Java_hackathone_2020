
public class Question29Class {
	public void merge(int[] arr, int l, int m, int r) {
		int lLength = m - l + 1;
		int rLength = r - m;
		int[] lArr = new int[lLength];
		int[] rArr = new int[rLength];
		for (int i = 0; i < lLength; i++) {
			lArr[i] = arr[l + i];
		}
		for (int j = 0; j < rLength; j++) {
			rArr[j] = arr[m + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (i < lLength && j < rLength) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		while (i < lLength) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while (j < rLength) {
			arr[k] = rArr[j];
			j++;
			k++;
		}	}
public void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}}}
