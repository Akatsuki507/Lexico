/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 *
 * @author Master
 */
public class Analizador extends javax.swing.JFrame {
    /**
     * Creates new form Analizador
     */
    public Analizador() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(223, 243, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 730));

        jTextField1.setBackground(new java.awt.Color(80, 180, 236));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(12, 136, 205));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Analizar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(80, 180, 236));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.setBackground(new java.awt.Color(12, 136, 205));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRADUCTOR");

        jButton3.setBackground(new java.awt.Color(12, 136, 205));
        jButton3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jButton3.setBorderPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(298, 298, 298)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lexico/Grupo 9.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(494, 872));
        jLabel2.setMinimumSize(new java.awt.Dimension(494, 872));

        jTextField2.setBackground(new java.awt.Color(80, 180, 236));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 136, 205));
        jLabel3.setText("Guna");

        jLabel4.setBackground(new java.awt.Color(12, 136, 205));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 136, 205));
        jLabel4.setText("Español");

        jButton2.setBackground(new java.awt.Color(12, 136, 205));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Traducir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(492, 492, 492)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     ArrayList<Token> tokens = new ArrayList<>();
     ArrayList<Nodo> arbol = new ArrayList<>();
     ArrayList<Nodo> temporal = new ArrayList<>();
     DefaultMutableTreeNode anterior = new DefaultMutableTreeNode();
     DefaultMutableTreeNode raiz = new DefaultMutableTreeNode();
     int estado = 0;
     boolean sobreescrito = false, invalido=false;
     String eleccion="";
     String input="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("root");
        DefaultTreeModel modeloarbol = new DefaultTreeModel(raiz);
        jTree1.setModel(modeloarbol);
        int x=0;
        if(jTextField1.getText().length()>0 && jTextField2.getText().length()==0){
        input = jTextField1.getText();
        jTextField1.setText("");
        eleccion="Esp";
        }
        else if(jTextField2.getText().length()>0 && jTextField1.getText().length()==0){
        input = jTextField2.getText();
        jTextField2.setText("");
        eleccion="Gun";
        }
        tokens = lex(input, eleccion);
        jTextArea1.setText("TOKENS: \n");
         if("Esp".equals(eleccion)){
        for (Token token : tokens) {
            jTextArea1.append( token.getValor() + ": " + token.getTipoE() + "\n");}}
        if("Gun".equals(eleccion)){
        for (Token token : tokens) {
            jTextArea1.append( token.getValor() + ": " + token.getTipoG() + "\n");}
        }
        if(invalido ==false){
         arbol = Sintact();
         if(invalido ==false){
         raiz = new DefaultMutableTreeNode(arbol.get(0).getdatos());
         Encontrarniños(raiz, arbol,x);
         modeloarbol = new DefaultTreeModel(raiz);
        jTree1.setModel(modeloarbol);
         jButton1.setEnabled(false);
         jButton2.setEnabled(true);
         jTextField1.setEnabled(false);
         jTextField2.setEnabled(false);}
         else{
              jButton1.setEnabled(false);
         }
        }
        else{
         jTextArea1.append("\nHay una palabra invalida en la oración. Intente nuevamente");
        jButton1.setEnabled(false);}
        invalido=false;
    }

    private ArrayList<Token> lex(String input, String eleccion) {
        final ArrayList<Token> tokens = new ArrayList<>();
        String[] result = input.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        for (String palabra : result) {
            boolean matched = false;
            if("Esp".equals(eleccion)){
                for (Token.TiposEspañol tokenTipo : Token.TiposEspañol.values()) {
                    Pattern patron = Pattern.compile(tokenTipo.patron, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                    Matcher matcher = patron.matcher(palabra);
                    if(matcher.find()) {
                        Token tk = new Token();
                        tk.setTipoE(tokenTipo);
                        tk.setValor(palabra.toLowerCase());
                        tokens.add(tk);
                        matched = true;
                    }
                }}
            else if("Gun".equals(eleccion)){
                for (Token.TiposGuna tokenTipo : Token.TiposGuna.values()) {
                    Pattern patron = Pattern.compile(tokenTipo.patron, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                    Matcher matcher = patron.matcher(palabra);
                    if(matcher.find()) {
                        Token tk = new Token();
                        tk.setTipoG(tokenTipo);
                        tk.setValor(palabra.toLowerCase());
                        tokens.add(tk);
                        matched = true;
                    }
                }}
            if (!matched) {
                Token tk = new Token();
                tk.setTipoE(Token.TiposEspañol.TOKEN_INVALIDO);
                tk.setTipoG(Token.TiposGuna.TOKEN_INVALIDO);
                tk.setValor(palabra);
                tokens.add(tk);
                invalido = true;
            }
        }
        return tokens;
    }//GEN-LAST:event_jButton1ActionPerformed
    

        
        
       
     

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      if((jTextField1.getText().length()==0 && jTextField2.getText().length()==0) || (jTextField1.getText().length()>0 && jTextField2.getText().length()>0)){
         jButton1.setEnabled(false);
     }
    else {
         jButton1.setEnabled(true);
     }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
      if((jTextField1.getText().length()==0 && jTextField2.getText().length()==0) || (jTextField1.getText().length()>0 && jTextField2.getText().length()>0)){
     jButton1.setEnabled(false);
     }
    else {
         jButton1.setEnabled(true);
     }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int x = 0,y=0;
     String trad[];
     if(invalido==false){
     Traduccion traduccion = new Traduccion();
       if("Esp".equals(eleccion)){
     trad = traduccion.getPregEsp();
     for(x=0;x<trad.length;x++){
         if(trad[x].equalsIgnoreCase(input)){
             y=x;
         }
     }
     trad=traduccion.getPregGun();
     jTextField2.setText(trad[y]);
     jButton1.setEnabled(true);
       }
       if("Gun".equals(eleccion)){
     trad = traduccion.getPregGun();
     for(x=0;x<trad.length;x++){
         if(trad[x].equalsIgnoreCase(input)){
             y=x;
         }
     }
     trad=traduccion.getPregEsp();
     jTextField1.setText(trad[y]);
     jButton1.setEnabled(true);
       }
      }
     jButton2.setEnabled(false);
     invalido=false;
     jTextField1.setEnabled(true);
     jTextField2.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private ArrayList<Nodo> Sintact(){
        String tipo = "            ";
        Pila pila = new Pila();
        boolean error=false;
        String palabras[]=new String[20];
        int numero = 0;
        String diccionario[] = new String[20];
        int grafo[][] = new int [60][20];
        int x = 0, y = 0, z=0, posicion=0, extraido = 0;
        if("Esp".equals(eleccion)){
        for (x=tokens.size()-1; x>=0 ;x--) {
            if(x == 1){
                tipo = tokens.get(x).getTipoE().toString();
            }
            pila.Insertar(tokens.get(x).getTipoE().toString()); 
            palabras[x]=tokens.get(x).getValor();
             Reglas regla = new Reglas();
             grafo = regla.getgrafoespañol();
             diccionario = regla.getDiccionarioespañol();
             numero = 48;
        }}
      else if("Gun".equals(eleccion)){
        for (x=tokens.size()-1; x>=0 ;x--) {
                if(x ==1 ){
                tipo = tokens.get(x).getTipoG().toString();
            }
            pila.Insertar(tokens.get(x).getTipoG().toString());  
            palabras[x]=tokens.get(x).getValor();
             Reglas regla = new Reglas();
            grafo = regla.getgrafoguna();
            diccionario = regla.getDiccionarioguna();
            numero = 36;
        }}
      Arbol arbol = new Arbol(tipo);
      while(y<numero && error==false){
          for(z=0;z<diccionario.length;z++){
              if(pila.PilaVacia()==false  && diccionario[z].equals(pila.UltimoValor())){
                  posicion=z;
              }
          }
          if(grafo[y][posicion]==0 || pila.PilaVacia()==true){
              error=true;
          }
          else{
              y=grafo[y][posicion];
              arbol.AñadirNodo(pila.UltimoValor(), palabras[extraido]);
               pila.Extraer();
              extraido++;
          }
      }
      if(pila.PilaVacia()==true && error==false){
      jTextArea1.append( "\nANÁLISIS SINTÁCTICO: \nSINTAXIS CORRECTA");} 
      else{
          if(extraido==0){
                jTextArea1.append( "\nANÁLISIS SINTÁCTICO: \nERROR DE SINTAXIS, FALTA SIGNO DE INTERROGACION DE APERTURA");
                    invalido = true;
          }
          else if(pila.PilaVacia()==true){
                jTextArea1.append( "\nANÁLISIS SINTÁCTICO: \nERROR DE SINTAXIS \nFALTA SIGNO DE INTERROGACION DE CIERRE");
                invalido = true;
          }
          else {
      jTextArea1.append( "\nANÁLISIS SINTÁCTICO: \nERROR DE SINTAXIS  luego de la palabra: ' "+palabras[extraido-1]+" '");
      invalido=true;
     }
      }
        return arbol.getarbol();
}
    
 private void Encontrarniños(DefaultMutableTreeNode padre, ArrayList<Nodo> arbol, int x) {
     if(!arbol.get(x).getHijos().isEmpty()){
      for (int i = 0; i < arbol.get(x).getHijos().size(); i++) {
      DefaultMutableTreeNode niño = new DefaultMutableTreeNode(arbol.get(x).getHijos().get(i).getdatos());
      padre.add(niño);
      }
      if(padre.getNextSibling()!=null && !arbol.get(x+1).getHijos().isEmpty()){
          this.temporal = arbol;
          anterior = padre.getNextSibling();
          estado = x+1;
          this.sobreescrito = true;
      }
      padre = padre.getFirstLeaf();
      Encontrarniños(padre,arbol.get(x).getHijos(),0);
       }
     else{
         if(padre.getNextSibling()!=null){
         x++;
     padre = padre.getNextSibling();
      Encontrarniños(padre,arbol,x);
}
         else if(sobreescrito ==true){
           this.sobreescrito = false;
          Encontrarniños(anterior,temporal,estado);
         }
 }
 }
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
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}