package observatory

import com.sksamuel.scrimage.{Image, Pixel}
import Math._

import scala.collection.parallel.ParIterable

/**
  * 2nd milestone: basic visualization
  */
object Visualization {



  /**
    * @param temperatures Known temperatures: pairs containing a location and the temperature at this location
    * @param location Location where to predict the temperature
    * @return The predicted temperature at `location`
    */
  def predictTemperature(temperatures: Iterable[(Location, Double)], location: Location): Double = {
    val distanceTemperatureCombi:ParIterable[(Double, Double)] = temperatures.par.map {
      case (otherLocation, temperature) => (location.point greatCircleDistance otherLocation.point, temperature)
    }



//    distanceTemperatureCombi.filter(_._1 == 0.0) match {
//      case l if l.isEmpty =>
//      case l => l.head._2
//    }
//    ParIterable.empty[()]
    Double.PositiveInfinity
  }

  /**
    * @param points Pairs containing a value and its associated color
    * @param value The value to interpolate
    * @return The color that corresponds to `value`, according to the color scale defined by `points`
    */
  def interpolateColor(points: Iterable[(Double, Color)], value: Double): Color = {
    ???
  }

  /**
    * @param temperatures Known temperatures
    * @param colors Color scale
    * @return A 360×180 image where each pixel shows the predicted temperature at its location
    */
  def visualize(temperatures: Iterable[(Location, Double)], colors: Iterable[(Double, Color)]): Image = {
    ???
  }

}

