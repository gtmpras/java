
//Custom Exception
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);//calling the parent class constructor
    }
}
class TestCustomException1{
    static void validate(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        try{
            validate(19);
        }catch(Exception e){
            System.out.println("Exception occured: "+e);
        }
        System.out.println("Rest of the code...");
    }
}