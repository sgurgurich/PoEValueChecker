package Main;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;

import DataInterface.*;
import UserInterface.*;

public class Main {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		DatabaseGrabber dbg = new DatabaseGrabber();
		dbg.grabCurrentDatabase();
		
		MainGUIWindow.main(args);
		
	}

}
