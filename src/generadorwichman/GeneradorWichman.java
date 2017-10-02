/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorwichman;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author RetailAdmin
 */
public class GeneradorWichman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            double semillax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en x"));
            double semillay = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en y"));
            double semillaz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en z"));
            int periodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el periodo"));

            String[][] semillas = new String[periodo][4];
            for (int i = 0; i < periodo; i++) {

                Utilidades utilidades = new Utilidades();
                semillax = utilidades.calculaX(semillax);
                semillay = utilidades.calculaY(semillay);
                semillaz = utilidades.calculaZ(semillaz);
                semillas[i][0] = "" + semillax;
                semillas[i][1] = "" + semillay;
                semillas[i][2] = "" + semillaz;
                semillas[i][3] = "" + ((semillax/30269)+(semillay/30307)+(semillaz/30323));
            }
            
            String[] columnas = {"semilla X","semilla Y","semilla Z","U"};
                JTable table = new JTable(semillas, columnas);
                table.setVisible(true);

                JFrame frame = new JFrame("JTable Test Display");

                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());

                JScrollPane tableContainer = new JScrollPane(table);

                panel.add(tableContainer, BorderLayout.CENTER);
                frame.getContentPane().add(panel);

                frame.pack();
                frame.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Recuerde que solo puede ingresar numeros");
        }
    }

}
