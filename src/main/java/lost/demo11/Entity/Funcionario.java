package lost.demo11.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
    public class Funcionario {
       @Id
               @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String nome;
        private Integer idade;
        private String cpf;
        private Double salario;
        private Integer mesesTrabalhados;
        private Double bonusPorIdade;
        private Double decimoTerceiro;
        private Double valorTotalSalario;


        public Funcionario() {
        }

        public Funcionario(Long id, String nome, Integer idade, String cpf, Double salario, Integer mesesTrabalhados, Double bonusPorIdade, Double decimoTerceiro, Double valorTotalSalario) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.salario = salario;
            this.mesesTrabalhados = mesesTrabalhados;
            this.bonusPorIdade = bonusPorIdade;
            this.decimoTerceiro = decimoTerceiro;
            this.valorTotalSalario = valorTotalSalario;
        }

        public Long getId() {
            return id;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

        public Integer getMesesTrabalhados() {
            return mesesTrabalhados;
        }

        public void setMesesTrabalhados(Integer mesesTrabalhados) {
            this.mesesTrabalhados = mesesTrabalhados;
        }

        public Double getBonusPorIdade() {
            return bonusPorIdade;
        }

        public Double setBonusPorIdade(Double bonusPorIdade) {
            if (bonusPorIdade <= 45) {
                valorTotalSalario = valorTotalSalario + 100;
            }
            return valorTotalSalario;
        }


        public Double getDecimoTerceiro() {
            return decimoTerceiro;
        }

        public Double setDecimoTerceiro(Double decimoTerceiro) {
            decimoTerceiro = (valorTotalSalario /12) * mesesTrabalhados;
            return decimoTerceiro;
        }

        public Double getValorTotalSalario() {
            return valorTotalSalario;
        }

        public void setValorTotalSalario(Double valorTotalSalario) {
            this.valorTotalSalario = valorTotalSalario;
        }


    }

