package dam.JosantVarona;

public class Calculadora {
    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplica(double a, double b) {
        return Math.abs(a * b);
    }

    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    double raizCuadrada(double radicando){
        if(radicando < 0) throw new OperacionInvalidaException("El radicando no puede ser negativo");
        double result = Math.sqrt(radicando);
        return result;
    }
    public class OperacionInvalidaException extends RuntimeException {
        public OperacionInvalidaException(String s) {
            super(s);
        }
    }
}
