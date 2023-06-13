
public class Main {
    public static void main(String[] args) {

/*        There are tow types of exception

        1) compile time exception (checked exception)
            -> it is checked at complie time only because it shows red lines at front
            -> because Intellij compile code side by side


        2) run time exception (unchecked exception)
            -> this exception cannot handel at compile time, it handels at runtime
            -> in the below example 5/0, is a normal statement for java, but is throw exception at runtime */

//        Normal statement -> it universally true it not give any exception at any time
//        Critical statement  -> these statements might be throw an exception, that's why are called critical statements



/*        int arr[] = {1,2,3,4};
        try{
            int ans = arr[5];
            int a = 5/2;
        }
        catch (ArithmeticException e){
            System.out.println("Abey Yarr... zero se kaise devide hoga");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("tumhe array ke bare me kuch pata hai bhi ya nahi");
        }
        System.out.println("I am genius"); */

 /*       there is separate exception handler for every exception but Exception can handle every exceptio
        because "Exception" is parent class of every exception

        ex ->
        try{
            int a = 5/0;
        }
        catch (Exception e){
            System.out.println("tum sach mai Idiot ho yarr !"); */
        }




 /*       every try should have catch block, we can not use try without catch block and vice versa

        there  is finally block also in java,
        finally will be executed by any situation, means if your code break at any point

//          ex ->
        try{
            int a = 5/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("handeld");
        }
        finally {
            System.out.println("it is print after code break also");
        }





  /*     throw and throws

        throw -> is used to throw an exception by any particular condition

        in the below condition we can make any exception by creating new java class of that name and
        if we extends any random exception for that class, then we can access it easily
                but if we extend class by only Exception that means we have to tell to the function
        that it might be throw an exception, so for implementation of that
                we have to use thrwos with the function
                like  public static void checkAge(int age) throws Exception{ */

 /*       try{
            checkAge(19);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Not found any exception");

    }
    public static boolean checkAge(int age){
        if(age < 18){
            throw new YouCantVoteException("you are under age");
        }
        return true;
    } */




    /*      throws -> it is used with the function, for telling the function that in this whole function
                might be exception be occur, so please handle that; */

 /*       throws -> it is basically used to tell to the function, that in this whole function exception can be happen
                so please handle that

            like this ->   public static void checkAge(int age) throws Exception{ */
                                                                    ^
        }
}