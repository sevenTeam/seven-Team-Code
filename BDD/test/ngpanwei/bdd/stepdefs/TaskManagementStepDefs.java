package ngpanwei.bdd.stepdefs;

import ngpanwei.backlog.Backlog;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskManagementStepDefs {
    Backlog backlog = null ;
    @Before
    public void setup() {
        backlog = new Backlog() ;
    }
	@Given("^�Ŷ�������TaskABC��$")
	public void �Ŷ�������_TaskABC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^�Ŷ�������TaskDEF��$")
	public void �Ŷ�������_TaskDEF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^�Ŷ���ɡ�TaskABC��$")
	public void �Ŷ����_TaskABC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^�Ŷӵ�δ��������ǡ�TaskDEF��$")
	public void �Ŷӵ�δ���������_TaskDEF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
