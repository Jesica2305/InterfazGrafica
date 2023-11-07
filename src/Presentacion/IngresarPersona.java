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
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndicado;

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
                String aceptoTerminos = (chbTerminos.isSelected() == true) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected())? "Masculino":
                                (rbtFemenino.isSelected()) ? "Femenino":
                                (rbtOtro.isSelected()) ? "Otro":
                                        (rbtNoIndicado.isSelected())? "No indicado": "";

                String mensaje = "Tus datos son: " + "\n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "Idioma: " + idioma + "\n" +
                                 "Género: " + genero + "\n" +
                                 "Acepto terminos: " + aceptoTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
