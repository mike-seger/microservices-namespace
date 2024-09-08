# microservices-namespace

## Recreate the Namespace
```
kubectl create namespace microservices-namespace
```

## Reapply All Configurations
```
helm install microservices ./helm --namespace microservices-namespace
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

