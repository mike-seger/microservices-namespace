# microservices-namespace

## Recreate the Namespace
```
kubectl create namespace microservices-namespace
```

## Reapply All Configurations
```
helm install microservices ./helm --namespace microservices-namespace --create-namespace
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

## Force delete pods stuck Terminating
```
kubectl get pods --all-namespaces | grep Terminating | tr -s " "|\
	while read l; do 
		n=$(echo $l|cut -f1 -d" ") 
		p=$(echo $l|cut -f2 -d" ")
		kubectl delete pod "$p" -n "$n" --grace-period=0 --force
	done
```

## Port forwarding
```
nohup kubectl port-forward service/gateway 8080:80 -n microservices-namespace &

nohup kubectl port-forward service/microservice-1 8081:8080 -n microservices-namespace &
```

