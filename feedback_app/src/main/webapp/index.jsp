<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="comp/link.jsp" %>
   </head>
  <body>
       <%@include file="header.jsp" %>
  <div class="content-container py-4 d-flex flex-column justify-content-center align-items-center">
  <form action="<%=application.getContextPath() %>/feedback" method="post" class="mt-3">
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" name="useremail" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Phone</label>
    <input type="text" name="usephone" class="form-control" id="exampleInputPassword1">
  </div>
  
   <div class="mb-3">
    <label for="feedbackmessage" class="form-label">Feedback Message</label>
    <textarea rows="10" name="usemessage" placeholder="Enter Your Message Here!" class="form-control"></textarea>
  </div>
  
  <button type="submit" class="btn btn-primary">Give Us A Feedback</button>
</form>

  </div>
     </body>
      <%@include file="comp/script.jsp" %>
</html>