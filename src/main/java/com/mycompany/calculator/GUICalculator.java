package com.mycompany.calculator;
public class GUICalculator extends javax.swing.JFrame {
    
    private double numero1;
    private double numero2;
    private double comodinN;
    private char operacion = ' ';
    private String N ="0";
    private String Ns = "";
    private boolean signomenos = false;
    
    public GUICalculator() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void agregarTexto(String texto){
        Ingreso.setText(Ingreso.getText()+texto);
    }
    
    
    private void operando(String Numerosoperando){
       // if(signomenos==true)numero1= Double.parseDouble("-"+Numerosoperando);
      
       if (operacion == '+' || operacion == '-' ||operacion == '/' ||operacion == '*'|| operacion =='8' || operacion=='9' || operacion=='0' || operacion=='$'){
           
           comodinN = Double.parseDouble(Numerosoperando);
           System.out.println(comodinN+"comidin");
         //  operacion= ' ';
          switch (operacion){
             case '+':
                 System.out.println("N2#"+numero2+"suma+"+numero1+"N1");
                 numero2= comodinN+numero1;
                 System.out.println(numero2+"Resultado");
                 break;
             case '-':
                 numero2= numero1-comodinN;
                 break;
             case '*':
                 numero2= comodinN*numero1;
                 break;
              case '/':
                 numero2= comodinN/numero1;
                 break;  
              case '8':
                  double apoyoN=numero1+1;
                  if (numero1<comodinN){
                      do{
                      numero2= numero1*apoyoN;
                      
                       System.out.println(numero2+"soy 2");
                      numero1= numero1+1;
                     if(numero1!=comodinN) apoyoN=numero2;
                      
                      System.out.println(numero1+"soy 1");
                      if(numero1==comodinN)numero2= numero1*apoyoN;
                  }while(numero1!=comodinN);
                 }
              break;
              case '9':
                  double apoyoN2=0;
                  if (numero1<comodinN){
                      do{
              
                      numero2= numero1+apoyoN2;
                      apoyoN2= numero2;
                      numero1= numero1+1;
                        
                  }while(numero1<=comodinN);
                  }
              break;
               case '0':
                   System.out.println("me ejecuto");
                   double apoyoN3=1;
               while(apoyoN3!=comodinN){
                   System.out.println("me ejecuto");
                   numero2=numero1*10;
                   numero1=numero2;
                   apoyoN3= apoyoN3+1;
               }
          break;
               case '$':
                   for (double x= 0; x>numero1; x++){
                       
                   }
               break;
          }
           
       }else{
           numero1 = Double.parseDouble(Numerosoperando);
            switch (operacion){
           
             case'(':
                numero2= Math.log10(numero1);
            break;
            case ',':
                numero2 = Math.sqrt(numero1); 
            break;
            case ';':
                numero2 = Math.cbrt(numero1); 
            break;
            case'1':
                numero2= Math.sin(numero1);
            break;
            case '2' :
                numero2= Math.cos(numero1);
            break;
            case'3':
                numero2= Math.tan(numero1);
            break;
            case'4':
                numero2= Math.asin(numero1);
            break;
            case'5':
                numero2= Math.acos(numero1);
            break;
            case'6':
                numero2= Math.atan(numero1);
            break;
       }
       
       } 
    }

    private void seleccionarOperacion (char operacion){
        if(numero2==0 ) numero2=numero1;
       
        System.out.println(numero2+"N2-solo una vez por codigo");
        this.operacion=operacion;
        switch(operacion){
            case '^':
                numero2= numero1*numero1;
                break;
            case '"':
                numero2= numero1*numero1*numero1;
            break;
            case '7':
                numero2= Math.pow(numero1,-1);
            break;
            case '!':
                double Napoyo =1;
                numero2= 0;
                do{
                numero2=numero2+1;
                
                Napoyo = Napoyo*numero2;
                 numero1 = numero1-1;
                }while ( numero1 != 0);
                numero2= Napoyo;
            break;
            
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Botonigual = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        inversomultiplicativo = new javax.swing.JButton();
        Notacioncientifica = new javax.swing.JButton();
        log10 = new javax.swing.JButton();
        eulier = new javax.swing.JButton();
        raizcubica = new javax.swing.JButton();
        potencia3 = new javax.swing.JButton();
        tangenteinversa = new javax.swing.JButton();
        senoinverso = new javax.swing.JButton();
        cosenoinverso = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        seno = new javax.swing.JButton();
        coseno = new javax.swing.JButton();
        PI = new javax.swing.JButton();
        sumatoriaN = new javax.swing.JButton();
        productoriaN = new javax.swing.JButton();
        Pitagoras = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        Permutacion = new javax.swing.JButton();
        Combinacion = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        potenciaN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingreso.setBackground(new java.awt.Color(255, 255, 255));
        Ingreso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 50, 490, 39));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("4");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 90, 51));

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("-");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 230, 200, 51));

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("7");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 90, 51));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("+/-");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 51));

        Botonigual.setBackground(new java.awt.Color(255, 255, 153));
        Botonigual.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Botonigual.setForeground(new java.awt.Color(0, 0, 0));
        Botonigual.setText("=");
        Botonigual.setBorder(null);
        Botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonigualActionPerformed(evt);
            }
        });
        getContentPane().add(Botonigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 350, 200, 51));

        jButton13.setBackground(new java.awt.Color(255, 255, 153));
        jButton13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("+");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 290, 200, 51));

        jButton16.setBackground(new java.awt.Color(255, 255, 153));
        jButton16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setText("^2");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 90, 51));

        jButton18.setBackground(new java.awt.Color(255, 255, 153));
        jButton18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("1");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, 51));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inversomultiplicativo.setBackground(new java.awt.Color(255, 255, 153));
        inversomultiplicativo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        inversomultiplicativo.setForeground(new java.awt.Color(0, 0, 0));
        inversomultiplicativo.setText("^-1");
        inversomultiplicativo.setBorder(null);
        inversomultiplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversomultiplicativoActionPerformed(evt);
            }
        });
        jPanel1.add(inversomultiplicativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 50));

        Notacioncientifica.setBackground(new java.awt.Color(255, 255, 153));
        Notacioncientifica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Notacioncientifica.setForeground(new java.awt.Color(0, 0, 0));
        Notacioncientifica.setText("x10");
        Notacioncientifica.setBorder(null);
        Notacioncientifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotacioncientificaActionPerformed(evt);
            }
        });
        jPanel1.add(Notacioncientifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 50));

        log10.setBackground(new java.awt.Color(255, 255, 153));
        log10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        log10.setForeground(new java.awt.Color(0, 0, 0));
        log10.setText("Log10");
        log10.setBorder(null);
        log10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log10ActionPerformed(evt);
            }
        });
        jPanel1.add(log10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 90, 50));

        eulier.setBackground(new java.awt.Color(255, 255, 153));
        eulier.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        eulier.setForeground(new java.awt.Color(0, 0, 0));
        eulier.setText("E");
        eulier.setBorder(null);
        eulier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulierActionPerformed(evt);
            }
        });
        jPanel1.add(eulier, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, 50));

        raizcubica.setBackground(new java.awt.Color(255, 255, 153));
        raizcubica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        raizcubica.setForeground(new java.awt.Color(0, 0, 0));
        raizcubica.setText("3√ ");
        raizcubica.setBorder(null);
        raizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizcubicaActionPerformed(evt);
            }
        });
        jPanel1.add(raizcubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 50));

        potencia3.setBackground(new java.awt.Color(255, 255, 153));
        potencia3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        potencia3.setForeground(new java.awt.Color(0, 0, 0));
        potencia3.setText("^3");
        potencia3.setBorder(null);
        potencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencia3ActionPerformed(evt);
            }
        });
        jPanel1.add(potencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 50));

        tangenteinversa.setBackground(new java.awt.Color(255, 255, 153));
        tangenteinversa.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tangenteinversa.setForeground(new java.awt.Color(0, 0, 0));
        tangenteinversa.setText("tan-()");
        tangenteinversa.setBorder(null);
        tangenteinversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteinversaActionPerformed(evt);
            }
        });
        jPanel1.add(tangenteinversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 90, 50));

        senoinverso.setBackground(new java.awt.Color(255, 255, 153));
        senoinverso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        senoinverso.setForeground(new java.awt.Color(0, 0, 0));
        senoinverso.setText("sin-()");
        senoinverso.setBorder(null);
        senoinverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoinversoActionPerformed(evt);
            }
        });
        jPanel1.add(senoinverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 50));

        cosenoinverso.setBackground(new java.awt.Color(255, 255, 153));
        cosenoinverso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cosenoinverso.setForeground(new java.awt.Color(0, 0, 0));
        cosenoinverso.setText("cos-()");
        cosenoinverso.setBorder(null);
        cosenoinverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosenoinversoActionPerformed(evt);
            }
        });
        jPanel1.add(cosenoinverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 50));

        tangente.setBackground(new java.awt.Color(255, 255, 153));
        tangente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tangente.setForeground(new java.awt.Color(0, 0, 0));
        tangente.setText("tan()");
        tangente.setBorder(null);
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });
        jPanel1.add(tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 90, 50));

        seno.setBackground(new java.awt.Color(255, 255, 153));
        seno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        seno.setForeground(new java.awt.Color(0, 0, 0));
        seno.setText("sin()");
        seno.setBorder(null);
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });
        jPanel1.add(seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 50));

        coseno.setBackground(new java.awt.Color(255, 255, 153));
        coseno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        coseno.setForeground(new java.awt.Color(0, 0, 0));
        coseno.setText("cos()");
        coseno.setBorder(null);
        coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosenoActionPerformed(evt);
            }
        });
        jPanel1.add(coseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, 50));

        PI.setBackground(new java.awt.Color(255, 255, 153));
        PI.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PI.setForeground(new java.awt.Color(0, 0, 0));
        PI.setText("PI");
        PI.setBorder(null);
        PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIActionPerformed(evt);
            }
        });
        jPanel1.add(PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, 90));

        sumatoriaN.setBackground(new java.awt.Color(255, 255, 153));
        sumatoriaN.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        sumatoriaN.setForeground(new java.awt.Color(0, 0, 0));
        sumatoriaN.setText("Σ");
        sumatoriaN.setBorder(null);
        sumatoriaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumatoriaNActionPerformed(evt);
            }
        });
        jPanel1.add(sumatoriaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 50));

        productoriaN.setBackground(new java.awt.Color(255, 255, 153));
        productoriaN.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        productoriaN.setForeground(new java.awt.Color(0, 0, 0));
        productoriaN.setText("𝝥");
        productoriaN.setBorder(null);
        productoriaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoriaNActionPerformed(evt);
            }
        });
        jPanel1.add(productoriaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 50));

        Pitagoras.setBackground(new java.awt.Color(255, 255, 153));
        Pitagoras.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Pitagoras.setForeground(new java.awt.Color(0, 0, 0));
        Pitagoras.setText("Pitagoras");
        Pitagoras.setBorder(null);
        jPanel1.add(Pitagoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 40));

        factorial.setBackground(new java.awt.Color(255, 255, 153));
        factorial.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        factorial.setForeground(new java.awt.Color(0, 0, 0));
        factorial.setText("n!");
        factorial.setBorder(null);
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });
        jPanel1.add(factorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 50));

        Permutacion.setBackground(new java.awt.Color(255, 255, 153));
        Permutacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Permutacion.setForeground(new java.awt.Color(0, 0, 0));
        Permutacion.setText("Permutacion");
        Permutacion.setBorder(null);
        Permutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermutacionActionPerformed(evt);
            }
        });
        jPanel1.add(Permutacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 40));

        Combinacion.setBackground(new java.awt.Color(255, 255, 153));
        Combinacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Combinacion.setForeground(new java.awt.Color(0, 0, 0));
        Combinacion.setText("Combinacion");
        Combinacion.setBorder(null);
        jPanel1.add(Combinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 40));

        jButton15.setBackground(new java.awt.Color(255, 255, 153));
        jButton15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("8");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 80, 51));

        jButton12.setBackground(new java.awt.Color(255, 255, 153));
        jButton12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("√ ");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 51));

        jButton10.setBackground(new java.awt.Color(255, 255, 153));
        jButton10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("2");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 80, 51));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("5");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 80, 51));

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("0");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 80, 51));

        jButton19.setBackground(new java.awt.Color(255, 255, 153));
        jButton19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("/");
        jButton19.setBorder(null);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 78, 51));

        jButton14.setBackground(new java.awt.Color(255, 255, 153));
        jButton14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("3");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 78, 51));

        jButton11.setBackground(new java.awt.Color(255, 255, 153));
        jButton11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("6");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 78, 51));

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("9");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 78, 51));

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText(".");
        jButton6.setBorder(null);
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 78, 51));

        jButton21.setBackground(new java.awt.Color(255, 255, 153));
        jButton21.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setText("CE");
        jButton21.setBorder(null);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 90, 51));

        jButton20.setBackground(new java.awt.Color(255, 255, 153));
        jButton20.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setText("C");
        jButton20.setBorder(null);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 100, 51));

        jButton17.setBackground(new java.awt.Color(255, 255, 153));
        jButton17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("*");
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 200, 51));

        potenciaN.setBackground(new java.awt.Color(255, 255, 153));
        potenciaN.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        potenciaN.setForeground(new java.awt.Color(0, 0, 0));
        potenciaN.setText("n^n");
        potenciaN.setBorder(null);
        jPanel1.add(potenciaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      agregarTexto("*");
      seleccionarOperacion('*');
      Ns= "";
      N="";
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        agregarTexto("1");
        N = "1";
        if (Ns != "0"){
            Ns=Ns+N;
            System.out.println(N+"prueba de n");
            System.out.println( Ns+"pureba de ns");
        }
        
        System.out.println(Ns+"boton-s");
        System.out.println(N+"boton");
        operando(Ns);
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       agregarTexto("2");
        N = "2";
        if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       agregarTexto("3");
        N = "3";
         if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     agregarTexto("4");
        N = "4";
         if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       agregarTexto("5");
        N = "5";
        if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        agregarTexto("6");
        N = "6";
        if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        agregarTexto("7");
        N = "7";
        if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        agregarTexto("8");
        N = "8";
       if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        agregarTexto("9");
        N = "9";
         if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        agregarTexto("0");
        N = "0";
        if (Ns != "0"){
            Ns=Ns+N;   
        }
        operando(Ns);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Ingreso.setText("-"+Ingreso.getText());
       signomenos=true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    if(numero1!=0){
        agregarTexto("^2");
          seleccionarOperacion('^');
    }
                
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (numero1==0){
           agregarTexto("√ ");
        seleccionarOperacion(',');  
        }
        //numero1 = Math.sqrt(numero1); 
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       agregarTexto("+");
       seleccionarOperacion('+');
       Ns= "";
       N= "";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       agregarTexto("-");
       seleccionarOperacion('-');
       Ns= "";
       N="";
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       agregarTexto("/");
       seleccionarOperacion('/');
       Ns= "";
        N="";
    }//GEN-LAST:event_jButton19ActionPerformed

    private void BotonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonigualActionPerformed
              
        Ingreso.setText("");
        if(numero2==0) numero2=numero1;
        Ingreso.setText(String.valueOf(numero2));
        N = "";
        Ns = "";
        numero2= 0;
        numero1= 0;
        
    }//GEN-LAST:event_BotonigualActionPerformed
        
     
        
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Ingreso.setText("");
        operando("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        numero1 = 0;
        numero2= 0;
        operacion= ' ';
        Ingreso.setText("");
        operando("");
        N= "";
        Ns= "";
        
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void inversomultiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversomultiplicativoActionPerformed
        if(numero1!=0){
        agregarTexto("^-1");
          seleccionarOperacion('7');
       } 
    }//GEN-LAST:event_inversomultiplicativoActionPerformed

    private void senoinversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoinversoActionPerformed
        if (numero1 ==0){
            agregarTexto("Sen-( ");
        seleccionarOperacion('4');
        }
    }//GEN-LAST:event_senoinversoActionPerformed

    private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
        // Pi
        numero1 = Math.PI;
        Ingreso.setText(Ingreso.getText()+numero1);
        Ns =String.valueOf(numero1);
        operando(Ns);
        
    }//GEN-LAST:event_PIActionPerformed

    private void potencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencia3ActionPerformed
       if(numero1!=0){
        agregarTexto("^3");
          seleccionarOperacion('"');
       }    
    }//GEN-LAST:event_potencia3ActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        if(numero1!=0){
        agregarTexto("!");
          seleccionarOperacion('!');
       }   
    }//GEN-LAST:event_factorialActionPerformed

    private void log10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log10ActionPerformed
        // logaritmo
        if (numero1 ==0){
            agregarTexto("Log( ");
        seleccionarOperacion('(');
        }
        
    }//GEN-LAST:event_log10ActionPerformed

    private void raizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizcubicaActionPerformed
        //raiz cubica
         if (numero1==0){
           agregarTexto("3√ ");
        seleccionarOperacion(';');  
        }
    }//GEN-LAST:event_raizcubicaActionPerformed

    private void eulierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eulierActionPerformed
        numero1 = Math.E;
        Ingreso.setText(Ingreso.getText()+numero1);
        Ns =String.valueOf(numero1);
        operando(Ns);
    }//GEN-LAST:event_eulierActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
          if (numero1 ==0){
            agregarTexto("Sen( ");
        seleccionarOperacion('1');
        }
    }//GEN-LAST:event_senoActionPerformed

    private void cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosenoActionPerformed
       if (numero1 ==0){
            agregarTexto("cos( ");
        seleccionarOperacion('2');
       }
    }//GEN-LAST:event_cosenoActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
       if (numero1 ==0){
            agregarTexto("tang( ");
        seleccionarOperacion('3');
    }//GEN-LAST:event_tangenteActionPerformed
    }
    private void cosenoinversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosenoinversoActionPerformed
        if (numero1 ==0){
            agregarTexto("cos-( ");
        seleccionarOperacion('5');
        }
    }//GEN-LAST:event_cosenoinversoActionPerformed

    private void tangenteinversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteinversaActionPerformed
       if (numero1 ==0){
            agregarTexto("Tan-( ");
        seleccionarOperacion('6');
       }
    }//GEN-LAST:event_tangenteinversaActionPerformed

    private void productoriaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoriaNActionPerformed
        if(numero1!=0){
            agregarTexto("𝝥");
            seleccionarOperacion('8');
        }
        N="";
        Ns="";
    }//GEN-LAST:event_productoriaNActionPerformed

    private void sumatoriaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumatoriaNActionPerformed
        if(numero1!=0){
            agregarTexto("Σ");
            seleccionarOperacion('9');
        }
        N="";
        Ns="";
    }//GEN-LAST:event_sumatoriaNActionPerformed

    private void NotacioncientificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotacioncientificaActionPerformed
         if(numero1!=0){
            agregarTexto("x10(");
            seleccionarOperacion('0');
        }
        N="";
        Ns="";
        
    }//GEN-LAST:event_NotacioncientificaActionPerformed

    private void PermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermutacionActionPerformed
       if(numero1!=0){
            agregarTexto("P");
            seleccionarOperacion('$');
        }
        N="";
        Ns="";
    }//GEN-LAST:event_PermutacionActionPerformed

   
    
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonigual;
    private javax.swing.JButton Combinacion;
    private javax.swing.JTextField Ingreso;
    private javax.swing.JButton Notacioncientifica;
    private javax.swing.JButton PI;
    private javax.swing.JButton Permutacion;
    private javax.swing.JButton Pitagoras;
    private javax.swing.JButton coseno;
    private javax.swing.JButton cosenoinverso;
    private javax.swing.JButton eulier;
    private javax.swing.JButton factorial;
    private javax.swing.JButton inversomultiplicativo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log10;
    private javax.swing.JButton potencia3;
    private javax.swing.JButton potenciaN;
    private javax.swing.JButton productoriaN;
    private javax.swing.JButton raizcubica;
    private javax.swing.JButton seno;
    private javax.swing.JButton senoinverso;
    private javax.swing.JButton sumatoriaN;
    private javax.swing.JButton tangente;
    private javax.swing.JButton tangenteinversa;
    // End of variables declaration//GEN-END:variables

  
}
