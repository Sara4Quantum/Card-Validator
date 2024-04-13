package CardValidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // This marks the class as a Spring MVC controller.
public class Card_Controller { // Class declaration starts here

    @Autowired
    Pan_Validation panVa; // Autowired dependency injection for PAN validation.

    @Autowired
    input_collect inc; // Autowired dependency injection for input collection.

    @Autowired
    Credit_or_Debit_Validation cdv; // Autowired dependency injection for credit/debit card validation.

  
    
    // Handler method for the main home page.
    @GetMapping("cardvalidator")
    public String mainHome_page() {
        
    	return "home.html"; // Return the view name for the main home page.
    
    }

    
    // Handler method for the credit/debit card search page.
    @GetMapping("creditsearch")
    public String credit_debit_Homepage() {
       
    	return "credit.html"; // Return the view name for the credit/debit card search page.
    
    }

    // Handler method for the PAN card search page.
    @GetMapping("pansearch")
    public String pan_card__Homepage() {
       
    	return "pan.html"; // Return the view name for the PAN card search page.
    
    }

    // Handler method for validating credit/debit card.
    @GetMapping("CreditDebitCard")
    public ModelAndView CreditDebit_validation(input_collect inc) {
        
    	ModelAndView mav = new ModelAndView();

        // Validate credit/debit card using the Credit_or_Debit_Validation class.
        int C_D_Result = cdv.valida(inc);

        // Check if the total sum of credit/debit card numbers is divisible by 10.
        if (C_D_Result % 10 == 0) {
           
        	mav.setViewName("creditValid.html"); // Set view name for valid credit/debit card.
            
        	System.out.println(C_D_Result); // Print the total sum of credit/debit card numbers.
            
        	return mav;
        }

        mav.setViewName("creditInvalid.html"); // Set view name for invalid credit/debit card.
        
        System.out.println(C_D_Result); // Print the total sum of credit/debit card numbers.
        return mav;
    }

    // Handler method for validating PAN card.
    @GetMapping("PanCardValidation")
    public ModelAndView pan_validation(input_collect inc) {
    	
        // Validate PAN card using the Pan_Validation class.
        
    	ModelAndView panresult = panVa.pan_valida(inc);
        
    	return panresult;
    
    }
}
