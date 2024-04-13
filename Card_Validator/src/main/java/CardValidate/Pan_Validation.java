package CardValidate;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component // This marks the class as a Spring component, allowing it to be automatically detected and instantiated by the Spring framework.

public class Pan_Validation { // Class declaration starts here

    // Method to validate PAN (Permanent Account Number).
    public ModelAndView pan_valida(input_collect inc) { // Method declaration starts here
       
    	ModelAndView mav = new ModelAndView(); // Create a new ModelAndView object to handle view rendering.

        // Extract PAN details from the input_collect object.
        String User_panName = inc.getUserPanName();
        String PanName = User_panName.toUpperCase();
        String PanNo = inc.getPanNo();

        // Initialize an ArrayList to store PAN types.
        ArrayList<Character> TypePan = new ArrayList<Character>();

        // Define types of PAN.
        String TypesOfPan = "PBAHCEFTGLJ";

        // Extract characters from TypesOfPan and add them to TypePan ArrayList.
        for (int i = 0; i < TypesOfPan.length(); i++) {
            TypePan.add(TypesOfPan.charAt(i));
        }

        // Define the pattern for PAN validation.
        String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]";
        Pattern patternobj = Pattern.compile(panPattern);
        Matcher matcherobj = patternobj.matcher(PanNo);

        // Perform PAN validation.
        if ((matcherobj.find()) && (TypePan.contains(PanNo.charAt(3))) && (PanNo.charAt(4) == PanName.charAt(0))) {
            mav.setViewName("panValid.html"); // Set view name for valid PAN.
            return mav;
        } else {
            mav.setViewName("panInvalid.html"); // Set view name for invalid PAN.
            return mav;
        }
    } // Method ends here
} // Class ends here
