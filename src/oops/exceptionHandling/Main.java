package oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a=5;
        int b=0;

        try{
//            int c=a/b;
//            divide(a,b);
            //mimicing
            String name = "kunal";
            if(name.equals("kunal")){
                throw new MyException("name is kunal");
            }
//            throw new MyException("just for fun");
        }catch (MyException e){                                  //put more strict exceptions above
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("normal exception");
        }
        finally {
            System.out.println("This will always execute");
        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }

}
