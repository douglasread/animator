package cs3500.animator.view.nongui.textshapes;

import cs3500.animator.model.state.IState;
import java.util.Map;

/**
 * Represents a function object for producing a properly formatted String describing a rectangle and
 * its states.
 */
public class TextRectangle extends AbstractTextShape {

  /**
   * Constructs an instance of {@link TextRectangle} with the specified name and map of states.
   *
   * @param name   String represents the name of the shape
   * @param states {@code Map<Integer, IState>} representing the states of the shape mapped to the
   *               time they occur
   */
  public TextRectangle(String name, Map<Integer, IState> states) {
    super(name, states);
  }

  @Override
  protected String getShapeType() {
    return "rectangle";
  }
}
