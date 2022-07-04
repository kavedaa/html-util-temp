package test

trait Renderer[A]:
  def render(x: A): xml.Elem

given Renderer[Int] with 
  def render(x: Int) = <td>{ x.toString }</td>

