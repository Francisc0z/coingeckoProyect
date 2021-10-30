import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro,miMorado,miCreador,miSalir, miNuevo;
    private JLabel labellogo, labelBienvenido, labelTitle, labelNombre, labelApellido1, labelApellido2,labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    private JTextField txtNombreTrabajador, txtApellido1, txtApellido2;
    private JScrollPane scroll;
    private JComboBox comboDepto, comboAntiguedad;
    private JTextArea textarea1;
    String nombreAdmin="";

    public Principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color (255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
        Bienvenida nombre=new Bienvenida();
        nombreAdmin=Bienvenida.texto;

        mb=new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        menuOpciones=new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);
        
        menuCalcular=new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1, 14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcercaDe=new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1, 14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        menuColorFondo=new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new  Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        miCalculo=new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo=new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro=new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado=new JMenuItem("Violeta");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo=new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miCreador=new JMenuItem("Creador");
        miCreador.setFont(new Font("Andale Mono",1,14));
        miCreador.setForeground(new Color(255,0,0));
        menuOpciones.add(miCreador);
        miCreador.addActionListener(this);

        miSalir=new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon("imagenes/logo-coca.png");
        labellogo=new JLabel(imagen);
        labellogo.setBounds(5,5,250,100);
        add(labellogo);

        labelBienvenido=new JLabel("Bienvenido " + nombreAdmin);
        labelBienvenido.setBounds(280,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle=new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        labelNombre=new JLabel("Nombre completo:");
        labelNombre.setBounds(25,118,180,25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        txtNombreTrabajador=new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtNombreTrabajador);

        labelApellido1=new JLabel("Apellido paterno");
        labelApellido1.setBounds(25, 248,180,25);
        labelApellido1.setFont(new Font("Andale Mono",1,12));
        labelApellido1.setForeground(new Color(255,255,255));
        add(labelApellido1);

        txtApellido1=new JTextField();
        txtApellido1.setBounds(25,273,150,25);
        txtApellido1.setBackground(new java.awt.Color(224,224,224));
        txtApellido1.setFont(new java.awt.Font("Andale Mono",1,14));
        txtApellido1.setForeground(new java.awt.Color(255,0,0));
        add(txtApellido1);

        labelApellido2=new JLabel("Apellido Materno");
        labelApellido2.setBounds(25, 308,180,25);
        labelApellido2.setFont(new Font("Andale Mono",1,12));
        labelApellido2.setForeground(new Color(255,255,255));
        add(labelApellido2);

        txtApellido2=new JTextField();
        txtApellido2.setBounds(25,334,150,25);
        txtApellido2.setBackground(new java.awt.Color(224,224,224));
        txtApellido2.setFont(new java.awt.Font("Andale Mono",1,14));
        txtApellido2.setForeground(new java.awt.Color(255,0,0));
        add(txtApellido2);

        labelDepartamento=new JLabel("Seleccione Departamento");
        labelDepartamento.setBounds(220, 188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);

        comboDepto= new JComboBox();
        comboDepto.setBounds(220,213,220,25);
        comboDepto.setBackground(new java.awt.Color(244,244,244));
        comboDepto.setFont(new java.awt.Font("Andale Mono",1,14));
        comboDepto.setForeground(new java.awt.Color(255,0,0));
        add(comboDepto);
        comboDepto.addItem("");
        comboDepto.addItem("Atencion al cliente");
        comboDepto.addItem("Departamento de Logistica");
        comboDepto.addItem("Departamento de Gerencia");

        labelAntiguedad=new JLabel("Seleccione la antiguedad");
        labelAntiguedad.setBounds(220, 248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);

        comboAntiguedad= new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(244,244,244));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o mas de servicio");

        labelResultado=new JLabel("Resultado del calculo");
        labelResultado.setBounds(220, 307,180,25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);

        textarea1=new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(244,244,244));
        textarea1.setFont(new Font("Andale Mono",1,11));
        textarea1.setForeground(new Color(248,0,0));
        textarea1.setText("\n Aqui aparece el resultado del calculo de las vacaciones");
        scroll= new JScrollPane(textarea1);
        scroll.setBounds(220,333,385,90);
        add(scroll);

        labelfooter=new JLabel("©2021 The Coca-Cola Company | Todos los derechos reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelfooter.setForeground(new java.awt.Color(255,255,255));
        add(labelfooter);
    }
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==miCalculo){
                String nombreTrabajador=txtNombreTrabajador.getText();
                String apellidoTrabajador=txtApellido1.getText();
                String apellidoTrabajador2=txtApellido2.getText();
                String Departamento = comboDepto.getSelectedItem().toString();
                String Antiguedad = comboAntiguedad.getSelectedItem().toString();

                if(nombreTrabajador.equals("")|apellidoTrabajador.equals("")||apellidoTrabajador2.equals("")||Departamento.equals("")||Antiguedad.equals("")){
                    JOptionPane.showMessageDialog(null,"Tenes que ingresar todos los campos.");
                }else{
                    String dptoElegido=Departamento;
                    String antiguedad=Antiguedad;
                    if(dptoElegido.equals("Atencion al cliente")){
                        if(antiguedad.equals("1 año de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 6 dias de vacaciones");
                        }if(antiguedad.equals("2 a 6 años de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 14 dias de vacaciones");
                        }if(antiguedad.equals("7 años o mas de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 20 dias de vacaciones");
                        }
                    }
                    if(dptoElegido.equals("Departamento de Logistica")){
                        if(antiguedad.equals("1 año de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 7 dias de vacaciones");
                        }if(antiguedad.equals("2 a 6 años de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 15 dias de vacaciones");
                        }if(antiguedad.equals("7 años o mas de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 22 dias de vacaciones");
                        }
                    }
                    if(dptoElegido.equals("Departamento de Gerencia")){
                        if(antiguedad.equals("1 año de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 10 dias de vacaciones");
                        }if(antiguedad.equals("2 a 6 años de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 20 dias de vacaciones");
                        }if(antiguedad.equals("7 años o mas de servicio")){
                            textarea1.setText("El trabajador" + nombreTrabajador +
                            "\n quien trabaja en " + dptoElegido +
                            "\n y tiene " + antiguedad + " Tiene derecho a 30 dias de vacaciones");
                        }
                    }
                }
            }
            if(e.getSource()==miRojo){
                this.getContentPane().setBackground(new Color(255,0,0));
            }
            if(e.getSource()==miNegro){
                this.getContentPane().setBackground(new Color(0,0,0));
            }
            if(e.getSource()==miMorado){
                this.getContentPane().setBackground(new Color(182,149,192));
            }
            if(e.getSource()==miCreador){
                JOptionPane.showMessageDialog(null, "El creador es Francisco Silva\n      @pancho.silva9");
            }
            if(e.getSource()==miSalir){
                System.exit(0);
            }
            if(e.getSource()==miNuevo){
                txtApellido1.setText("");
                txtApellido2.setText("");
                txtNombreTrabajador.setText("");
                comboAntiguedad.setSelectedIndex(0);
                comboDepto.setSelectedIndex(0);
                textarea1.setText("\n Aqui aparece el resultado del calculo de las vacaciones");
            }

    }
    public static void main(String[] args) {
        Principal ventanaPrincipal= new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
