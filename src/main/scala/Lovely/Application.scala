package Lovely

object Application extends App {

  val goodScran = new Starter("G Bread", 4.00)
  val badScran = new Main("Squirrel", 0.5)
  val lavlybablyScran = new Dessert("Crimble Crumble", 8.00)

  val order = new Order(List(goodScran, badScran,lavlybablyScran))
  order.total()

  println(order.total())
}
