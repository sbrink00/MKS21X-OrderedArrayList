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

  /*public boolean add(T o){
    if (this.size() == 0 || o.compareTo(this.get(this.size() - 1)) >= 0){
      return super.add(o);
    }
    else{
      for (int idx = 0; idx < this.size(); idx ++){
        if (this.shouldIAdd(o, idx) != -1) super.add(this.shouldIAdd(o, idx), o);
      }
    }
    return true;
  }
  //[A, P, U], (B, 0), me = A,
  public int shouldIAdd(T other, int index){
    T me = this.get(index);
    if (this.size() == 0) return -1;
    if (index == this.size() - 1) return -1;
    if (other.compareTo(me) >= 0 && (other.compareTo(this.get(index + 1)) < 0)){
      return index + 1;
    }
    return -1;
  }

  public void add(int index, T o){
    super.add(o);
  }

  public boolean add(T o){
    super.add(o);
    boolean done = false;
    boolean tempDone = true;
    while (!done){
      for (int idx = 0; idx < this.size() - 1; idx ++){
        T obj1 = this.get(idx);
        T obj2 = this.get(idx + 1);
        if (obj1.compareTo(obj2) > 0){
          super.set(idx, obj2);
          super.set(idx + 1, obj1);
        }
      }
      for (int idx = 0; idx < this.size() - 1 && tempDone; idx ++){
        tempDone = true;
        if (this.get(idx).compareTo(this.get(idx + 1)) > 0) tempDone = false;
      }
      if (tempDone) done = true;
    }
    return true;
  }*/
  public T set(int index, T o){
    T output = this.get(index);
    this.remove(index);
    this.add(o);
    return output;
  }
}
