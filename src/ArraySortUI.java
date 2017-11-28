import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

    public class ArraySortUI extends JFrame{

        JPanel p= new JPanel();
        JButton b= new JButton("Start");
        JTextField t= new JTextField("Array: ",20);
        JTextArea in = new JTextArea("Input : ",12,30);
        JTextArea out = new JTextArea("Output : ",12,30);




        public ArraySortUI(){
            super("\uD83C\uDF1A QuickSort \uD83C\uDF1E");

            setSize(450,500);
            setResizable(false);

            p.add(b);
            p.add(t);
            p.add(in);
            p.add(out);
            add(p);

            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }


//}
