<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.Model.DBConnection"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>Corporate | Edit Your Details</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/plugins/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES --> 
	<link rel="stylesheet" type="text/css" href="assets/plugins/select2/select2_metro.css" />
        <link rel="stylesheet" type="text/css" href="assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.css"/>
	<!-- END PAGE LEVEL SCRIPTS -->
	<link rel="shortcut icon" href="favicon.ico" />
         <%@page import="java.sql.*" %>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->

<body class="page-header-fixed">
	<!-- BEGIN HEADER -->   
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="navbar-inner">
			<div class="container-fluid">
				<!-- BEGIN LOGO -->
				<a class="brand" href="index.html">
				<img src="assets/img/logo.png" alt="logo" />
				</a>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
				<img src="assets/img/menu-toggler.png" alt="" />
				</a>          
				<!-- END RESPONSIVE MENU TOGGLER -->            
				<!-- BEGIN TOP NAVIGATION MENU -->              
				<ul class="nav pull-right">
					<!-- BEGIN NOTIFICATION DROPDOWN -->   
					<li class="dropdown" id="header_notification_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
						<i class="icon-warning-sign"></i>
						<span class="badge">6</span>
						</a>
						<ul class="dropdown-menu extended notification">
							<li>
								<p>You have 14 new notifications</p>
							</li>
							<li>
								<ul class="dropdown-menu-list scroller" style="height:250px">
									<li>
										<a href="#">
										<span class="label label-success"><i class="icon-plus"></i></span>
										New user registered. 
										<span class="time">Just now</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-important"><i class="icon-bolt"></i></span>
										Server #12 overloaded. 
										<span class="time">15 mins</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-warning"><i class="icon-bell"></i></span>
										Server #2 not responding.
										<span class="time">22 mins</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-info"><i class="icon-bullhorn"></i></span>
										Application error.
										<span class="time">40 mins</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-important"><i class="icon-bolt"></i></span>
										Database overloaded 68%. 
										<span class="time">2 hrs</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-important"><i class="icon-bolt"></i></span>
										2 user IP blocked.
										<span class="time">5 hrs</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-warning"><i class="icon-bell"></i></span>
										Storage Server #4 not responding.
										<span class="time">45 mins</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-info"><i class="icon-bullhorn"></i></span>
										System Error.
										<span class="time">55 mins</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="label label-important"><i class="icon-bolt"></i></span>
										Database overloaded 68%. 
										<span class="time">2 hrs</span>
										</a>
									</li>
								</ul>
							</li>
							<li class="external">
								<a href="#">See all notifications <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END NOTIFICATION DROPDOWN -->
					<!-- BEGIN INBOX DROPDOWN -->
					<li class="dropdown" id="header_inbox_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
						<i class="icon-envelope"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended inbox">
							<li>
								<p>You have 12 new messages</p>
							</li>
							<li>
								<ul class="dropdown-menu-list scroller" style="height:250px">
									<li>
										<a href="inbox.html?a=view">
										<span class="photo"><img src="./assets/img/avatar2.jpg" alt="" /></span>
										<span class="subject">
										<span class="from">Lisa Wong</span>
										<span class="time">Just Now</span>
										</span>
										<span class="message">
										Vivamus sed auctor nibh congue nibh. auctor nibh
										auctor nibh...
										</span>  
										</a>
									</li>
									<li>
										<a href="inbox.html?a=view">
										<span class="photo"><img src="./assets/img/avatar3.jpg" alt="" /></span>
										<span class="subject">
										<span class="from">Richard Doe</span>
										<span class="time">16 mins</span>
										</span>
										<span class="message">
										Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh
										auctor nibh...
										</span>  
										</a>
									</li>
									<li>
										<a href="inbox.html?a=view">
										<span class="photo"><img src="./assets/img/avatar1.jpg" alt="" /></span>
										<span class="subject">
										<span class="from">Bob Nilson</span>
										<span class="time">2 hrs</span>
										</span>
										<span class="message">
										Vivamus sed nibh auctor nibh congue nibh. auctor nibh
										auctor nibh...
										</span>  
										</a>
									</li>
									<li>
										<a href="inbox.html?a=view">
										<span class="photo"><img src="./assets/img/avatar2.jpg" alt="" /></span>
										<span class="subject">
										<span class="from">Lisa Wong</span>
										<span class="time">40 mins</span>
										</span>
										<span class="message">
										Vivamus sed auctor 40% nibh congue nibh...
										</span>  
										</a>
									</li>
									<li>
										<a href="inbox.html?a=view">
										<span class="photo"><img src="./assets/img/avatar3.jpg" alt="" /></span>
										<span class="subject">
										<span class="from">Richard Doe</span>
										<span class="time">46 mins</span>
										</span>
										<span class="message">
										Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh
										auctor nibh...
										</span>  
										</a>
									</li>
								</ul>
							</li>
							<li class="external">
								<a href="inbox.html">See all messages <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END INBOX DROPDOWN -->
					<!-- BEGIN TODO DROPDOWN -->
					<li class="dropdown" id="header_task_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
						<i class="icon-tasks"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended tasks">
							<li>
								<p>You have 12 pending tasks</p>
							</li>
							<li>
								<ul class="dropdown-menu-list scroller"  style="height:250px">
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">New release v1.2</span>
										<span class="percent">30%</span>
										</span>
										<span class="progress progress-success ">
										<span style="width: 30%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">Application deployment</span>
										<span class="percent">65%</span>
										</span>
										<span class="progress progress-danger progress-striped active">
										<span style="width: 65%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">Mobile app release</span>
										<span class="percent">98%</span>
										</span>
										<span class="progress progress-success">
										<span style="width: 98%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">Database migration</span>
										<span class="percent">10%</span>
										</span>
										<span class="progress progress-warning progress-striped">
										<span style="width: 10%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">Web server upgrade</span>
										<span class="percent">58%</span>
										</span>
										<span class="progress progress-info">
										<span style="width: 58%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">Mobile development</span>
										<span class="percent">85%</span>
										</span>
										<span class="progress progress-success">
										<span style="width: 85%;" class="bar"></span>
										</span>
										</a>
									</li>
									<li>
										<a href="#">
										<span class="task">
										<span class="desc">New UI release</span>
										<span class="percent">18%</span>
										</span>
										<span class="progress progress-important">
										<span style="width: 18%;" class="bar"></span>
										</span>
										</a>
									</li>
								</ul>
							</li>
							<li class="external">
								<a href="#">See all tasks <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END TODO DROPDOWN -->               
					<!-- BEGIN USER LOGIN DROPDOWN -->
					<li class="dropdown user">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
						<img alt="" src="assets/img/avatar1_small.jpg" />
						<span class="username">Bob Nilson</span>
						<i class="icon-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
							<li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>
							<li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>
							<li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox <span class="badge badge-important">3</span></a></li>
							<li><a href="#"><i class="icon-tasks"></i> My Tasks <span class="badge badge-success">8</span></a></li>
							<li class="divider"></li>
							<li><a href="javascript:;" id="trigger_fullscreen"><i class="icon-move"></i> Full Screen</a></li>
							<li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>
							<li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
						</ul>
					</li>
					<!-- END USER LOGIN DROPDOWN -->
					<!-- END USER LOGIN DROPDOWN -->
				</ul>
				<!-- END TOP NAVIGATION MENU --> 
			</div>
		</div>
		<!-- END TOP NAVIGATION BAR -->
	</div>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar nav-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->        
			<ul class="page-sidebar-menu">
				<li>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler hidden-phone"></div>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				</li>
				<li>
					<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
					<form class="sidebar-search">
						<div class="input-box">
							<a href="javascript:;" class="remove"></a>
							<input type="text" placeholder="Search..." />
							<input type="button" class="submit" value=" " />
						</div>
					</form>
					<!-- END RESPONSIVE QUICK SEARCH FORM -->
				</li>
				<li>
					<a href="ManagerWelcomeJsp">
					<i class="icon-home"></i> 
					<span class="title">Home</span>
					<span class="selected"></span>
					</a>
				</li>
                                <li>
                                        <a href="ViewManagerProfileJsp.jsp">
					<i class="icon-pencil"></i> 
					<span class="title">View Profile</span>
					<span class="selected"></span>
					</a>
				</li>
                                 <li>
					<a href="ViewTeamLeaderJsp.jsp">
					<i class="icon-pencil"></i> 
					<span class="title">View Team Leaders</span>
					<span class="selected"></span>
					</a>
				</li>
                                 <li>
					<a href="AddProjectJsp.jsp">
					<i class="icon-pencil"></i> 
					<span class="title">Add Projects</span>
					<span class="selected"></span>
					</a>
				</li>
                                <li  class="start active">
					<a href="ViewProjectJsp.jsp">
					<i class="icon-pencil"></i> 
					<span class="title">View Projects</span>
					<span class="selected"></span>
					</a>
				</li>
                                 <li>
					<a href="#">
					<i class="icon-pencil"></i> 
					<span class="title">Allocate Project</span>
					<span class="selected"></span>
					</a>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-user"></i> 
					<span class="title">Login Options</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="#">
							Change Password</a>
						</li>
						<li >
							<a href="#">
							Change UserId</a>
						</li>
					</ul>
				</li>	
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div id="portlet-config" class="modal hide">
				<div class="modal-header">
					<button data-dismiss="modal" class="close" type="button"></button>
					<h3>Widget Settings</h3>
				</div>
				<div class="modal-body">
					Widget settings form goes here
				</div>
			</div>
			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<!-- BEGIN PAGE CONTAINER-->
			<div class="container-fluid">
				<!-- BEGIN PAGE HEADER-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN STYLE CUSTOMIZER -->
						<div class="color-panel hidden-phone">
							<div class="color-mode-icons icon-color"></div>
							<div class="color-mode-icons icon-color-close"></div>
							<div class="color-mode">
								<p>THEME COLOR</p>
								<ul class="inline">
									<li class="color-black current color-default" data-style="default"></li>
									<li class="color-blue" data-style="blue"></li>
									<li class="color-brown" data-style="brown"></li>
									<li class="color-purple" data-style="purple"></li>
									<li class="color-grey" data-style="grey"></li>
									<li class="color-white color-light" data-style="light"></li>
								</ul>
								<label>
									<span>Layout</span>
									<select class="layout-option m-wrap small">
										<option value="fluid" selected>Fluid</option>
										<option value="boxed">Boxed</option>
									</select>
								</label>
								<label>
									<span>Header</span>
									<select class="header-option m-wrap small">
										<option value="fixed" selected>Fixed</option>
										<option value="default">Default</option>
									</select>
								</label>
								<label>
									<span>Sidebar</span>
									<select class="sidebar-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
								<label>
									<span>Footer</span>
									<select class="footer-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
							</div>
						</div>
						<!-- END BEGIN STYLE CUSTOMIZER -->    
						<!-- BEGIN PAGE TITLE & BREADCRUMB-->
						<h3 class="page-title">
                                                        Edit <small>Project Details</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="ManagerWelcomeJsp.jsp">Home</a> 
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">Details</a></li>
							<li class="pull-right no-text-shadow">
								<div id="dashboard-report-range" class="dashboard-date-range tooltips no-tooltip-on-touch-device responsive" data-tablet="" data-desktop="tooltips" data-placement="top" data-original-title="Change dashboard date range">
									<i class="icon-calendar"></i>
									<span></span>
									<i class="icon-angle-down"></i>
								</div>
							</li>
						</ul>
						<!-- END PAGE TITLE & BREADCRUMB-->
					</div>
				</div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row-fluid">
					<div class="span12">
						<div class="tabbable tabbable-custom boxless">
							<div class="tab-content">
								
								<div class="tab-pane active " id="tab_2">
									<div class="portlet box green">
										<div class="portlet-title">
											<div class="caption"><i class="icon-reorder"></i>Edit your Profile</div>
											<div class="tools">
												<a href="javascript:;" class="collapse"></a>
												<a href="#portlet-config" data-toggle="modal" class="config"></a>
												<a href="javascript:;" class="reload"></a>
												<a href="javascript:;" class="remove"></a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
                                                                                        <form action="UpdateProjectController" method="post" class="form-horizontal">
                                                                                         
                                                                                            
                                                                                            <%
                                                                                                String projectid=request.getParameter("projectid");
                                                                                                String projecttitle =request.getParameter("projecttitle");
                                                                                                String summary =request.getParameter("summary");
                                                                                                String startingdate =request.getParameter("startingdate");
                                                                                                String endingdate =request.getParameter("endingdate");
                                                                                                String language =request.getParameter("language");
                                                                                                String clientname =request.getParameter("clientname");
                                                                                                String street=request.getParameter("street");
                                                                                                String city=request.getParameter("city");
                                                                                                String state=request.getParameter("state");
                                                                                                String contactno=request.getParameter("contactno");
                                                                                                String email=request.getParameter("email");
                                                                                               
                                                                                            %>
                                                                                            
												<h3 class="form-section">Project Info</h3>
                                                                                                
                                                                                                <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label">Project Id</label>
															<div class="controls">
																<input type="text" name="projectid" class="m-wrap span12" placeholder="Enter Project Name" value="<%=projectid%>">
															</div>
														</div>
													</div>
                                                                                                </div>
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label">Project Title</label>
															<div class="controls">
																<input type="text" name="projecttitle" class="m-wrap span12" placeholder="Enter Project Name" value="<%=projecttitle%>">
															</div>
														</div>
													</div>
                                                                                                </div>
													<!--/span-->
                                                                                                <div class="row-fluid">
													<div class="span6 ">
                                                                                                                <div class="control-group">
                                                                                                                    <label class="control-label">Summary</label>
                                                                                                                    <div class="controls">
                                                                                                                        <input type="text" class="m-wrap span12" rows="2" name="projectsummary" value="<%=summary%>"/>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                        </div>
                                                                                                </div>
                                                                                               
                                                                                                <!--/row-->
                                                                                                <div class="row-fluid">
													<div class="span6 ">
                                                                                                                <div class="control-group">
                                                                                                                        <label class="control-label">Starting Date</label>
                                                                                                                        <div class="controls">
                                                                                                                                 <div class="input-append" id="ui_date_picker_trigger">
                                                                                                                                      <i class="icon-calendar"></i>
                                                                                                                                      <input type="text" class="m-wrap medium" name="startingdate" value="<%=startingdate%>" /><span class="add-on"><i class="icon-calendar"></i></span>
                                                                                                                                 </div>
                                                                                                                        </div>
                                                                                                                </div>
                                                                                                        </div>
													<!--/span-->
												</div>
                                                                                                
                                                                                                <div class="row-fluid">
													<div class="span6 ">
                                                                                                                <div class="control-group">
                                                                                                                        <label class="control-label">Ending Date</label>
                                                                                                                        <div class="controls">
                                                                                                                                 <div class="input-append" id="ui_date_picker_trigger">
                                                                                                                                      <i class="icon-calendar"></i>
                                                                                                                                            <input type="text" class="m-wrap medium" name="endingdate" value="<%=endingdate%>" /><span class="add-on"><i class="icon-calendar"></i></span>
                                                                                                                                 </div>
                                                                                                                            
                                                                                                                        </div>
                                                                                                                </div>
                                                                                                        </div>
													<!--/span-->
												</div>
                                                                                                
												<!--/row-->        
												
													<!--/span-->
                                                                                                <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" >Language</label>
                                                                                                                        <%
                                                                                                                        
                                                                                                                        Connection con;
                                                                                                                        con=DBConnection.getConnection();
                                                                                                                        PreparedStatement ps1=con.prepareStatement("SELECT SkillName from skills");
                                                                                                                        ResultSet rs1=ps1.executeQuery();
                                                                                                                    
                                                                                                                        %> 
															<div class="controls">
                                                                                                                            <select name="projectlanguage">
                                                                                                                                <option><%=language%></option>
                                                                                                                                <% while(rs1.next())
                                                                                                                                {%>
                                                                                                                                <option value="<%=rs1.getString("SkillName")%>"  >   <%=rs1.getString("SkillName")%>  </option> 
                                                                                                                               <%}%>         
															    </select>
															</div>
														</div>
                                                                                                        </div>
                                                                                                </div>
                                                                                                <!--/span-->
												
                                                                                                <div>
												<h3 class="form-section">Client Details</h3>
												<!--/row--> 
                                                                                                <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label" for="clientname">Name</label>
															<div class="controls">
                                                                                                                            <input type="text" id="clientname" class="m-wrap span12" placeholder="Client Name"  name="clientname" value="<%=clientname%>">	
															</div>
														</div>
                                                                                                        </div>
                                                                                                </div>
                                                                                                                            
                                                                                                <h4 class="form-section">Address </h4>
												<div class="row-fluid">
													<div class="span12 ">
														<div class="control-group">
															<label class="control-label">Street</label>
                                                                                                                        <div class="controls">
                                                                                                                        <div class="input-icon left">
                                                                                                                                 <i class="icon-home"></i>
                                                                                                                                        <input type="text" name="street" class="m-wrap span12" value="<%=street%>">
                                                                                                                        </div>
                                                                                                                        </div>
														</div>
													</div>
												</div>
												<div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label">City</label>
															<div class="controls">
																<input type="text" name="city" class="m-wrap span12" value="<%=city%>"> 
															</div>
														</div>
													</div>
                                                                                                </div>
													<!--/span-->
                                                                                                <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
															<label class="control-label">State</label>
															<div class="controls">
																<select name="state" class="m-wrap span12">
                                                                                                                                         <option><%=state%></option>
																	 <option>Assam</option>
                                                                                                                                         <option>Bihar</option>
                                                                                                                                         <option>Gujarat</option>
                                                                                                                                         <option>Maharashtra</option>
                                                                                                                                         <option>Kerala</option>
                                                                                                                                         <option>Karnataka</option>
                                                                                                                                         <option>Madhya Pradesh</option>
                                                                                                                                         <option>Orissa</option>
                                                                                                                                         <option>Tamil Nadu</option>
                                                                                                                                         <option>West Bengal</option>
                                                                                                                                         <option>Rajasthan</option>
                                                                                                                                         <option>Jammu-Kashmir</option>
																</select>
															</div>
														</div>
													</div>
                                                                                                    </div>
                                                                                                        
                                                                                                    <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
                                                                                                                    <label class="control-label">Contact No.</label>
                                                                                                                        <div class="controls">
                                                                                                                            <div class="input-icon left">
                                                                                                                                 <i class="icon-bell"></i>
                                                                                                                                 <input class="m-wrap " type="text" name="clientcontactno" placeholder="Client's Contact Number" value="<%=contactno%>" /> 
                                                                                                                            </div>
                                                                                                                        </div>
                                                                                                                </div>
													</div>
                                                                                                    </div>
                                                                                                        
                                                                                                    <div class="row-fluid">
													<div class="span6 ">
														<div class="control-group">
                                                                                                                    <label class="control-label">Email Address Input</label>
                                                                                                                        <div class="controls">
                                                                                                                            <div class="input-icon left">
                                                                                                                                 <i class="icon-envelope"></i>
                                                                                                                                 <input class="m-wrap " type="text" name="clientemail" placeholder="Email Address" value="<%=email%>" />    
                                                                                                                            </div>
                                                                                                                        </div>
                                                                                                                </div>
													</div>
                                                                                                    </div>
													<!--/span-->
												
												<!--/row-->
												<div class="form-actions">
													<button type="submit" class="btn blue"><i class="icon-ok"></i>Update</button>
													<button type="button" class="btn">Cancel</button>
												</div>
											</form>
											<!-- END FORM-->                
										</div>
									</div>
								</div>
								
								
								
								
								
							</div>
						</div>
					</div>
				</div>
				<!-- END PAGE CONTENT-->         
			</div>
			<!-- END PAGE CONTAINER-->
		</div>
		<!-- END PAGE -->  
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="footer">
		<div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
		</div>
	</div>
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->   <script src="assets/plugins/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript" ></script>
	<!--[if lt IE 9]>
	<script src="assets/plugins/excanvas.min.js"></script>
	<script src="assets/plugins/respond.min.js"></script>  
	<![endif]-->   
	<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="assets/plugins/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript" ></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="assets/scripts/app.js"></script>
	<script src="assets/scripts/form-samples.js"></script>  
        <script src="assets/scripts/ui-jqueryui.js"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
		jQuery(document).ready(function() {    
		   // initiate layout and plugins
		   App.init();
		   FormSamples.init();
                   UIJQueryUI.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->   
</body>
<!-- END BODY -->
</html>

