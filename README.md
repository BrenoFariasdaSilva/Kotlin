<div align="center">
  
# [Kotlin.](https://github.com/BrenoFariasdaSilva/Kotlin) <img src="https://github.com/devicons/devicon/blob/master/icons/kotlin/kotlin-original.svg"  width="3%" height="3%">

</div>

<div align="center">
  
---

This repo is made with the objective of showing the Kotlin related codes i have written. \
Feel free to contribute and send suggestions.
  
---

</div>

<div align="center">

![GitHub Code Size in Bytes](https://img.shields.io/github/languages/code-size/BrenoFariasdaSilva/Kotlin)
![GitHub Last Commit](https://img.shields.io/github/last-commit/BrenoFariasdaSilva/Kotlin)
![GitHub](https://img.shields.io/github/license/BrenoFariasdaSilva/Kotlin)
![wakatime](https://wakatime.com/badge/github/BrenoFariasdaSilva/Kotlin.svg)

</div>

<div align="center">
  
![RepoBeats Statistics](https://repobeats.axiom.co/api/embed/54c6014ed6bb4be23d3c23b1dce51d0fdc0f4a52.svg "Repobeats analytics image")

</div>

## Table of Contents
- [Kotlin. ](#kotlin-)
	- [Table of Contents](#table-of-contents)
	- [Installation:](#installation)
	- [Run Kotlin code:](#run-kotlin-code)
	- [IDE - Android Studio:](#ide---android-studio)
	- [Contributing](#contributing)
	- [License](#license)


## Installation:
* Zip and Unzip Tools: Zip and Unzip might be some necessary tools to install SDKMAN
	```bash
	# Unzip:
	sudo apt install unzip -y

	# Zip:
	sudo apt install zip -y
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

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**. If you have suggestions for improving the code, your insights will be highly welcome.
In order to contribute to this project, please follow the guidelines below or read the [CONTRIBUTING.md](CONTRIBUTING.md) file for more details on how to contribute to this project, as it contains information about the commit standards and the entire pull request process.
Please follow these guidelines to make your contributions smooth and effective:

1. **Set Up Your Environment**: Ensure you've followed the setup instructions in the [Setup](#setup) section to prepare your development environment.

2. **Make Your Changes**:
   - **Create a Branch**: `git checkout -b feature/YourFeatureName`
   - **Implement Your Changes**: Make sure to test your changes thoroughly.
   - **Commit Your Changes**: Use clear commit messages, for example:
     - For new features: `git commit -m "FEAT: Add some AmazingFeature"`
     - For bug fixes: `git commit -m "FIX: Resolve Issue #123"`
     - For documentation: `git commit -m "DOCS: Update README with new instructions"`
     - For refactorings: `git commit -m "REFACTOR: Enhance component for better aspect"`
     - For snapshots: `git commit -m "SNAPSHOT: Temporary commit to save the current state for later reference"`
   - See more about crafting commit messages in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

3. **Submit Your Contribution**:
   - **Push Your Changes**: `git push origin feature/YourFeatureName`
   - **Open a Pull Request (PR)**: Navigate to the repository on GitHub and open a PR with a detailed description of your changes.

4. **Stay Engaged**: Respond to any feedback from the project maintainers and make necessary adjustments to your PR.

5. **Celebrate**: Once your PR is merged, celebrate your contribution to the project!

## License
[MIT](https://choosealicense.com/licenses/mit/)
