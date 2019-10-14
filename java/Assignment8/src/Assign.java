import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 
public class Assign {
	List<Integer> Elements;
	List<Integer> Elements2;
	public Assign() {
	 Elements = new ArrayList<Integer>();
	 Elements2=new ArrayList<Integer>();}


	public static void main(String[] args) {
	          int option=0,n;
	          int element;
	          Scanner s = new Scanner(System.in);
		        
                Assign m=new Assign();
                do {
    				System.out.println("menu");
    				System.out.println("1 Creating ArrayList");
    				System.out.println("2 Insert First");
    				System.out.println("3 Print ArrayList");
    				System.out.println("4 Retrieve");
    				System.out.println("5 Search");
    				System.out.println("6 Sort");
    				System.out.println("7 Shuffle");
    				System.out.println("8 Reverse");
    				System.out.println("9.Compare");
    				System.out.println("10.Exit");
    				System.out.print("\noption>");
    				option = s.nextInt();
    				switch(option) {
    				case 1:
    					System.out.println("Enter number of elements in an array:");
    					n=s.nextInt();
    					System.out.print("Enter the Elements:");
    					for(int i=0;i<n;i++) {
    						element=s.nextInt();
    						m.add(element);
    					}
    					break;
    				case 2:
    					System.out.println("Enter the Element to be Inserted:");
    					element=s.nextInt();
    					m.insert(element);
    					break;
    				case 3:
    					System.out.println("Printing Elements in Arraylist:\n");
    					m.printAll();
    					break;
    				case 4:
    					System.out.println("Enter the element to be Retrived:");
    				    element=s.nextInt();
    				    m.retriv(element);
    				    break;
    				case 5:
    					System.out.println("Enter the element to be searched");
    					element=s.nextInt();
    					m.search(element);
    					break;
    				case 6:
    					m.sort();
    					break;
    				case 7:
    					m.shuffle();
    					break;
    				case 8:
    					m.reverse();
    					break;
    				case 9:
    					System.out.println("Enter number of elements in an array2:");
    					int n1=s.nextInt();
    					System.out.print("Enter the Elements:");
    					for(int i=0;i<n1;i++) {
    						int element1=s.nextInt();
    						m.add1(element1);
    						}
    					m.compare();
    					break;
    				case 10:
    					System.exit(0);
    					break;
    					}
                }while(option!=-1);
                s.close();
	}
public void add (int element) {
	
	Elements.add(element);
		}
public void add1 (int element1) {
	
	Elements2.add(element1);
		}
public void insert (int element) {
	Elements.add(0,element);
		}
public  void printAll() {
	for(Integer element:Elements) {
		System.out.println(element);}
}
public void retriv(int element) {
	int index = Elements.indexOf(element);
	int y=Elements.get(index);
	
	System.out.printf("The Element %d Is Retrived and it is in the position:%d\n",y,index);
	}
public void search(int element) {
	int index=Elements.indexOf(element);
	if(index!=-1)
		System.out.printf(" The Element %d is found at position %d.\n",element,index);
	else
		System.out.printf("cannot find  the element %d in the list.\n",element);
	
}
public void sort() {
	Collections.sort(Elements);
	System.out.println("Sorted List Is:");
	printAll();
}
public void shuffle() {
	Collections.shuffle(Elements);
	System.out.println("The shuffled List is:");
	printAll();
}
public void reverse() {
	Collections.reverse(Elements);
	System.out.println("The list after Reversing:");
	printAll();
}
public void compare() {
	System.out.println("The given two arrays are compared." + Elements.equals(Elements2));
}
}


