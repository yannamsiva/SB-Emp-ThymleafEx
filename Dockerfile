FROM openjdk:11
COPY target/SB-Emp-ThymleafEx.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","SB-Emp-ThymleafEx.jar"]
