package warmcoffe;

import GUI.LoginView;

public class Login extends LoginView {
	Users users;
	public Login(Users users) {
		super();
		this.users=users;
	}

	@Override
	protected boolean login(String username) {
		if(users.isUser(username)) return true;
		else return false;
		
		//if true?
    	//MainMenu menuWindow=new MainMenu(username);
    	//menuWindow.setVisible(true);
	}

	@Override
	protected void showHelpGUI() {
		// TODO Auto-generated method stub

	}

}
