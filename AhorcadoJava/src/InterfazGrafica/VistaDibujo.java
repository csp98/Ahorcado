/* 
 * Copyright (C) 2018 csp98
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package InterfazGrafica;

import javax.swing.ImageIcon;

public class VistaDibujo extends javax.swing.JPanel {

    public VistaDibujo() {
        initComponents();
        img.setVisible(true);

    }

    public void actualizar(int errores) {
        if (errores == 0) {
            img.setVisible(false);
        } else {
            img.setVisible(true);
            img.setIcon(new ImageIcon(getClass().getResource("/InterfazGrafica/step" + errores + ".png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(150, 195));
        setMinimumSize(new java.awt.Dimension(150, 195));
        setPreferredSize(new java.awt.Dimension(150, 195));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGrafica/step1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    // End of variables declaration//GEN-END:variables
}
