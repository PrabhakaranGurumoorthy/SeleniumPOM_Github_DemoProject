package Testcases;

import BaseClass.common;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class gitflow extends common {
    HomePage home;
    LoginPage login;
    WelcomePage welcome;
    RepoPage repo;
    Createrepo create;
    SettingsPage setting;

    String reponame="repo1";
    @BeforeClass
    void setobjects(){
        home=new HomePage(driver);
        login=new LoginPage(driver);
        welcome=new WelcomePage(driver);
        repo=new RepoPage(driver);
        create=new Createrepo(driver);
        setting=new SettingsPage(driver);
    }
    @Test(priority = 1)
    void login(){
        home.clicksignin();
        login.login(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Test(priority = 2)
    void createRepo(){
        welcome.clicknewrepo();
        create.enterrepodetails(reponame,"Automated by selenium");
        boolean selectedrepotype=create.getselectedrepotype();
        if (selectedrepotype==false){
            create.clickrepo();
        }
//        Assert.assertTrue(repo.isrepocreated(reponame));

    }
    @Test(priority = 3)
    void deleteRepo() {
        reponame = "repo1";
        welcome.clicknewrepo();
        create.enterrepodetails(reponame, "Autoamted by selenium");
        boolean selectedrepotype = create.getselectedrepotype();
        if (selectedrepotype) {
            create.clickrepo();
        }
        Assert.assertTrue(repo.isrepocreated(reponame));
        repo.clicksetting();
        setting.clickdeleterepo(reponame,"TestProfile-01");
        String deletemsg=welcome.getdeletemessage();
        System.out.println(deletemsg);
        Assert.assertTrue(deletemsg.contains("deleted"));


    }
}
