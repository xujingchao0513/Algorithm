package algorithm;
public class _01Selection_sort {
	public static void main(String[] args) {//main中要有参数
		//定义数据
		int[] arr={10,9,8,7,6,5,4,3,2,1};
		String result=SelectionSort(arr);
		//输出结果
		System.out.println(result);	
	}
	/**
	 * 冒泡排序
	 */
	public static String SelectionSort(int[] arr){
		String result= "";
		//获取数组长度
		int len = arr.length;
		//设置中间值ֵ
		int check = 0;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					check=arr[i];
					arr[i]=arr[j];
					arr[j]=check;
				}
			}
			int a=arr[i];
			result += a+" ";
		}
		return result;
	}
	/**
	 * 选择排序
	 */
	public static int[] SelectionSort_1(int[] arr){
		String result= "";
		//获取数组长度
		int len = arr.length;
		//设置中间值ֵ
		
		for(int i=0;i<len;i++){
			int minNum = i;
			for(int j=i+1;j<len;j++){
				if(arr[j]<arr[minNum]){
					minNum=j;
				}
			}
			swap( arr , i , minNum);
		}
		return arr;
	}
	  public static void sort(int[] arr){

	        int n = arr.length;
	        for( int i = 0 ; i < n ; i ++ ){
	            // 寻找[i, n)区间里的最小值的索引
	            int minIndex = i;
	            for( int j = i + 1 ; j < n ; j ++ )
	                if( arr[j] < arr[minIndex] )
	                    minIndex = j;

	            swap( arr , i , minIndex);
	        }
	    }
	/**
	 * 交换数组中两个位置的值
	 */
	  public static void swap(int[] arr, int i, int j) {
	        int t = arr[i];
	        arr[i] = arr[j];
	        arr[j] = t;
	    }
}
