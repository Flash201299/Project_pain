import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Window extends JFrame implements ActionListener {
        private Drawing draw = new Drawing();
         public Window(String Title,int x,int y)
 {
         super(Title);
         this.setSize(x,y);
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         Container contentPanel = this.getContentPane() ;


         // Créer la barre de menu
         JMenuBar menubar = new JMenuBar();
         // Créer le menu
         JMenu File = new JMenu("File");
         JMenu Propos = new JMenu("A propos");
         // Créer les éléments du menu
         JMenuItem e1 = new JMenuItem("New");
         JMenuItem e2 = new JMenuItem("Open");
         JMenuItem e3 = new JMenuItem("Save");
         JMenuItem e4 = new JMenuItem("Quit");
         JMenuItem e5 = new JMenuItem("Authors");


         // Ajouter les éléments au menu
         File.add(e1);
         File.add(e2);
         File.add(e3);
         File.add(e4);
         Propos.add(e5);

         // Ajouter le menu au barre de menu
         menubar.add(File);
         menubar.add(Propos);




         // creation des boutons de couleur
         JButton Noir = new JButton("Noir");
         Noir.setBackground(Color.BLACK);
         JButton Jaune = new JButton("Jaune");
         Jaune.setBackground(Color.YELLOW);
         JButton Bleu = new JButton("Bleu");
         Bleu.setBackground(Color.BLUE);
         JButton Vert = new JButton("Vert");
         Vert.setBackground(Color.GREEN);
         JButton Rouge = new JButton("Rouge");
         Rouge.setBackground(Color.RED);
         JButton Magenta = new JButton("Magenta");
         Magenta.setBackground(Color.MAGENTA);
         JButton Orange = new JButton("Orange");
         Orange.setBackground(Color.ORANGE);
         JButton Rose = new JButton("Rose");
         Rose.setBackground(Color.PINK);




         // ajout des boutons de couleur crée
         JPanel Couleur = new JPanel();
         Couleur.setLayout(new GridLayout(2,4));
         Couleur.add(Noir);
         Couleur.add(Rouge);
         Couleur.add(Vert);
         Couleur.add(Bleu);
         Couleur.add(Jaune);
         Couleur.add(Rose);
         Couleur.add(Magenta);
         Couleur.add(Orange);
         Noir.setForeground(Color.white);
         Bleu.setForeground(Color.white);

         JPanel PaintPackage = new JPanel();
         PaintPackage.setLayout(new GridLayout(2,2));
         // Creation des boutons pour les figures + ajout
         JButton PaintPackageElispe = new JButton("PaintPackageElispe");
         JButton PaintPackageCercle = new JButton("PaintPackageCercle");
         JButton PaintPackageCarre = new JButton("PaintPackageCarre");
         JButton PaintPackageRectangle = new JButton("PaintPackageRectangle");

         PaintPackage.add(PaintPackageElispe);
         PaintPackage.add(PaintPackageCercle);
         PaintPackage.add(PaintPackageCarre);
         PaintPackage.add(PaintPackageRectangle);

//création du panel ayant les 2 panels PaintPackage et southPanel
         JPanel southPanel = new JPanel();
         southPanel.setLayout(new GridLayout(1,2));



         //On définit que chaque bouton à une action reconnue via son tag
         //Pour les couleurs des formes
         Noir.addActionListener((ActionListener) this); // This because this class implements ActionListener.
         Rouge.addActionListener((ActionListener) this);
         Rose.addActionListener((ActionListener) this);
         Magenta.addActionListener((ActionListener) this);
         Jaune.addActionListener((ActionListener) this);
         Bleu.addActionListener((ActionListener) this);
         Vert.addActionListener((ActionListener) this);
         Orange.addActionListener((ActionListener) this);

         //Pour les formes

         PaintPackageElispe.addActionListener((ActionListener) this);
         PaintPackageCarre.addActionListener((ActionListener) this);
         PaintPackageCercle.addActionListener((ActionListener) this);
         PaintPackageRectangle.addActionListener((ActionListener) this);


         //Pour la barre liste
         e1.addActionListener((ActionListener) this);
         e2.addActionListener((ActionListener) this);
         e3.addActionListener((ActionListener) this);
         e4.addActionListener((ActionListener) this);
         e5.addActionListener((ActionListener) this);

         // Add de tout les panel
         southPanel.add(Couleur,"South");
         southPanel.add(PaintPackage,"South");
         contentPanel.add(southPanel,"South");
         // Ajouter la barre de menu au Panel principal
         contentPanel.add(menubar,"North");

         // Ajouter le dessin sur le Pannel Principal au centre pour dessiner
         contentPanel.add(draw,"Center");


         this.setVisible(true);
 }

         public static void main (String args[]){
         Window win = new Window("Paint ",800,600);
         }
// on décrit l'event de chaque bouton avec le tag associé
        @Override
        public void actionPerformed(ActionEvent e)
        {
                String cmd=e.getActionCommand();
                switch (cmd)
                {
                        case "Noir" :
                                System.out.println("Noir");
                                draw.setColor(Color.black);
                                //Drawing.setBackground(Color.ORANGE);
                                break;
                        case "Jaune" :
                                draw.setColor(Color.yellow);
                                System.out.println("Jaune");
                                break;
                        case "Magenta" :
                                draw.setColor(Color.magenta);
                                System.out.println("Mauve");
                                break;
                        case "Rouge" :
                                draw.setColor(Color.red);
                                System.out.println("Rouge");
                                break;
                        case "Rose" :
                                draw.setColor(Color.pink);
                                System.out.println("Rose");
                                break;
                        case "Vert" :
                                draw.setColor(Color.green);
                                System.out.println("Vert");
                                break;
                        case "Bleu" :
                                draw.setColor(Color.blue);
                                System.out.println("Bleu");
                                break;
                        case "Orange" :
                                draw.setColor(Color.orange);
                                System.out.println("Orange");
                                break;
                        case "PaintPackageElispe" :
                                System.out.println("PaintPackageElispe");
                                draw.setNameFigure("Ellipse");
                                break;
                        case "PaintPackageCarre" :
                                System.out.println("PaintPackageCarre");
                                draw.setNameFigure("Carre");
                                break;
                        case "PaintPackageCercle" :
                                System.out.println("PaintPackageCercle");
                                draw.setNameFigure("Cercle");
                                break;
                        case "PaintPackageRectangle" :
                                System.out.println("PaintPackageRectangle");
                                draw.setNameFigure("Rectangle");
                                break;

                        case "Quit"	: 	System.exit(0);
                                break;
                        case "New" : 	draw.reset();
                                break;

                        case "Authors" :
                                JOptionPane info = new JOptionPane();
                                info.showInternalMessageDialog( info, "Authors : Baudouin Guillaume",
                                        "information",JOptionPane.INFORMATION_MESSAGE);

                                break;

                        case "Open" : 	JFileChooser fdo=new JFileChooser();
                                int x=fdo.showOpenDialog(this);
                                if (x==JFileChooser.CANCEL_OPTION)
                                {System.out.println("Cancelled");
                                        break;}
                                String nameFileOpen=fdo.getSelectedFile().getAbsolutePath();
                                draw.recallDrawing(nameFileOpen);
                                break;

                        case "Save" : 	JFileChooser fds=new JFileChooser();
                                int c=fds.showSaveDialog(this);
                                if (c==JFileChooser.CANCEL_OPTION)
                                {System.out.println("Cancelled");
                                        break;}
                                String nameFile=fds.getSelectedFile().getAbsolutePath();
                                draw.saveDrawing(nameFile);
                                break;





                }
        }
}
