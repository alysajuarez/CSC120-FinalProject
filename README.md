# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?

working on this project was a constantly changing process. i started with trying to make a text based adventure game and ultimately ended up with a ghostbusters game and an activity planning program haha. however, the overall approach i decided to take was taking small steps at a time. for example, when working on different classes, just slowly building and working on them individually helped me stay organised and be able to pull them all together ultimately.

 - What **new thing(s)** did you learn / figure out in completing this project?

i am glad i was able to get more practice with classes that work together. although we did this in class, i learned a lot more while completing this project and gained a better understanding of the "object" aspects of classes and OOP, such as by creating the array list of 'Plan' objects. 

 - Is there anything that you wish you had **implemented differently**?

i am actually quite happy with the way i implemented things in this program, especially with bringing classes together. my getRecommendation method defintiely makes me a bit confused when working on it (such as when i was adding to it) so that is one place i wish i could have changed up my code for to make it more direct and less confusing. 



 - If you had **unlimited time**, what additional features would you implement?

if i had unlimited time, i would want to add additional things being taken into account by the program. right now it gives recommendations based on staying in/going out, relaxing/getting active, and budget. i  would want to implement features that allow users to answer more questions or possibly input other things like interests or personality which could also be used to generate even more specific recommendations. 

i also did not have enough time to fix a bug with an array list. i wanted to print out a list of all the entered/generated plans when the program ends, but the list i made was only "saving" the last added option. if i had more time i would definitely want to figure out the issue and fix this so the user gets the proper list of plans at the end. 

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?

the most helpful piece of feedback i got while working on this project was actually a simple comment from a friend. i told her i was struggling and she was helping me talk out some of my code and ideas/goals. then she made a joke about how i "want it all done now" and told me i just need to slow down and go line by line, feature by feature, and do things one at a time. this honestly helped me so much because it made me realise that i was just trying to get everything done at once, which is not how programming works. we can only code individual things at once and cannot fit an entire program into a few lines of code. this feedback helped me slow myself down and stop jumping around to so many different ideas and things i wanted, which allowed me to not get overwhelmed and confused and be able to create a program that brough multiple classes together. 

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?

i would definitely give myself the advice of talking out ideas and using psuedocode as well. this is something that we can easily disregard but that helps a lot. i would also tell myself to start working with one class at a time. getting all the attributes and functions set in one class before jumping to the next is so important. you can always go back and make changes and additions, but just get basic frameworks for classes one by one to make it more easy to "pull them together"

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.

i did not work with a team for this project. the reason for this was because i had so many group projects this semester/at this time and was already struggling with scheduling and planning meeting times, so i didn't think i'd be able to do this with a group. i do wish i would have because it is a lot easier and more fun to code with others. luckily i had friends and the professors who i was able to get help from whether that be with fixing bugs or just talking through things with to figure stuff out on my own!


## design justification
i think the design of my program was efficient. an alternative which i originally planned was to have my “plans” as a string array list or a hash table. if i had used a hashtable, i would probably be only be able to have one thing associated with my activity, such as budget (or i could have implemented more but it would be much more messy and difficult to work with). i think the right choice was creating the Plan class, in which i could construct plans as their own object to use in other classes. this really helped with keeping organised and being able to connect the classes and ultimately generate plans in the PlansRecommendation class. 