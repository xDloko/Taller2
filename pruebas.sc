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

println("\n\n Casos de perueba Derivacion:")
val dev1=(x:Double) => (5*x+8)
val dev2=(x:Double) => (5*x+8)*(5*x+8) //2(5*x+8)*5
val dev3=(x:Double) => (-4*scala.math.pow(x, 4) + 3*x) //0
val dev4=(x:Double) => (-4*scala.math.pow(x, 4) + 3*scala.math.pow(x, 2)) //0
val dev5=(x:Double) => (scala.math.exp(x)) //0

val devh1=derivada(dev1)
val devh2=derivada(dev2)
val devh3=derivada(dev3)
val devh4=derivada(dev4)
val devh5=derivada(dev5)
println(devh1(2))
println(devh2(2))
println(devh3(0))
println(devh4(0))
println(devh5(10))
