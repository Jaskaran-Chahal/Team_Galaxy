# CMPS 3350 - Software Engineering 
# Spring 2020
# Project - Galaxy Invaders

## Galaxy Invader Game:
The Galaxy Invader is a 2D space shooter based game, like Galaxy Glory and Galaga Chronicles. Inside which, the player needs to protect the raider (spaceship) and the galaxy from invaders. The Invaders will move across the screen swaying their arms and shooting bullets. If they hit a player he loses a life if they hit a shelter it will disintegrate until eventually the player has nowhere to hide. When the invaders reach the side of the screen they will drop down and scroll back the other way; a little bit faster. Eventually they will be moving so fast the player is doomed. The space invaders must be taken out quickly in order to protect their galaxy.

## Instructions for running application:
1. Download Android Studio
2. Download zip file or clone the project.
3. Open the Android Studio, Click on File >> Open >> Project >> Team_Galaxy
4. Now, download the Pixel 2 with API 29 device from emulator in case you don't have an android phone. 
5. If you already have an android phone, plug it directly into computer using USB cable, wait for android studio to detect your device.
6. Build the project
7. After successfully Building the project, Run it and Play !!

## Disecting the game:
### Jaskaran Chahal:
Progamming done with Java inside Android Studio, starting with one touch listener for adding all buttons. Further, a thread "drawIt()" updates the canvas, score and plays the explosion sound. Another, thread checks for velocity and coordinates for checking direction of spaceship which updates every 30 milliseconds. Moving along with array lists for missile and spacejunk objects which gets deleted and decayed after player shoots missiles. The incorporation of flags for checking the player has hit or miss the spacejunk and missile gets deleted if nothing is hit. The fireInTheHole() creates a new missile (i.e. radius,coordinates and direction) also sets the missile coordinates and adds them to the list of missiles. Now, if the flag(daFlag) is true which is set from main activity, we do the switch case for direction which is also set by the main activity. The manifest starts with screen orientation set to portrait so it locks the orientation down. For, future release will have the dual fire mode, objects will be replaced with images, OpenGL Skybox with secenic design.  

### Menu in ac branch: (Victor & Amairany)
Merging the ac branch along with the master gave an error, therefore, it was pushed back to my own branch. Done on Android Studio and need to take repository webpage and clone it in order to import it and build, then run in order to see outcome.  
### Amairany Chavez:
Menu portion in android studio with Java and implementation of Demo and Help along with creative features such as buttons and different colored letters with descriptions of the different functions of the game provided. This was done by using classes that would connect to the layouts that were done in .xml files in android studio. For example, the demo class lets us access the demo page from the intro page consisting of the menu with options of start game, demo, help, and exit. Demo has a description of the controls, score board, objects, and function of the game. After accessing this page, we are able to go back to the intro screen by clicking on the 'Demo' button. These buttons are set to function on click through the use of a demo and help class that set the same button that is in layout inside of the class. Similarly, the 'Help' button takes us to the help page where the individual playing the game is able to read a description of each of the buttons that are given at the intro page and return to the intro page. This along with the music and exit button can be found in the ac branch. 
### Victor Santiago:
The introduction to our app which is the opening screen was implemented by using the splash_time_out and handler to delay the next activity. By using this, we were able to display the opening screen or first activity approximately four seconds before displaying the main menu or next activity. The opening screen shows the name of our team. After four seconds, it displays the main menu with all the buttons. Additionally, the background music starts playing when you open the app. Also, the music keeps playing on the background when in the main menu as well as any of the buttons' screens or activities. The music pauses when you get out of the app without using the exit button and resumes back where it was left off when you open the app again. If the exit button is used, music will start from the beginning. The start game button was supposed to be the connection between the main menu and the actual game once merge into one.       

## SkyBox:
### Raul Barajas:
Our skybox is based on ARM software OpenGL ES SDK for android. It is a "collection of resources to help you build OpenGL ES applications for a platform with a Mali GPU and an ARM processor. You can use it for creating new applications, training, and exploration of implementation possibilities." This SDK has many samples, tutorials, that one can use for their own projects, including a skybox sample. 

#### How to run the Skybox:
When running, you will need an ARM based device that can run it. On Android Studio, you will need to make a virtual device that is based on ARM. This is simple to do. You will need to create a virtual device and when selecting the system image, you will need to go into "Other Images" tab and select an ARM ABI and that's it. Another option is to use physical device. I(Raul) did not use a virtual device. I used my phone which is a Samsung Galaxy S10 and it ran perfectly. 

## Demo:
[Demo-Latest] https://youtu.be/ccMvNrbby7A
[Demo-Older] https://youtu.be/_INYFD3BzHA

