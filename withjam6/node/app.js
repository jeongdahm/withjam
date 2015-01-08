
/**
 * Module dependencies.
 */

var express = require('express')
  , routes = require('./routes')
  , user = require('./routes/user')
  , http = require('http')
  , path = require('path');

var mysql = require('mysql');
var connection = mysql.createConnection({
    host    :'localhost',
    port : 3306,
    user : 'study',
    password : 'study',
    database:'WITHJAM'
});

connection.connect(function(err) {
    if (err) {
        console.error('mysql connection error');
        console.error(err);
        throw err;
    }
});


var app = express();

// all environments
app.set('port', process.env.PORT || 3000);
app.set('views', __dirname + '/views');
app.set('view engine', 'jade');
app.use(express.favicon());
app.use(express.logger('dev'));
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(app.router);
app.use(express.static(path.join(__dirname, 'public')));


app.get('/idCheck', function (request, response) {
	response.setHeader("Access-Control-Allow-Origin", "*");
	connection.query('SELECT EMAIL FROM MEMBERS WHERE EMAIL=?', 
			[request.param('email')], 
	        function (error, result) {

    	    console.log(result);
    	    
    	    console.log(result[0]);
    	
    		response.send(result[0]);
    	
    });
});

app.get('/searchFriendList', function (request, response) {
	response.setHeader("Access-Control-Allow-Origin", "*");
	connection.query(
			'SELECT A.*,A.UID fUid,CASE WHEN B.F_UID IS NOT NULL THEN "follow" ELSE "unfollow" END FOLLOWYN FROM (SELECT A.* FROM MEMBERS A WHERE A.UID <> 35 AND UNAME LIKE ?) A LEFT OUTER JOIN (SELECT A.UID,A.F_UID FROM FRIEND A WHERE A.UID=35) B ON A.UID = B.F_UID', 
			[request.param('search') + '%'], 
	        function (error, result) {

    	    console.log(result);
    	    console.log(result.length);
    	    response.send(result);
    	
    });
});





// development only
if ('development' == app.get('env')) {
  app.use(express.errorHandler());
}

app.get('/', routes.index);
app.get('/users', user.list);

http.createServer(app).listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});
