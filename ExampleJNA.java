import com.sun.jna.Library;  

public interface ExampleJNA extends Library {
  public void func0();  
  public void func1(int param1, String param2);    
  public int func2(byte param1, int[] param2);  
}