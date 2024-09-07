public class Test {
    public static void main(String[] args){
       for (int x = 0; x <= 100; x++) {
            if (x == 101) {
              break;
            }
            if (x%2!=0){
                System.out.println(x+" is Odd"); 
             } else { System.out.println(x+" is Even");
            }
        }
    }
}

