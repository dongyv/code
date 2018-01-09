package demo;
/**
 * 运行不了，不会溢出啊
 * @author Administrator
 *
 */
public class GcDemo_01 {
	public Object instance = null;
	 private static final int _1MB = 1024*1024;
	 
	 private byte[] bigSize = new byte[2 * _1MB];
	 
	 public static void main(String args[]){
		 GcDemo_01 objA = new GcDemo_01();
		 GcDemo_01 objB = new GcDemo_01();
		 objA.instance = objB;
		 objB.instance = objA;
		 
		 System.out.println("oba:"+objA.instance);
		 System.out.println("obb:"+objB.instance );
		 objA = null;
		 objB = null;
		 
		 System.gc();






	 }
}
