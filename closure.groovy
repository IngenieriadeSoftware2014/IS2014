def imprimeNombre = { nombre -> println "mi nombre es ${nombre}"
    println "otro nombre estilo java: " + nombre
}
    imprimeNombre("Juan")
    imprimeNombre "Yolanda"
    
    
def printSum = {a,b -> println a + b}
    printSum(8, 9)
    
def imprimeLoQueSea = {println it}
    imprimeLoQueSea("hola")
    