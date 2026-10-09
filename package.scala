package object Derivacion {
    def derivada(f: Double => Double): Double => Double = {
        (x: Double) => (f(x - 2 * 0.1) - 8*f(x - 0.1) + 8*f(x+0.1) - f(x+2*0.1)) / (12*0.1)
    }

    def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {
        (x: Double) => derivada(f)(x) + derivada(g)(x)
    }

    def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
        (x: Double) => derivada(f)(x) - derivada(g)(x)
    }

    def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
        (x: Double) => derivada(f)(x) * g(x) + f(x) * derivada(g)(x)
    }

    def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
        (x: Double) => (derivada(f)(x) * g(x) - f(x) * derivada(g)(x)) / (g(x) * g(x))
    }

    def derivadaDiv1(f: Double => Double, g: Double => Double): Double => Double = {
        derivada((x: Double) => f(x) / g(x))
    }
}