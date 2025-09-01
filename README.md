# mongoTest
Spring + Mongo + Redis + GraphQL test

# start mongo locally
- Install mongo locally or create a free cluster on MongoDB Atlas
  - local installation guide: https://zellwk.com/blog/install-mongodb/
  - local setup: https://zellwk.com/blog/local-mongodb/
  
- mongod or brew services stop mongodb-community
- mongod-status or brew services list
- mongod-stop or brew services stop mongodb-community

# start redis locally
- Install redis locally or use a free cloud service like Redis Labs
  - local installation guide: https://redis.io/docs/getting-started/installation/install-redis-on-mac-os/
  - local setup: https://redis.io/docs/getting-started/quickstart/
- redis-server or brew services start redis
- redis-status or brew services list
- redis-stop or brew services stop redis

# start the app
MongoTestApplication.main()

# GraphiQL UI
http://localhost:8080/graphiql

# GraphQL endpoint
http://localhost:8080/graphql
