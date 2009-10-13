// SplashScreen
// $Id: SplashScreen.java,v 1.7 2003/02/03 19:07:06 axelwernicke Exp $
//
// Copyright (C) 2002-2003 Axel Wernicke <axel.wernicke@gmx.de>
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
package de.axelwernicke.mypod.gui;


/**
 *
 * @author  axel wernicke
 */
public class SplashScreen extends javax.swing.JWindow {
    /** Creates new form BeanForm */
    public SplashScreen() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() //GEN-BEGIN:initComponents
     {
        splashLabel = new javax.swing.JLabel();
        splashImage = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        splashLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        splashLabel.setMaximumSize(new java.awt.Dimension(200, 300));
        splashLabel.setMinimumSize(new java.awt.Dimension(200, 300));
        splashLabel.setPreferredSize(new java.awt.Dimension(200, 300));
        getContentPane().add(splashLabel);
        splashLabel.setBounds(0, 280, 200, 20);

        splashImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/splash.jpg")));
        splashImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        splashImage.setMinimumSize(new java.awt.Dimension(200, 300));
        splashImage.setPreferredSize(new java.awt.Dimension(200, 300));
        splashImage.setOpaque(true);
        getContentPane().add(splashImage);
        splashImage.setBounds(0, 0, 200, 300);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(200, 300));
        setLocation((screenSize.width - 200) / 2, (screenSize.height - 300) / 2);
    } //GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel splashImage;
    public javax.swing.JLabel splashLabel;

    // End of variables declaration//GEN-END:variables
}
