public class FontStyle {
  private int fontStyle;
  public static final int BOLD = 1;
  public static final int ITALIC = 2;
  public static final int UNDERLINE = 4;
  public static final int STRIKE_THROUGH = 8;

  public FontStyle(){}

  public FontStyle(int fontStyle){
      this.fontStyle = fontStyle;
  }
  public int getFontStyle(){
      return fontStyle;
  }
  public void setFontStyle(int fontStyle){
      this.fontStyle = fontStyle;
  }
  public void boldClicked(){
      this.fontStyle = fontStyle ^ BOLD;
  }
  public void italicClicked(){
      this.fontStyle = fontStyle ^ ITALIC;
  }
  public void underlineClicked(){
      this.fontStyle = fontStyle ^ UNDERLINE;
  }
  public void strikeThroughClicked(){
      this.fontStyle = fontStyle ^ STRIKE_THROUGH;
  }
  public String fontStyleInBinaryString(){
      return Integer.toBinaryString(fontStyle);
  }
}
