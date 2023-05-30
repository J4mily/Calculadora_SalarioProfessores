    class ProfessorCLT extends Professor {
        private double salarioMensal;
    
        public ProfessorCLT(String nome, double salarioMensal) {
            super(nome, "CLT");
            this.salarioMensal = salarioMensal;
        }
    
        @Override
        public double calcularValorAReceber() {
            return salarioMensal;
        }
    }

