package org.example.page;

import org.example.Browser;
import org.openqa.selenium.*;

public class GoogleCloudPage {

    private Browser browser;
    private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView(true);";
    private static final String GOOGLE_CLOUD_PAGE_URL = " https://cloud.google.com/";
    private static final String COOKIES_OK = "/html/body/devsite-snackbar/div/div/button";
    private static final String SEARCH_XPATH = " //input[@name='q']";
    private static final String SEARCH_VALUE = "Google Cloud Platform Pricing Calculator" ;
    private static final String FIRST_RESULT_XPATH = "(//a[@class='gs-title']/b)[1]";
    private static final String COMPUTE_ENGINE_XPATH = "//md-tab-item//div[text()='Compute Engine']";
    private static final String NUMBER_OF_INSTANCES_XPATH = "//input[@ng-model='listingCtrl.computeServer.quantity']";
    private static final String NUMBER_OF_INSTANCES_VALUE = "4";
    private static final String MACHINE_CLASS_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.class']";
    private static final String MACHINE_CLASS_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='regular']";
    private static final String OPERATING_SYSTEM_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.os']";
    private static final String OPERATING_SYSTEM_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='free']";
    private static final String SERIES_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.series']";
    private static final String SERIES_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='n1']";
    private static final String MACHINE_TYPE_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.instance']";
    private static final String MACHINE_TYPE_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']";
    private static final String ADD_GPUS_CHECKBOX_XPATH = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']";
    private static final String NUMBER_OF_GPUS_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.gpuCount']";
    private static final String NUMBER_OF_GPUS_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']";
    private static final String GPUS_TYPE_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.gpuType']";
    private static final String GPUS_TYPE_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='NVIDIA_TESLA_V100']";
    private static final String LOCAL_SSD_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.ssd']";
    private static final String LOCAL_SSD_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']";
    private static final String DATACENTER_LOCATION_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.location']";
    private static final String DATACENTER_LOCATION_VALUE = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='europe-west3']";
    private static final String COMMIT_USAGE_XPATH = "//md-select[@ng-model='listingCtrl.computeServer.cud']";
    private static final String COMMIT_USAGE_VALUE= "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']";
    private static final String ADD_TO_ESTIMATE_XPATH = "//button[@ng-click='listingCtrl.addComputeServer(ComputeEngineForm);']";
    public GoogleCloudPage() {
      browser = Browser.getInstance();
    }


    private WebElement waitVisible(String xpathLocator) {
        WebElement el = browser.waitVisible(xpathLocator);
        return el;
    }
    public void clickCookiesOk(){

        waitVisible(COOKIES_OK).click();
    }
    public void openPage(){
        browser.open(GOOGLE_CLOUD_PAGE_URL);
    }
    public void searchField(){
        waitVisible(SEARCH_XPATH).click();
        waitVisible(SEARCH_XPATH).sendKeys(SEARCH_VALUE);
        waitVisible(SEARCH_XPATH).sendKeys(Keys.ENTER);
    }
    public void clickFirstSearchResult(){

        waitVisible(FIRST_RESULT_XPATH).click();
    }
    public void clickComputeEngine(){
        WebDriver driver = browser.getWrappedDriver();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        waitVisible(COMPUTE_ENGINE_XPATH).click();

    }
    public void fillNumberOfInstances(){
        waitVisible(NUMBER_OF_INSTANCES_XPATH).click();
        waitVisible(NUMBER_OF_INSTANCES_XPATH).sendKeys(NUMBER_OF_INSTANCES_VALUE);
    }

    public void fillMachineClass(){
       WebElement element = waitVisible(COMPUTE_ENGINE_XPATH);
       ((JavascriptExecutor) browser.getWrappedDriver()).executeScript(SCROLL_SCRIPT, element);

        waitVisible(MACHINE_CLASS_XPATH).click();
        browser.waitClickable(MACHINE_CLASS_VALUE).click();
    }

    public void fillOperatingSystem(){
        waitVisible(OPERATING_SYSTEM_XPATH).click();
        browser.waitClickable(OPERATING_SYSTEM_VALUE).click();
    }

    public void fillSeries(){
        waitVisible(SERIES_XPATH).click();
        browser.waitClickable(SERIES_VALUE).click();

    }
    public void fillMachineType(){

        waitVisible(MACHINE_TYPE_XPATH).click();
        browser.waitClickable(MACHINE_TYPE_VALUE).click();

    }

    public void chooseAddGPUs(){
        WebElement element = waitVisible(MACHINE_CLASS_XPATH);
        ((JavascriptExecutor) browser.getWrappedDriver()).executeScript(SCROLL_SCRIPT, element);
        waitVisible(ADD_GPUS_CHECKBOX_XPATH).click();
    }

    public void fillNumberOfGPUs(){
        waitVisible(NUMBER_OF_GPUS_XPATH).click();
        browser.waitClickable(NUMBER_OF_GPUS_VALUE).click();
    }
    public void fillGPUType(){
        waitVisible(GPUS_TYPE_XPATH).click();
        browser.waitClickable(GPUS_TYPE_VALUE).click();
    }
    public void fillLocalSSD(){
        waitVisible(LOCAL_SSD_XPATH).click();
        browser.waitClickable(LOCAL_SSD_VALUE).click();
    }
    public void fillDatacenterlocation(){
        waitVisible(DATACENTER_LOCATION_XPATH).click();
        browser.waitClickable(DATACENTER_LOCATION_VALUE).click();
    }

    public void fillCommitUsage(){
        waitVisible(COMMIT_USAGE_XPATH).click();
        browser.waitClickable(COMMIT_USAGE_VALUE).click();

    }
    public void tabAddToEstimate(){
        WebElement element = waitVisible(DATACENTER_LOCATION_XPATH);
        ((JavascriptExecutor) browser.getWrappedDriver()).executeScript(SCROLL_SCRIPT, element);
        browser.waitClickable(ADD_TO_ESTIMATE_XPATH).click();

    }

    public boolean isVMClassCorrect(){
        boolean result = false;
        try {
            String expectedValue = "VM class: regular";
            String xpathString = "//div[contains(text(),'VM class: regular')]";
            waitVisible(xpathString);
            result = expectedValue.equals(waitVisible(xpathString).getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean isInstanceTypeCorrect(){
        boolean result = false;
        try {
            String expectedValue = "Instance type: n1-standard-8";
            String xpathString = "//div[contains(text(),'Instance type: n1-standard-8')]";
            waitVisible(xpathString);
            result = expectedValue.equals(waitVisible(xpathString).getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean islocalSSDCorrect(){
        boolean result = false;
        try {
            String expectedValue = "Total available local SSD space 2x375 GiB";
            String xpathString = "//div[contains(text(),'Total available local SSD space 2x375 GiB')]";
            waitVisible(xpathString);
            result = expectedValue.equals(waitVisible(xpathString).getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean isRegionCorrect(){
        boolean result = false;
        try {
            String expectedValue = "Region: Frankfurt";
            String xpathString = "//div[contains(text(),'Region: Frankfurt')]";
            waitVisible(xpathString);
            result = expectedValue.equals(waitVisible(xpathString).getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean isCommitMentTermCorrect(){
        boolean result = false;
        try {
            String expectedValue = "Commitment term: 1 Year";
            String xpathString = "//div[contains(text(),'Commitment term: 1 Year')]";
            waitVisible(xpathString);
            result = expectedValue.equals(waitVisible(xpathString).getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean isTotalEstimatedCostCorrect(){
        boolean result = false;
        try {
            String xpathString = "//b[contains(text(),'Estimated Component Cost:') and contains( text(),'USD 1,082.77')  and contains( text(),'per 1 month')]";
            waitVisible(xpathString);
            result = true;

        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
