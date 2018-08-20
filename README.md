# GlobalWarming
Spigot plugin that adds game changing global warming mechanics

## Overview
+ Adds the idea of CO2 in the worlds atmosphere 
+ Furnaces emit CO2 when players smelt items
+ Trees (instantly) absorb CO2 when they grow from a sapling
+ As CO2 levels rise, global temperature rises because of the [Greenhouse Effect](http://hyperphysics.phy-astr.gsu.edu/hbase/thermo/grnhse.html)

## Purpose
+ Ever had the hankering to turn a game meant for fun into a emulator of one of the modern worlds toughest challenges?
+ Observe the [Prisoner's Dilemma](https://en.wikipedia.org/wiki/Prisoner%27s_dilemma#In_environmental_studies) first hand! 
+ Players are best off when they co-operate and agree to reduce their emissions
+ However, each individual player believes they are better off for themselves to emit as much as possible. 
+ Avoiding a [Tragedy of the Commons](https://en.wikipedia.org/wiki/Tragedy_of_the_commons) might be fun! If the players dont play nice and end up dealing with the consequences, they might decide to make an agreement to fix the planet. 

## Mechanics 
+ Every furnace burn causes a "Contribution" with an associated numerical value
+ Every tree growth causes a "Reduction" with an associated numerical value
+ The global temperature is a function of the net global carbon score. 
+ As the global temperature rises, the frequency and severity of negative climate damages increases.
+ Allow players to purchase "carbon offsets" which instantly reduce their personal carbon score

## (Planned) Features
+ Scoreboard Integration - Players can compete for carbon neutrality! The worst polluters can be shamed.
+ Economy Integration - Carbon Offsetting using your in-game currency! Make em pay for being lazy with not replanting.
+ Carbon Scorecard - Each player can see their latest carbon footprint trends via command line.
+ Multi-world - You can experiment with this plugin on one of your worlds to test it out!
+ Custom Models - The inner numerical workings are configurable as possible. Set thresholds, probabilities, and distributions.
+ Database storage - Load data on startup, queue DB changes to be done async and at intervals (instead of as they happen, that'd kill performance), and empty queue on shutdown. 
+ Highly configurable - Almost everything will have some degree of configuration to suit your servers needs.
+ Efficient - Despite major mechanics changes and an extensive event listening setup, I plan to optimize this plugin to be suitable for up to medium to large servers. 

## Science and Economics of Climate Change
+ Atmosphere warms with more CO2 because of Greenhouse Effect
+ ![Earth's Global Energy Budget](https://prnt.sc/kkxnhu)
+ [Acid Rain](https://en.wikipedia.org/wiki/Acid_rain)
+ Oceans rise b/c water expands when heated and glaciers are melting
![Oceans](https://i.imgur.com/dJPkYAo.png)

## Negative Climate Damages (Sample Model) 
- Higher temps inherit the damages from the lower temps
+ 14.0 C - No effects [Baseline]
+ 14.5 C - | barely anything | 
+ 15.0 C - | Localized Acid Rain | Some mobs spawn less | Some mobs spawn more |
+ 16.0 C - | +1 Sea Level Rise | Tropical fish die |
+ 17.0 C - |Global Acid Rain | Some trees no longer grow | +1 Sea Level Rise |
+ 18.0 C - |Noxious Area Potion Effect Clouds | Farm yields decrease | +2 Sea Level Rise | All Snow/Ice melts |
+ 19.0 C - | All fish die |
+ 20.0 C - Highly polluted chunks get permanent severe area potion effects, 

## Suggestions 
Feel free to create issues on this github project, or email me at nsporillo@gmail.com

## Contributing 
Always welcome to fork this repository and submit pull requests!

I will need at least a medium size server to test this plugin on once I've completed features and testing! Performance is important to me, and I can only identify the problematic code sections with the help of server owners. 