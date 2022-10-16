import java.io.StringReader
import java.util.LinkedList
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener

fun main() {
    var listNames = ArrayList<String>()
    var listLocations = LinkedList<String>()

    var mapName = HashMap<String, String>()
    var mapLocation = LinkedHashMap<String, String>()

    var setName = HashSet<String>()
    var setLocation = LinkedHashSet<String>()

    var set: Set<String> = HashSet<String>()
    var map: Map<String, String> = HashMap<String, String>()
    var list: List<String> = ArrayList<String>()

    var names: List<String> = mutableListOf<String>("Jason", "Kurt", "Logan", "Monique")
    var numbers: Set<Char> = mutableSetOf('1', '2', '3', '4', '5')
    var characters: Map<String, Int> = mutableMapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var locations: List<String> = listOf("Cubao", "Santolan", "Shaw", "Boni", "Buendia")
    var setPoints: Set<Int> = setOf(1, 2, 3, 4, 5)
    var mapPoints: Map<String, Int> = mapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var arrayList: ArrayList<String> = names as ArrayList<String>
//    var linkedList: LinkedList<String> = names as LinkedList<String>

//    for (name in names) {
//        logger.info { "Name: $names" }
//    }
//
//    for (index in names.indices) {
//        logger.info { "Name [$index]: ${names[index]}" }
//    }
//
//    var iterator = names.iterator()
//    while (iterator.hasNext())
//        logger.info { "Name: ${iterator.next()}"
//
//        }
//
//    names.forEach{
//        logger.info { "Name: ${iterator.next()}"}
//    }
//
//    names.forEach{
//        logger.info {"Name:$it"}
//
//    }
//
//    names.forEachIndexed{index, name ->
//        logger.info {"Name [$index]:$name"}
//    }
//
//    var studentsnames = names as ArrayList
//
//    studentsnames.add("Noah")
//    studentsnames.add(0, "Isaiah")
//    studentsnames.add("Oakley")
//    studentsnames.addAll(listOf("Patrick", "Quentine"))



//    var deque : List<String> = ArrayDeque<String>()
//    deque.(ListOf<String>)("Mercury", "Venus", "Earth",))

//}

//    for (entry in characters.entries){
//    logger.info {"Key: ${entry.key} -> Value: ${entry.value}" }
//    }
}
