## Marvel Project

This is the repository for the Marvel project. It is a work in progress 🚧.

In this project tries explain and create all the possible tests using this application, explaining 
step by step how we can create all the test and that we can assimilate in android.

I will use all the Android documentation for create in this project a guide to learn all about 
Android testing. https://developer.android.com/training/testing

First we must know who tests types exist, and in the Android documentations we are named the 
following: 

## Subject
For example, there are different types of tests depending on the subject:

* Functional testing: does my app do what it's supposed to?
* Performance testing: does it do it quickly and efficiently?
* Accessibility testing: does it work well with accessibility services?
* Compatibility testing: does it work well on every device and API level?

## Scope
Tests also vary depending on size, or degree of isolation:

* Unit tests or small tests only verify a very small portion of the app, such as a method or class.
* End-to-end tests or big tests verify larger parts of the app at the same time, such as a whole 
screen or user flow.
* Medium tests are in between and check the *integration* between two or more units.

![img.png](imgDocs%2Fimg.png)

## Defining a strategy
Like in the Android docs, we must define a strategy to our tests too, so we need first define like
should be our application. 
Our app will get the information of this API: https://developer.marvel.com/
Your public api key: 
-- 867462cac1e405719115a3bcff1bff6f
Your private api key:
-- b3e8b09fac2a774d1feadba1310b6c19ce87614b
Hash for request:
-- 821211cf98f866ca95bc7531d03dd4df

Information about this API:
**Your rate limit:3000 calls/day**

We must show all the information with respect this mock ups:

![Diagrama-mockup-marvel.drawio.png](imgDocs%2FDiagrama-mockup-marvel.drawio.png)
![Diagrama-mockup-marvel-2.png](imgDocs%2FDiagrama-mockup-marvel-2.png)

## Features

* Room Database
* Hilt
* ViewModel, read+write
* UI in Jetpack Compose, list + write (Material3)
* Navigation 
* Repository and data source
* Kotlin Coroutines and Flow
* Unit tests
* Medium test (integration)
* UI tests using fake data with Hilt

## Architecture
I use de architecture proposed by Android. MVVM.
![arquitectura_Android.png](imgDocs%2Farquitectura_Android.png)
If you wants read more about our implementation you can see: 
[ArquitectureMarvelMVVM.md](docs%2FArquitectureMarvelMVVM.md)

## Modularization
In this application, i will use this architecture modularized by features, we separate
ui layer, domain and data; everyone has your own subdivisions.
![diagrama arquitectura.marvel.png](imgDocs%2Fdiagrama%20arquitectura.marvel.png)

## Development Environment
Now in this app, i use only Debug environment, because is a test app in this moment.

## UI
The UI for this application was created with jetpack compose and using an atomic design. 
Material Design 3 was also used as a guide.

## Central declaration of dependencies
Using a version catalog
https://docs.gradle.org/current/userguide/platforms.html#sub:version-catalog






