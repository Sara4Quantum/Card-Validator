package CardValidate;

import org.springframework.stereotype.Component;

@Component // This marks the class as a Spring component, allowing it to be automatically detected and instantiated by the Spring framework.
public class input_collect { // Class declaration starts here

    // POJO (Plain Old Java Object) class for collecting input data.

    private String UserPanName; // Variable to store user PAN name.

    // Getter method for retrieving user PAN name.
    public String getUserPanName() {
        return UserPanName;
    }

    // Setter method for setting user PAN name.
    public void setUserPanName(String userPanName) {
        UserPanName = userPanName;
    }

    private String PanNo; // Variable to store PAN number.

    // Getter method for retrieving PAN number.
    public String getPanNo() {
        return PanNo;
    }

    // Setter method for setting PAN number.
    public void setPanNo(String panNo) {
        PanNo = panNo;
    }

    private String digit; // Variable to store digits.

    // Getter method for retrieving digits.
    public String getDigit() {
        return digit;
    }

    // Setter method for setting digits.
    public void setDigit(String digit) {
        this.digit = digit;
    }

    // Method to remove spaces from a string.
    public String removeSpace(String string) {
        String strNumber = getDigit();
        StringBuilder Number = new StringBuilder();

        // Iterate through each character in the string.
        for (int i = 0; i < strNumber.length(); i++) {
            char c = strNumber.charAt(i);
            if (!(strNumber.charAt(i) == ' ')) {
                Number.append(c); // Append non-space characters to the StringBuilder.
            }
        }
        return Number.toString(); // Return the string without spaces.
    }
}
