# User Guide

## Introduction

Bobotype is a minimalist, interactive CLI tool that enhances typing speed and accuracy through personalized exercises, 
real-time feedback, and progress tracking, helping users build muscle memory and confidence efficiently.

## Quick Start

1. Ensure that you have Java 17 or above installed.
1. Download the latest version of `Bobotype` from [here](https://github.com/AY2425S2-CS2113-F13-2/tp/releases/tag/v1.1).
2. Download the jar file to the folder you want to use as the home folder for your Bobotype.
3. Open a terminal and navigate to the folder where the jar file is located.
4. Run the command `java -jar Bobotype.jar` to start the application.

## Features

### Start a Typing Exercise: `start`
Starts a typing exercise with a random sentence.

Format: `start`

### Set Mode: `normal`, `timelimit`, `zen`
Set the mode to set the typing speed.

Format: `normal`, `timeLimit`, `zen`

Example:

```
____________________________________________________________
 Select your mode: 
 Type: 'normal' or 'timeLimit' or 'zen'
____________________________________________________________
```

### Select Difficulty Level: `easy`, `intermediate`, `difficult`
Select the difficulty level of the typing exercise. If the user leaves it blank, then 
it is set as default difficulty level, which would be automatically adjusted depending on the user's progress. 

Format: `easy`, `intermediate`, `difficult`

Example: 
```
____________________________________________________________
 Default difficulty: easy
 (Type 'override' to choose your own difficulty, or leave blank to proceed)
____________________________________________________________
```

### Select Text Length: `short`, `medium`, `long`
Select the length of the typing exercise. 

Format: `short`, `medium`, `long`

Example:
```
____________________________________________________________
 Select your text length: 
 Type: 'short' or 'medium' or 'long'
____________________________________________________________
```

### Practice in Normal Mode: 
In the normal mode, each sentence will be given for the user to type.

Example:

```
____________________________________________________________
Typing test started! Type the following text:
The sun is shining, and birds are singing.
```


### Practice in TimeLimit Mode:
In the time limit mode, each sentence will be given for the user to type, and there will be time limit for each sentence based on the difficulty level and the length of the sentence. Based on the user input, the response will be given. 

[ Warning ] What the user inputs will be displayed on the console only after the user presses enter. In other words, before the user presses enter, the user is not able to see what they have typed so far.

Example:

```
____________________________________________________________
Welcome to Time Limit mode.
____________________________________________________________
Are you ready? The game will begin in 
3
2
1
____________________________________________________________
The sun is shining, and birds are singing.
The sun is shining, and birds are singing.
*** Great! ***
The park is full of families enjoying the day.
The park is full of fammmmmmmmmmmmmmmmmmmmmmm.

*** Time's up! Try typing faster! ***
Children play on swings, and parents chat while sitting on benches.
Children paay on
*** Wrong! Please be more careful next time! ***

____________________________________________________________
You finished the timeLimit Mode Practice! 
	 - Num of correct lines: 1 lines out of 0 lines
____________________________________________________________
*** Please press enter to continue. ***
```


### Time Limit Typing Speed: `timeLimit`
Set a time limit for the typing exercise to the user's liking.

Format: `timeLimit`

Example:

` Set your time limit: `

` Type: '1' or '2' or '3' `

### Set Zen Typing Speed: `zen`
Type as long as desired. Get the typing speed of the user's attempt.

Format: `zen`

Example:

```
Welcome to Zen Mode, you can type out anything to your
heart's content and find out your typing speed.
Typing 'start' will start the typingTimer and
typing the command 'stop_practice' will stop the practice.
```

User types
- `start`
- `Some Sample Text`
- `stop_practice`

Returns
```
____________________________________________________________
You finished the Zen Mode Practice!
You have typed: 4 words
Typing speed (WPM): 33 WPM
Typing speed (CPM): 246 CPM
____________________________________________________________
Please type
- 'exit' to exit or
- 'start' to start the new practice.
____________________________________________________________
```

### Set Typing Difficulty: `difficulty`
Sets the difficulty of the typing exercise.

Example:
` Select your difficulty: `

` Type: 'easy' or 'intermediate' or 'difficult' `

### Get Typing Accuracy: `typingaccuracy`
Returns the typing accuracy of the user's previous typing test.

Format: `typingaccuracy`

Example: 

` Your typing accuracy is: 39.285714285714285%`

### Get High Score: `highscore`
Gets back the highest score of the user across all attempts.
Highscore is calculated based on the WPM * typingAccuracy of the user.

Format: `highscore`

Example: 

` Your high score is: 49.0`

### Get High Score List: `highscorelist`
Gets back the top 3 highest score of the user across all attempts.

Format: `highscorelist`

Example:

` Top 3 High Scores: `

`1. 49.0`

`2. 30.5`

`3. 12.7`

### Add Target Speed: `targetspeedadd`
Add a target speed (WPM) to hit. Users will be informed when they hit their target speed.

Format: `targetspeedadd`

Example:

`Please enter a typing speed target you would like to hit (WPM)!`

`Type an integer (e.g., 60)`

### Add Target Score: `targetscoreadd`
Add a target score (effective WPM) to hit. Users will be informed when they hit their target score.

Format: `targetscoreadd`

Example:

`Please enter a typing score target you would like to hit (Effective WPM)!`

`Type an integer (e.g., 60)`

### View Milestone: `milestone`
Displays the user's current milestone, which reflects the default typing difficulty. This difficulty level is 
automatically adjusted based on the user's progress in achieving milestones dependent on their highscore.

Format: `milestone`

Example:
```
____________________________________________________________
Current milestone: intermediate
____________________________________________________________
```

### View Progress Report: `[Coming Soon]`
Displays a report on the user's past 10 runs in normal mode.

Format: `progress`

### Set Custom Mode: `[Coming Soon]`
Allows user to input custom text to practice typing.

Format: `custom`

### Exit the application: `exit`
Exits the application.

Format: `exit`

Output:
```
____________________________________________________________
 Bye. Hope to see you again soon!
____________________________________________________________
```

### Saving the data
Bobotype data is saved in the hard disk automatically after any command that changes the data. 
There is no need to save manually.

### Editing the data file
Bobotype data is saved as a text file `data/bobotype.txt`. 
Advanced users are welcome to update data directly by editing that data file.


## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: 

## Command Summary

* Start a typing exercise `start`
* Set mode `normal`, `timelimit`, `zen`
* Set difficulty level `easy`, `intermediate`, `difficult`
* Set text length `short`, `medium`, `long`
* Get typing accuracy `typingaccuracy`
* Get high score `highscore`
* Get high score list `highscorelist`
* Add target speed `targetspeedadd`
* Add target score `targetscoreadd`
* Get milestone `milestone`
