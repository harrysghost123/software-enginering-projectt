public class confirmation_window {

    public void loadConfirmationWindow(){
        //code for loading the confirmation window
    }

    public void accept(){
        //code for accepting the deletion of the discussion
        library_manager manager = new library_manager();
        manager.selectedDiscussion(2);
    }

    public void decline(){
        //code for declining the deletion of the discussion
        negative_answer_window negativeAnswer = new negative_answer_window();
        negativeAnswer.loadNegativeAnswerScreen();
    }
}
