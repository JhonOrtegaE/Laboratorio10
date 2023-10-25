/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author Ortega Echenique
 */
public class Smartphone implements Camara, NavegadorInternet,ReproductorMusica {

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
   
    public String Modelo;
    public String Marca;
    
    public Smartphone (String Modelo, String Marca)
    {
        this.Marca= Marca;
        this.Modelo=Modelo;
    }
    
    @Override
    public void GrabarVideo(){
        System.out.print("Video Grabando");
    }
    @Override
    public void TomarFoto(){
        System.out.print("Tomar una foto");
    }
    @Override
    public void ModoCine(){
        System.out.print("Pasar a modo cine");
    }
    @Override
    public void ModoRetrato(){
        System.out.print("Pasar a modo retrato");
    }
    @Override
    public void Buscar(){
        System.out.print("Buscar en el Navegador");
    }
    @Override
    public void Actualizar(){
        System.out.print("Actualizar Pagina");
    }
    @Override
    public void Detener(){
        System.out.print("Detener Actualizacion");
    }
    @Override
    public void Home(){
        System.out.print("Regresar al Menu");
    }
    @Override
    public void Retroceder(){
        System.out.print("Retroceder a la anterior Pagina");
    }
    @Override
    public void Avanzar(){
        System.out.print("Avanzar a la siguiente pagina");
    }
    @Override
    public void Reproducir(){
        System.out.print("Reproducir Musica");
    }
    @Override
    public void Siguiente(){
        System.out.print("Siguiente Musica");
    }
    @Override
    public void Anterior(){
        System.out.print("Retroceder Musica");
    }
    @Override
    public void Stop(){
        System.out.print("Detener la Musica");
    }
}
