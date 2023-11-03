package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;

    public IngresarPersona(){
        this.setContentPane(pnlPrincipal);
        this.setSize(400, 300);

      this.setVisible(true);


        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();

                String mensaje = "Tus datos son: " + "\n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "idioma: " + idioma;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
