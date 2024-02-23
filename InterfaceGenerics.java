interface a<T>{
	T max(T z);
}
class InterfaceGenerics<T> implements a<T>{
	public T max(T z){
		return z;
	}
	public static void main(String args[]){
		InterfaceGenerics<Integer> obj=new InterfaceGenerics<Integer>();

		int abc=obj.max(33);
		System.out.println(abc);
	}
}