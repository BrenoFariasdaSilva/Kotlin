<div align="center">
  
# [Kotlin.](https://github.com/BrenoFariasdaSilva/Kotlin) <img src="https://github.com/devicons/devicon/blob/master/icons/kotlin/kotlin-original.svg"  width="3%" height="3%">

</div>

<div align="center">
  
---

This repo is made with the objective of showing the Kotlin related codes i have written. \
Feel free to contribute and send suggestions.
  
---

</div>

<p align="center">
  <img src="https://wakatime.com/badge/github/BrenoFariasdaSilva/Kotlin.svg" alt="wakatime" />
</p>

<div align="center">
  
![RepoBeats Statistics](https://repobeats.axiom.co/api/embed/54c6014ed6bb4be23d3c23b1dce51d0fdc0f4a52.svg "Repobeats analytics image")

</div>

## Installation:
* Zip and Unzip Tools: Zip and Unzip might be some necessary tools to install SDKMAN
	```bash
	# Unzip:
	sudo apt-get install unzip -y

	# Zip:
	sudo apt-get install zip -y
	```

* SDKMAN Tool: SDKMAN is a tool for managing parallel versions of multiple Software Development Kits on most Unix based systems. It provides a convenient Command Line Interface (CLI) and API for installing, switching, removing and listing Candidates.
  
	```bash
	# SDKMAN:
	curl -s "https://get.sdkman.io" | bash
	source "$HOME/.sdkman/bin/sdkman-init.sh"
	sdk version
	```
* Kotlin Language via SDKMAN:
	```bash
	# Kotlin:
	sdk install kotlin
	kotlin -version

	# Java in order to execute the generated jar file:
	sdk install java
	java -version
	```

## Run Kotlin code:
```bash
# Compile the application using the Kotlin compiler:
kotlinc filenameHere.kt -include-runtime -d filenameHere.jar
# Example: kotlinc main.kt -include-runtime -d main.jar

# Run the application.
java -jar filenameHere.jar
# Example: java -jar main.jar
```

## IDE - Android Studio:
Download and install the Android Studio from [here](https://developer.android.com/studio) or install it via Snap. \
Honestly, i hate to use the Snap version of anything, but it's irrefutable that it's the easiest way to install lots of apps.
* Install Snap: 
```bash
# Install Snap Commands:
sudo apt install snapd -y
sudo snap install core -y
```

* Install Android-Studio via Snap: 
```bash
# Android Studio
sudo snap install android-studio --classic
```

## Contributing
Code improvement recommendations are very welcome, but keep in mind that many exercises will be very simple, with a lot of room for improvement, after all here is all the history of my learning progress.

## License
[MIT](https://choosealicense.com/licenses/mit/)
