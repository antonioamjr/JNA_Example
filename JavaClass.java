import com.sun.jna.Native;

public class JavaClass {
     public static void main(String[] args){
        ExampleJNA obj = (ExampleJNA) Native.loadLibrary("example", ExampleJNA.class);

        obj.func0(); 
        obj.func1(10, "teste");
    }
}