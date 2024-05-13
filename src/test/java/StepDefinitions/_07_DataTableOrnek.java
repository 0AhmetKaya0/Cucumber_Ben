package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _07_DataTableOrnek {
    @When("write username {string}")
    public void writeUsername(String arg0) {
        System.out.println( arg0);
    }

    @And("write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String arg0, String arg1) {
        System.out.println(arg0+" "+arg1);

    }

    @And("write username as DataTable")
    public void writeUsernameAsDataTable(DataTable userlar) {
        List<String>ListUserlar=userlar.asList(String.class);

        for (String user:ListUserlar){
            System.out.println("user = " + user);
        }
    }

    @And("write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable userPass) {
        List<List<String>> ListUserPass=userPass.asLists(String.class);

        for (int i = 0; i <ListUserPass.size() ; i++) {
            System.out.println(ListUserPass.get(i).get(0)+" "+ListUserPass.get(i).get(1));

        }
    }
}
