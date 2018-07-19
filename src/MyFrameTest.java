import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyFrameTest extends JFrame{

    public MyFrameTest() {
        setTitle("test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        JButton btn = new JButton("Click");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Тук-тук");
            }
        });
        JLabel lbl = new JLabel("Hello World");
        JTextField field = new JTextField();
        //getContentPane().add(lbl);
        JPanel blp = new JPanel((new BorderLayout()));
        blp.setBorder(BorderFactory.createLineBorder(Color.red));
        //setLayout(blp);
        add(btn, BorderLayout.NORTH);
        add(field,BorderLayout.CENTER);
        add(lbl, BorderLayout.SOUTH);
        add(blp, BorderLayout.EAST);
        blp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println(e.getX()+" "+getY());
            }
        });


        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("text");
            }
        });

        setVisible(true);
    }
}
