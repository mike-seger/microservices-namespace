# microservices-namespace

## Recreate the Namespace
```
kubectl create namespace microservices-namespace
```

## Reapply All Configurations
```
kubectl apply -f k8s/gateway-deployment.yaml
kubectl apply -f k8s/microservice-1-deployment.yaml
kubectl apply -f k8s/ingress.yaml 
```

## Verify the Setup
```
kubectl get all -n microservices-namespace
```

## Remove Everything from the Namespace
```
kubectl delete namespace microservices-namespace
```

## Force the Deployment to Restart
```
kubectl rollout restart deployment gateway -n microservices-namespace
```

