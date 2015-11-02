/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import Clases.Factura;
import Clases.Opcion;
import Clases.Utilidades;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author sofia
 */
public class frmFactura extends javax.swing.JFrame {

    /**
     * Creates new form frmFactura
     */
    public frmFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric12 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric21 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric15 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric13 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric14 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric16 = new org.edisoncor.gui.label.LabelMetric();
        dchCarga = new com.toedter.calendar.JDateChooser();
        dchFactura = new com.toedter.calendar.JDateChooser();
        txtIDFactura = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        cmbServicios = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cmbStatus = new org.edisoncor.gui.comboBox.ComboBoxRound();
        txtMonto = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescrip = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProveedor = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cmbEmpleado = new org.edisoncor.gui.comboBox.ComboBoxRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Facturas");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.blue);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMetric12.setText("Status:");

        labelMetric9.setText("Empleado:");

        labelMetric8.setText("Proveedor:");

        labelMetric21.setText("Fecha de Carga:");

        labelMetric15.setText("Fecha de Factura:");

        labelMetric10.setText("Nº Factura:");

        labelMetric1.setText("Registro de Facturas");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric13.setText("Servicio:");

        labelMetric14.setText("Descripción:");

        labelMetric16.setText("Monto:");

        dchFactura.setEnabled(false);

        txtIDFactura.setEnabled(false);

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        areaDescrip.setColumns(20);
        areaDescrip.setRows(5);
        jScrollPane1.setViewportView(areaDescrip);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(dchCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(dchFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(cmbServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbEmpleado, cmbProveedor, cmbServicios, cmbStatus, txtIDFactura, txtMonto});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addGap(28, 28, 28))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbEmpleado, cmbProveedor, cmbServicios, cmbStatus, txtIDFactura, txtMonto});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel1.getAccessibleContext().setAccessibleName("");
        panel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /* Evento de click sobre el boton de REGISTRAR EMPLEADO */

        /* Instanciamos un objeto de la Clase Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if (txtIDFactura.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el ID de la factura");
            txtIDFactura.requestFocusInWindow();
            return;
        }

        if (Utilidades.formateDate(dchFactura.getDate()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la fecha de la factura");
            dchFactura.requestFocusInWindow();
            return;
        }

        if (dchCarga.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una fecha de carga");
            dchCarga.requestFocusInWindow();
            return;
        }

        if (cmbProveedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un proveedor");
            cmbProveedor.requestFocusInWindow();
            return;
        }

        if (cmbEmpleado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un Empleado");
            cmbEmpleado.requestFocusInWindow();
            return;
        }

        if (cmbServicios.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un servicio");
            cmbServicios.requestFocusInWindow();
            return;
        }

        if (cmbStatus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un Status");
            cmbStatus.requestFocusInWindow();
            return;
        }

        if (txtMonto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un monto");
            txtMonto.requestFocusInWindow();
            return;
        }

        if (areaDescrip.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una descripcion ");
            areaDescrip.requestFocusInWindow();
            return;
        }

        /* Instanciamos un objeto de la Clase Factura, el cual se lo pasaremos
         a la funcion agregarFactura, la cual pide como parametro un objeto Factura */
        Factura factura = new Factura(
                Integer.parseInt(txtIDFactura.getText()),
                dchFactura.getDate(),
                dchCarga.getDate(),
                Integer.parseInt(((Opcion) cmbProveedor.getSelectedItem()).getValor()),
                Integer.parseInt(((Opcion) cmbEmpleado.getSelectedItem()).getValor()),
                Integer.parseInt(((Opcion) cmbServicios.getSelectedItem()).getValor()),
                areaDescrip.getText(),
                Integer.parseInt(((Opcion) cmbStatus.getSelectedItem()).getValor()),
                Double.parseDouble(txtMonto.getText()));

        if (datos.agregarFactura(factura)) {
            try {
                JOptionPane.showMessageDialog(this, "Factura agregada Correctamente");

                /* Si la factura se registra exitosamente pasamos armar el pdf*/
                /* Instanciamos un objeto de tipo Map para pasarle los parametros
                 al reporte */
                Map parametros = new HashMap();

                /* con el metodo put se le pasa el parametros al reporte, en este
                 caso el parametro se llama factura */
                parametros.put("factura", txtIDFactura.getText());

                /* Obtenemos la direccion del reporte*/
                String template = frmFactura.class.getProtectionDomain().getCodeSource().getLocation().getPath();

                File aux = new File(template);

                /* Aqui comprobamos si el reporte se mando a ejecutar desde un IDE
                 o desde un JAR, si es desde un IDE guardamos la direccion del 
                 reporte con System.getProperty("user.dir") + "/src/Reportes/rptFactura.jrxml"; 
                 y si no es le pasamos la direccion donde se encuentra el jar */
                if (aux.isDirectory()) {
                    template = System.getProperty("user.dir") + "/src/Reportes/rptFactura.jrxml";
                } else {
                    template = aux.getParent() + "/rptFactura.jrxml";
                }

                /* Le pasamos la direccion del reporte que en este caso es un 
                 archivo jrxml, para que lo compile */
                JasperReport jasperReport = JasperCompileManager.compileReport(template);

                /* Una ves compilado se lo pasamos al objeto Jasperprint para que
                 arme las consultas y los datos que contendran el reporte */
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, datos.getCon());

                /* Lo hacemos visible en pantalla */
                JasperViewer.viewReport(print);

            } catch (JRException ex) {
                Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "En estos momentos no es posible"
                    + " agregar una factura, intentelo mas tarde");
        }

        txtIDFactura.setText("");
        dchCarga.setDate(null);
        cmbProveedor.setSelectedIndex(0);
        cmbEmpleado.setSelectedIndex(0);
        cmbServicios.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        txtMonto.setText("");
        areaDescrip.setText("");

        /* Cargamos los ID en los formularios */
        int idFac = datos.getNumFac();
        txtIDFactura.setText("" + idFac);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            /* Evento cuando el formulario se abra */

            /* Instanciamos un objeto de la Clase Datos, para poder acceder a los
             metodos */
            Datos datos = new Datos();

            /* Cargamos los ID en los formularios */
            int idFac = datos.getNumFac();
            txtIDFactura.setText("" + idFac);

            /* Cargamos la fecha actual al campo tipo date */
            dchFactura.setDate(new Date());

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los proveedores  */
            Opcion op = new Opcion("0", "Seleccione un proveedor");

            /* Añadimos el primer elemento al combo box */
            cmbProveedor.addItem(op);

            /* Llamos a la funcion getProveedor la cual nos devuelve todos los
             proveedores que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Proveedores */
            ResultSet rs = datos.getProveedor();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rs.next()) {
                op = new Opcion(
                        rs.getString("id_proveedor"),
                        rs.getString("rif_cedula")
                        + "-" + rs.getString("nom_prove"));
                cmbProveedor.addItem(op);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los servicios  */
            Opcion op2 = new Opcion("0", "Seleccione un servicio");

            /* Añadimos el primer elemento al combo box */
            cmbServicios.addItem(op2);

            /* Llamos a la funcion getServicios la cual nos devuelve todos los
             Servicios que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Servicios */
            ResultSet rsSer = datos.getServicios();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsSer.next()) {
                op2 = new Opcion(
                        rsSer.getString("id_servicio"),
                        rsSer.getString("nom_servi"));
                cmbServicios.addItem(op2);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los Status  */
            Opcion op3 = new Opcion("0", "Seleccione un Status ");

            /* Añadimos el primer elemento al combo box */
            cmbStatus.addItem(op3);

            /* Llamos a la funcion getStatus la cual nos devuelve todos los
             Status que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Status */
            ResultSet rsSta = datos.getStatus();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsSta.next()) {
                op3 = new Opcion(
                        rsSta.getString("id_status"),
                        rsSta.getString("nom_sta"));
                cmbStatus.addItem(op3);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los Empleados  */
            Opcion op4 = new Opcion("0", "Seleccione un Empleado ");

            /* Añadimos el primer elemento al combo box */
            cmbEmpleado.addItem(op4);

            /* Llamos a la funcion getPersonal la cual nos devuelve todo el
             Personal que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Empleados */
            ResultSet rsPer = datos.getPersonal();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsPer.next()) {
                op4 = new Opcion(
                        rsPer.getString("id_personal"),
                        rsPer.getString("nom_per")
                        + " " + rsPer.getString("ape_per"));
                cmbEmpleado.addItem(op4);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped

        /* Funcion para validar que solo ingresen numeros */
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }

        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_txtMontoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescrip;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbEmpleado;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbProveedor;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbServicios;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbStatus;
    private com.toedter.calendar.JDateChooser dchCarga;
    private com.toedter.calendar.JDateChooser dchFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric12;
    private org.edisoncor.gui.label.LabelMetric labelMetric13;
    private org.edisoncor.gui.label.LabelMetric labelMetric14;
    private org.edisoncor.gui.label.LabelMetric labelMetric15;
    private org.edisoncor.gui.label.LabelMetric labelMetric16;
    private org.edisoncor.gui.label.LabelMetric labelMetric21;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtIDFactura;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtMonto;
    // End of variables declaration//GEN-END:variables
}
