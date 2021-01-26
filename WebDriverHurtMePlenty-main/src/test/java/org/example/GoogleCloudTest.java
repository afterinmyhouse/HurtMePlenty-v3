package org.example;

import org.example.page.GoogleCloudPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class GoogleCloudTest {
    private static Browser browser;

    @BeforeAll
    public static void setup() {
        browser = Browser.getInstance();
    }

    @Test
    public void baseTest(){
        GoogleCloudPage page = new GoogleCloudPage();
        page.openPage();
        page.clickCookiesOk();
        page.searchField();
        page.clickFirstSearchResult();
        page.clickComputeEngine();
        page.fillNumberOfInstances();
        page.fillOperatingSystem();
        page.fillMachineClass();
        page.fillSeries();
        page.fillMachineType();
        page.chooseAddGPUs();
        page.fillNumberOfGPUs();
        page.fillGPUType();
        page.fillLocalSSD();
        page.fillDatacenterlocation();
        page.fillCommitUsage();
        page.tabAddToEstimate();

        Assertions.assertTrue(page.isVMClassCorrect());
        Assertions.assertTrue(page.isInstanceTypeCorrect());
        Assertions.assertTrue(page.isRegionCorrect());
        Assertions.assertTrue(page.islocalSSDCorrect());
        Assertions.assertTrue(page.isCommitMentTermCorrect());
        Assertions.assertTrue(page.isTotalEstimatedCostCorrect());

    }

    @AfterAll
    public static void tearDown() {
        browser.stopBrowser();
    }

}
