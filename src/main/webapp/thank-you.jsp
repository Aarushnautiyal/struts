<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>Thank You</title></head>
<body>
<h2>Thank You!</h2>

<p><strong>Name:</strong> <s:property value="feedback.name" /></p>
<p><strong>Email:</strong> <s:property value="feedback.email" /></p>
<p><strong>Message:</strong> <s:property value="feedback.message" /></p>
</body>
</html>
