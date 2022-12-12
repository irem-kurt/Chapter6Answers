public class deneme {

    public static void main(String[] args) {
        int x = 0;
        for (int k=4 ; k<=10; k++){
            if (k%2 ==1)
                continue;
            x++;
        }
        System.out.println(x);
    }
}
