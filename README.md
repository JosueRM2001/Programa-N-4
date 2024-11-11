# Presentation
This is a project that was developed with Java.

## Description
This project shows a page in which there will be a message that shows how the program works.

It is a simple program to show how a program developed in the Java programming language works.

## Project Structure
*Contains the following*
- Aplication.java: File in charge of printing the message on the page.
- Dockerfile: Configuration of the Docker image.

## Requirements for its Development
- *Docker Desktop* (if you want to run it in a container)
- *Visual Studio Code* (optional, but recommended)
- *The Java extension for Visual Studio Code* (to improve support and syntax highlighting).
- *GitHub Desktop* (if you want to clone and use the project)

## Docker Hub
## Steps to generate the image and container for Docker Hub
- *Step #1*

Open the cmd terminal on your computer (you must have Docker Desktop installed).

- *Step #2*

Run the following command, which will generate the image:

```bash
docker pull erickjrm/programjava:latest
```

- *Step #3*

Then run the following command, which generates the container and the port.

```bash
docker run -d -p 9000:9000 --name java erickjrm/programjava:latest
```

- *Step #4*

Open the Docker Desktop to see if the image is created correctly and send it to run to view.

- *Step #5*
- 
**Acces the application**: Is running you can accces the applicaction by to the

following url in your web browser: http://localhost:9000

## Program-N-4 Project
## Steps to run the project locally on your computer
- *Step #1*

Clone the project repository on your machine with the following link (you must have GitHub Desktop installed):

```bash
https://github.com/JosueRM2001/Programa-N-4.git
```

- *Step #2*

Open the project with Visual Estudio Code (you must have VisualEstudio Code installed, if possible the most recent version).

- *Step #3*

Install the following extensions in Visual Estudio Code:

- Extension Pack for Java (Will install all packages)
- Spring Initializr Java Supp
- Docker

*With this you will be able to run the project without problems locally*.
