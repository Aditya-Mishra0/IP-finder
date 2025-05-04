import javax.swing.* ;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpFinder{
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("IP finder ") ;
        jFrame.setBounds(100,100,400,300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null) ;

        JLabel label = new JLabel("Enter the URL: ") ;
        label.setBounds(50,30,150,20);

        JTextField textField = new JTextField() ;
        textField.setBounds(50,60,200,25);

        JButton button = new JButton("Find IP ") ;
        button.setBounds(50,100,100,30);

        button.addActionListener(e -> {
            String url = textField.getText() ;
            try {
                InetAddress ia = InetAddress.getByName(url) ;
                String ip = ia.getHostAddress() ;
                JOptionPane.showMessageDialog(jFrame,ip);
            } catch (UnknownHostException ex) {
                JOptionPane.showMessageDialog(jFrame,"URL not found ","Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        jFrame.add(label) ;
        jFrame.add(textField) ;
        jFrame.add(button) ;

       jFrame.setVisible(true);
    }
}