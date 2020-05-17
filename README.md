# CMPS 3350 - Software Engineering 
# Spring 2020
# Project - Galaxy Invaders

## Galaxy Invader Game:
The Galaxy Raider is a 2D space shooter based game, like Galaxy Glory and Galaga Chronicles. Inside which, the player needs to protect the raider (spaceship) and the galaxy from invaders. The Invaders will move across the screen swaying their arms and shooting bullets. If they hit a player he loses a life if they hit a shelter it will disintegrate until eventually the player has nowhere to hide. When the invaders reach the side of the screen they will drop down and scroll back the other way; a little bit faster. Eventually they will be moving so fast the player is doomed. The space invaders must be taken out quickly in order to protect their galaxy.

## Disecting the game:
Progamming done with Java inside Android Studio, starting with one touch listener for adding all buttons. Further, a thread "drawIt()" updates the canvas, score and plays the explosion sound. Another, thread checks for velocity and coordinates for checking direction of spaceship which updates every 30 milliseconds. Moving along with array lists for missile and spacejunk objects which gets deleted and decayed after player shoots missiles. The incorporation of flags for checking the player has hit or miss the spacejunk and missile gets deleted if nothing is hit. The fireInTheHole() creates a new missile (i.e. radius,coordinates and direction) also sets the missile coordinates and adds them to the list of missiles. Now, if the flag(daFlag) is true which is set from main activity, we do the switch case for direction which is also set by the main activity. The manifest starts with screen orientation set to portrait so it locks the orientation down. For, future release will have the dual fire mode, objects will be replaced with images, OpenGL Skybox with secenic design.  

## SkyBox:
Our skybox is based on ARM software OpenGL ES SDK for android. It is a "collection of resources to help you build OpenGL ES applications for a platform with a Mali GPU and an ARM processor. You can use it for creating new applications, training, and exploration of implementation possibilities." This SDK has many samples, tutorials, that one can use for their own projects, including a skybox sample. 

When running, you will need an ARM based device that can run it. On Android Studio, you will need to make a virtual device that is based on ARM. This is simple to do. You will need to create a virtual device and when selecting the system image, you will need to go into "Other Images" tab and select an ARM ABI and that's it. Another option is to use physical device. I(Raul) did not use a virtual device. I used my phone which is a Samsung Galaxy S10 and it ran perfectly. 



