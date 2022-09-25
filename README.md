# Hangman-Game

A Classic Hangman Console Game, in Java.                                                                                               

# General Description

A Java program that allows user to play the "Hangman" game against computer.                                                        

# Main Menu

The program has a main menu, with the following options:                                                                            
- Start a new Game (N) - Start a new game(round), where player should guess a random word.                                      
- Statistics (S) - Display the total number of games(rounds) played and the number of wins and losses, since the start of game.    
- Exit (E) - Ask for exit game.                                                                                                    

# The Game

- Choosing a random "secret" word(in English). The word will be selected in class "Dictionary", with method "getWord()" that connects to 
  the [Random Words API](https://github.com/mcnaveen/Random-Words-API) and returns a random word.
- Basic structure of game: the user is prompted to select a letter, measure the number of remaining attempts,
  print messages, print graphic progress, detect the end of the game, etc.).                                                          
- Tracking the word progress, user is gradually guessing.                                                                       
- The letters that user enters must be either uppercase or lowercase(the words in the dictionary will always be in uppercase).     
- If the user enters an unauthorized entry(eg a letter is requested and enters a number or symbol, etc.), the program will tell the
  user that the selection is invalid and a new letter will be requested.                                                                
- If the user tries to re-enter a letter or enter a letter that is already guessed, the program will display an appropriate message
  and a new letter will be requested.                                                                                                  
- At the end of each round display a message of success or failure as well as the number of correct and wrong predictions of player.     
