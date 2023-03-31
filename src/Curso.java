import br.com.dio.desafio.dominio.Conteudo;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp(){
    return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
