public abstract class ProvaUniversidade {
    private float av1;
    private float av2;

    public ProvaUniversidade(float av1, float av2) {
        this.av1 = av1;
        this.av2 = av2;
    }

    public float calcularMedia() {
        return (av1 + av2) / 2;
    }
}
