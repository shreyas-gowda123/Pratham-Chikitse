# Pratham-Chikitse (Android Version)

This is a pure Android project built with **Kotlin** and **Jetpack Compose**. It is designed to be opened and run in **Android Studio**.

## Project Features
- **Multilingual Support**: English, Kannada, and Hindi.
- **Emergency Guidance**: Step-by-step first aid procedures for Cardiac Arrest, Burns, Snake Bites, etc.
- **Hospital Finder**: Mock data and UI for finding nearby clinics.
- **Modern UI**: Built with Jetpack Compose following Material 3 design principles.

## How to use in Android Studio

1. **Export the Code**: In AI Studio, go to the top-right settings menu and select **Export to ZIP**.
2. **Extract**: Unzip the downloaded file on your computer.
3. **Open Project**:
   - Open Android Studio.
   - Click on **File > Open**.
   - Navigate to the extracted folder and select the root directory (containing `settings.gradle.kts`).
4. **Build and Run**:
   - Wait for the Gradle sync to finish.
   - **If sync fails**: Go to `File > Sync Project with Gradle Files`.
   - Connect your Android phone or start an Emulator.
   - Click the **Run** button (green play icon).

## Troubleshooting Sync
- **Missing Gradle Wrapper**: If Android Studio asks to "Fix Gradle Wrapper", click **OK**. I have provided the `gradle-wrapper.properties` in the `gradle/wrapper` folder to help.
- **JDK Version**: Ensure you are using **JDK 17** in Android Studio (`Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JDK`).
- **Internet Connection**: Gradle needs to download dependencies (Material3, Compose, Coil) on the first sync.

## Project Structure
- `app/src/main/kotlin/com/pratham/chikitse/`
  - `MainActivity.kt`: NavHost and entry point.
  - `ui/screens/`: Compose UI screens (Home, Detail, Hospitals, etc.).
  - `data/`: Emergency data definitions.
  - `models/`: Data classes for Emergencies and Languages.
- `app/src/main/res/`: App resources (Strings, Themes, Drawables).
- `/`: Root Gradle configuration files.
