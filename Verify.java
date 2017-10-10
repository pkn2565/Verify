/**Author:Patrick Nguyen
 * Purpose:CSC200
 * License: Public
 * Application: Read username and password of user
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;


public class Verify extends Application {
	@Override
	public void start(Stage primarySage){
	//decares constants
	String knownUser = new String("Tanes");
	String knownPass = new String("CSC200");
	//creates JFX for username input
	TextInputDialog userName = new TextInputDialog();
	userName.setTitle("Enter Your Username");
	userName.setContentText("What is your Username?");
	Optional<String> user = userName.showAndWait();
	//creates JFX for password input
	TextInputDialog passWord = new TextInputDialog();
	passWord.setTitle("Enter Your Password");
	passWord.setContentText("What is your password?");
	Optional<String> pass = passWord.showAndWait();
	//creates if statement and output
	if ((user.get().equals (knownUser))&&(pass.get().equals(knownPass))) {
		System.out.println("Welcome " + knownUser);
	}
	//creates else statement and output
	else {
		System.out.println("Wrong Username or Password");
	}	

	
	
	}
}
