public class FloatAndDouble {
    public static void main(String args[]){
        float a=27f;

        // float a=27;-->Error because of it will understand as the double and float to to double typecasting is not possible
        double b=27;//27d

        System.out.println(a);
        System.out.println(b);
        System.out.println("Float minimum value is "+Float.MIN_VALUE + "float maximum value is "+Float.MAX_VALUE);
        System.out.println("Double minimum value is "+Double.MIN_VALUE + "Double maximum value is "+Double.MAX_VALUE);
        
        
    }
    
}
