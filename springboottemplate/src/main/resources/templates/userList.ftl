<html>
	<body>
	${fromUserName}
	<table>
		
		<tr>
			<th>用户名</th>
			<th>密码</th>
		</tr>
		
		<#list userList as item>
		<tr>
			<td>${item.uId}</td>
			<td>${item.uPassword}</td>
		</tr>
		</#list>
		
	</table>
	 
	</body>
</html>
