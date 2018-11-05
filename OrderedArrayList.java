public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){}
  public OrderedArrayList(int startLen){
    super(startLen);
  }


  public boolean add(T o){
    if (this.size() == 0) return super.add(o);
    for (int idx = 0; idx < this.size(); idx ++){
      if (o.compareTo(this.get(idx)) <= 0){
        super.add(idx, o);
        return true;
      }
    }
    super.add(o);
    return true;
  }

  public void add(int index, T o){
    super.add(o);
  }

  public T set(int index, T o){
    T output = this.get(index);
    this.remove(index);
    this.add(o);
    return output;
  }
}
