package Lovely

object WineApplication {

  val brendansDrinkMenu= new DrinksMenu()

  val coos = new lager("Coos",2.95)
  val budweiser = new lager("budweiser",2.50)
  val x : List[lager] = List(coos,budweiser)

  val SexOnBeach = new Cocktails("SexOnTHeBeach", 6.30)
  val godFather = new Cocktails("GodFather", 6.3)
}

