import groovy.json.JsonSlurperClassic

println("Building the Application...")
cDelivery = readFile "$wrks/config/cpl.json"
def jString = new JsonSlurperClassic().parseText(cDelivery)
def bStr = jString.btool
bStr = "$bStr" + " -f " + '"appl/pom.xml "' + jString.target
println("Executing the mvn clean package command...")
println("$bStr")
shell "$bStr"
println("Completed the Building of the Application!")