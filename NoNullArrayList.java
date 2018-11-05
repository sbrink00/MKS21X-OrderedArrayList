//this comment is here so that this file can be
//committed with an accurate message.
import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){}

  public NoNullArrayList(int startSize){
    super(startSize);
  }

  public boolean add(T o){
    if (o == null){
      throw new IllegalArgumentException("null can't be added");
    }
    else super.add(o);
    return true;
  }

  public void add(int index, T o){
    if (o == null){
      throw new IllegalArgumentException("null can't be added");
    }
    else super.add(index, o);
  }

  public T set(int index, T o){
    T output = this.get(index);
    if (o == null){
      throw new IllegalArgumentException("value can't be set to null");
    }
    else super.set(index, o);
    return output;
  }

}
