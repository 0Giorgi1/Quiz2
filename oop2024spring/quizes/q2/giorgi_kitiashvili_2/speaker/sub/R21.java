package quizes.q2.giorgi_kitiashvili_2.speaker.sub;

// Import class A21 from the speaker package
import quizes.q2.giorgi_kitiashvili_2.speaker.A21;

// Import class A22 from the speaker package
import quizes.q2.giorgi_kitiashvili_2.speaker.A22;

public class R21 {
    public static void main(String[] args) {
        // Calculate the area of the rectangle
        int area = A21.hei * A21.len;

        // Use variables from A21 and A22
        System.out.println("Height: " + A21.hei);
        System.out.println("Length: " + A21.len);
        System.out.println("Month: " + getMonthName(A22.month));

        // Print the area of the rectangle
        System.out.println("Area of the rectangle: " + area);
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
