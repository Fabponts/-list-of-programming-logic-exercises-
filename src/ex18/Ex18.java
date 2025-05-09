package ex18;

public class Ex18 {
    public static void main(String[] args) {
        String boyName = "Francisco";
        String girlName = "Sarah";
        double boyheight = 1.50;
        double girlHeight = 1.10;
        int year = 0;

        for (year = 0; boyheight > girlHeight; year++){
            boyheight += 0.2;
            girlHeight +=0.3;
        }
        System.out.printf("In %d years %s will be higher than %s with: %.2f meters and him with %.2f"
                ,year,girlName,boyName,girlHeight,boyheight);
    }
}
