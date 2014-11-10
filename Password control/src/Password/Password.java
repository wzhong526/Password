package Password;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Password {
	private static final String PASS_FIELD = "pass field";

	   public Password() {
	      // TODO Auto-generated constructor stub
	   }

	   private static void createAndShowGui() {
	      final JPasswordField passwordField = new JPasswordField(10);

	      final CardLayout cardLayout = new CardLayout();
	      final JPanel cardPanel = new JPanel(cardLayout);
	      cardPanel.add(passwordField, PASS_FIELD);

	      JButton okBtn = new JButton("OK");
	      okBtn.addItemListener(new ItemListener() {

	         @Override
	         public void itemStateChanged(ItemEvent iEvt) {
	            if (iEvt.getStateChange() == ItemEvent.SELECTED) {
	               cardLayout.show(cardPanel, PASS_FIELD);
	               passwordField.requestFocusInWindow();
	            } else {
	               }
	         }
	      });

	      JButton helpBtn = new JButton("Help");
	      helpBtn.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent arg0) {
	        System.out.println("Error");
	         }
	      });

	      JPanel mainPanel = new JPanel();
	      mainPanel.add(cardPanel);
	      mainPanel.add(okBtn);
	      mainPanel.add(helpBtn);

	      JFrame frame = new JFrame("Password");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add(mainPanel);
	      frame.pack();
	      frame.setLocationByPlatform(true);
	      frame.setVisible(true);
	   }

	   public static void main(String[] args) {
	      SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            createAndShowGui();
	         }
	      });
	   }
}
