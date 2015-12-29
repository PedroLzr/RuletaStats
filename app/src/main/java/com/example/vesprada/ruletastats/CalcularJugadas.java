package com.example.vesprada.ruletastats;

import java.util.ArrayList;

public class CalcularJugadas {
    public static int pares, impares;
    public static int rojo, negro;
    public static int primeraMitad, segundaMitad;
    public static int primeraDocena, segundaDocena, terceraDocena;

    public static int[] numSalidos = new int[37];
    public static double[] porcentajeNum = new double[37];
    public static ArrayList<Integer> numerosCalientes = new ArrayList<Integer>();
    public static ArrayList<Integer> numerosCalientesFila = new ArrayList<Integer>();
    public static ArrayList<Integer> numerosCalientesCuadro = new ArrayList<Integer>();
    public static ArrayList<Integer> numerosApostados = new ArrayList<Integer>();

    public static void calcularNumeros(ArrayList<Integer> tiradas){

        //Vaciar números salidos.
        for(int i = 0; i < numSalidos.length; i++){
            numSalidos[i] = 0;
        }

        for (int i = 0; i < tiradas.size(); i++) {
            switch (tiradas.get(i)){
                case 0:{
                    numSalidos[0]++;
                }break;
                case 1:{
                    numSalidos[1]++;
                }break;
                case 2:{
                    numSalidos[2]++;
                }break;
                case 3:{
                    numSalidos[3]++;
                }break;
                case 4:{
                    numSalidos[4]++;
                }break;
                case 5:{
                    numSalidos[5]++;
                }break;
                case 6:{
                    numSalidos[6]++;
                }break;
                case 7:{
                    numSalidos[7]++;
                }break;
                case 8:{
                    numSalidos[8]++;
                }break;
                case 9:{
                    numSalidos[9]++;
                }break;
                case 10:{
                    numSalidos[10]++;
                }break;
                case 11:{
                    numSalidos[11]++;
                }break;
                case 12:{
                    numSalidos[12]++;
                }break;
                case 13:{
                    numSalidos[13]++;
                }break;
                case 14:{
                    numSalidos[14]++;
                }break;
                case 15:{
                    numSalidos[15]++;
                }break;
                case 16:{
                    numSalidos[16]++;
                }break;
                case 17:{
                    numSalidos[17]++;
                }break;
                case 18:{
                    numSalidos[18]++;
                }break;
                case 19:{
                    numSalidos[19]++;
                }break;
                case 20:{
                    numSalidos[20]++;
                }break;
                case 21:{
                    numSalidos[21]++;
                }break;
                case 22:{
                    numSalidos[22]++;
                }break;
                case 23:{
                    numSalidos[23]++;
                }break;
                case 24:{
                    numSalidos[24]++;
                }break;
                case 25:{
                    numSalidos[25]++;
                }break;
                case 26:{
                    numSalidos[26]++;
                }break;
                case 27:{
                    numSalidos[27]++;
                }break;
                case 28:{
                    numSalidos[28]++;
                }break;
                case 29:{
                    numSalidos[29]++;
                }break;
                case 30:{
                    numSalidos[30]++;
                }break;
                case 31:{
                    numSalidos[31]++;
                }break;
                case 32:{
                    numSalidos[32]++;
                }break;
                case 33:{
                    numSalidos[33]++;
                }break;
                case 34:{
                    numSalidos[34]++;
                }break;
                case 35:{
                    numSalidos[35]++;
                }break;
                case 36:{
                    numSalidos[36]++;
                }break;
            }
        }

        //Borrar array de porcentajes
        for (int i = 0; i < porcentajeNum.length; i++) {
            porcentajeNum[i] = 0;
        }

        //CALCULAR PORCENTAJE Y METERLO EN ARRAY
        for (int i = 0; i < porcentajeNum.length; i++) {
            porcentajeNum[i] = (numSalidos[i] * 100) / tiradas.size();
        }

        //CALCULAR NUMEROS CALIENTES Y METERLO EN ARRAYLIST (BORRANDO CONTENIDO ANTES)
        numerosCalientes.clear();
        numerosCalientesCuadro.clear();
        numerosCalientesFila.clear();
        for (int i = 0; i < porcentajeNum.length; i++) {
            if (porcentajeNum[i] > 3.15) {
                numerosCalientes.add(i);
            }
            if (porcentajeNum[i] > 2.8) {
                numerosCalientesCuadro.add(i);
            }
            if (porcentajeNum[i] > 3) {
                numerosCalientesFila.add(i);
            }
        }
    }

  /*  public static void mostrarEstadisticas(double numerosTotal, String[] ultimosNumeros) {

        //CALCULAR PORCENTAJE Y METERLO EN ARRAY
        for (int i = 0; i < porcentajeNum.length; i++) {
            porcentajeNum[i] = (numSalidos[i] * 100) / numerosTotal;
        }

        //CALCULAR NUMEROS CALIENTES Y METERLO EN ARRAYLIST (BORRANDO CONTENIDO ANTES)
        numerosCalientes.clear();
        numerosCalientesCuadro.clear();
        numerosCalientesFila.clear();
        for (int i = 0; i < porcentajeNum.length; i++) {
            if (porcentajeNum[i] > 3.15) {
                numerosCalientes.add(i);
            }
            if (porcentajeNum[i] > 2.8) {
                numerosCalientesCuadro.add(i);
            }
            if (porcentajeNum[i] > 3) {
                numerosCalientesFila.add(i);
            }
        }
    }*/

        //MOSTRAR ESTADISTICAS
        /*
        System.out.println();
        System.out.println();
        int mostrarNumTotal = (int) numerosTotal;
        System.out.println("Números total introducidos : "+mostrarNumTotal);
        System.out.println("**************ESTADÍSTICAS**************");
        for(int i = 0; i < 37; i++){
            if(numSalidos[i]!=1){
                System.out.println("Número : "+i+" ha salido "+numSalidos[i]+" veces - "+porcentajeNum[i]+"%");
            }
            else{
                System.out.println("Número : "+i+" ha salido "+numSalidos[i]+" vez - "+porcentajeNum[i]+"%");
            }
        }
        System.out.println();
        System.out.println("Pares : "+pares+" - "+(pares*100)/numerosTotal+"%");
        System.out.println("Impares : "+impares+" - "+(impares*100)/numerosTotal+"%");
        System.out.println();
        System.out.println("Rojo : "+rojo+" - "+(rojo*100)/numerosTotal+"%");
        System.out.println("Negro : "+negro+" - "+(negro*100)/numerosTotal+"%");
        System.out.println();
        System.out.println("Primera Mitad: "+primeraMitad+" - "+(primeraMitad*100)/numerosTotal+"%");
        System.out.println("Segunda Mitad: "+segundaMitad+" - "+(segundaMitad*100)/numerosTotal+"%");
        System.out.println();
        System.out.println("Primera Docena : "+primeraDocena+" - "+(primeraDocena*100)/numerosTotal+"%");
        System.out.println("Segunda Docena : "+segundaDocena+" - "+(segundaDocena*100)/numerosTotal+"%");
        System.out.println("Tercera Docena : "+terceraDocena+" - "+(terceraDocena*100)/numerosTotal+"%");
        System.out.println();

        //MOSTRAR NUMEROS CALIENTES
        System.out.print("Números calientes: ");
        for(Integer current : numerosCalientes) {
            System.out.print(current+"   ");
        }
        System.out.println();
        System.out.println();

        //NUMEROS CONGELADOS
        System.out.print("Números congelados (Menos del 1%): ");
        for(int i = 0; i<numSalidos.length; i++){
            if(porcentajeNum[i]<1){
                System.out.print(i + "   ");
            }
        }
        System.out.println();
        System.out.println();

        //ULTIMOS NUMEROS
        System.out.print("Últimos números salidos: ");
        for(int i = 0; i<ultimosNumeros.length; i++){
            System.out.print(ultimosNumeros[i] + "   ");
        }

        System.out.println();
        System.out.println();
    }*/

    /*
    public static void Cero(){
        numSalidos[0]++;
    }

    public static void Uno(){
        numSalidos[1]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Dos(){
        numSalidos[2]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Tres(){
        numSalidos[3]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Cuatro(){
        numSalidos[4]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Cinco(){
        numSalidos[5]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Seis(){
        numSalidos[6]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Siete(){
        numSalidos[7]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Ocho(){
        numSalidos[8]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Nueve(){
        numSalidos[9]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Diez(){
        numSalidos[10]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Once(){
        numSalidos[11]++;
        impares++;
        primeraMitad++;
        primeraDocena++;
        negro++;
    }

    public static void Doce(){
        numSalidos[12]++;
        pares++;
        primeraMitad++;
        primeraDocena++;
        rojo++;
    }

    public static void Trece(){
        numSalidos[13]++;
        impares++;
        primeraMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Catorce(){
        numSalidos[14]++;
        pares++;
        primeraMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Quince(){
        numSalidos[15]++;
        impares++;
        primeraMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Dieciseis(){
        numSalidos[16]++;
        pares++;
        primeraMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Diecisiete(){
        numSalidos[17]++;
        impares++;
        primeraMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Dieciocho(){
        numSalidos[18]++;
        pares++;
        primeraMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Diecinueve(){
        numSalidos[19]++;
        impares++;
        segundaMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Veinte(){
        numSalidos[20]++;
        pares++;
        segundaMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Veintiuno(){
        numSalidos[21]++;
        impares++;
        segundaMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Veintidos(){
        numSalidos[22]++;
        pares++;
        segundaMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Veintitres(){
        numSalidos[23]++;
        impares++;
        segundaMitad++;
        segundaDocena++;
        rojo++;
    }

    public static void Veinticuatro(){
        numSalidos[24]++;
        pares++;
        segundaMitad++;
        segundaDocena++;
        negro++;
    }

    public static void Veinticinco(){
        numSalidos[25]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }

    public static void Veintiseis(){
        numSalidos[26]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Veintisiete(){
        numSalidos[27]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }

    public static void Veintiocho(){
        numSalidos[28]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Veintinueve(){
        numSalidos[29]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Treinta(){
        numSalidos[30]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }

    public static void Treintaiuno(){
        numSalidos[31]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Treintaidos(){
        numSalidos[32]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }

    public static void Treintaitres(){
        numSalidos[33]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Treintaicuatro(){
        numSalidos[34]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }

    public static void Treintaicinco(){
        numSalidos[35]++;
        impares++;
        segundaMitad++;
        terceraDocena++;
        negro++;
    }

    public static void Treintaiseis(){
        numSalidos[36]++;
        pares++;
        segundaMitad++;
        terceraDocena++;
        rojo++;
    }
    */

    public static ArrayList<String> calcularCuadros(ArrayList<Integer> tiradas) {

        calcularNumeros(tiradas);

        ArrayList<String> jugadas = new ArrayList<String>();

        //Calcular Cuadros
        if (numerosCalientesCuadro.contains(0) && numerosCalientesCuadro.contains(1) && numerosCalientesCuadro.contains(2) && numerosCalientesCuadro.contains(3)) {
            jugadas.add("Cuatro primeros");

            numerosApostados.add(0);
            numerosApostados.add(1);
            numerosApostados.add(2);
            numerosApostados.add(3);
        }
        for (int i = 1; i < numSalidos.length; i++) {
            if (i % 3 != 0) {
                if (numerosCalientesCuadro.contains(i) && numerosCalientesCuadro.contains(i + 1) && numerosCalientesCuadro.contains(i + 3) && numerosCalientesCuadro.contains(i + 4)) {
                    jugadas.add("Cuadro del " + i + ", " + (i + 1) + ", " + (i + 3) + " y " + (i + 4));

                    if (!numerosApostados.contains(i)) {
                        numerosApostados.add(i);
                    }
                    if (!numerosApostados.contains(i + 1)) {
                        numerosApostados.add(i + 1);
                    }
                    if (!numerosApostados.contains(i + 3)) {
                        numerosApostados.add(i + 3);
                    }
                    if (!numerosApostados.contains(i + 4)) {
                        numerosApostados.add(i + 4);
                    }
                }
            }
        }

        return jugadas;
    }

    public static ArrayList<String> calcularFilas(ArrayList<Integer> tiradas) {

        calcularNumeros(tiradas);

        ArrayList<String> jugadas = new ArrayList<String>();

        //Calcular Filas
        for(int i = 1; i<numSalidos.length; i=i+3){
            if(numerosCalientesFila.contains(i) && numerosCalientesFila.contains(i+1) && numerosCalientesFila.contains(i+2)){
                jugadas.add("Fila del "+i+", "+(i+1)+" y "+(i+2));

                if(!numerosApostados.contains(i)){
                    numerosApostados.add(i);
                }
                if(!numerosApostados.contains(i+1)){
                    numerosApostados.add(i+1);
                }
                if(!numerosApostados.contains(i+2)){
                    numerosApostados.add(i+2);
                }
            }
        }

        return jugadas;
    }

    public static ArrayList<String> calcularCaballos(ArrayList<Integer> tiradas) {

        calcularNumeros(tiradas);

        ArrayList<String> jugadas = new ArrayList<String>();

        //Calcular Caballos
        if(numerosCalientes.contains(0) && numerosCalientes.contains(1)){
            jugadas.add("Caballo al 0 y 1");

            if(!numerosApostados.contains(0)){
                numerosApostados.add(0);
            }
            if(!numerosApostados.contains(1)){
                numerosApostados.add(1);
            }
        }
        if(numerosCalientes.contains(0) && numerosCalientes.contains(2)){
            jugadas.add("Caballo al 0 y 2");

            if(!numerosApostados.contains(0)){
                numerosApostados.add(0);
            }
            if(!numerosApostados.contains(2)){
                numerosApostados.add(2);
            }
        }
        if(numerosCalientes.contains(0) && numerosCalientes.contains(3)){
            jugadas.add("Caballo al 0 y 3");

            if(!numerosApostados.contains(0)){
                numerosApostados.add(0);
            }
            if(!numerosApostados.contains(3)){
                numerosApostados.add(3);
            }
        }

        for(int i = 1; i<numSalidos.length; i++){
            if(i%3!=0){
                if(numerosCalientes.contains(i) && numerosCalientes.contains(i+1)){
                    jugadas.add("Caballo al " + i + " y " + (i + 1));

                    if(!numerosApostados.contains(i)){
                        numerosApostados.add(i);
                    }
                    if(!numerosApostados.contains(i+1)){
                        numerosApostados.add(i+1);
                    }
                }
            }
            if(i<=33){
                if(numerosCalientes.contains(i) && numerosCalientes.contains(i+3)){
                    jugadas.add("Caballo al " + i + " y " + (i + 3));

                    if(!numerosApostados.contains(i)){
                        numerosApostados.add(i);
                    }
                    if(!numerosApostados.contains(i+3)){
                        numerosApostados.add(i+3);
                    }
                }
            }
        }

        return jugadas;
    }

    public static ArrayList<String> calcularPlenos(ArrayList<Integer> tiradas) {

        calcularNumeros(tiradas);

        ArrayList<String> jugadas = new ArrayList<String>();

        //Calcular Plenos
        for(int i = 1; i<numSalidos.length; i++){
            if(porcentajeNum[i]>3.9){
                jugadas.add("Pleno al " + i);

                if(!numerosApostados.contains(i)){
                    numerosApostados.add(i);
                }
            }
        }

        return jugadas;
    }

    public static ArrayList<String> calcularInfo(ArrayList<Integer> tiradas) {

        ArrayList<String> info = new ArrayList<String>();

        //Probabilidad Real
        double probabilidadAcierto;
        int cantidadNumApostados = numerosApostados.size();
        probabilidadAcierto = (double) cantidadNumApostados/37*100;
        double probabilidadAciertoRedondeado = (double) Math.round(probabilidadAcierto*100)/100;
        info.add("La probabilidad real de acierto es de: " + probabilidadAciertoRedondeado + "%");

        //Probabilidad Según Estadísticas
        int sumaApostados=0;
        double probabilidadAciertoSE = 0;
        double probabilidadAciertoSERedondeado = 0;
        for(int i = 0; i<numSalidos.length; i++){
            if(numerosApostados.contains(i)) {
                sumaApostados++;
            }
        probabilidadAciertoSE = (double) sumaApostados/tiradas.size()*100;
        probabilidadAciertoSERedondeado = (double) Math.round(probabilidadAciertoSE*100)/100;
        }

        info.add("La probabilidad estadística de acierto es de: "+probabilidadAciertoSERedondeado+"%");

        info.add("Total números apostados: " + numerosApostados.size());

        numerosApostados.clear();

        return info;
    }


        ///////////////////////////////////////// /////////// /////////////////////////////////////////
        ///////////////////////////////////////// NO UTILIZAR /////////////////////////////////////////
        ///////////////////////////////////////// /////////// /////////////////////////////////////////

        //Apuestas complementarias
        /*
        if(contadorApuestas<5){
            System.out.println("Apuestas Complementarias: ");
            System.out.println();

            for(int i = 0; i<numSalidos.length; i++){
                if(porcentajeNum[i]>3.5){
                    System.out.println("Apuestas complementarias al "+i);
                }
            }
            System.out.println("*Estas apuestas pueden ser arriesgadas. NO se recomienda pleno.");
            System.out.println();

            double probabilidadAcierto;
            int cantidadNumApostados = numerosApostados.size();
            probabilidadAcierto = (double) cantidadNumApostados/37*100;
            double probabilidadAciertoRedondeado = (double) Math.round(probabilidadAcierto*100)/100;
            System.out.println("La probabilidad de acierto (sin contar apuestas complementarias) es de: "+probabilidadAciertoRedondeado+"%");
            System.out.println();
        }

        //Mensajes
        if(hayCuadrado && contadorApuestas>9){
            System.out.println("*La apuesta a cuadros no recupera la inversión (Excepto si contiene caballos)");
        }
        if(contadorApuestas>18){
            System.out.println("*La apuesta a caballos no recupera la inversión (Excepto si contiene pleno)");
        }
        System.out.println();
        //System.out.println("**Apuestas recomendadas basadas en los números calientes.");
        //System.out.println();
        //System.out.println();
        */
}
