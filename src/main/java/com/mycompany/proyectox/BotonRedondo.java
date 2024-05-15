/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectox;
import java.awt.*;
import javax.swing.*;

public class BotonRedondo extends JButton {

    //private int radio = 30; // Ajusta este valor para cambiar la redondez de los bordes

    public static void hacerRedondeado(JButton boton, int radio, Color colorFondo, Color colorBorde) {
        // Crear un nuevo botón con bordes redondeados usando un Border
        boton.setContentAreaFilled(false);
        boton.setBorder(new RoundedBorder(radio, colorBorde));
        boton.setBackground(colorFondo);
    }

    // Clase interna para el borde redondeado
    static class RoundedBorder implements javax.swing.border.Border {
        private int radio;
        private Color colorBorde;

        RoundedBorder(int radio, Color colorBorde) {
            this.radio = radio;
            this.colorBorde = colorBorde;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radio + 1, this.radio + 1, this.radio + 2, this.radio);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(colorBorde);
            g.drawRoundRect(x, y, width - 1, height - 1, radio, radio);
        }
    }
}

