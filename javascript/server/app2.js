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
