public class Cliente {
    private String nome;
    private boolean status;
    private String senha;
    private int compras;

    public Cliente(String nome, boolean status, String senha, int compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;

    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSstatus() {
        return status;
    }

    public void setSstatus(boolean sstatus) {
        this.status = sstatus;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", sstatus=" + status +
                ", senha='" + senha + '\'' +
                ", compras=" + compras +
                '}';
    }



        public void setSenha(String senha) {
            this.senha = senha;
        }

}
