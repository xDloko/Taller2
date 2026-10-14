import Derivacion._

// val cte=(x:Double)=>2.0
// val f=(x:Double)=>(x * x)
// val g=(x:Double)=>(x * x * x) 
// // val h=(x:Double)=>f(x)/g(x)
// // val j=(x:Double)=>g(x)/f(x)

// val h1=derivadaDiv(f,g)
// val h2=derivadaDiv1(f,g)
// val h3=derivadaDiv(g,f)
// val h4=derivadaDiv1(g,f)

// println(h1(2))
// println(h2(2))
// println(h3(2))
// println(h4(2))

// println(derivada(cte)(2))
// println(derivada(cte)(6))


val dev1=(x:Double) => (5*x+8)
val dev2=(x:Double) => (5*x+8)*(5*x+8) 
val dev3=(x:Double) => (-4*scala.math.pow(x, 4) + 3*x) 
val dev4=(x:Double) => (-4*scala.math.pow(x, 4) + 3*scala.math.pow(x, 2)) 
val dev5=(x:Double) => (scala.math.exp(x)) 

println("\n\n Casos de perueba Derivacion:")
println(derivada(dev1)(2))
println(derivada(dev2)(2))
println(derivada(dev3)(0))
println(derivada(dev4)(0))
println(derivada(dev5)(10))

println("\n\n Casos de perueba Derivacion Suma:")
println(derivadaSuma(dev1,dev2)(2))
println(derivadaSuma(dev2,dev3)(0))
println(derivadaSuma(dev3,dev4)(0))
println(derivadaSuma(dev5,dev1)(10))
println(derivadaSuma(dev4,dev5)(10))

println("\n\n Casos de perueba Derivacion Resta:")
println(derivadaResta(dev1,dev2)(2))
println(derivadaResta(dev2,dev3)(0))
println(derivadaResta(dev3,dev4)(0))
println(derivadaResta(dev5,dev1)(10))
println(derivadaResta(dev4,dev5)(10))

println("\n\n Casos de perueba Derivacion Multiplicacion:")
println(derivadaMult(dev1,dev2)(2))
println(derivadaMult(dev2,dev3)(0))
println(derivadaMult(dev3,dev4)(0))
println(derivadaMult(dev5,dev1)(10))
println(derivadaMult(dev4,dev5)(10))

println("\n\n Casos de perueba Derivacion Division:")
println(derivadaDiv(dev1,dev2)(2))
println(derivadaDiv(dev2,dev3)(0))
println(derivadaDiv(dev3,dev4)(0))
println(derivadaDiv(dev5,dev1)(10))
println(derivadaDiv(dev4,dev5)(10))
 
println("\n\n Casos de perueba IA:")

val cte    = (x: Double) => 5.0
val id     = (x: Double) => x
val cuad   = (x: Double) => x * x
val cubo   = (x: Double) => x * x * x
val cuart  = (x: Double) => math.pow(x, 4)
val seno   = (x: Double) => math.sin(x)
val coseno = (x: Double) => math.cos(x)
val exp    = (x: Double) => math.exp(x)
val ln     = (x: Double) => math.log(x)

println("=== 1. derivada ===")
println(derivada(cte)(3.0))
println(derivada(cuad)(-2.0))
println(derivada(cuart)(2.0))
println(derivada(seno)(0.0))
println(derivada(exp)(1.0))

println("=== 2. derivadaSuma ===")
println(derivadaSuma(id, cte)(4.0))
println(derivadaSuma(cuad, cubo)(2.0))
println(derivadaSuma(cuad, (x: Double) => -x * x)(5.0))
println(derivadaSuma(seno, coseno)(0.0))
println(derivadaSuma(exp, ln)(1.0))

println("=== 3. derivadaResta ===")
println(derivadaResta(cubo, cubo)(3.0))
println(derivadaResta(cubo, cuad)(1.0))
println(derivadaResta(cte, cuad)(3.0))
println(derivadaResta(seno, coseno)(math.Pi / 2))
println(derivadaResta(exp, id)(0.0))

println("=== 4. derivadaMult ===")
println(derivadaMult(cte, cuad)(3.0))
println(derivadaMult(id, cuad)(2.0))
println(derivadaMult(seno, coseno)(0.0))
println(derivadaMult(exp, id)(1.0))
println(derivadaMult((x: Double) => x - 2, (x: Double) => x + 2)(2.0))

println("=== 5. derivadaDiv ===")
println(derivadaDiv(cuad, cte)(5.0))
println(derivadaDiv((x: Double) => 1.0, id)(2.0))
println(derivadaDiv(cubo, id)(3.0))
println(derivadaDiv(seno, coseno)(0.0))
println(derivadaDiv(exp, exp)(2.0))

