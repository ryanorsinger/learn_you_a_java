## Passing arguments to methods
** When passing objects to methods, you are passing the object reference, not the actual object itself!
When you pass a primitive variable, you are passing a copy of the bits representing the variable. (pass by value)

## Scope
    class Ex1{
      static int x = 10;
      public static void main(String[] args) {
       for(int x=0;x<5;x++){
          }
        System.out.print(x);
      }
    }

x is 10 because the scope of x in the for loop is limited to the for block.

## Overloading Methods

public class DataArtist {
    ...
    public void draw(String s) {
        ...
    }
    public void draw(int i) {
        ...
    }
    public void draw(double f) {
        ...
    }
    public void draw(int i, double f) {
        ...
    }
}

Overloaded methods are differentiated by the number and the type of the arguments passed into the method. In the code sample, draw(String s) and draw(int i) are distinct and unique methods because they require different argument types.

Note: Overloaded methods should be used sparingly, as they can make code much less readable.

## Method arguments
    // takes in an array of strings
    public void main(String[] args)

    // method returns a Polygon object and takes in an  amount of Point objects from an array
    public Polygon polygonFrom(Point[] corners)


## Arbitrary Number of Arguments - method can be called either with an array or with a sequence of arguments.
public PrintStream printf(String format, Object... args)
or
public PrintStream printf(String format, Object... args)

