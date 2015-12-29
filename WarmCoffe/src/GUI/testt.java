/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

    
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author rafae
 */
public class testt {

    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ImageIcon image = new ImageIcon("Image/1.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( label, BorderLayout.CENTER );
        
        panel.setVisible(true);
    }
}
