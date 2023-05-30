class ProfessorPJ extends Professor {
        private double valorContrato;
    
        public ProfessorPJ(String nome, double valorContrato) {
            super(nome, "PJ");
            this.valorContrato = valorContrato;
        }
    
        @Override
        public double calcularValorAReceber() {
            return valorContrato;
        }
    }