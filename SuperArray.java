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

  public boolean add(String value) {
    if (size < data.length){
      data[size] = value;
      size++;
      return true;
    }
    return false;
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

  public String set(int index, String value){
    String pop = data[index];
    if (index < 0 || index >= size()) return null;
    else data[index] = value;
    return pop;
  }

  private void resize() {
    String[] temp = new String[data.length * 2 + 1];
    for (int i = 0; i < size; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public boolean contains(String target){
    for (int i = 0; i < size; i++) {
      if (data[i].equals(target)) return true;
    }
    return false;
  }

  public int indexOf(String target){
    for (int i = 0; i < size; i++) {
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = size - 1; i >= 0; i++) {
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

}
