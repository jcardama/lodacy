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

## License

```
Copyright 2018 Jose Cardama

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
