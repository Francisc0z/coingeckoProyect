import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scroll;
    private JTextArea textarea1;
    String nombre="";

    public Terminos(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
        Bienvenida panelAnterior = new Bienvenida();
        nombre=panelAnterior.texto;
        
        label1=new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textarea1=new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono",0,11));
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES\n\n          La Sociedad, en la medida de lo posible, realizará"+
         "\n          los actos necesarios para que la Aplicación proteja toda la"+
        "\n          información y bases de datos que haya proporcionado a la Sociedad." +
        "\n          Independientemente de lo anterior, el"+
        "\n          Usuario y el Autorizado deberán realizar lo siguiente:"+
        "\n\n1.- No ingresar a la Aplicación virus ni códigos maliciosos de ningún tipo."+
        "\n\n2.- No solicitar información de inicio de sesión ni acceder a una cuenta perteneciente a otro Usuario."+
        "\n\n3.- No utilizar la Aplicación para actos ilícitos, engañosos, malintencionados o discriminatorios."+
        "\n\n4.- No realizar ninguna acción que pudiera inhabilitar, sobrecargar o afectar al funcionamiento correcto de la"+
        "\nAplicación o a su aspecto."+
        "\n\n5.- No proporciona nombres y datos falsos."+
        "\n\n6.- No proporcionar información personal falsa, ni crear una cuenta para otras personas sin su autorización."+
        "\n\n7.- No crear más de una cuenta personal."+
        "\n\n8.- No crear otra cuenta sin el permiso de la Sociedad, en caso de que la Sociedad inhabilite la cuenta del"+
        "\nUsuario."+
        "\n\n9.- No utilizar los Servicios o la Aplicación si el Usuario o el Autorizado son menores de 18 años."+
        "\n\n10.- No transferir la cuenta de usuario que administre a nadie sin el previo consentimiento por escrito de la"+
        "\nSociedad.");
        scroll=new JScrollPane(textarea1);
        scroll.setBounds(10,40,575,200);
        add(scroll);

        check1=new JCheckBox("Yo "+nombre+" acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        boton1=new JButton("Continuar");
        boton1.setBounds(10,280,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2=new JButton("No acepto");
        boton2.setBounds(130,280,100,30);
        boton2.addActionListener(this);
        boton1.setEnabled(true);
        add(boton2);
        
        
        ImageIcon imagen = new ImageIcon("imagenes/coca-coca.png");
        label2=new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){
        if(check1.isSelected()){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            Principal ventanaPrincipal= new Principal();
            ventanaPrincipal.setBounds(0,0,640,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        }else if(e.getSource()==boton2){
            Bienvenida inicio= new Bienvenida();
            inicio.setBounds(0,0,350,450);
            inicio.setResizable(false);
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            this.setVisible(false);
        }

    }
    public static void main(String[] args) {
        Terminos bases = new Terminos();
        bases.setBounds(0,0,630,360);
        bases.setVisible(true);
        bases.setResizable(false);
        bases.setLocationRelativeTo(null);
    }
}
