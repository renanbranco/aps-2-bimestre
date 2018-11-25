package modelos;

import java.util.Date;

public class anunciar {
    
//    CREATE TABLE `apsveiculos`.`veluiculo` (
//    `id` INT NOT NULL AUTO_INCREMENT,
//    `titulo` VARCHAR(255) NOT NULL,
//    `ano_fabricacao` INT NOT NULL,
//    `ano_modelo` INT NOT NULL,
//    `quilometragem` INT NOT NULL,
//    `valor` INT NOT NULL,
//    `categoria` VARCHAR(45) NOT NULL,
//    `imagem` VARCHAR(45) NOT NULL,
//    `descricao` VARCHAR(255) NOT NULL,
//    `data_cadastro` DATE NOT NULL,
//    PRIMARY KEY (`id`));;;
    
    private long id;
    private String titulo;
    private int anoFabricacai;
    private int anoModelo;
    private int quilometragem;
    private int valor;
    private String categoria;
    private String imagem;
    private String descricao;
    private Date dataCadastro;

    public anunciar() {
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoFabricacai() {
        return anoFabricacai;
    }

    public void setAnoFabricacai(int anoFabricacai) {
        this.anoFabricacai = anoFabricacai;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final anunciar other = (anunciar) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
