package project_teams;

public class project_details_screen {
    public void display() {
        System.out.print(details)
                //load details for this project the user selected
    }
    public void sendrequest(){
        //user selects to send requestt too this pproject team
    }
    public void successsend(){
        if(succes=1) {
            success_request_screen successsend = new success_request_screen();
            successsend.displaysend();
        }else {
           fail_request_screen fail = new fail_request_screen();
            fail.display();
        }
    }

}
