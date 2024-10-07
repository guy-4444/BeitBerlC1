import java.util.Scanner;

public class SalaryCalculator {

    // https://www.kolzchut.org.il/he/%D7%94%D7%A9%D7%9B%D7%A8_%D7%94%D7%9E%D7%9E%D7%95%D7%A6%D7%A2
    public static final double AVERAGE_SALARY_FOR_SOCIAL_SECURITY = 12_536;

    public static void start() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("▧ ▧ ▧ ▧ ▧ Salary Calculator App ▧ ▧ ▧ ▧ ▧");
        System.out.println("Please enter your gross salary:");

        double input = scanner.nextDouble();
        double tax = calculateIncomeTax(input);
        double socialSecurity = calculateSocialSecurity(input, false);
        double healthTax = calculateHealthTax(input, false);

        System.out.println("Gross Salary: " + input);
        System.out.println("tax: " + tax);
        System.out.println("socialSecurity: " + socialSecurity);
        System.out.println("healthTax: " + healthTax);
    }

    public static double calculateSocialSecurity(double gross, boolean under18) {
        // https://www.kolzchut.org.il/he/%D7%93%D7%9E%D7%99_%D7%91%D7%99%D7%98%D7%95%D7%97_%D7%9C%D7%90%D7%95%D7%9E%D7%99_%D7%9C%D7%A2%D7%95%D7%91%D7%93_%D7%A9%D7%9B%D7%99%D7%A8
        final double AVERAGE_60 = AVERAGE_SALARY_FOR_SOCIAL_SECURITY * 0.6;
        final double MAX_FOR_CALCULATING = 49_030;

        double tax = 0;

        if (under18) {
            return 0;
        }

        if (gross <= 0) {
            return 0;
        }

        gross = Math.min(gross, MAX_FOR_CALCULATING);

        double bigPart = gross - AVERAGE_60;
        bigPart = Math.max(0, bigPart);
        tax += bigPart * 0.07;

        double smallPart = Math.min(gross, AVERAGE_60);
        tax += smallPart * 0.004;

        return tax;
    }

    public static double calculateHealthTax(double gross, boolean under18) {
        // https://www.kolzchut.org.il/he/%D7%93%D7%9E%D7%99_%D7%91%D7%99%D7%98%D7%95%D7%97_%D7%9C%D7%90%D7%95%D7%9E%D7%99_%D7%9C%D7%A2%D7%95%D7%91%D7%93_%D7%A9%D7%9B%D7%99%D7%A8
        final double AVERAGE_60 = AVERAGE_SALARY_FOR_SOCIAL_SECURITY * 0.6;
        final double MAX_FOR_CALCULATING = 49_030;

        double tax = 0;

        if (under18) {
            return 0;
        }

        if (gross <= 0) {
            return 0;
        }

        gross = Math.min(gross, MAX_FOR_CALCULATING);

        double bigPart = gross - AVERAGE_60;
        bigPart = Math.max(0, bigPart);
        tax += bigPart * 0.05;

        double smallPart = Math.min(gross, AVERAGE_60);
        tax += smallPart * 0.031;

        return tax;
    }

    public static double calculateIncomeTax(double gross) {
        final double[] steps = new double[]{0, 7_010, 10_060, 16_150, 22_440, 46_690, 60_130};
        final double[] prcnt = new double[]{10, 14, 20, 31, 35, 47, 50};

        if (gross <= 0) {
            return 0;
        }


        double tax = 0;

        for (int i = steps.length - 1; i >= 0; i--) {
            if (gross > steps[i]) {
                double part = gross - steps[i];
                double newTax = part * prcnt[i] / 100.0;
                tax += newTax;
                gross -= part;
            }
        }

        return tax;
    }

    public static double calculatePension(double gross) {


        return 0;
    }

    public static double calculateFund(double gross) {


        return 0;
    }
}
