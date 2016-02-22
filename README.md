# SwingUIScaler4K [![Build Status](https://travis-ci.org/bobvdvalk/SwingUIScaler4K.svg?branch=master)](https://travis-ci.org/bobvdvalk/SwingUIScaler4K) [ ![Download](https://api.bintray.com/packages/bobvdvalk/maven/swinguiscaler4k/images/download.svg) ](https://bintray.com/bobvdvalk/maven/swinguiscaler4k/_latestVersion)

Easy UI scaler for 4K screens.

I wrote this package because I have a 4K screen and it was hard to read my school assignments.

# What does it do
It takes the normal sizes of a screen lower dan 4K and calculates the dimensions to a 4K screen making it nice and readable.

# How to set up
Init Gradle

```
repositories {
    mavenCentral()
    maven {
        url  "http://dl.bintray.com/bobvdvalk/maven"
    }
}

dependencies {
    compile 'nl.bobvandervalk:swinguiscaler4k:1.0.1'
}
```
Set up your JFrame

```
public class Example extends JFrame {
    public static void main(String ... args) {
        JFrame frame = new Example();
```

Set dimensions using the FrameScaler.
Set up the dimensions you want on a normal screen (not 4K screen).
```
FrameScaler frameScaler = new FrameScaler();
frameScaler.setSize(frame, new Dimension(400, 200));
```

To change font and font sizes you have to add a panel in JFrame. Add on top of your panel these lines.
Set up the font size you want on a normal screen (not 4K screen).
```
UIScaler uiScaler = new UIScaler();
uiScaler.setFontSize("Arial", 12);
```

Now you are good to go!
