public class Main {
    public static void main(String[] args) {
        int number = 371;
        System.out.println(armstrong(number));
    }

    private static boolean armstrong(int number) {
        String n = number+"";

        int tot = 0;
        int tam = n.length();
        for(int i=0;i<tam;i++){
            int sum = 0;
            sum += Math.pow(Character.getNumericValue(n.charAt(i)),tam);
            tot = tot+sum;
        }
        return number==tot;
    }
}
