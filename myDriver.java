public class myDriver{
  public static void main(String[]args){
    NoNullArrayList<String> a = new NoNullArrayList<>();
    a.add("A");
    a.add("P");
    a.add("U");
    a.add("S");
    a.add("H");
    try{
      a.add(null);
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    System.out.println(a);

    try{
      a.add(1, null);
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }

    try{
      a.set(2, null);
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }

    OrderedArrayList<String> b = new OrderedArrayList<>();
    b.add("a");
    b.add("A");
    b.add("D");
    b.add("E");
    b.add("B");
    b.add("Cat");
    b.add("a");

    System.out.println(b);

    OrderedArrayList<Double> myGrades = new OrderedArrayList<>();
    myGrades.add(95.6);
    myGrades.add(90.6);
    myGrades.add(0, 100.5345);
    myGrades.set(1, 105.90);
    System.out.println(myGrades);



  }
}
