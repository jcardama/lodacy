# Lodacy

This is a loading handler with a small, extensible API which provides utility to show a progress bar when required.

I copy this class into all the little apps I make. I'm tired of doing it. Now it's a library.

## Including in your project

In you application-level build.gradle add the following repo

```
allProjects {
  repositories {
    // required to find the project's artifacts
    maven { url "https://www.jitpack.io" }
  }
}
```

Then in your project-level build.graddle add the following dependency

```
dependencies {
  implementation 'com.github.JCardama:lodacy:1.0.0' 
}
```

## Usage

Here is an usage example to show a ProgressBar:

```
import pw.josc.lodacy.Lodacy

val lodacy = Lodacy(context)
lodacy.setDuration(duration)
lodacy.setContainer(containerView)
lodacy.setProgress(progressView)

lodacy.show()
// Do other things
lodacy.hide()
```
