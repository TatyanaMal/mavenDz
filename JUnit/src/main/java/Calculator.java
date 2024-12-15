public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //Сложение
    public double summation(){
        return a + b;
    }

    //Вычитание
    public double subtraction(){
        return a - b;
    }

    //Деление
    public double division(){
        if(a == 0 || b == 0){
            System.out.println("Нельзя делить на 0");
            return 0;
        }
        return a / b;
    }

    //Умножение
    public double multiplication(){
        if(a == 0 || b == 0){
            System.out.println("Нельзя умножать на 0!");
            return 0;
        }
        return a * b;
    }

    //Возведение в степень
    public double degree(){
        return Math.pow(a, b);
    }
}
