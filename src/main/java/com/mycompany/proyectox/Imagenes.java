package com.mycompany.proyectox;

import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Imagenes {
    
    void SetImageLabel(JLabel labelName, String root, int newWidth, int newHeight){
    /*AJUSTAR IMAGEN AL JLABEL.*/
    ImageIcon image = new ImageIcon(root);
    Image img = image.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
    ImageIcon icon = new ImageIcon(img);
    labelName.setIcon(icon);
}    
    void SetImageButton (JButton ButtonName, String root) {
        
        ImageIcon imagen = new ImageIcon(root);
        Icon img = new ImageIcon(imagen.getImage().getScaledInstance(ButtonName.getWidth(), ButtonName.getHeight(), Image.SCALE_DEFAULT));
        ButtonName.setIcon(img);
    }
}

