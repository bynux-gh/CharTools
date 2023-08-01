# CharTools
## A small program for HEX-ASCII (or UTF-8) conversion.

This program is converted and improved from one I wrote in Scala as a way of
further familiarizing myself with Kotlin, as I'd like to move to Android dev in
the future.

### Build

Requires the Kotlin compiler, available via [SDKMAN!](https://sdkman.io) on
MacOS and Linux, or as a
[direct download](https://github.com/JetBrains/kotlin/releases/) on all
platforms.

Quick and easy. Clone the repo and go into it:

```sh
git clone https://github.com/digital-diplomat/CharTools.git
cd CharTools
```

Then compile it to a jarfile with `kotlinc`, making sure to include include the
Kotlin runtime (so it can be run in Java…or at all).

```sh
kotlinc * -include-runtime -d chartools.jar
```

It can then be run with `java -jar chartools.jar`, or on some Linux distros it
can be set to executable (`chmod +x chartools.jar`) and run directly
(./chartools.jar).

On Windows and MacOS, if it was set up on Java install, you can also
double-click the jarfile in your file explorer to open/run it.

### Usage

When invoked without an argument, an interactive session is started which can be
used for multiple translations in a row. You can also pass an argument to the
program to handle just one conversion:

```
e(ncode) - Prompts for a string to encode
d(ecode) - Prompts for a space- or comma-separated string of hex values to decode
t(able)  - Prints an ASCII table from 0x20 to 0x7f
f        - Pays respects
```

For decoding HEX strings, the values can be separated by any number of commas
and/or spaces.

### Contributing

Please submit a pull request or issue if you have any suggestions for
improvement; I'm always looking for new ways to improve my methodology and can
always use a bit of guidance!

```
54 68 61 6e 6b 73 20 66 6f 72 20 64 6f 77 6e 6c 6f 61 64 69 6e 67 21
```
