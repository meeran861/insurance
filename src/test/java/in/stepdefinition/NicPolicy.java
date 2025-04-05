package in.stepdefinition;

import java.awt.AWTException;

import in.objRepository.NicPom;
import in.utilityclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NicPolicy {
	BaseClass base = new BaseClass();
	NicPom ni = new NicPom();
	
	@Given("user launch insurance application {string}")
	public void user_launch_insurance_application(String string) {
		  base.applicationlaunch(string);
	 
	}
	@Given("user select the guest login")
	public void user_select_the_guest_login() {
		base.javascriptscrolldown(ni.getUser_guest());
		base.setImplicitWait();
		base.javascriptexecutorclick(ni.getUser_guest());
	}
	
	@Then("user close the instruction popup")
	public void user_close_the_instruction_popup() {
		try {
	        //  if (base != null) {
			  base.waitForelementToBeClickable(ni.getUser_close());
	          base.moveTo(ni.getUser_close());
	          base.actclick(ni.getUser_close());
	       //   }
	      } catch (Exception e) {
	          System.out.println("close the popup: " + e.getMessage());
	      } 
	}


	@When("user click check premium of two wheeler policy")
	public void user_click_check_premium_of_two_wheeler_policy() {
		base.waitForelementToBeClickable(ni.getUser_checkpremium());
		base.javascriptexecutorclick(ni.getUser_checkpremium());
	    
	}
	@Then("user fills out the application form with valid details")
	public void user_fills_out_the_application_form_with_valid_details() throws InterruptedException {
		base.waitForelementToBeClickable(ni.getUser_type());
		base.javascriptexecutorclick(ni.getUser_type());
		base.button(ni.getUser_new());
		base.waitForelementToBeClickable(ni.getUser_plan());
		base.button(ni.getUser_plan());
		base.button(ni.getUser_year());
		base.button(ni.getUser_class());
		base.button(ni.getUser_motor());
		base.javascriptscrolldown(ni.getUser_location());
		base.button(ni.getUser_location());
		base.button(ni.getUser_delhi());
		base.button(ni.getUser_make());
		base.button(ni.getUser_adms());
		base.button(ni.getUser_model());
		base.waitForelementToBeClickable(ni.getUser_boxer());
		base.button(ni.getUser_boxer());
		base.javascriptexecutorclick(ni.getUser_variant());
		base.waitForelementToBeClickable(ni.getUser_standard());
		base.actclick(ni.getUser_standard());
	}
	@Then("user click policy quotation")
	public void user_click_policy_quotation() {
	    base.button(ni.getUser_generate());
	    System.out.println("Scenario 1 : Completed");
	}
	
	@When("user click cashless guarage")
	public void user_click_cashless_guarage() {
		 base.waitForelementToBeClickable(ni.getUser_cashless());
	     base.moveTo(ni.getUser_cashless());
	     base.actclick(ni.getUser_cashless());
	     base.childWindow();
	}
	
	@When("user search the products in search bar  {string}")
	public void user_search_the_products_in_search_bar(String string) throws AWTException{		
		base.button(ni.getUser_search());
		base.inputKeys(ni.getUser_search(), string);
	    base.roboclass();
	}

	@When("user click the products")
	public void user_click_the_products() {
		base.moveTo(ni.getUser_car());
		base.actclick(ni.getUser_car());
	}

	@When("user select claim procedure")
	public void user_select_claim_procedure() {
		base.moveTo(ni.getUser_claim());
		base.actclick(ni.getUser_claim());
	    
	}

	@Then("user scrolldown in claim procedure")
	public void user_scrolldown_in_claim_procedure() {
		base.moveTo(ni.getUser_garages());
	}

	@Then("user select the list of cashless garage")
	public void user_select_the_list_of_cashless_garage() {
	   base.button(ni.getUser_garages());
	}

	@Then("user download list of service center")
	public void user_download_list_of_service_center() {
	    base.moveTo(ni.getUser_service());
	    base.actclick(ni.getUser_service());
	    System.out.println("Scenario 2 : Completed");
	}


	@When("user select the products")
	public void user_select_the_products() {
	      base.button(ni.getUser_prod());
	}

	@Then("user click health insurance")
	public void user_click_health_insurance() {
	      base.button(ni.getUser_health());
	}

	@Then("user select national mediclaim policy")
	public void user_select_national_mediclaim_policy() {
	       base.button(ni.getUser_mediclaim());
	}

	@Then("user click download options")
	public void user_click_download_options() {
		   base.waitForelementToBeClickable(ni.getUser_downloads());
	       base.javascriptexecutorclick(ni.getUser_downloads());
	}

	@Then("user select the policy details")
	public void user_select_the_policy_details() {
	       base.waitForelementToBeClickable(ni.getUser_policy());
	       base.javascriptexecutorclick(ni.getUser_policy());
	       System.out.println("Scenario 3 : Completed");
	}
	
	@When("user select the products in home page")
	public void user_select_the_products_in_home_page() {
	      base.button(ni.getUser_product());
	}

	@Then("user click travel insurance")
	public void user_click_travel_insurance() {
	      base.waitForelementToBeClickable(ni.getUser_travel());
	      base.javascriptexecutorclick(ni.getUser_travel());
	}

	@Then("user select national overseas policy insurance")
	public void user_select_national_overseas_policy_insurance() {
	      base.waitForelementToBeClickable(ni.getUser_overseas());
	      base.javascriptexecutorclick(ni.getUser_overseas());
	}

	@Then("user click claim procedure options")
	public void user_click_claim_procedure_options() {
		  base.waitForelementToBeClickable(ni.getUser_claimprocedure());
		  base.javascriptexecutorclick(ni.getUser_claimprocedure());
	}

	@Then("user scrolldown to view required documents")
	public void user_scrolldown_to_view_required_documents() {
		  base.javascriptscrolldown(ni.getUser_documents());
		  System.out.println("Scenario 4 : Completed");
	    
	}
	

	@When("user select the products in home")
	public void user_select_the_products_in_home() {
		base.button(ni.getUser_pro());
	}

	@Then("user click home and property")
	public void user_click_home_and_property() {
		base.waitForelementToBeClickable(ni.getUser_home());
	    base.javascriptexecutorclick(ni.getUser_home());
	}

	@Then("user select National Bharat Griha Raksha policy")
	public void user_select_National_Bharat_Griha_Raksha_policy() {
		base.waitForelementToBeClickable(ni.getUser_griha());
	    base.javascriptexecutorclick(ni.getUser_griha());
	}

	@Then("user click download function")
	public void user_click_download_function() {
		base.waitForelementToBeClickable(ni.getUser_down());
		base.javascriptexecutorclick(ni.getUser_down());
	}

	@Then("user select the policy form")
	public void user_select_the_policy_form() {
		base.waitForelementToBeClickable(ni.getUser_form());
		base.javascriptexecutorclick(ni.getUser_form());
	    System.out.println("Scenario 5 : Completed");
	}
}

