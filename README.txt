﻿Serkan Koch

This project contains two inner folders, one that represents the RLEncoder java project and the other one representing the RLDecoder java project.

In order to run and compile the programs just open them in a java IDE like NetBeans or any other capable IDE and compile them.

NOTE: This project is intended to work with the karamazov.txt file but because of it's huge size being a book, the encoders actually take very long time and struggle to compile and encode the text in a efficient manner.

1. RLEncoder reads text from the "text.txt" file which is located in the project's folder while also creating an additional txt file after the program is compiled: "compressed.txt", which will also be located in the RLEncoder projects folder. If the "compressed.txt" file is deleted from the folder it can be recreated by simply recompiling the program. NOTE: "text.txt" should be apparent in the RLEncoder for it to be accessible by the program and for the program to compile without any errors.

2. RLDecoder reads text from the "compressed.txt" file that contains the compressed text of "text.txt" produced by RLEncoder (NOTE: "compressed.txt" should be manually added to the RLDecoder project folder (if it is not already there) for it to be accessible and readable by the program). After allocating and reading from the "compressed.txt" file, the RLDecoder program will decode the text and present it in it's initial form as it was in "text.txt" before being compressed by RLEncoder.
