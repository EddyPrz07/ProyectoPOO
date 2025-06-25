package proyecto_poo_ii;

import java.util.Scanner;
import java.util.ArrayList;

public class Proyecto_POO_II {

    public static void main(String[] args) {
        
        boolean bucle = true;
        ArrayList<String> pedido = new ArrayList<>();
        Fast_Food pappas = new Fast_Food("Pappa's Luois","Calle 19a Sur #18-07");
        Restaurante martha = new Restaurante("El sazon de Martha","Calle 27a Sur");
        Panaderia panesla30 = new Panaderia("Panes La 30","Calle 17 Sur");
        Domiciliario victor = new Domiciliario("Victor","Moto");
        Domiciliario manuel = new Domiciliario("Manuel","Moto");
        Domiciliario francisco = new Domiciliario("Francisco","Moto");
        Domiciliario frank = new Domiciliario("Frank","Moto");
        Domiciliario rick = new Domiciliario("Rick","Moto");
        Domiciliario john = new Domiciliario("John","Bici");
        Domiciliario gerardo = new Domiciliario("Gerardo","Bici");
        Domiciliario santiago = new Domiciliario("Santiago","Moto");
        Domiciliario lorenzo = new Domiciliario("Lorenzo","Moto");
        Domiciliario johnny = new Domiciliario("Johnny","Bici");
        Domiciliario[] domiciliariosPan = {lorenzo,johnny};
        Domiciliario[] domiciliariosRes = {victor,manuel,francisco,frank};
        Domiciliario[] domiciliariosFast = {rick,john,gerardo,santiago};
        Scanner sc = new Scanner(System.in);
        
        while (true){
        System.out.println("--------------------");
        System.out.println("Ingrese su rol");
        System.out.println("1.Establecimiento");
        System.out.println("2.Cliente");
        System.out.println("3.Domiciliario");
        System.out.println("0.Salir");
        System.out.println("-------------------");
        int rol = sc.nextInt();
        sc.nextLine();
        switch (rol){
            case 1:
                System.out.println("Que desea");
                System.out.println("1.Lista de pedidos \n2.Domiciliarios \n3.Resenas del establecimiento");
                int eleccion = sc.nextInt();
                switch (eleccion) {
                case 1:
                    System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                    int listaEleccion = sc.nextInt();
                    sc.nextLine();
                    if (listaEleccion == 1)
                        System.out.println(pappas.listaPedidos);
                    else if (listaEleccion == 2)
                        System.out.println(martha.listaPedidos);
                    else if (listaEleccion == 3)
                        System.out.println(panesla30.listaPedidos);
                    else {
                        System.out.println("Opcion no valida");}
                    break;
                case 2:
                    System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                    int domiEleccion = sc.nextInt();
                    if (domiEleccion == 1){
                        for (Domiciliario domi : domiciliariosFast){
                            domi.mostrarData();
                        }}
                    else if (domiEleccion == 2){
                        for (Domiciliario domi : domiciliariosRes){
                            domi.mostrarData();
                        }}
                    else if (domiEleccion == 3){
                        for (Domiciliario domi : domiciliariosPan){
                            domi.mostrarData();
                        }}
                    else {
                        System.out.println("Opcion no valida");}
                    break;
                case 3:
                    System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                    int resenaEleccion = sc.nextInt();
                    sc.nextLine();
                    if (resenaEleccion == 1)
                        System.out.println(pappas.listaResenas);
                    else if (resenaEleccion == 2)
                        System.out.println(martha.listaResenas);
                    else if (resenaEleccion == 3)
                        System.out.println(panesla30.listaResenas);
                    else {
                        System.out.println("Opcion no valida");}
                    break;
                default:
                    System.out.println("Opcion no valida");
                }
                break;
            case 2:
                System.out.println("Ingrese su nombre");
                String nombre = sc.nextLine();
                System.out.println("Que va a hacer");
                System.out.println("1.Registrar pedido\n2.Realizar resena");
                int eleccionMadre = sc.nextInt();
                sc.nextLine();
                switch (eleccionMadre){
                    case 1:
                        System.out.println("Ingrese su direccion");
                        String direccion = sc.nextLine();
                        Cliente c1 = new Cliente(nombre,direccion);
                        System.out.println("Establecimientos a disposicion");
                        System.out.println("1.");pappas.mostrarData();
                        System.out.println("2.");martha.mostrarData();
                        System.out.println("3.");panesla30.mostrarData();
                        System.out.println("Donde desea hacer el pedido?");
                        eleccion = sc.nextInt();
                        sc.nextLine();
                        switch (eleccion) {
                        case 1:
                            System.out.println(pappas.menu);
                            break;
                        case 2:
                            System.out.println(martha.menu);
                            break;
                        default:
                            System.out.println(panesla30.menu);
                            break;
                        }
                        int monto = 0;
                        while (bucle){
                        System.out.println("Que desea");
                        int eleccionComida = sc.nextInt();
                        sc.nextLine();
                        switch (eleccionComida) {
                            case 1:
                                if (eleccion == 1){
                                    pedido.add("Porcion de papa francesa");
                                    monto += 5000;}
                                if (eleccion == 2){
                                    pedido.add("Corrientazo");
                                    monto += 8000;}
                                if (eleccion == 3){
                                    pedido.add("Pan de queso");
                                    monto += 3000;}
                                break;
                            case 2:
                                if (eleccion == 1){
                                    pedido.add("Hamburguesa sencilla");
                                    monto += 8000;}
                                if (eleccion == 2){
                                    System.out.println("Cual desea (Sobrebarriga,pechuga,mojarra,chicharron)");
                                    String  tipoEspecial = sc.nextLine();
                                    pedido.add("Especial " + tipoEspecial);
                                    monto += 15000;}
                                if (eleccion == 3){
                                    System.out.println("De que tamano (Grande/Pequeno)");
                                    String pastelTamano = sc.nextLine();
                                    pedido.add("Pastel de cumpleanos " + pastelTamano);
                                    if (pastelTamano.equalsIgnoreCase("Grande"))
                                        monto += 25000;
                                    else
                                        monto += 16000;}
                                break;
                            case 3:
                                if (eleccion == 1){
                                    pedido.add("Hamburguesa doble carne");
                                    monto += 12000;}
                                if (eleccion == 2){
                                    pedido.add("Ensalada clasica");
                                    monto += 3000;}
                                if (eleccion == 3){
                                    pedido.add("Almojabana");
                                    monto += 2000;}
                                break;
                            case 4:
                                if (eleccion == 1){
                                    pedido.add("Hamburguesa completa");
                                    monto += 16000;}
                                if (eleccion == 2){
                                    System.out.println("Gallina (1/2 o completa)");
                                    String tipoGallina = sc.nextLine();
                                    pedido.add(tipoGallina + " gallina");
                                    if (tipoGallina.equalsIgnoreCase("Completa"))
                                        monto += 80000;
                                    monto += 40000;}
                                if (eleccion == 3){
                                    System.out.println("De cual (Carne/Pollo)");
                                    String pastelGloria = sc.nextLine();
                                    pedido.add("Pastel gloria " + pastelGloria);
                                    monto += 4000;}
                                break;
                            case 5:
                                if (eleccion == 1){
                                    pedido.add("Hot dog americano");
                                    monto += 7000;}
                                if (eleccion == 2){
                                    pedido.add("Porcion de rellena");
                                    monto += 5000;}
                                if (eleccion == 3){
                                    pedido.add("Brownie de chocolate");
                                    monto += 2500;}
                                break;
                            case 6:
                                if (eleccion == 1){
                                    pedido.add("Chorriperro");
                                    monto += 9000;}
                                if (eleccion == 2){
                                    pedido.add("Picada");
                                    monto += 60000;}
                                if (eleccion == 3){
                                    pedido.add("Mariposa");
                                    monto += 3000;}
                                break;
                            case 7:
                                if (eleccion == 1){
                                    pedido.add("Hot dog mexicano");
                                    monto += 12000;}
                                if (eleccion == 2){
                                    pedido.add("Sopa del dia");
                                    monto += 5000;}
                                if (eleccion == 3){
                                    pedido.add("Brazo de reina");
                                    monto += 8000;}
                                break;
                            case 8:
                                if (eleccion == 1){
                                    pedido.add("Hot dog completo");
                                    monto += 14000;}
                                if (eleccion == 2){
                                    pedido.add("Jugo");
                                    monto += 4000;}
                                if (eleccion == 3){
                                    pedido.add("Pan integral");
                                    monto += 5000;}
                                break;
                            case 9:
                                if (eleccion == 1){
                                    System.out.println("De cual quiere (Carne,pollo,mixta)");
                                    String tipoEmpanada = sc.nextLine();
                                    pedido.add("Empanada " + tipoEmpanada);
                                    monto += 4000;}
                                if (eleccion == 2){
                                    pedido.add("Sancocho");
                                    monto += 8000;}
                                if (eleccion == 3){
                                    System.out.println("De cual quiere (Carne,pollo,mixto)");
                                    String tipoEmparedado = sc.nextLine();
                                    pedido.add("Sandwich " + tipoEmparedado);
                                    monto += 6000;}
                                break;
                            case 10:
                                if (eleccion == 1){
                                    pedido.add("Burrito");
                                    monto += 8000; }
                                if (eleccion == 2){
                                    pedido.add("Ajiaco");
                                    monto += 10000;}
                                if (eleccion == 3){
                                    System.out.println("Mogolla (Grande / Pequena)");
                                    String mogollaTamano = sc.nextLine();
                                    pedido.add("Mogolla " + mogollaTamano);
                                    if (mogollaTamano.equalsIgnoreCase("Grande"))
                                        monto += 7000;
                                    monto += 4000;}
                                break;
                            case 11:
                                if (eleccion == 1){
                                    System.out.println("De cual quiere (Rosada,tomate,BBQ,suero costeno,tartara) o aji,pico de gallo,guacamole");
                                    String tipoAditivo = sc.nextLine();
                                    pedido.add(tipoAditivo);
                                    monto += 2000; }
                                if (eleccion == 2){
                                    pedido.add("Consome");
                                    monto += 5000;}
                                if (eleccion == 3){
                                    pedido.add("Postre de maracuya");
                                    monto += 8000;}
                                break;
                            case 12:
                                if (eleccion == 1){
                                    System.out.println("Que desea (Nachos,papas fritas,queso derretido)");
                                    String tipoTope = sc.nextLine();
                                    pedido.add(tipoTope);
                                    monto += 4000;}
                                if (eleccion == 2){
                                    pedido.add("Caldo de costilla");
                                    monto += 8000;}
                                if (eleccion == 3){
                                    pedido.add("Galleta de chocolate");
                                    monto += 2500;}
                                break;
                            case 0:
                                bucle = false;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                            }}
                            System.out.println("Aqui tiene su pedido");
                            if (eleccion == 1){
                                Pedido p1 = new Pedido(c1,pappas,gerardo,pedido);
                                gerardo.actualizarEstado();
                                gerardo.anadirPedido(p1);
                                pappas.anadirPedido(p1);
                                System.out.println(pedido);
                                p1.mostrarInfo();}
                            else if (eleccion == 2){
                                Pedido p1 = new Pedido(c1,martha,manuel,pedido);
                                manuel.actualizarEstado();
                                manuel.anadirPedido(p1);
                                martha.anadirPedido(p1);
                                System.out.println(pedido);
                                p1.mostrarInfo();}
                            else {
                                Pedido p1 = new Pedido(c1,panesla30,johnny,pedido);
                                johnny.actualizarEstado();
                                johnny.anadirPedido(p1);
                                panesla30.anadirPedido(p1);
                                System.out.println(pedido);
                                p1.mostrarInfo();}
                            System.out.println("Total a pagar: $" + monto);
                            System.out.println("Espero que lo disfrutes =)");
                            break;
                    case 2:
                        System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                        int estrellaEleccion = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Estrellas (1/5)");
                        int estrellas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Resena");
                        String resena = sc.nextLine();
                        String resenaCompleta = nombre + ": " + estrellas + "/5, " + resena;
                        if (estrellaEleccion == 1)
                            pappas.anadirResena(resenaCompleta);
                        if (estrellaEleccion == 2)
                            martha.anadirResena(resenaCompleta);
                        if (estrellaEleccion == 3)
                            panesla30.anadirResena(resenaCompleta);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                break;
            case 3:
                System.out.println("Que desea");
                System.out.println("1.Lista de pedidos\n2.Actualizar estado (Activo/Inactivo)\n3.Contactarme con alguien");
                eleccion = sc.nextInt();
                sc.nextLine();
                switch (eleccion) {
                case 1:
                    System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                    int pedidoEleccion = sc.nextInt();
                    sc.nextLine();
                    switch (pedidoEleccion){
                        case 1:
                            for (int i = 0;i < domiciliariosFast.length;i++){
                                System.out.println((i+1) + "." + domiciliariosFast[i].getName());}
                            int pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                               System.out.println(rick.pedidosPendientes);
                            if (pedidoEleccion2 == 2)
                                System.out.println(john.pedidosPendientes);
                            if (pedidoEleccion2 == 3)
                                System.out.println(gerardo.pedidosPendientes);;
                            if (pedidoEleccion2 == 4)
                                System.out.println(santiago.pedidosPendientes);
                            break;
                        case 2:
                            for (int i = 0;i < domiciliariosRes.length;i++){
                                System.out.println((i+1) + "." + domiciliariosRes[i].getName());}
                            pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                                System.out.println(victor.pedidosPendientes);
                            if (pedidoEleccion2 == 2)
                                System.out.println(manuel.pedidosPendientes);
                            if (pedidoEleccion2 == 3)
                                System.out.println(francisco.pedidosPendientes);
                            if (pedidoEleccion2 == 4)
                                System.out.println(frank.pedidosPendientes);
                            break;
                        case 3:
                            for (int i = 0;i < domiciliariosPan.length;i++){
                                System.out.println((i+1) + "." + domiciliariosPan[i].getName());}
                            pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                                System.out.println(lorenzo.pedidosPendientes);
                            if (pedidoEleccion2 == 2)
                                System.out.println(johnny.pedidosPendientes);
                            break;
                        }
                    break;
                case 2:
                    System.out.println("1." + pappas.getName() +  " 2." + martha.getName() + " 3." + panesla30.getName());
                    pedidoEleccion = sc.nextInt();
                    sc.nextLine();
                    switch (pedidoEleccion){
                        case 1:
                            for (int i = 0;i < domiciliariosFast.length;i++){
                                System.out.println((i+1) + "." + domiciliariosFast[i].getName());}
                            int pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                               rick.actualizarEstado();
                            if (pedidoEleccion2 == 2)
                                john.actualizarEstado();
                            if (pedidoEleccion2 == 3)
                                gerardo.actualizarEstado();
                            if (pedidoEleccion2 == 4)
                                santiago.actualizarEstado();
                            break;
                        case 2:
                            for (int i = 0;i < domiciliariosRes.length;i++){
                                System.out.println((i+1) + "." + domiciliariosRes[i].getName());}
                            pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                                victor.actualizarEstado();
                            if (pedidoEleccion2 == 2)
                                manuel.actualizarEstado();
                            if (pedidoEleccion2 == 3)
                                francisco.actualizarEstado();
                            if (pedidoEleccion2 == 4)
                                frank.actualizarEstado();
                            break;
                        case 3:
                            for (int i = 0;i < domiciliariosPan.length;i++){
                                System.out.println((i+1) + "." + domiciliariosPan[i].getName());}
                            pedidoEleccion2 = sc.nextInt();
                            sc.nextLine();
                            if (pedidoEleccion2 == 1)
                                lorenzo.actualizarEstado();
                            if (pedidoEleccion2 == 2)
                                johnny.actualizarEstado();
                            break;
                        }
                    break;
                case 3:
                    System.out.println("Contacto: 699-788-108");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                }
            case 0:
                return;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }
    }
}
