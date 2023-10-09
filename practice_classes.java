class Method_1{
    int month;

    void print(){
        System.out.println("Hi I am runnung print method inside Method_1 class\n");
    }
    int calculate(int num){
        int monthleft = 12- num;
        return monthleft;
    }


}

public class practice_classes {
    public static void main(String[] args){

        Method_1 name = new Method_1();

        name.print();
        
        System.out.println(name.calculate(55));
    }
}
