# gnu-procedure

<br>&nbsp;&nbsp;&nbsp;gnu procedure call api
<br>

---
# - putty service start

```

 #> sudo systemctl start userinfo.service

```

---
# - API Endpoint
 
> 1. server health
> <br><br>&nbsp;&nbsp; /health

### return
```
  Ok! Good!
```

<br>

> 2. Is db connected?
<br><br>&nbsp;&nbsp; /status

### return
```
  true / false
```

<br>

> 3. login procedure
<br><br>&nbsp;&nbsp;/api/search/login

<br>

> 4. info procedure
<br><br>&nbsp;&nbsp;/api/search/userinfo

---
# - curl

## login procedure

```
 #> curl -L -v -d '{"classof": [학번], "password" : [암호]}' -H "Accept: application/json" -H "Content-Type: application/json" http://localhost:8080/api/search/login
```

## user info procedure

```
 #> curl -L -v -d '{"classof": [학번]}' -H "Accept: application/json" -H "Content-Type: application/json" http://localhost:8080/api/search/userinfo
```
