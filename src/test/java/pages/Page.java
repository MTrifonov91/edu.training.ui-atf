package pages;

import config.ScenarioContext;

public abstract class Page {
    public Page() {
        ScenarioContext.getInstance().setCurrentPage(this);
    }
}
