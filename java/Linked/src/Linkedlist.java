import java.util.Collections;
import java.util.LinkedList; 
import java.util.Scanner;
import java.util.ListIterator;
import java.util.ArrayList;
public class Linkedlist {
	LinkedList<Integer> lists;

	public Linkedlist() {
		 lists = new LinkedList<Integer>(); 
	      

	}
	public static void main(String[] args) {
	    
          Linkedlist m= new Linkedlist();
          int list,d,option=0;
          
          Scanner s=new Scanner(System.in);
          do {
        	    int n = 0;
				System.out.println("menu");
				System.out.println("1 Creating ArrayList");
				System.out.println("2 Insert Last");
				System.out.println("3 Print ArrayList");
				System.out.println("4 Reverse");
				System.out.println("5 To get Occurence");
				System.out.println("6 retrieve Last");
				System.out.println("7.Remove First");
				System.out.println("8 Iteration");
                System.out.println("9.Conversion to Arraylist");
				System.out.println("option");

				option = s.nextInt();
				switch(option) {
				case 1:
                  System.out.println("Enter the no of elemenets in the List:");
                    n=s.nextInt();
                  System.out.println("Enter the elements:");
                   for(int i=0;i<n;i++) {
        	     list=s.nextInt();
        	     m.add(list);
                  }
                   break;
				case 2:
					 System.out.println("Enter the element to be added at end:");
			          list=s.nextInt();
			          m.addlast(list);
			          break;
				case 3:
                      m.printAll();
                      break;
				case 4:
                    System.out.println("The elements after reversing:");
                     m.reverse();
                     break;
				case 5:
					System.out.println("Elements to be find:");
					list=s.nextInt();
					m.first(list);
					break;
				case 6:
					m.retriv();
					break;
				case 7:
					m.removelast();
					break;
				case 8:
					System.out.println("Enter index from where to iterate");
					int index=s.nextInt();
					m.iterate(index);
					break;
					
				case 9:
					m.convert();
					break;}
          }while(option!=-1);
          s.close();
				
         
	}
	
public void add(int list) {
	lists.add(list);
}
public void addlast(int list) {
	lists.addLast(list);
}
public  void printAll() {
	for(Integer list:lists) {
		System.out.println(list);}
}
public void reverse() {
	Collections.reverse(lists);
	printAll();
}
public void first(int list) {
	int first=lists.indexOf(list);
	int last=lists.lastIndexOf(list);
	System.out.println("The First and Last element of List is: "+first+" "+last);
}
public void retriv() {
	
	int y=lists.peekLast();
	
	System.out.printf("The Last Element  Is Retrived:%d\n",y);
	}
public void removelast() {
	System.out.printf("The first element is %d:\n",lists.get(0));
	lists.removeFirst();
	System.out.println("The first element is removed.");
}
public void iterate(int index) {
    ListIterator<Integer> list_Iter = lists.listIterator(index); 
    System.out.println("The list is as follows:"); 
    while(list_Iter.hasNext()){ 
       System.out.println(list_Iter.next()); 
    } 
}
public void convert() {
    ArrayList<Integer> arrayList = new ArrayList<>(lists);
    System.out.println(arrayList);

}
}




