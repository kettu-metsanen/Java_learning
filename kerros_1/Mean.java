public class Mean {
    public static void main(String[] args) {
        double summ =0;
        double sch = 0;
        for(String i : args){
            summ += Double.parseDouble(i);
            sch++;
        }
        System.out.println("Mean: " + summ/sch);
    }
}
