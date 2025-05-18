<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>Feedback Form</title></head>
<body>
<h2>Feedback Form</h2>

<s:form action="submitFeedback" method="post">
    <s:textfield name="feedback.name" label="Name" />
    <s:textfield name="feedback.email" label="Email" />
    <s:textarea name="feedback.message" label="Your Feedback" />
    <s:submit value="Submit" />
</s:form>
</body>
</html>
