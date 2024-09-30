import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HolaMonFinestra {

	JFrame frame;  
	HolaMonFinestra(){  
	    frame=new JFrame();  
	    JOptionPane.showMessageDialog(frame,"Hola Món!");  
	}  
	public static void main(String[] args) {  
	    new HolaMonFinestra();  
	}  

}
