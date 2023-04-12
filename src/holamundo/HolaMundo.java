/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author jordi
 */
import java.util.Scanner;
import java.io.*;
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hi World");
        
        //cambio pequeño de comentario
         int sizeMatrix [][];
      int value;
      Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite el número de filas y columnas que desea en la matriz :");
        value = entrada.nextInt();
        sizeMatrix = new int[value][value];
        int con = 40;
        value = 10; 
        for (int i = 1; i <= sizeMatrix.length; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                con += value;
                System.out.print(" [ " + con + " ] ");
            }//cierra el for de la matriz
     
            /*
        tarea de cantera
        String user1= "cantera", password1 ="cantera1234";
        String user, password;
        int validacion=0;
     
        user = JOptionPane.showInputDialog("Ingrese el nombre de usuario :");
        password = JOptionPane.showInputDialog("Ingrese la contraseña : ");

        if (user1.equals(user) && password1.equals(password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido a Cantera");
        }

        while (password1.equals(password) == false && validacion < 2) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos, vuelva a intentarlo");
            user = JOptionPane.showInputDialog("Ingrese el número de usuario :");
            password = JOptionPane.showInputDialog("Ingrese la contraseña : ");
            validacion++;
            if (validacion == 2) {
                JOptionPane.showMessageDialog(null, "Intentarlo más tarde");
            }
            break;
            
        }//cierra el while
        
        String ID="";
        String name="";
        String phone="";
        String address="";
        String CIF="";
        String type="";
        
        int plate=0;
        Date entryDate;
        Date departureDate;
        Date checkTime;
        Date departureTime;
        Double capacity;
        
        //objeto para la empresa y persona fisica
        PhysicalPerson person1 = new PhysicalPerson (); 
        
        Bussiness bussines1 = new Bussiness();
        
        Vehicle vehicle1 = new Vehicle();
        //menu que funciona
       
        try{
            
            System.out.println("Seleccionar una opción");
            System.out.println("Opción 1: Registrar Persona Fisica");
            System.out.println("Opción 2: Registrar Empresa");
            System.out.println("Opción 3: Salir");
            
          
            int opc= Integer.parseInt(br.readLine());
            
            switch (opc){
                case 1:
                     name=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                     ID=JOptionPane.showInputDialog("Ingrese el ID del cliente");
                     phone=JOptionPane.showInputDialog("Ingrese el celular del cliente");
                     address=JOptionPane.showInputDialog("Ingrese la dirección del cliente");
        
        
        person1.setID(ID);
        person1.setName(name);
        person1.setPhone(phone);
        person1.setAddress(address);
        
        JOptionPane.showMessageDialog(null,"El nombre del cliente es : " + person1.getName()+
                "\n"+"El número de celular es: " +person1.getPhone()+"\n"
                +"El ID del cliente es: "+person1.getID()+"\n"+"La dirección de entrega es: "
                + person1.getAddress());
        
                String plate1;
                // entryDate=LocalDate.now();
                plate1=JOptionPane.showInputDialog("Ingrese la placa del carro repartidor: ");
                plate=Integer.parseInt(plate1);
                //entryDate1=JOptionPane.showInputDialog("Ingrese la placa del carro repartidor: "); 
                //EntryDate=Integer.parseInt(entryDate1);
                
                 vehicle1.setPlate(plate);
                 //vehicle1.setEntryDate(LocalDate.now());
                 
        /*Date entryDate;
        Date departureDate;
        Date checkTime;
        Date departureTime;
        Double capacity;*/
       /*
                  JOptionPane.showMessageDialog(null,"La placa del carro es " 
                          + vehicle1.getPlate()+ "\n"+ "La fecha de entrada es: " +LocalDate.now()+"\n"
                          + LocalTime.now() );
                   
                    break;
                case 2:
        
        name=JOptionPane.showInputDialog("Ingrese el nombre de la empresa");
        CIF=JOptionPane.showInputDialog("Ingrese el CFI de la empresa");
        type=JOptionPane.showInputDialog("Ingrese el tipo de empresa");
        phone=JOptionPane.showInputDialog("Ingrese el número de teléfono de la empresa");
        address=JOptionPane.showInputDialog("Ingrese la dirección de la empresa");
        
        bussines1.setName(name);
        bussines1.setPhone(phone);
        bussines1.setAddress(address);
        bussines1.setType(type);
        bussines1.setCIF(CIF);
        
        JOptionPane.showMessageDialog(null,"El nombre de la empresa es : " + bussines1.getName()+
                "\n"+"El número de teléfono de la empresa es: " + bussines1.getPhone()+"\n"
                +"El CIF de la empresa es: " + bussines1.getCIF()+"\n"
                +"El tipo de empresa sería: " + bussines1.getType()+"\n"
                +"La dirección de la empresa es: " + bussines1.getAddress());
                    break;
                case 3:
                    System.out.println("Muchas gracias");
                    break;
                default: {
                }
            }
            //deberia ir el while
          }catch (NumberFormatException numberFormatException){ //cierra el try la primera llave
        } cierra tarea de cantera*/
            
        }//cierra el main principal
        
        
        
       /* int max=new Integer(args[0]);
        int i=0,j=0;
 
        for(i=1;i<=max;i=i+1)
        {
            // Mostramos los asteriscos en cada fila
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Scanner sc=new Scanner (System.in);
        System.out.println("Tamaño de a figura");
        int x=sc.nextInt();
                
                for(int i=1; i<=x;i++){
                    System.out.println();
                    for(int j=1; j<i;j++){
                        System.out.print(" * ");
                    }
                }
                 int sizeMatrix [][];
      int value;
      Scanner entrada = new Scanner(System.in); 
      
        int con = 40;
        value = 10;
        
        System.out.println("Digite el número de filas y columnas que desea en la matriz :");
        value = entrada.nextInt();
        sizeMatrix = new int[value][value];
        
        for (int i = 1; i <= sizeMatrix.length; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                con += value;
                System.out.print(" [ " + con + " ] ");
            }
        } */
     /* Scanner entrada= new Scanner(System.in);
      double numeros[]=new double [3];
      
      System.out.println("Guardando los datos en el arreglo");
      
      for(int i=0; i<3; i++){
          System.out.println("Ingrese un numero");
          
          numeros[i]= entrada.nextDouble();
          }
      
      System.out.println("Los datos del arreglo son: ");
      for(int i=0; i<3; i++){
          System.out.println(numeros[i]);
          }*/
    /* HolaMundo Objeto = new HolaMundo();
       
        Objeto.jugarGato(); */
    }
   // public class JuegoGato{
  //Variables.  
   /* public char [] [] tablero;
    public char jugadorUno;
    public char jugadorDos;
    public boolean turno;
    int contador;        

 //Constructor(Inicializa Variables).
    public HolaMundo(){
       
        tablero      = new char[3][3];               
        jugadorUno   = 'X';
        jugadorDos   = 'O';
        turno        = true;  //Si El Valor De "turno" Es Igual A "true" El Turno Es Del Jugador 1, De Lo Contrario Es Jugador 2.
        int contador = 0;     //Lleva Cuenta De Las Veces Que Han Participado Los Jugadores 1 y 2.
        inicializarTablero();  
    }
       
  //Inicia El Arreglo, Especifica El Numero Que Le Corresponde A Cada Casilla.
    public void inicializarTablero(){
       
        int posicion = 1;
       
        for(int i=0;i<3;i++){
               
                for(int j=0; j<3;j++){
                       
                        tablero[i][j] = Integer.toString(posicion).charAt(0);
                        posicion++;
                }                      
        }
    }
   
  //Imprime El Formato Del Tablero.
    public void imprimirTablero(){
               
        for(int i=0;i<3;i++){
               
                for(int j=0;j<3;j++){
                       
                        if(j<2)
                       
                                System.out.print(" " + tablero[i][j] + " |");
                       
                        else
                               
                                System.out.print(" " + tablero[i][j] + " ");
                                                               
                }
               
                if(i<2)
                       
                        System.out.println("\n-----------");                                                                   
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
 
  //Indica La Posicion Donde Se Ingresara El Dato Dentro Del Arreglo Por Medio De Parametros.  
    public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}
  //Manipula el valor De La Variable "turno".  
    public void setTurno               (boolean d)            {turno         =d;} 
  //Manipula el valor De La Variable "contador".  
    public void setContador            (int e)                {contador      =e;}
   
  //Regresa Valor De La Posicion Del Arreglo Indicada Por Medio De Parametros.  
    public char getPosicionArreglo (int a, int b)  {return tablero[a][b];}
       
  //Regresa Valor De La Variable "jugadorUno".
    public char getJugadorUno      ()  {return jugadorUno   ;}            
   
  //Regresa Valor De La Variable "jugadorDos".
    public char getJugadorDos      ()  {return jugadorDos   ;}            
 
  //Regresa Valor De La Variable "turno".
    public boolean getTurno        ()  {return turno        ;}
  //Regresa Valor De La Variable "contador".              
    public int getContador         ()  {return contador     ;}          
   
   
  //Imprime e Indica El El Turno Del Jugador Que Le Toca Elejir Una Casilla Con Ayuda del Metodo "getTurno()".
    public void indicarTurno(){
       
        if(getTurno()==true)
               
                System.out.println("JUGADOR 1: Elija Una Casilla Ingresando El Numero Correspondiente.");
               
        else
               
                System.out.println("JUGADOR 2: Elija Una Casilla Ingresando El Numero Correspondiente.");      
    }
   
  //Regresa El Caracter De Tipo Char Para Posteriormente Ingresarlo A Alguna Posicion Del Arreglo, Usandolo En Otro Metodo.
    public char obtenerFigura(){
       
        if(getTurno()==true)
               
                return jugadorUno;
               
        else
               
                return jugadorDos;     
    }
   
  //Cambia El Valor De La Variable "turno" Para Llevar El Orden Correcto De Los Turnos Entre Los 2 Jugadores.    
    public void cambiarTurno(){        
       
        if(obtenerFigura()=='X') //Si el Metodo regresa un valor char igual a "X" cambia el valor de "turno" a "false".
               
                setTurno(false);
       
        else
               
                setTurno(true);
    }
     
  //Verifica Si La Posicion Del Arreglo Al Que El Jugador Desea Ingresar El Caracter No Fue Utilizada Antes.  
    public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
     
      //Si Se Cumple La Condicion Se Ingresa El Valor En La Posicion Del Arreglo Especificada. 
        if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
               
           indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());//Ingresa EL Caracter Si Se Cumple La Condicion.
           cambiarTurno();                                                  //Cambia El Turno Si Se Cumple La Condicion.  
           contador++;                                                      //Solo Incremente Cuando Se Cumple La Anterior Condicion.              
        }
       
        else
         
         //Imprime El Siguiente Mensaje En Caso De Que No Se Cumpla La Anterior Condicion.                             
           System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");                
    }
           
  //Metodo Que Hace Uso De Un "switch" Para Indicar La Posicion Del Arreglo Que El Jugador Elijio En El Juego.  
    public void elegirPosicion(int posicion){
                           
            switch(posicion){
               
                  //Comprueba Si La Posicion Esta Disponible Valiendose Del Metodo "comprobarEspacio()"
                        case 1:comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
                        case 2:comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
                        case 3:comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
                        case 4:comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
                        case 5:comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
                        case 6:comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
                        case 7:comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
                        case 8:comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
                        case 9:comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
                        default:
                          //Imprime El Siguiente Mensaje En Caso De Que El "switch" No Reciba Un Digito Del 1 al 9.    
                                System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;                             
            }          
    }
   
  //Solo Imprime Un Mensaje Distinto Dependiendo Del Jugador Que Haya Resultado Ganador.
    public void decirGanador(char a){
       
       
        if(a=='X')
                               
                System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 1!, HA GANADO!.");
       
               
        else if(a=='O')
                           
                    System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 2!, HA GANADO!.");                      
               
                               
    }
   
 //Verifica Las Unicas 8 Combinaciones Que Pueden Dar La Victoria A Uno De Los Jugadores.
    public void buscarGanador(){
                 
      //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Horizontal.
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
                                                       
                           decirGanador(tablero[i][j]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }                      
        }
   
      //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Vertical.  
        for(int i=0;i<3;i++){
               
                for(int j=1;j<2;j++){
                       
                        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                       
                           decirGanador(tablero[j][i]);
                           imprimirTablero();
                           setContador(10);
                        }                              
                }
        }
       
      //Instrucciones Para Comprobar La Unica Posibilidad De Ganar De Forma Diagonal.  
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
       
           decirGanador(tablero[1][1]);
           imprimirTablero();
           setContador(10);
        }  
           
      //Ciclo Con Instrucciones Para Comprobar La Unica Posibilidade De Ganar De Forma Diagonal Inversa.
        if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
               
           decirGanador(tablero[1][1]);
           imprimirTablero();                  
           setContador(10);
        }      
    }    
       
  //Metodo Que Contiene El Flujo Y El Orden Del Juego.
    public void jugarGato(){
       
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("BIENVENIDO A GATO Ver. 1.0");      
               
        do{
       
                indicarTurno();                
                imprimirTablero();     
                try{elegirPosicion(Integer.parseInt(entrada.readLine()));}
                catch(IOException e){}    
                catch(NumberFormatException e){
                       
                        if(getTurno()==true)
                           
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                       
                        else
                               
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");      
                }
                         
                buscarGanador();
       
        }while(getContador()<9);
       
          if(getContador()==9){
               
                System.out.println("¡GATO!¡JUEGO EMPATADO!");                                        
            imprimirTablero();
            System.out.println("THANKS FOR PLAYING!");             
          }
         
         System.out.println("THANKS FOR PLAYING!");            
    }
    
*/
    
    
    
    
    
}
