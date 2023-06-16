package GUI;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import comp_decomp.Compressor;
import comp_decomp.Decompressor;

import javax.swing.JFileChooser;
import java.io.*;

//Action listener to detect that the button was clicked and further actions needs to be taken


public class AppFrame extends JFrame implements ActionListener{

	//Creating 2 buttons
	JButton compressButton;
	JButton decompressButton;
	
	
	AppFrame(String name){
		
		this.setTitle(name); 
		//this.setLayout(new FlowLayout());
		this.setLayout(null);
		
		compressButton=new JButton("Select file to Compress");
		compressButton.setSize(200, 300);
		compressButton.setBounds(100, 150, 250, 100);
		compressButton.addActionListener(this);
		compressButton.setBackground(new Color(63, 81, 181));
		compressButton.setForeground(Color.WHITE);
		compressButton.setFont(new Font("Arial", Font.BOLD, 14));
		
		decompressButton= new JButton("Select file to Decompress");
		decompressButton.setSize(200, 300);
		decompressButton.setBounds(500, 150, 250, 100);
		decompressButton.addActionListener(this);
		decompressButton.setBackground(new Color(63, 81, 181));
		decompressButton.setForeground(Color.WHITE);
		decompressButton.setFont(new Font("Arail", Font.BOLD, 14));

		 
		
		this.add(compressButton);
		this.add(decompressButton);
		this.setSize(800, 500);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.black);
		 
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==compressButton) {
			JFileChooser filechooser=new JFileChooser();
			int response =filechooser.showSaveDialog(null);
			if(response == JFileChooser.APPROVE_OPTION) {
				File file =new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					Compressor.method(file);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1.toString());
				}
			}	
		}
		if(e.getSource()==decompressButton) {
			JFileChooser filechooser=new JFileChooser();
			int response =filechooser.showSaveDialog(null);
			if(response == JFileChooser.APPROVE_OPTION) {
				File file =new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					Decompressor.method(file);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1.toString());
				}
			}
		}
	}
		
	
}
