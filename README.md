<h1>Gathering Statistics Project</h1>

<p> Gathering Statistics Project is a web serivce to provide statistics to the Short Url Creator. </p>
<p>To see it working please, access the link below and follow the steps there to install and run the Short Url Creator Project. </p>
<p>Link to short url creator: https://github.com/FaustoTadeu/shorturlcreator </p>
<br />

<br />
<h3>Donwload and install </h3>
<p>1 -  Clone this Repository <p>
<p>2 -  Run command: mvn install </p>
<p>3 -  Run command: mvn update<p>
<br />
<h3>Run </h3>
<br />
<p>After doing the steps above run this command: mvn springboot:run<p>
<br />
<br />
<h3>Run and use </h3>
<h4>Create new short Url </h4>
<p>Using Postman access the POST URL "http://YOUR_LOCAL_URL:8100/shortener" passing the following json string in body request: </p>
<p>  {  "url": "longUrl" }  ---- Example: {  "url": "www.twitter.com" } <p>
<br />
<p> If the long url is still not created you will receive the json array as: </p>
<p>[  { "error": "Not exists Statistics for this URL or Gathering Statistics service is unavailable",  "url": "http://YOUR_LOCAL_URL:8100/e"  } ] <p>
<br />
<p> If the long url already exists you will receive the json array as: </p>
 [  { "URLAllAcess": 0, "SumRegistries": 4, "AllAcess": 0, "PercentMemoryUsed": "25.0%",  "PercentAcess": "0.0%", "URL": "http://YOUR_LOCAL_URL:8100/e"  }  ] </p>
<br />
<h4>Using the created short URL </h4>
<p>Open any browse and set "http://YOUR_LOCAL_URL:8100/'shorturl'" ---    Example: "http://YOUR_LOCAL_URL:8100/d" and you will be redirect to longUrl created before </p>
<br />
<h4>Acessing Statistics </h4>
<p> Open any browse and set http://YOUR_LOCAL_URL:8100/statistics/"shorturl" --- Example: http://YOUR_LOCAL_URL:8100/d and you will see the statistics about this short URL </p>
<p> PS: The Gathering Statistics Project is a service that provide statistics to the Short Url Creation Project and both should be running together. </p>
<br />
<br />
<p align="right">Developed by Fausto Alves - fausto.tna@hotmail.com </p> 
