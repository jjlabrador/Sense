// Servidor node HTTP simple

var http = require('http'); // Docs: https://nodejs.org/api/http.html
var url = require('url'); //Docs: https://nodejs.org/api/url.html
var exec = require('child_process').exec;


var server = http.createServer( function (request,response) {
  exec("./opt/tinyos/setup.sh");
  console.log('request starting');
  console.log('URL:',request.url);
  console.log('Mode:',request.method);
  var url_parts = url.parse(request.url, true);
  var query = url_parts.query;
  console.log(query);
  console.log('\n');
  //response.write('hello client!\n');
  
  if (Object.keys(query).length == 2) {
    var str = "java ControlNewSense -comm serial@/dev/ttyUSB1:57600 " + query['tag'] + " " + query['type'];
    var child = exec(str, function (error, stdout, stderr) {
      console.log('stdout: ' + stdout);
      console.log('stderr: ' + stderr);
      if (error !== null) {
        console.log('exec error: ' + error);
      }
    });
    
    response.write('Running: ' + str + '\n');
  }
  else {
    console.log("Bad GET request\n");
    response.write("Error: Bad GET request\n");
  }
  response.end();
});

server.listen(3000);
console.log('Server running in port 3000');