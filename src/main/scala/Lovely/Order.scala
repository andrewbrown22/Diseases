package Lovely

class Order(listOfDishes : List[Dish]) {

  def price(dish: Dish): Double = {
    dish.price
  }

  def total(): Double = {
    {
      //      for {dish <- listOfDishes} yield {dish.price}}.sum
      listOfDishes.map(price).sum
    }

  }



}