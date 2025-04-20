# Docker Task
1. Java build
   `gradlew clean build`
3. Docker build
	`docker build -t cyclopeye/health:v1.0 .`
4. Docker push
	`docker image push cyclopeye/health:v1.0`
5. Docker run
	`docker run -d --name health -p 8000:8080 cyclopeye/health:v1.0`
# Kubernetes Task
1. First link `http://arch.homework/health`
2. Second ling `http://arch.homework/otusapp/AGerastovskiy/*`
