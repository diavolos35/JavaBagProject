
public class Test {
	public static void main(String[] args) {
		Bag tBag=new Bag();
		
		tBag.add(1);
		tBag.add(2);
        tBag.add(3);
        tBag.add(3);
        tBag.add(3);
        
        
        System.out.println(" "+tBag);
        System.out.println("**********************************");

        
        boolean contains1=tBag.contains(1);
        System.out.println("The bag contains 1 -->"+contains1);
        System.out.println("**********************************");
        
        boolean contains2=tBag.contains(4);
        System.out.println("The bag contains 4 -->"+contains2);
        System.out.println("**********************************");
        
        boolean isEmpty1=tBag.isEmpty();
        System.out.println("The bag is empty -->"+isEmpty1);
        System.out.println("**********************************");
        
        int distictsize1=tBag.distictSize();
        System.out.println("Distict size of the bag is : "+distictsize1);
        System.out.println("**********************************");
        
        int elementsize1=tBag.elementSize(3);
        System.out.println("Size of '3' : "+elementsize1);
        System.out.println("**********************************");
        
        int size1=tBag.size();
        System.out.println("Size of the Bag "+size1);
        System.out.println("**********************************");
        
        tBag.remove(3);
        
        System.out.println(" "+tBag);
        System.out.println("**********************************");
        
        System.out.println("The size of bag"+size1);
        int elementsize2=tBag.elementSize(3);
        System.out.println("Size of 3 : "+elementsize2);
        System.out.println("**********************************");

        tBag.clear();
        System.out.println(" "+tBag);
        System.out.println("**********************************");
        
        Bag b1=new Bag();
        Bag b2=new Bag();
        
        b1.add(1);
        b1.add(2);
        b1.add(3);
        
        b2.add(1);
        b2.add(2);
        b2.add(5);
        
        
        System.out.println("b1 ="+b1);
        System.out.println("b2 ="+b2);
        
        boolean equals1=b1.equals(b2);
        
       System.out.println("These bags are equal -->" +equals1);
        
        
        
        
        
   
       
               
   
    
	}
	
  }

