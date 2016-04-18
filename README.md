# JNA_Example

Try it yourself!

Step 1 (library):
  * Linux: gcc -o libexample.so -fPIC -shared example.c
  * OS X: gcc -o liexample.dylib -fPIC -shared example.c
  * Windows: gcc -o libexample.dll -fPIC -shared example.c

Step 2 (Java compile):
  * javac -cp .:jna.4.2.1.jar ExampleJNA.java JavaClass.java

Step 3 (Run J, run):
  * java -cp .:jna.4.2.1.jar JavaClass

PS: 
  * Task 1: Include `func3` to java's main function.
  * Task 2: Code your own function to `example.c` and make use of it.

Best regards,
Antonio Jr
