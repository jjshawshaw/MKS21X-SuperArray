public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public Boolean isEmpty(){
    return (size == 0);
  }

  public void add(String value) {
      data[size] = value;
      size++;
  }

  public String toString(){
    String output = "{";
    for (int i = 0; i < size; i++) {
      output += data[i];
      if (i + 1 < size) output += ", ";
    }
    output += "}";
    return output;
  }

  public String toStringDebug(){
    String output = "{";
    for (int i = 0; i < data.length; i++) {
      output += data[i];
      if (i + 1 < data.length) output += ", ";
    }
    output += "}";
    return output;
  }

  public String get(int index){
    if (index < 0 || index >= size()) return null;
    else return data[index];
  }
}
