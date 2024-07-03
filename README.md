# Java-Fontstyle-Binary-Operations
FontStyle Java Class
This Java project contains a FontStyle class that allows you to manipulate font styles using binary operations. The class supports four different font styles: BOLD, ITALIC, UNDERLINE, and STRIKE_THROUGH.

Table of Contents
Installation
Usage
Creating a FontStyle Object
Setting Font Styles
Toggling Font Styles
Displaying Font Styles
FontStyle Class Explanation
Repo Name Suggestion
Contributing
License
Installation
To use this project, simply clone the repository to your local machine:


Verify

Open In Editor
Edit
Copy code
git clone https://github.com/[Java-Fontstyle-Binary-Operations].git
Then, import the project into your favorite Java IDE.

Usage
Creating a FontStyle Object
You can create a new FontStyle object with or without specifying the initial font style.
FontStyle fontStyle = new FontStyle(); // No initial font style
FontStyle currentFontStyle = new FontStyle(FontStyle.BOLD | FontStyle.STRIKE_THROUGH); // Initial font style with BOLD and STRIKE_THROUGH
Setting Font Styles
You can set the font style using the setFontStyle method.

fontStyle.setFontStyle(FontStyle.BOLD | FontStyle.ITALIC);
Toggling Font Styles
You can toggle font styles using the boldClicked, italicClicked, underlineClicked, and strikeThroughClicked methods.

fontStyle.boldClicked();
fontStyle.italicClicked();
fontStyle.underlineClicked();
fontStyle.strikeThroughClicked();
Displaying Font Styles
You can display the current font style as a binary string using the fontStyleInBinaryString method.
System.out.println(fontStyle.fontStyleInBinaryString());
FontStyle Class Explanation
The FontStyle class uses binary operations to manage font styles. Each font style is represented by a power of 2, allowing you to combine them using the bitwise OR operator (|). The class provides methods to toggle and display font styles using binary strings.

Contributing
We welcome contributions! Please submit a pull request if you'd like to contribute
