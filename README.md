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
1. Deploy
a. Deployment kubectl apply -f deployment.yaml
b. Servise & Ingress kubectl apply -f ingress.yaml
2. Links 
a. first: `http://arch.homework/health`
b. second: `http://arch.homework/otusapp/AGerastovskiy/*`
