import java.awt.Frame;
import java.util.*;
class IntervalWindow extends Frame implements Observer {
  java.awt.TextField startField;
  java.awt.TextField endField;
  java.awt.TextField lengthField;
  private Interval subject;

  public IntervalWindow() {
    startField = new java.awt.TextField();
    endField = new java.awt.TextField();
    lengthField = new java.awt.TextField();
    SymFocus focusListener = new SymFocus();
    startField.addFocusListener(focusListener);
    endField.addFocusListener(focusListener);
    lengthField.addFocusListener(focusListener);

    subject = new Interval();
    subject.addObserver(this);
    update(subject, null);
  }

class SymFocus extends java.awt.event.FocusAdapter {
  public void focusLost(java.awt.event.FocusEvent event) {
    Object object = event.getSource();
    if (object == startField) {
      StartField_FocusLost(event);
    }
    else if (object == endField) {
      EndField_FocusLost(event);
    }
    else if (object == lengthField) {
      LengthField_FocusLost(event);
    }
  }

  void StartField_FocusLost(java.awt.event.FocusEvent event) {
    setStart(startField.getText());
    if (isNotInteger(getStart())) {
      setStart("0");
    }
    subject.calculateLength();
  }

  void EndField_FocusLost(java.awt.event.FocusEvent event) {
    setEnd(endField.getText());
    if (isNotInteger(getEnd())) {
      setEnd("0");
    }
    subject.calculateLength();
  }

  void LengthField_FocusLost(java.awt.event.FocusEvent event) {
    setLength(lengthField.getText());
    if (isNotInteger(getLength())) {
      setLength("0");
    }
    subject.calculateEnd();
  }

  boolean isNotInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
 
      return isValidInteger;
   }
}

  public void update(Observable observed, Object arg) {
    endField.setText(subject.getEnd());
    startField.setText(subject.getStart());
    lengthField.setText(subject.getLength());
  }

  String getEnd() {
    return subject.getEnd();
  }
  void setEnd(String arg) {
    subject.setEnd(arg);
  }
  String getStart() {
    return subject.getStart();
  }
  void setStart(String arg) {
    subject.setStart(arg);
  }
  String getLength() {
    return subject.getLength();
  }
  void setLength(String arg) {
    subject.setLength(arg);
  }
}

class Interval extends Observable {
  private String end = "0";
  private String start = "0";
  private String length = "0";

  String getEnd() {
    return end;
  }
  void setEnd(String arg) {
    end = arg;
    setChanged();
    notifyObservers();
  }
  String getStart() {
    return start;
  }
  void setStart(String arg) {
    start = arg;
    setChanged();
    notifyObservers();
  }
  String getLength() {
    return length;
  }
  void setLength(String arg) {
    length = arg;
    setChanged();
    notifyObservers();
  }

  void calculateLength() {
    try {
      int start = Integer.parseInt(getStart());
      int end = Integer.parseInt(getEnd());
      int length = end - start;
      setLength(String.valueOf(length));
    } catch (NumberFormatException e) {
      throw new RuntimeException ("Unexpected Number Format Error");
    }
  }
  void calculateEnd() {
    try {
      int start = Integer.parseInt(getStart());
      int length = Integer.parseInt(getLength());
      int end = start + length;
      setEnd(String.valueOf(end));
    } catch (NumberFormatException e) {
      throw new RuntimeException ("Unexpected Number Format Error");
    }
  }
}
