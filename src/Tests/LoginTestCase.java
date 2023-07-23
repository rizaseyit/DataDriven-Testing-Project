package Tests;

import POM.LoginPage;
import TestBase.DriverClass;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginTestCase extends DriverClass {

    @Test(dataProvider = "test")
    public void LoginTest(String myMail, String myPassword) throws Exception{

        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailAdress(myMail);
        loginPage.password(myPassword);
        loginPage.signIn();

    }
    @DataProvider(name="test")
    public Object[][] generateData() throws IOException {

        FileInputStream testFile = new FileInputStream("./TestData/TestData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(testFile);

        XSSFSheet sheet = workbook.getSheet("Login");

        int rownumbs = sheet.getPhysicalNumberOfRows();

        Object [][] testData = new Object[ rownumbs ][ 2 ];

        // this
        for ( int i = 0; i < rownumbs; i++){

            XSSFRow row = sheet.getRow( i );
            XSSFCell email = row.getCell(0);
            XSSFCell password = row.getCell(1);

            // storing value from cells
            testData [ i ][ 0 ] = email.getStringCellValue();
            testData [ i ][ 1 ] = password.getStringCellValue();

        }
        return testData;

    }


}
