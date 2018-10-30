public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startingCapacity){
    data = new String[startingCapacity];
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
    if (data.length <= size) resize();
    data[size] = value;
    size++;
    return true;
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
    if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
    else return data[index];
  }

  public String set(int index, String value){
    String pop = data[index];
    if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
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
    for (int i = size - 1; i >= 0; i--) {
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

  public void add(int index, String value) {
    if (0 <= index && index <= size) {
      if (size == data.length) resize();
      String[] output =  new String[size + 1];
      for (int i = 0; i <= size; i++) {
        if (i < index) output[i] = data[i];
        if (i == index) output[i] = value;
        if (i > index) output[i - 1] = data[i];
      }
      size++;
      data = output;
    }
    else throw new IndexOutOfBoundsException();

  }

  public String remove(int index) {
    if (0 <= index && index < size) {
      String out = data[index];
      for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
      }
      size--;
      return out;
    }
    else throw new IndexOutOfBoundsException();
  }

  public boolean remove(String target){
    if (contains(target)) {
      remove(indexOf(target));
      return true;
    }
    return false;
  }

}
