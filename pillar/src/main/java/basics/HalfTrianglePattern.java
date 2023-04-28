package basics;

public class HalfTrianglePattern {
    public static void main(String[] args) {
        halfTriangleUp();
        halfTriangleDown();
    }

    public static void halfTriangleUp(){
        for(int i = 1; i < 6; i++){
            System.out.println("#".repeat(i));
        }
    }

    public static void halfTriangleDown(){
        for(int i = 5; i > 0; i--){
            System.out.println("#".repeat(i));
        }
    }
    
}
