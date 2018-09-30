package algorithm;

public class _04TimeAndCheck {
	/**
	 * 校验数组结果是否正确
	 */
	public static boolean IsSort(int[] arr){
		int len = arr.length;
		for(int j = 0;j<len-1;j++){
			if(arr[j]>arr[j+1])
				return false;
		}
		return true;
		
	}
	/**
	 *计算程序执行所消耗的时间
	 */
	public static  String IsTime(long startTime,long endTime,int i){
		long time = (endTime - startTime);
		String result = String.valueOf(time);
		if(i==1)
			System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
		else if(i==2)
			System.out.println("程序运行时间：" + (endTime - startTime) + "ns");
		else
			System.out.println("程序运行时间：" + (endTime - startTime) + "未知的时间单位");
		return result;
	}
	// 打印arr数组的所有内容
    public static void printArray(Object[] arr) {

        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }
}
 