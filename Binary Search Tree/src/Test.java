public class Test {

    public static void main(String[] args) {
    	Bag tBag=new Bag();
    	tBag.add(1);
    	tBag.add(2);
    	tBag.add(3);
    	tBag.add(4);
    	tBag.add(4);
    	
    	System.out.println("tBag = "+tBag);
    	boolean isEmpty1=tBag.isEmpty();//we could write like ; System.out.println(tBag.isEmpty1) but i just want print "The bag is empty --> "
    	System.out.println("The bag is empty -->"+isEmpty1);
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	boolean contains1=tBag.contains(4);
    	System.out.println("The bag is contain '4 -->'"+contains1);
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	System.out.println("The bag is contain '5' -->" +tBag.contains(5));
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	System.out.println("The distict size is : "+tBag.distictSize());
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	System.out.println("The size of '4' is : "+tBag.elementSize(4));
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	System.out.println("The size of bag : "+tBag.size());
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	
    	tBag.remove(4);
    	System.out.println("The uptated  "+tBag);
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	tBag.clear();
    	System.out.println("The bag is cleaned");
    	System.out.println("The bag is empty -->"+ tBag.isEmpty());
    	System.out.println("                                       ");
    	System.out.println("                                       ");
    	
    	
    	Bag b1=new Bag();
    	b1.add(1);
    	b1.add(2);
    	b1.add(3);   
    	b1.add(3);
    	
    	System.out.println("The bag1 "+b1);
    	Bag b2=new Bag();
    	b2.add(1);
    	b2.add(2);
    	b2.add(3);
    	b2.add(3);
    	System.out.println("The bag2 "+b2);
    	
    	
    	System.out.println("These bags are equal -->" +b1.equals(b2));
    	System.out.println("                                       ");
    	System.out.println("                                       ");


     
  }
}