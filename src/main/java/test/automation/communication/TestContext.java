package test.automation.communication;

import test.automation.base.SuperClass;
import test.automation.pages.PageObjectManager;

public class TestContext extends SuperClass {

    private PageObjectManager pageObjectManager;
    public ScenarioContext scenarioContext;

    public TestContext(){
        pageObjectManager = new PageObjectManager();
        scenarioContext = new ScenarioContext();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
