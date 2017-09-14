package br.edu.ifes.vi.eletrica.javabeginner;

/**
 * Created by Cabelino on 13/09/2017.
 */

public class ArCondicionado {
    protected String Marca;
    protected String Modelo;
    protected String Tipo;
    protected int BTU;
    protected int Voltagem;
    protected int Amperagem;

    public ArCondicionado (String marca, String modelo, String tipo, int BTU, int voltagem, int amperagem)  {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Tipo = tipo;
        this.BTU = BTU;
        this.Voltagem = voltagem;
        this.Amperagem = amperagem;
    }

    public void setMarca (String marca) {
        this.Marca = marca;
    }

    public void setModelo (String modelo){
        this.Modelo = modelo;
    }

    public void setTipo (String tipo){
        this.Tipo = tipo;
    }

    public void setBTU (int BTU) {
        this.BTU = BTU;
    }

    public void setVoltagem (int voltagem){
        this.Voltagem = voltagem;
    }

    public void setAmperagem (int amperagem) {
        this.Amperagem = amperagem;
    }

    public String getMarca() {
        return this.Marca;
    }
}
