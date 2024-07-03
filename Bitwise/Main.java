public class Main {
  public static void main(String[] args) {
    FontStyle currentFontStyle = new FontStyle(FontStyle.BOLD|FontStyle.STRIKE_THROUGH);
    System.out.println(currentFontStyle.fontStyleInBinaryString());
    currentFontStyle.underlineClicked();
    System.out.println(currentFontStyle.fontStyleInBinaryString());

}
}
