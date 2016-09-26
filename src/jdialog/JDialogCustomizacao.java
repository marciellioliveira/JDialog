package jdialog;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Marcielli
 */
public class JDialogCustomizacao extends JDialog implements ActionListener{
    
    
    final JDialog dialog = new JDialog();
    final JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JComboBox combo = new JComboBox();
    JButton buttonDivulgar = new JButton();
    JButton buttonQuero = new JButton();
    JButton buttonNaoQuero = new JButton();
    JButton buttonFechar = new JButton();
    JLabel labelConfirma = new JLabel();
    JLabel labelNaoQueroObservacao = new JLabel();
    JLabel labelQueroObservacao = new JLabel();
    JLabel labelDivulgarObservacao = new JLabel();
     
    public JDialogCustomizacao() {
    
        buttonDivulgar.addActionListener(this);
        buttonNaoQuero.addActionListener(this);
        buttonQuero.addActionListener(this);        
    }
    
    public void frame() {
     
        Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setMaximumSize(DimMax);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setOpacity(0.5F);
        
        frame.add(panel);
        panel.setBackground(Color.white);
        
        frame.setVisible(true);
    }
    
    
    public void dialogBotaoDivulgaVaga() {
        dialog.add(panel);
        
        dialog.setSize(350, 200);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension tamanhoTela = toolkit.getScreenSize();
        final int x = (tamanhoTela.width - dialog.getWidth())/2;
        final int y = (tamanhoTela.height - dialog.getHeight())/2;
        dialog.setLocation(x, y);
        
        dialog.setUndecorated(true);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(new Color(37, 45, 132), 2));        
        panel.add(new JLabel(new ImageIcon(getClass().getResource("/jdialog/divulgarvaga.png"))));
        panel.add(combo);
        
        combo.setBackground(new Color(37, 45, 132));
       
        combo.addItem("Compartilhar");
        combo.addItem("Feed de Amigos");
        combo.addItem("Feed de Grupos");
        
        panel.add(buttonDivulgar);
        buttonDivulgar.setText("Divulgar");
        buttonDivulgar.setBackground(new Color(37, 45, 132));
        buttonDivulgar.setForeground(Color.WHITE);
        buttonDivulgar.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
    }
    
    public void dialogBotaoQueroVaga() {
        
        dialog.add(panel);
        
        dialog.setSize(350, 200);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension tamanhoTela = toolkit.getScreenSize();
        final int x = (tamanhoTela.width - dialog.getWidth())/2;
        final int y = (tamanhoTela.height - dialog.getHeight())/2;
        dialog.setLocation(x, y);
        
        dialog.setUndecorated(true);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(new Color(68, 154, 64), 2));
        panel.add(new JLabel(new ImageIcon(getClass().getResource("/jdialog/quermesmo.png"))));
       // panel.add(labelConfirma);
       // labelConfirma.setText("Quer mesmo?");
        labelConfirma.setForeground(new Color(68, 154, 64));
       
        panel.add(buttonQuero);
        buttonQuero.setText("Eu Quero essa vaga");
        buttonQuero.setBackground(new Color(68, 154, 64));
        buttonQuero.setForeground(Color.WHITE);
        buttonQuero.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
    }
    
    public void dialogBotaoNaoQueroVaga() {
        
        dialog.add(panel);
        
        dialog.setSize(350, 200);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension tamanhoTela = toolkit.getScreenSize();
        final int x = (tamanhoTela.width - dialog.getWidth())/2;
        final int y = (tamanhoTela.height - dialog.getHeight())/2;
        dialog.setLocation(x, y);
        
        
        dialog.setUndecorated(true);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(new Color(162, 25, 26), 2));
        panel.add(new JLabel(new ImageIcon(getClass().getResource("/jdialog/naoquermesmo.png"))));
       // panel.add(labelConfirma);
        //labelConfirma.setText("Não quer mesmo?");
        labelConfirma.setForeground(new Color(162, 25, 26));

        panel.add(buttonNaoQuero);
        buttonNaoQuero.setText("Eu não Quero essa vaga");
        buttonNaoQuero.setBackground(new Color(162, 25, 26));
        buttonNaoQuero.setForeground(Color.WHITE);
        buttonNaoQuero.setCursor(new Cursor(Cursor.HAND_CURSOR));       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if((e.getSource() == buttonDivulgar) || (e.getSource() == buttonQuero) || (e.getSource() == buttonNaoQuero)){
            
            dialog.setVisible(false);
            frame.setVisible(false);
            
        }
    }
}
