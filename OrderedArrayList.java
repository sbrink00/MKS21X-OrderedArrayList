public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){}
  public OrderedArrayList(int startLen){
    super(startLen);
  }

  public boolean add(T o){
    for (int idx = 0; idx < this.size(); idx ++){
      if (!this.compare(o, idx)) super.add(idx, o);
    }
    return true;
  }

  public void add(int index, T o){
    add(o);
  }

  public T set(int index, T o){
    return o;
  }

  public boolean compare(T other, int index){
    if (this.get(index).compareTo(other) == -1) return false;
    if (this.get(index).compareTo(other) == 1 || this.get(index).compareTo(other) == 0) return true;
    return false;
  }
}
