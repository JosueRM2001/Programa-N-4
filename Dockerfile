# Use a base image of OpenJDK
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Aplication.java file into the container
COPY Aplication.java /app

# Compile the Aplication.java file
RUN javac Aplication.java

# Expose port 9000 inside the container
EXPOSE 9000

# Run the main 'Aplication' class
CMD ["java", "Aplication"]


