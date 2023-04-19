# Kotlin <img src="https://github.com/devicons/devicon/blob/master/icons/kotlin/kotlin-original.svg"  width="3%" height="3%">
This repo is made with the objective of showing the Kotlin related codes i have written. \
Feel free to contribute and send suggestions.

## Installation:
* Zip and Unzip Tools: Zip and Unzip might be some necessary tools to install SDKMAN
	```bash
	# Unzip:
	sudo apt-get install unzip -y

	# Zip:
	sudo apt-get install zip -y
	```

* SDKMAN Tool: 
  * SDKMAN is a tool for managing parallel versions of multiple Software Development Kits on most Unix based systems. It provides a convenient Command Line Interface (CLI) and API for installing, switching, removing and listing Candidates.
  
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

	# Java for executing the jar file:
	sdk install java
	```

## Run Kotlin code:
```bash
# Compile the application using the Kotlin compiler:
kotlinc filenameHere.kt -include-runtime -d filenameHere.jar

# Run the application.
java -jar filenameHere.jar
```

## IDE - Android Studio:
For Android Studio, you can download it from [here](https://developer.android.com/studio) or install it via Snap. \
Honestly, i hate to use the Snap version of anything, but it's irrefutable that it's the easiest way to install lots of apps.
```bash
sudo snap install android-studio --classic
```
