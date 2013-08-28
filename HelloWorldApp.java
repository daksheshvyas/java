/**
* The HelloWorldApp class implements an application that
* simply prints "Hello World!" to the standard output.
*/

class HelloWorldApp {
    public static void main(String[] args) {
	if (args.length > 0) {
	    for (String s: args) {
		System.out.println("Hello, " + s + "!"); //add a string in the command line
	    }
	} else {
		System.out.println("Hello, World!"); 
	}
    }
}

