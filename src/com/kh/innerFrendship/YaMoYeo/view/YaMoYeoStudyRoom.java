package com.kh.innerFrendship.YaMoYeo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class YaMoYeoStudyRoom extends JPanel {
	private JFrame mf;
	private JPanel panel;
	
	public YaMoYeoStudyRoom(JFrame mf) {
		this.mf = mf;
		this.panel = this;
		
		this.setSize(600,600);
		this.setLocation(100,100);
		this.setLayout(null);
		this.setBackground(new Color(234, 208, 184));
		
		JLabel title = new JLabel("스터디");
		title.setLocation(240, 20);
		title.setSize(250, 50);
		title.setFont(new Font("돋움", Font.BOLD,35));
		
		JButton back = new JButton(new ImageIcon("images/back.png"));
		back.setLocation(20, 20);
		back.setSize(45, 45);
		back.setContentAreaFilled(false);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ChangePanel.changePanel(mf, panel, new YaMoYeoEnter(mf));
			}
		});
		
		JButton menu = new JButton(new ImageIcon("images/menu.png"));
		menu.setLocation(530, 15);
		menu.setSize(50, 50);
		menu.setContentAreaFilled(false);
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ChangePanel.changePanel(mf, panel, new MenuManager(mf));
			}
		});
		
		JCheckBox chk1 = new JCheckBox();
		chk1.setLocation(50, 100);
		chk1.setSize(50, 50);
		chk1.setOpaque(false);
		
		JCheckBox chk2 = new JCheckBox();
		chk2.setLocation(50, 145);
		chk2.setSize(50, 50);
		chk2.setOpaque(false);
				
		JCheckBox chk3 = new JCheckBox();
		chk3.setLocation(50, 190);
		chk3.setSize(50, 50);
		chk3.setOpaque(false);
		
		JTextField txt = new JTextField("to do list");
		txt.setLocation(85, 110);
		txt.setSize(200,30);
		txt.setOpaque(false);
		
		JTextField txt2 = new JTextField("to do list");
		txt2.setLocation(85, 155);
		txt2.setSize(200,30);
		txt2.setOpaque(false);
		
		JTextField txt3 = new JTextField("to do list");
		txt3.setLocation(85, 205);
		txt3.setSize(200,30);
		txt3.setOpaque(false);
		
		this.add(title);
		this.add(back);
		this.add(menu);
		this.add(chk1);
		this.add(chk2);
		this.add(chk3);
		this.add(txt);
		this.add(txt2);
		this.add(txt3);
		
		mf.add(this);
	}
}
