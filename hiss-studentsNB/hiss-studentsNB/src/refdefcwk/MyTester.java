package refdefcwk;
/**
 * For possible solutions to Task 5 look at Task 1 & Task 4 testing
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class MyTester
{
//     public static void doTest1() 
//     {
//         // Task 1 testing
//         HISS gp = new Manager("Olenka",1000);
//         System.out.println("Display Jobs & Staff for Hire");
//         System.out.println(gp.getAllJobs());
//         System.out.println("*********************************");
//         System.out.println(gp.getAllAvailableStaff());
//         System.out.println("*********************************");
//         System.out.println(gp.toString());
//         System.out.println("*********************************");
//         System.out.println("Account:" + gp.getAccount());         
//         System.out.println("*********************************");
//  
//     }

    public static void hiringStaff()
    {
        HISS gp = new Manager("Olenka",1000);
        System.out.println("Hire Staff");
        System.out.println(gp.hireStaff("Alan"));
        System.out.println(gp.hireStaff("Gita"));
        System.out.println(gp.hireStaff("Hela"));
        // System.out.println(gp.hireStaff("John")); // No such Staff
        System.out.println("\n******Are Alan,Gita & Hela Hired ??");
        System.out.println(gp.toString());
        System.out.println("*********************************");
        System.out.println("\n*****Alan,Gita & Hela should not be on the list");
        System.out.println(gp.getAllAvailableStaff());
        System.out.println("*********************************");
        //Hire Staff - but no  money
        System.out.println("\n*****Hire  - no money. Fela not hired");
        System.out.println(gp.hireStaff("Fela"));
        System.out.println(gp.toString());
        System.out.println("*********************************"); 
    }
    
    public static void engDoingSoftware() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Bob");
        System.out.println("Account should be 900");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(102));
        System.out.println("Account should be 800");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void engDoingHwarNoExper() 
    {
        //eligible but inexperienced 
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Bob");
        System.out.println("Account should be 900");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(101));
        System.out.println("Account should be 750");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void engDoingHwarWithExper() 
    {
        //eligible with experience - job done
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Ceri");
        System.out.println("Account should be 750");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(101));
        System.out.println("Account should be 1550");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void programmerDoingHardware() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Gita");
        System.out.println("Account should be 800");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(101));
        System.out.println("Account should be 650");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void programmerDoingSoftwareNoExp() 
    {
        //eligible but inexperienced
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Gita");
        System.out.println("Account should be 800");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(102));
        System.out.println("Account should be 700");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void programmerDoingSoftwareWithExp() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Ela");
        System.out.println("Account should be 800");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(102));
        System.out.println("Account should be 1400");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void programmerDoingDesignWithExp() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Ela");
        System.out.println("Account should be 800");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(100));
        System.out.println("Account should be 1000");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void desDoingSoftwareWithProgNoExp() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Ian");
        System.out.println("Account should be 700");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(104));
        System.out.println("Account should be 350");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void desDoingSoftwareWithProgWithExp() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Ian");
        System.out.println("Account should be 700");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(102));
        System.out.println("Account should be 2500");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void desDoingDesignWithProgWithExp() 
    {
        //Not eligible
        HISS gp = new Manager("Olenka",1000);
        gp.hireStaff("Fela");
        System.out.println("Account should be 700");
        System.out.println("Account is" + gp.getAccount());
        System.out.println("Result is:" +  gp.doJob(100));
        System.out.println("Account should be 1600");
        System.out.println("Account is " + gp.getAccount());
    }
    
    public static void doingJobsInTeam1()
    {
        HISS gp = new Manager("Olenka",1000);
        // Main Functionality 
        // Hire Staff
        System.out.println("Hire Staff");
        System.out.println(gp.hireStaff("Alan"));
        System.out.println(gp.hireStaff("Gita"));
        System.out.println(gp.hireStaff("Hela"));
        
        //Do Job
        System.out.println("\n*****Do Job**********");
        System.out.println("\n*****After Hiring account should be 50");
        System.out.println("Account = " + gp.getAccount());
        System.out.println("\n*****Job done - Account will be 850");
        System.out.println(gp.doJob(101));
        System.out.println("\n*****Job lost on skill level - Account will be 650");
        System.out.println(gp.doJob(100));
        System.out.println("\n*****Job lost as no Staff - Account will be 300");
        System.out.println(gp.doJob(104));
        
    } 
    
    public static void doingJobsInTeam2()
    {
        HISS gp = new Manager("Olenka",1000);
        // Main Functionality 
        // Hire Staff
        System.out.println("Hire Staff");
        System.out.println(gp.hireStaff("Alan"));
        System.out.println(gp.hireStaff("Gita"));
        System.out.println(gp.hireStaff("Hela"));
        
        //Do Job
        System.out.println("\n*****Do Job**********");
        System.out.println("\n*****After Hiring account should be 50");
        System.out.println("Account = " + gp.getAccount());
        System.out.println("\n*****Job done - Account will be 850");
        System.out.println(gp.doJob(101));
        System.out.println("\n*****Job lost on skill level - Account will be 650");
        System.out.println(gp.doJob(100));
        System.out.println("\n*****Job lost as no Staff - Account will be 500");
        System.out.println(gp.doJob(101));
        
    } 
    
    public static void onHoliday()
    {
        HISS gp = new Manager("Olenka",1000);
        // Main Functionality 
        // Hire Staff
        System.out.println("Hire Staff");
        System.out.println(gp.hireStaff("Hela"));
        
        //Do Job
        System.out.println("\n*****Do Job**********");
        System.out.println("\n*****After Hiring account should be 850");
        System.out.println("Account = " + gp.getAccount());
        System.out.println("\n*****Job done - Account will be 1350");
        System.out.println(gp.doJob(101));
        System.out.println("\n*****Hela on holiday - not available - Account 1200");
        System.out.println(gp.doJob(101));
        System.out.println("\n*****Hela returns- job done - account = 2000");
        gp.staffRejoinTeam("Hela");
        System.out.println(gp.doJob(101));  
    } 
    
     public static void gettingOverdrawn()
    {
        HISS gp = new Manager("Olenka",1000);
        // Main Functionality 
        // Hire Staff
        System.out.println("Hire Staff");
        System.out.println(gp.hireStaff("Alan"));
        System.out.println(gp.hireStaff("Gita"));
        System.out.println(gp.hireStaff("Hela"));
        
        //Do Job
        System.out.println("\n*****Do Job**********");
        System.out.println("\n*****After Hiring account should be 50");
        System.out.println("Account = " + gp.getAccount());
        System.out.println("\n*****Job not done - Account will be -150");
        System.out.println(gp.doJob(100));
    }
    
}
