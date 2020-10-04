import java.lang.Math;
public class LinkedListTest{
	public static void main(String[] args){
		int initial = 10;
		ArrayList kw = new ArrayList(initial);

		//adding element to the array
			System.out.println("All space full in array");
		
			kw.add(1);
			kw.add(1);

		//element in the array before shrinking
		System.out.println("Elements in array before:");

		for (int x = 0; x < kw.size; x++) { 
			System.out.print(kw.array[x] + " "); 
		}

		//size of the element before shrinking
		System.out.println("\n size of array before is "+kw.size);
		System.out.println("Number of element in the array bofore is "+kw.count);

		//removing last element of the array
		kw.pop();

		//element in the array after removing last element
		System.out.println("\nElements in array after pop:");

		for (int x = 0; x < kw.size; x++) { 
			System.out.print(kw.array[x] + " "); 
		}

		//size of the element after removing last element
		System.out.println("\nsize of the array after pop "+kw.size);
		System.out.println("Number of element in array after pop is "+kw.count);

		kw.check();
		kw.resize();

		
		System.out.println("\nElements in array after:");

		if(kw.size!=initial){

			for (int x = 0; x < kw.size; x++) { 
				System.out.print(kw.array[x] + " "); 
			}

			System.out.println("\nsize of the array has changed as array is full by 1/4 or 3/4 is "+kw.size);
		
		}else{

			for (int x = 0; x < kw.size; x++) { 
				System.out.print(kw.array[x] + " "); 
			}
			System.out.println("\nsize of the array remains same that is "+kw.size);
		}
		System.out.println("Number of element in array after is "+kw.count);
	}
}

class ArrayList{
	int size;//initial_size;//,constant;
	int count = 0;
	int full_king;
	int full_wang;
	int[] array;

	public ArrayList(int length){
		size = length;
		array = new int[size];
		full_king = Math.round((25*length)/100);
		full_wang = Math.round((75*length)/100);
	}

	//will add new element in the array
	public void add(int add_ele)
	{
		array[count] = add_ele;
		count++;
	}
	//remove the last element
	public void pop()
	{
		if(count > 0){
            array[count-1] = 0; 
            count--; 
        } 	
	}

	public int size(){
		return size;
	}
	//resize the size of array to double if array is full by 75% and half if 25% full
	public void resize()
	{
		if(count == full_king){

			int[] temp = new int[size/2];

			for(int x=0;x<count;x++){
				temp[x]=array[x];
			}

			size = size/2;
			array = temp;
		}

		if(count == full_wang){

			int[] temp = new int[size*2];

			for(int x=0;x<count;x++){
				temp[x]=array[x];
			}

			size = size*2;
			array = temp;
		}	
	}

	public int check()
	{
		return count;
	}

	public String toString()
	{
		String s=Integer.toString(size);
		return s;
	} 
}