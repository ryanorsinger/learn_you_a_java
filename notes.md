## Characters
java uses Unicode characters
char is an unsigned 16 bit type w/ range from 0 to 65,535
ASCII charset uses 0 to 127 and is a valid subset of Unicode.
Since char is a 16 bit numeric type, we can perform arithmetic operations on it

## ARRAYS
Array variables always assign by reference b/c they are implemented as objects
int[] foo = {1, 2, 3};
int[] bar = foo;
bar[1] = 99;
foo and bar both refer to the same object
and that object is {1, 99, 3};
so both foo and bar are {1, 99, 3}; now

to copy an array, do this:
int[] bar = foo.clone();

## Default constructor
Initializes all member variables to default values (zero, null, and false for numerics, references, and booleans)
Defining a constructor means the default is no longer used.


# Assignment
Dynamic initializaiton is a thing

## Passing arguments to methods
** When passing objects to methods, you are passing the object reference, not the actual object itself!
When you pass a primitive variable, you are passing a copy of the bits representing the variable. (pass by value)

## Scope and lifecycle
lifetime of a variable is within its scope
each block defines a new scope
Nesting blocks passes variables into the inner block

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


# Java reserved Keywords
abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictftp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while


