package com.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MyButton extends JButton {
    // ATRIBUTES
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    
    // KONSTRUKTOR
    public MyButton() {
        //  MENGINISIALISASI WARNA        
        setColor(getColor());
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(30, 136, 56);
        setContentAreaFilled(false);
        //  MENAMBAHKAN EVENT LISTENER MOUSE
        addMouseListener(new MouseAdapter() {
            
            // KETIKA KURSOR MASUK KEAREA KOMPONEN
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            // KETIKA KURSOR KELUAR DARI AREA KOMPONEN
            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;

            }

            // KETIKA KURSOR MENGKLIK KOMPONEN
            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            // KETIKA KURSOS MELEPAS KLIK
            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }
    
    // SETTER GETTER
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // MENGGAMBAR BORDER
        g2.setColor(borderColor); // WARNA DARI BORDER
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // MENGGAMBAR BACKGROUND DIDALAM BORDER
        g2.setColor(getBackground()); // WARNA BACKGROUND
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius - 2, radius - 2);

        super.paintComponent(grphcs);
    }
}
