# 2.semScopeDemoNoSession

### App ...
<li> shows global page counter <br>
<li> has basket which is shared across clients/browsers (unsual behavior). See 2.semScopeDemoSession for better behavior.
<li> @Controller uses @GetMapping (HTTP GET is used for viewing something) and @PostMapping (HTTP POST is for submiting data to be processed
<li> is dynamic, as it has HTML Form to enter data and send to endpoint in @Controller
<li> uses Thymeleaf to render data in HTML page 
<li> uses stylesheet to style HTML page
