var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

var routes = require('./routes/index');
var users = require('./routes/users');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', routes);
app.use('/users', users);

var data=[];
data.push({name:"아이폰 6",snippet:"가볍고 이쁜 폰입니다.",price:80});
data.push({name:"겔럭시 S5",snippet:"삼성에서 만든 방수폰 입니다.",price:110});
data.push({name:"Nexus 6",snippet:"Google 테블릿 입니다.",price:65});
data.push({name:"옵티머스 G",snippet:"LG 핸드폰 입니다.", price:80});

// 전화기 정보 요청 처리 
app.get("/angular/phones", function(req, res){
  // 전화기 정보를 json 문자열로 출력한다. 
  res.json({phones:data});
});

// post 방식 /angular/insert 요청 처리 
app.post("/angular/insert", function(req,res){
  //요청 파라미터 추출
  var name=req.body.name;
  var addr=req.body.addr;
  //테스트로 콘솔에 출력
  console.log(name+" | "+addr);
  //응답
  res.end("okay~");
});


//DB 에 있는 sample Data 라고 가정 
var girls=[];
girls.push({
  src:"/images/image1.png",
  title:"제시카",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});
girls.push({
  src:"/images/image2.png",
  title:"유리",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});

girls.push({
  src:"/images/image3.png",
  title:"태연",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});

girls.push({
  src:"/images/image4.png",
  title:"윤아",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});

girls.push({
  src:"/images/image5.png",
  title:"티파니",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});

girls.push({
  src:"/images/image6.png",
  title:"수연",
  content:"어쩌구... 저쩌구...",
  phone:"010-111-2222"
});

//연락처 목록 요청에 대한 응답
app.get("/angular/girls", function(req, res){
  res.json(girls);
});

//특정 회원 한명의 연락처 요청에 대한 응답 
app.get("/angular/girls/detail", function(req, res){
  //요청 파라미터 추출
  var index=req.query.index;
  //응답
  var obj=girls[index]; 
  res.json(obj);
});

// get 방식 /ajax/moreInfo 요청 처리 
app.get("/ajax/moreInfo", function(req, res){
  // get 방식 요청 파라미터 추출 
  var index=req.query.index;

  //인덱스에 해당하는 정보를 얻어온다.
  var obj=girls[index];

  //테스트로 응답을 2초 뒤에 하기 
  setTimeout(function(){
    //응답하기 (json 문자열 응답하기)
    res.json(obj);
  }, 2000);

});


//post 방식 /idCheck 요청 처리
app.post("/idCheck", function(req, res){
  //전송된 파라미터를 읽어온다.
  var id=req.body.inputId;
  if(id=="gura"){//이미 존재 하는 아이디라고 가정
    res.end('{"canUse":false}');
  }else{
    res.end('{"canUse":true}');
  }
});


//get 방식 /ajax/test02 요청 처리
app.get("/ajax/test02", function(req, res){

  // 1, 김구라, 노량진
  //res.end("1, 김구라, 노량진");
  res.end('{"num":1,"name":"김구라","addr":"노량진"}');
});


//post 방식 /ajax/test01 요청 처리
app.post("/ajax/test01", function(req, res){
  //ajax 전송된 파라미터 추출하기
  var msg=req.body.msg;
  //콘솔에 출력해보기
  console.log(msg);
  //응답하기
  res.end("ok client!");
});


//post 방식 /form/signup 요청 처리
app.post("/form/signup", function(req, res){
  //폼 전송된 파라미터 추출하기
  var email=req.body.email;
  var pwd=req.body.pwd;
  var phone=req.body.phone;
  //콘솔에 출력해 보기
  console.log(email);
  console.log(pwd);
  console.log(phone);
  //응답하기
  res.end("signup ok");

});

// post 방식 /login 요청 처리 
app.post("/login", function(req, res){
  //폼 전송된 파라미터 추출하기
  var id=req.body.id;
  var pwd=req.body.pwd;

  //콘솔에 출력해 보기
  console.log("id : "+id);
  console.log("pwd : "+pwd);

  //가상의 아이디와 비밀번호 
  if(id=="gura" && pwd=="1234"){
    res.end("login ok!");
  }else{
    res.end("login fail!");
  }

});

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
  app.use(function(err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
      message: err.message,
      error: err
    });
  });
}

// production error handler
// no stacktraces leaked to user
app.use(function(err, req, res, next) {
  res.status(err.status || 500);
  res.render('error', {
    message: err.message,
    error: {}
  });
});


module.exports = app;
