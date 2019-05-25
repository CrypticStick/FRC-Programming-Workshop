package frc.robot;

class java_basics {

    // by starting any line with "//", you can comment it.
    // Commented code doesn't actually do anything; it's simply for you to read.
    // it's good practice to comment anything you create, but it's not necessary.

    /*
    You can also comment 
    multiple lines of code
    like this
    */

    //////////////////// BASIC VARIABLE TYPES ////////////////////
    {
        //This is a variable. You can use variables to store information in your code.
        Object variable = "An Object is the root of all variables." +
        "Every variable is an object, and an object can be anything";

        //this is an integer - it's simply a whole number.
        int wholeNumber = 2;

        //this is a float - it supports decimal values up to 7 digits of precision (32-bit precision)
        float bigNumber = 9.33f;

        //this is a double - it supports decimal values up to 16 digits of precision (64-bit precision)
        //decimal numbers default as a double.
        double decimalNumber = 4.87;

        //this is a boolean - it simply represents true or false, yes or no
        boolean isTrue = false;

        //this is a string - it holds text
        //strings are surrounded by " "
        String text = "Hey, this is a string!";

        //this is a character - it's like a string, but just one character
        //characters are surrounded by ' ' 
        char character = 'e';
    }

    //////////////////// VARIABLE USAGE ////////////////////
    {
        boolean value = false;

        //any normal variables can be set and received
        boolean anotherValue = value;
        value = true;
        // even though 'anotherValue' is created equal to 'value' (false),
        // when 'value' is changed to true, 'anotherValue' is still false.


        //you can add, subtract, multiply, and divide numbers as you normally would.
        double result = (2 + 5) / 2;
        double newResult = result + 4 / 2;
        //keep in mind that multiplication and division will likely create a double.

        int myNumber = (int)(Math.random() * 100); //a random number between 1 and 100;

        //let's say you want to increment a number by one.
        myNumber = myNumber + 1;
        //this works perfectly fine, but here's a fancy shortcut:
        myNumber += 1;  //means the exact same thing; adds 1 to myNumber.

        //OR, if you're just adding 1, you can do this:
        myNumber++;
        ++myNumber;
        //both of these do ALMOST do the same thing. They both add 1 to the number,
        //HOWEVER. Let's say you do this...
        int anotherNumber = myNumber++;
        //this is NOT equal to...
        int anotherNumber2 = ++myNumber;

        //when you put the ++ BEFORE the variable, it adds one to the number, THEN returns the value.
        //when you put the ++ AFTER the variable, it returns the value, THEN adds one to the number.
        //you don't need to do this, but it's handy for compact code

        //you can do the same thing with subtraction!!
        myNumber -= 1;
        myNumber--;
        --myNumber;

        //you can even do shortcuts with multiplication and division!
        myNumber *= 2; //multiplies myNumber by 2;
        myNumber /= 2; //divides myNumber by 2;

        //you can't do myNumber** or myNumber//, because why would you want to
        //multiply and divide by one? :P

        //if you want to compare two numbers to each other, you can use ==
        boolean isTrue = (1 == 2);  //this will return false, because 1 is NOT equal to 2
        //remember, 1 equal sign SETS a value; 2 equal signs COMPARES values.

        //when comparing strings or other objects, you can't usually use ==.
        //instead, use the .equals() method.
        String newString = "bingo";
        boolean isTrue2 = newString.equals("bingo"); //this equals TRUE
        boolean isTrue3 = "bingo".equals(newString); //also equals TRUE

        //when manipulating strings, you can add them together
        String part1 = "this is";
        String part2 = "a sentence";
        String sentence = part1 + part2 + "!";

        //you can also add numbers into strings
        int numberOfApples = 5;
        String message = "We have " + numberOfApples + " apples";


        //you don't have to make 3 variables for 3 different integers;
        //you can store them all in one array!
        //all arrays are surrounded with { }
        Object[] arrayOfObjects = {1, "wow", false, "true"};
        int[] arrayOfIntegers = {1, 2, 3, 4};
        String[] arrayOfStrings = {"one", "two", "oatmeal"};
        boolean[] arrayOfBooleans = {true, false, false, true};
        //you can make arrays for ANY variable type

        //you can get values from arrays very easily...
        int aNumber = arrayOfIntegers[2];
        //in this example, 'aNumber' is equal to arrayOfIntegers at an index of 2.
        //all arrays start at 0, so arrayOfIntegers[0] is the first number, 
        //arrayOfIntegers[1] is the second number, and so on.

        //you can also set the values in arrays
        arrayOfIntegers[0] = 3;
        //however, you can not make an array any larger than when you created it
            // arrayOfIntegers[4] = 4;
        // although the code will tell you this is okay, it is NOT.
        // arrayOfIntegers can only hold 4 numbers, so index 4 doesn't exist (remember, arrays start at 0);
    }

    //////////////////// FUNCTIONS AND CONDITIONALS ////////////////////
    class ICanMakeSubclassesWheneverIWant {
    //if you have a chunk of code you would like to run multiple times,
        //you can store it in a function!
        void blockOfCode() {
            int i = 3 + 4;
        }

        {
        //then, you can call the function to run the code (inside of another function!!)
        //or, at least within the scope of brackets...
        blockOfCode();
        }

        //you can also pass information into the function, so it can do more complicated tasks!
        void giveMeANumber(int number) {
            int i = number + 1;
        }

        {
            //then, to run the code, make sure to give the function what it wants.
            //in giveMeANumber, the function wants an int.
            giveMeANumber(4);
        }

        //when function starts with 'void', it means the function doesn't return any information.
        //However, we can actually make functions give us values directly!
        int giveMeAnotherNumber(int number) {   //function MUST give us an 'int'
            int i = number + 1;
            return i;   //the function quits here, and gives us the value of 'i'.
        }

        {
            //since giveMeAnotherNumber returns an 'int', we can treat it as a number-
            int newNumber = giveMeAnotherNumber(4);
        }

        //functions can return anything you want, and will accept as many parameters as you please.
        String repeatString(String text, int repeatTimes, boolean withSpace) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < repeatTimes; i++) { //fancy stuff don't worry yet
                sb.append(text);
                if (withSpace)
                    sb.append(' ');
            }
            return sb.toString();
        }
    
        {
            System.out.println("This command prints a message to the console");
            //This prints our string "bingo" 10 times into the console
            System.out.println(repeatString("bingo",10,true));
        }

        void moreExamples() {
            //now for conditional statements!
            //one of the most important conditional statements is the 'if' statement.
            if (true) {
                //do something
            }
            //these statements check if a provided boolean is true. If it is, it runs code.
            //Here's a more realistic example:
            String command = "end";
            int status = 0;
            if (command.equals("end")) {
                if (status == 0) {
                //do something
                }
            }
            //you can write this an even shorter way!
            if (command.equals("end") && status == 0) {
                //do something
            }

            //you can use '&&' (the 'and' operator) to check if BOTH statements are true. In this example,
            //the code only runs IF command equals "end" AND status equals 0.

            //you can also use '||' (the 'or' operator) to check if at least ONE statement is true.

            if (command.equals("end") || status == 1) {
                //the code here stills runs, because command equals "end"
            }

            //if the 'if' statements fails, you can make it run something 'else'
            if (false) {
                //this cannot run, since false is not true
            } else {
                //since the if statement isn't true, run this INSTEAD
            }
            
            //if you would like to chain multiple 'if' statements together, you can even do this:
            int number = 2;
            if (number == 0) {
                //not going here
            } else if (number == 1) {
                //not going here either
            } else if (number == 2) {
                //code will go here!
            } else {
                //one of the if statements is true, so code won't go here.
            }

            //if you want to loop something multiple times
            //you can either use 'while' loops or 'for' loops.

            //a while loop will repeat WHILE the boolean provided is true.
            //while loops are a little dangerous to use, since they could potentially get stuck in an infinite loop.
            while(true) {   
                //do something infinitely.

                break;  //break will always immediately end the loop it is inside.
            }

            //you can use while loops WITH if statements to repeat something until you want to stop
            boolean run = true;
            while(run) {    //this loops until 'run' is no longer true. The code inside eventually changes 'run'.
                //do something
                if (true) {
                    run = false;
                }
            }

            //alternatively, you can loop with for statements
            // for ([number initializes here]; [conditional]; [what to do after code runs])
            //here's an example that makes more sense:
            for (int i = 0; i < 10; i++) {
                //run this code 10 times.
            }
        }
    }
}