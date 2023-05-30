class ProfessorHorista extends Professor {
        private int horasTrabalhadas;
        private double valorHoraTrabalho;
    
        public ProfessorHorista(String nome, int horasTrabalhadas, double valorHoraTrabalho) {
            super(nome, "Horista");
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHoraTrabalho = valorHoraTrabalho;
        }
    
        @Override
        public double calcularValorAReceber() {
            return horasTrabalhadas * valorHoraTrabalho;
        }
    }
