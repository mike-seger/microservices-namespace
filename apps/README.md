# Buildiung app images

```
cd apps/gateway
../gradlew build
docker build -t gateway:0.0.1-SNAPSHOT -f Dockerfile .
```

...
