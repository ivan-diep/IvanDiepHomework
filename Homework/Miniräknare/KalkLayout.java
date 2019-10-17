
import javafx.scene.Scene;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;


public class KalkLayout {

        public static void main(String[] args){
            // frame
            JFrame frame = new JFrame();

            frame.setTitle("Calclayout");
            //panel och dens layout
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4,3));
            //knappar till panel
            addButtons(panel, "7", "8", "9","4","5","6","1","2","3","+","-","=" );

            //visar vad som ska stå på skärmen
            JTextField textfield = new JTextField("0");
            textfield.setEditable(true);

            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.getContentPane().add(textfield,BorderLayout.NORTH);


            frame.pack();
            frame.setVisible(true);


        }

        private static void addButtons(Container container,String... string){
            for(String label  : string){
                container.add(new JButton(label));
            }
            }
        }