# DAT355_First_EMF_Assignment



1. Download as .zip archive.
2. Open EMF IDE and switch workspace to an empty folder.
3. file --> import --> General --> Existing Projects into Workspace.<br>
Select the downloaded archive and import.
4. Right click the "dat355.eclipse.bowlingmodel" folder in Model Explorer,<br>
and run as eclipse application to start the runtime editor.
5. In the runtime editor, select file --> new --> other --> General --> Project.<br>
Give it a fitting name and click finish.
6. Right click the created project in Project Explorer<br> 
--> new --> other --> "Example EMF Model Creation Wizards" --> Bowling Model --> next<br>
Enter a name for the file, ending with .bowling (This file will contain the data of the model instance in XML form)<br>
Select League as the class to be the root object of the model instance.

You should now have a functional model instance.<br>
By right clicking on the League object, you can create Players and specify name, height,<br>
date of birth and whether the player is professional, in the properties tab.


7. Right click the created project in Project Explorer<br> 
--> new --> other --> "Example EMF Model Creation Wizards" --> Bowling Model --> next<br>
Enter a name for the file, ending with .bowling (Something else than the first file!)<br>
Select Tournament as the class to be the root object of the model instance.

In this model, you can add matchups and games (must be 2 games per matchup for model to be valid!).

8. Right click in the .bowling file with Tournament as the root object --> Load Resource --><br>
Browse Workspace --> select the model with League as root object --> ok --> ok<br>
You now have both models in the same resource set, and can create references between<br>
the different model objects (players and games).
