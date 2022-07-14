package co.com.certificacion.google.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

        public static final Target LBL_PRICE = Target.the("shoping").located(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/span[1]"));
        public static final Target Insert_Info = Target.the("shoping").located(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
        public static final Target TXT_Criteria = Target.the("shoping").located(By.xpath("//textarea[@id='tw-source-text-ta']"));

        public static final Target COMPROBATE_CATEGORIES = Target.the("shoping").located(By.xpath("//a[contains(text(),'{0}')]"));


}
