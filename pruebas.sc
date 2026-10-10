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
val dev2=(x:Double) => (5*x+8)*(5*x+8) //2(5*x+8)*5
val dev3=(x:Double) => (-4*scala.math.pow(x, 4) + 3*x) //0
val dev4=(x:Double) => (-4*scala.math.pow(x, 4) + 3*scala.math.pow(x, 2)) //0
val dev5=(x:Double) => (scala.math.exp(x)) //0

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
