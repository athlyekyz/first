import javax.swing.*;  
public class HolaMonFinestra2 {  
JFrame frame;  
HolaMonFinestra2(){  
    frame=new JFrame();  
    JOptionPane.showMessageDialog(frame,"Hola Món 2!","Programació 1r DAW",JOptionPane.WARNING_MESSAGE);     
}  
public static void main(String[] args) {  
    new HolaMonFinestra2();  
}  
}  