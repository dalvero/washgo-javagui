package com.component;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class MyLabel extends JLabel{
    // ATRIBUTES
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private boolean isOver;

    // KONSTRUKTOR
    public MyLabel() {
        color = Color.BLACK;
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        
        setForeground(color);
        
        
        addMouseListener(new MouseAdapter() {
            // KETIKA KURSOR MASUK KEAREA KOMPONEN
            @Override
            public void mouseEntered(MouseEvent me) {
                setForeground(colorOver);
                isOver = true;
            }

            // KETIKA KURSOR KELUAR DARI AREA KOMPONEN
            @Override
            public void mouseExited(MouseEvent me) {
                setForeground(color);
                isOver = false;

            }

            // KETIKA KURSOR MENEKAN
            @Override
            public void mousePressed(MouseEvent me) {
                setForeground(colorClick);
            }

            // KETIKA KURSOR MELEPAS
            @Override
            public void mouseReleased(MouseEvent me) {
                if (isOver) {
                    setForeground(colorOver);
                } else {
                    setForeground(color);
                }
            }
        });
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public boolean isIsOver() {
        return isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }
    
    
}
