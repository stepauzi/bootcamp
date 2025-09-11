package abstraction;

// Skill or Contract
// ! Bad idea using "Shape" as Interface, Shape is NOT a skill
public interface Shape {
  // ! Interface has NO attribute
  // ! Interface has NO concrete method (public & abstract only)
  // Interface is 100% abstraction (Before Java 8)
  double area(); // ! implicitly public and abstract
}
