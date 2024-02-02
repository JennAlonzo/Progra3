/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoramain;

/**
 *
 * @author jenni
 */

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
    
    public Calculator() {
		
		JFrame ventana = new JFrame(); //crea la ventana
		setTitle("Mi Calculadora");
		setSize(new Dimension(400,500));
		setLocationRelativeTo(null);
		
		JPanel topPanel = new JPanel();
		JPanel centralPanel = new JPanel();  //crea los paneles
		
		topPanel.setPreferredSize(new Dimension(100,200));
		
		topPanel.setBackground(Color.black);
		centralPanel.setBackground(Color.white);  //pone color a los paneles
		
	//	Border blackBorder = BorderFactory.createLineBorder(Color.black);
	//	topPanel.setBorder(blackBorder);
	//	centralPanel.setBorder(blackBorder);
		
		
		topPanel.setLayout(new GridLayout(1,1));  //establece el diseño
		add(topPanel,BorderLayout.NORTH);
		centralPanel.setLayout(new GridLayout(5,4,10,10)); //establece el diseño y distribucion
		add(centralPanel,BorderLayout.CENTER);
		
		JTextField campo = new JTextField(15); //crea el campo y su tamaño
		campo.setPreferredSize(new Dimension(100,50));
		
		topPanel.add(campo);
		
		//crea arreglo del texto de botones
		String[] botones = {"AC","DEL","( )","/","7","8","9","x","4",
				"5","6","-","1","2","3","+","%","0",".","="};
		JButton boton[] = new JButton[20];  //crea el arreglo de botones
		
		for(int i=0; i<20; i++) {
			boton[i] = new JButton(botones[i]);  //asigna un nuevo boton con el texto
			boton[i].setBackground(Color.gray);
			boton[i].setFont(new Font("ARIAL NARROW",Font.BOLD,14));
			centralPanel.add(boton[i]);
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
    
}
