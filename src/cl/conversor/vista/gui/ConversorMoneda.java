package cl.conversor.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import cl.conversor.moneda.Moneda;

/**
 * GUI Currency converter class
 */
public class ConversorMoneda extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final String titulo = "Conversión de Moneda";
    private static JMenuBar menuBarOpcs;
    private static JMenu menuOpcs;
    private static JMenuItem opcion0;
    private static JMenuItem opcion1;
    private static JMenuItem opcion2;
    private static JMenuItem opcion3;
    private static JMenuItem opcion4;
    private static JMenuItem opcion5;
    private static JMenuItem opcion6;
    private static JMenuItem opcion7;
    private static JMenuItem opcion8;
    private static JMenuItem opcion9;
    private static JMenuItem opcion10;
    private static JMenuItem opcion11;
    private static JMenuItem opcion12;
    private static JMenuItem opcion13;
    private static JMenuItem opcion14;
    private static JMenuItem opcion15;
    
    /**
     * Creates a JMenuBar with currency converter options
     */
    public ConversorMoneda() {
        try {
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/logo_green.png"));
            setIconImage(icono.getImage());
        } catch (Exception e) {
            System.out.println("Icono no encontrado");
        }
        setSize(400,100);
        setTitle("Conversor Alura G5 ONE");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        menuConversion();
        panel.add(menuBarOpcs);
        add(panel);
        
        opcion0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                terminarApp();
            }
        });

        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.USD);
            }
        });
        
        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.USD, Moneda.MXN);
            }
        });
        
        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.CLP);
            }
        });
        
        opcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.CLP, Moneda.MXN);
            }
        });
        
        opcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.EUR);
            }
        });
        
        opcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.EUR, Moneda.MXN);
            }
        });
        
        opcion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.ARG);
            }
        });
        
        opcion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.ARG, Moneda.MXN);
            }
        });
        
        opcion9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.JPY);
            }
        });
        
        opcion10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.JPY, Moneda.MXN);
            }
        });
        opcion11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.GBP);
            }
        });
        
        opcion12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.GBP, Moneda.MXN);
            }
        });
        opcion13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.MXN, Moneda.KRW);
            }
        });
        
        opcion14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoConversion(Moneda.KRW, Moneda.MXN);
            }
        });
        opcion15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConversorGui.main(null);
                dispose();
            }
        });
        
    }
    
    /**
     * Currency conversion menu choices, exit and return options
     */
    private static void menuConversion() {
        menuBarOpcs = new JMenuBar();
        menuOpcs = new JMenu("Opciones de conversión");
        menuOpcs.setMnemonic('o');
        
        opcion0 = new JMenuItem("Salir");
        opcion1 = new JMenuItem("Convertir MXN a USD");
        opcion2 = new JMenuItem("Convertir USD a MXN");
        opcion3 = new JMenuItem("Convertir MXN a CLP");
        opcion4 = new JMenuItem("Convertir CLP a MXN");
        opcion5 = new JMenuItem("Convertir MXN a EUR");
        opcion6 = new JMenuItem("Convertir EUR a MXN");
        opcion7 = new JMenuItem("Convertir MXN a ARG");
        opcion8 = new JMenuItem("Convertir ARG a MXN");
        opcion9 = new JMenuItem("Convertir MXN a JPN");
        opcion10 = new JMenuItem("Convertir JPN a MXN");
        opcion11 = new JMenuItem("Convertir MXN a GBP");
        opcion12 = new JMenuItem("Convertir GBP a MXN");
        opcion13 = new JMenuItem("Convertir MXN a KRW");
        opcion14 = new JMenuItem("Convertir KRW a MXN");
        opcion15 = new JMenuItem("Volver");
        
        opcion0.setMnemonic('s');
        opcion1.setMnemonic('1');
        opcion2.setMnemonic('2');
        opcion3.setMnemonic('3');
        opcion4.setMnemonic('4');
        opcion5.setMnemonic('5');
        opcion6.setMnemonic('6');
        opcion7.setMnemonic('7');
        opcion8.setMnemonic('8');
        opcion9.setMnemonic('9');
        opcion10.setMnemonic('0');
        opcion11.setMnemonic('Q');
        opcion12.setMnemonic('W');
        opcion13.setMnemonic('E');
        opcion14.setMnemonic('R');
        opcion15.setMnemonic('v');
        
        menuOpcs.add(opcion1);
        menuOpcs.add(opcion2);
        menuOpcs.add(opcion3);
        menuOpcs.add(opcion4);
        menuOpcs.add(opcion5);
        menuOpcs.add(opcion6);
        menuOpcs.add(opcion7);
        menuOpcs.add(opcion8);
        menuOpcs.add(opcion9);
        menuOpcs.add(opcion10);
        menuOpcs.add(opcion11);
        menuOpcs.add(opcion12);
        menuOpcs.add(opcion13);
        menuOpcs.add(opcion14);
        menuOpcs.add(opcion15);
        menuOpcs.add(opcion0);
        menuBarOpcs.add(menuOpcs);
    }
    
    /** 
     * Handles user input for amount to convert. Validates, converts and return value.
     * @param orig String origin currency
     * @param dest String target currency
     * @return Double amount to convert
     */
    public static Double montoConversion(String orig, String dest) {
        Double montoIn = 0D;
        String resp; 
        while (montoIn == 0D) {
            try {
                resp = JOptionPane.showInputDialog(
                        menuBarOpcs, "Ingresa el monto a convertir",
                        "Conversion "+orig+" a "+dest,
                        JOptionPane.QUESTION_MESSAGE);
                if (resp == null) {
                    return null;
                } else {
                    return montoIn = Double.valueOf(resp);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        menuBarOpcs, "Debes ingresar un número válido",
                        titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return null;
    }
    
    /**
     * Shows result of currency conversion
     * @param orig Moneda origin currency
     * @param dest Moneda target currency
     */
    public static void resultadoConversion(Moneda orig, Moneda dest) {
        Double monto = montoConversion(orig.name(), dest.name());
        if (monto != null) {
            StringBuilder resultado = new StringBuilder();
            resultado.append(Moneda.monedaString(monto)+" "+orig.name()+" equivalen a");
            resultado.append(" "+Moneda.monedaString(orig.convert(dest, monto)));
            resultado.append(" "+dest.name());
            JOptionPane.showMessageDialog(menuBarOpcs, resultado.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
            continuar();
        }
    }
    
    /**
     * Terminates application 
     */
    public static void terminarApp() {
        JOptionPane.showMessageDialog(
                        menuOpcs, "Cerrando aplicación",
                        "Conversor finalizado", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    /**
     * Asks the user if they will continue using the application, if "YES" return to 'ConversorGui' menu,
     * else, ends application.
     */
    public static void continuar() {
        int resp = JOptionPane.showConfirmDialog(menuBarOpcs, "¿Seleccionar otra conversión?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp > 0) {
            terminarApp();
        } else {
            ConversorGui.main(null);
        }
    }
    
    /**
     * @param args Not used
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConversorMoneda aplicacion = new ConversorMoneda();
            aplicacion.setVisible(true);
        });
    }
}
