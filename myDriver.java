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






  }
}
