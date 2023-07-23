package assertions;

import org.openqa.selenium.WebDriver;

public class Comparisons {

    public static boolean urlValidation(WebDriver driver, String expectedURL){

        boolean valid = false;

        if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL)){
            valid = true;
        }
        return valid;
    }

    public static boolean pageTitleValidation(WebDriver driver, String expectedTitle){

        boolean valid = false;

        if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
            valid = true;
        }
        return valid;
    }
}
