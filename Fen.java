import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Fen extends JFrame {
	JLayeredPane layeredPane ;
	JTabbedPane tabbedPane ;
	
	// classe responcable a toute conversion
	Conversion cnv=new Conversion();
	// fin appel
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JComboBox comboBox;
	JComboBox comboBox_1;
	JComboBox comboBox_2;

	JComboBox comboBox_3;
	JComboBox comboBox_4;
	JComboBox comboBox_5;
	
	
	 
	
	
	// fonction pour tester si une chaine contient un nombre ou nn
	 Boolean isNumber(String str) {
		 int c=0;
		 for(int i=0;i<str.length();i++) {
			 if (str.charAt(i)!='.') {
			 if(Character.isDigit(str.charAt(i))==false ) return false;}
			 if(str.charAt(i)=='.') {
				 c++;
			 if(c>1) return false;
			 }
			 
		 }
		 
		 return true;
	 }
// fin fonction
	 
	 
	Fen(){
		setTitle("Convertusseur");
		 
		
 		this.setBounds(100, 100, 465, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

		layeredPane = new JLayeredPane();
		this.getContentPane().add(layeredPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 548, 273);
		layeredPane.add(tabbedPane);
		
		
		
		//pour afficher les images dans des labels
		
		Image img= new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
		Image img1= new ImageIcon(this.getClass().getResource("/lng.jpg")).getImage();
		Image img2= new ImageIcon(this.getClass().getResource("/balance-roberval.jpg")).getImage();
		JDesktopPane desktopPane_2 = new JDesktopPane();
		tabbedPane.addTab("Masse", null, desktopPane_2, null);
		
		        // fin declaration
				
				
				
				
				textField_2 = new JTextField();
				textField_2.setText("0");
				
				textField_2.setBounds(10, 180, 188, 20);
				desktopPane_2.add(textField_2);
				textField_2.setColumns(10);
				
				textField_3 = new JTextField();
				
				textField_3.setBounds(217, 180, 194, 20);
				desktopPane_2.add(textField_3);
				textField_3.setColumns(10);
				
				 comboBox_2 = new JComboBox();
				 
				 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Kg", "Mg", "G"}));
				 comboBox_2.setBounds(10, 152, 188, 20);
				 desktopPane_2.add(comboBox_2);
				 
				   comboBox_3 = new JComboBox();
				   
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Kg", "Mg", "G"}));
		comboBox_3.setBounds(217, 149, 194, 20);
		desktopPane_2.add(comboBox_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 11, 487, 130);
		// ajout d'image dans label
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
				// ajout de label dans desktopPane == Tabconclor en c#
				desktopPane_2.add(lblNewLabel_2);
				JDesktopPane desktopPane_1 = new JDesktopPane();
				tabbedPane.addTab("Longeur", null, desktopPane_1, null);
				
				
				textField_4 = new JTextField();
				textField_4.setText("0");
				
				textField_4.setBounds(25, 188, 197, 20);
				desktopPane_1.add(textField_4);
				textField_4.setColumns(10);
				
				textField_5 = new JTextField();
				
				textField_5.setText("0");
				textField_5.setBounds(250, 188, 178, 20);
				desktopPane_1.add(textField_5);
				textField_5.setColumns(10);
				
				  comboBox_4 = new JComboBox();
				  
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Km", "M", "Cm"}));
		comboBox_4.setBounds(25, 157, 197, 20);
		desktopPane_1.add(comboBox_4);
		
		  comboBox_5 = new JComboBox();
		  
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Km", "M", "Cm"}));
		comboBox_5.setBounds(250, 157, 180, 20);
		desktopPane_1.add(comboBox_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(25, 11, 403, 135);
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		
				desktopPane_1.add(lblNewLabel_1);
				
				JDesktopPane desktopPane = new JDesktopPane();
				tabbedPane.addTab("Temperture", null, desktopPane, null);
				
				
				textField = new JTextField();
				textField.setText("0");
				
				
				textField.setBounds(20, 169, 197, 20);
				desktopPane.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setText("0");
				textField_1.setBounds(227, 169, 213, 20);
				desktopPane.add(textField_1);
				textField_1.setColumns(10);
				
				JComboBox comboBox11 = new JComboBox();
				
				comboBox11.setModel(new DefaultComboBoxModel(new String[] {"Celisius", "Fahrenheit", "Kelvin"}));
 				comboBox11.setBounds(20, 138, 197, 20);
				desktopPane.add(comboBox11);
				
				JComboBox comboBox_1_1 = new JComboBox();
				
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Celisius", "Fahrenheit", "Kelvin"}));
				comboBox_1_1.setBounds(227, 138, 213, 20);
				desktopPane.add(comboBox_1_1);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(20, 0, 318, 127);
				lblNewLabel.setIcon(new ImageIcon(img));
				
				desktopPane.add(lblNewLabel);
				
				
				
				textField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						 
						if(textField.getText().equals("")) textField.setText(""+0);

					 
					 
							if(isNumber(textField.getText())==false) {
								textField.setText(""+0);
							
                textField_1.setText(""+cnv.tmp(Double.parseDouble(textField.getText()),comboBox11.getSelectedItem().toString(), comboBox_1_1.getSelectedItem().toString()));
							}
							
							
							else  textField_1.setText(""+cnv.tmp(Double.parseDouble(textField.getText()),comboBox11.getSelectedItem().toString(), comboBox_1_1.getSelectedItem().toString()));

						 
						
					}
				});
				
				
				textField_1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
 				 
						if(textField_1.getText().equals("")) textField_1.setText(""+0);
						
						if(isNumber(textField_1.getText())==false) {
							textField_1.setText(""+0);
                textField.setText(""+cnv.tmp(Double.parseDouble(textField_1.getText()),comboBox_1_1.getSelectedItem().toString(), comboBox11.getSelectedItem().toString()));

						}
						
						
						else  textField.setText(""+cnv.tmp(Double.parseDouble(textField_1.getText()),comboBox_1_1.getSelectedItem().toString(), comboBox11.getSelectedItem().toString()));

						
					}
				});
				
				 
				 
				 // test des comboBox
				 
				 
				comboBox11.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						//System.out.println(comboBox11.getSelectedItem().toString());
                textField_1.setText(""+cnv.tmp(Double.parseDouble(textField.getText()),comboBox11.getSelectedItem().toString(), comboBox_1_1.getSelectedItem().toString()));

					}
				});
				
				comboBox_1_1.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
                textField_1.setText(""+cnv.tmp(Double.parseDouble(textField.getText()),comboBox11.getSelectedItem().toString(), comboBox_1_1.getSelectedItem().toString()));

					}
				});
				
				
				
				
				// implementation de chaque listnner  ecouteur  pour 12 attributs 
				
				
				
				
				textField_4.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						
						// test si un champ est  vide

						if(textField_4.getText().equals("")) textField_4.setText(""+0);

						
						// test si un champs contient autre qu'un nombre
						 
						if(isNumber(textField_4.getText())==false) {
					    textField_4.setText(""+0);
						textField_5.setText(""+cnv.Longeur(Double.parseDouble(textField_4.getText()),comboBox_4.getSelectedItem().toString(), comboBox_5.getSelectedItem().toString()));
						}
						else textField_5.setText(""+cnv.Longeur(Double.parseDouble(textField_4.getText()),comboBox_4.getSelectedItem().toString(), comboBox_5.getSelectedItem().toString()));

						
					}
				});
				
				// meme chsoe se repete jusqu'a la fin 
				
				textField_5.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						if(textField_5.getText().equals("")) textField_5.setText(""+0);

						 
						if(isNumber(textField_5.getText())==false) {
							textField_5.setText(""+0);
						textField_4.setText(""+cnv.Longeur(Double.parseDouble(textField_5.getText()),comboBox_5.getSelectedItem().toString(), comboBox_4.getSelectedItem().toString()));
						}
						
						else textField_4.setText(""+cnv.Longeur(Double.parseDouble(textField_5.getText()),comboBox_5.getSelectedItem().toString(), comboBox_4.getSelectedItem().toString()));

						
					}
				});
				
				
				 comboBox_4.addItemListener(new ItemListener() {
					  	public void itemStateChanged(ItemEvent e) {
					  		
							textField_5.setText(""+cnv.Longeur(Double.parseDouble(textField_4.getText()),comboBox_4.getSelectedItem().toString(), comboBox_5.getSelectedItem().toString()));

					  	}
					  });
				 
				 
				 comboBox_5.addItemListener(new ItemListener() {
			  	public void itemStateChanged(ItemEvent e) {
					textField_5.setText(""+cnv.Longeur(Double.parseDouble(textField_4.getText()),comboBox_4.getSelectedItem().toString(), comboBox_5.getSelectedItem().toString()));

			  	}
			  });
				
				
				
				textField_2.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent arg0) {
						if(textField_2.getText().equals("")) textField_2.setText(""+0);

						 
					 
						if(isNumber(textField_2.getText())==false) {
							
							textField_2.setText(""+0);
						
                textField_3.setText(""+cnv.masse(Double.parseDouble(textField_2.getText()),comboBox_2.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString()));
						 
                }
                
                
                else  textField_3.setText(""+cnv.masse(Double.parseDouble(textField_2.getText()),comboBox_2.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString()));

					}
				});
				
				
				
				textField_3.addKeyListener(new KeyAdapter() {
					@Override
				
					public void keyReleased(KeyEvent e) {
						 	if(textField_3.getText().equals("")) textField_3.setText(""+0);
						
						if(isNumber(textField_3.getText())==false) {
							textField_3.setText(""+0);
						
                textField_2.setText(""+cnv.masse(Double.parseDouble(textField_3.getText()),comboBox_3.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString()));
						}
						
						else textField_2.setText(""+cnv.masse(Double.parseDouble(textField_3.getText()),comboBox_3.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString()));

						
						
					}
				});
				
				 comboBox_2.addItemListener(new ItemListener() {
					 	public void itemStateChanged(ItemEvent e) {
					 		
	                textField_3.setText(""+cnv.masse(Double.parseDouble(textField_2.getText()),comboBox_2.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString()));

					 	}
					 });
				 
				  
				  comboBox_3.addItemListener(new ItemListener() {
				 	  	public void itemStateChanged(ItemEvent arg0) {
	                textField_3.setText(""+cnv.masse(Double.parseDouble(textField_2.getText()),comboBox_3.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString()));

				 	  	}
				 	  });
		 
		 
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Fen f=new Fen();
 		f.setVisible(true);
	}
}
