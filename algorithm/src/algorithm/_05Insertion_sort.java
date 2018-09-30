package algorithm;

import java.util.Arrays;

public class _05Insertion_sort {
	public static void main(String[] args) {//main中要有参数
		//定义数据
		int len = 100;
		int maxNum= 10000;
		int[] arr=_03TestHelper.TestHelper(len,maxNum);
		int[] arr2 = Arrays.copyOf(arr, arr.length);	//复制数组
		int[] result=Insertion_Sort(arr);
		//输出结果
		_04TimeAndCheck.printArray(arr);
	}
	/**
	 * 插入排序
	 */
	public static int[] Insertion_Sort(int[] arr){
		//获取数组长度
		int len = arr.length;
		//设置中间值ֵ
		int check = 0;
		for(int i=1;i<len;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--){
				_01Selection_sort.swap(arr,j,j-1);
			}
		}
		return arr;
	}
}
