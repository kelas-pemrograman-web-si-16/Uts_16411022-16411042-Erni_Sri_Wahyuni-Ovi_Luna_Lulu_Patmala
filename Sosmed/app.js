var express = require('express');
var app = express();
var cons = require('consolidate');
var path= require('path');

var register = require('./routes/user');
var login = require('./routes/user');
var home = require('./routes/user');
var Chat = require('./routes/user');
var Status = require('./routes/user');
var Panggilan = require('./routes/user');


app.set('views', 'views')
app.set('view engine', 'pug'); // setting template engine yang digunakan. Dalam hal ini menggunakan pug.

app.use(express.static(path.join(__dirname, 'public')));
app.use('/', register);
app.use('/', login);
app.use('/', home);
app.use('/', Chat);
app.use('/', Status);
app.use('/', Panggilan);



module.exports = app;