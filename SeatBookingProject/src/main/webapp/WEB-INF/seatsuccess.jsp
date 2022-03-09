<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/seats.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/font-awesome.css" type="text/css"> 
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/animate.css" type="text/css">
	<link href='https://fonts.googleapis.com/css?family=Baloo' rel='stylesheet'>
  
    <title>Select Seats :: Bookmymovie.com</title>
   
    
</head>
<body>

	<%-- <div class="head-all">	
		<%@ include file ="header.jsp" %>
	</div>
	
	<br><br>
	 --%>
	 <h1>Your Seat is successfully booked!</h1>
	<form action="http://localhost:8080/SeatBookingProject/booking/submit" method="GET">
	<div class="container">
				<div class="sc">
					<h1>SCREEN</h1><br>
					<!-- <h5>RS. 150</h5> -->
				</div>
				<div class="row justify-content-center">
				
				
						<div class="col-sm-1">
							<div class="cust-rows">
							<ul>
								<li>ROW 1</li>
								<li>ROW 2</li>
							</ul>
							<br>
							<ul>
								<li>ROW 3</li>
								<li>ROW 4</li>
								<li>ROW 5</li>
								<li>ROW 6</li>
								<li>ROW 7</li>
								<li>ROW 8</li>
								<li>ROW 9</li>
								<li>ROW 10</li>
							</ul>
							</div>
						</div>
						<div class="col-sm-5 screen">
							
								<section id="seats">
								
								  <div class="row justify-content-center">
								  <div class="col-sm-12">
								  <input id="seat-1" class="seat-select" type="checkbox" value="1" name="seat_no" >
								  <label for="seat-1" class="seat">1</label>
								  <input id="seat-2" class="seat-select" type="checkbox" value="2" name="seat_no">
								  <label for="seat-2" class="seat">2</label>
								  <input id="seat-3" class="seat-select" type="checkbox" value="3" name="seat_no" />
								  <label for="seat-3" class="seat">3</label>
								  <input id="seat-4" class="seat-select" type="checkbox" value="4" name="seat_no" />
								  <label for="seat-4" class="seat">4</label>
								  <input id="seat-5" class="seat-select" type="checkbox" value="5" name="seat_no" />
								  <label for="seat-5" class="seat">5</label>
								  <input id="seat-6" class="seat-select" type="checkbox" value="6" name="seat_no" />
								  <label for="seat-6" class="seat">6</label>
								  <input id="seat-7" class="seat-select" type="checkbox" value="7" name="seat_no" />
								  <label for="seat-7" class="seat">7</label>
								  <input id="seat-8" class="seat-select" type="checkbox" value="8" name="seat_no" />
								  <label for="seat-8" class="seat">8</label>
								  <input id="seat-9" class="seat-select" type="checkbox" value="9" name="seat_no" />
								  <label for="seat-9" class="seat">9</label>
								  <input id="seat-10" class="seat-select" type="checkbox" value="10" name="seat_no" />
								  <label for="seat-10" class="seat">10</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-11" class="seat-select" type="checkbox" value="11" name="seat_no" />
								  <label for="seat-11" class="seat">11</label>
								  <input id="seat-12" class="seat-select" type="checkbox" value="12" name="seat_no" />
								  <label for="seat-12" class="seat">12</label>
								  <input id="seat-13" class="seat-select" type="checkbox" value="13" name="seat_no" />
								  <label for="seat-13" class="seat">13</label>
								  <input id="seat-14" class="seat-select" type="checkbox" value="14" name="seat_no" />
								  <label for="seat-14" class="seat">14</label>
								  <input id="seat-15" class="seat-select" type="checkbox" value="15" name="seat_no" />
								  <label for="seat-15" class="seat">15</label>
								  <input id="seat-16" class="seat-select" type="checkbox" value="16" name="seat_no" />
								  <label for="seat-16" class="seat">16</label>
								  <input id="seat-17" class="seat-select" type="checkbox" value="17" name="seat_no" />
								  <label for="seat-17" class="seat">17</label>
								  <input id="seat-18" class="seat-select" type="checkbox" value="18" name="seat_no" />
								  <label for="seat-18" class="seat">18</label>
								  <input id="seat-19" class="seat-select" type="checkbox" value="19" name="seat_no" />
								  <label for="seat-19" class="seat">19</label>
								  <input id="seat-20" class="seat-select" type="checkbox" value="20" name="seat_no" />
								  <label for="seat-20" class="seat">20</label>
								  </div>
								  <br><br><br>
								  <div class="col-sm-12">
								  <input id="seat-21" class="seat-select" type="checkbox" value="21" name="seat_no" />
								  <label for="seat-21" class="seat">21</label>
								  <input id="seat-22" class="seat-select" type="checkbox" value="22" name="seat_no" />
								  <label for="seat-22" class="seat">22</label>
								  <input id="seat-23" class="seat-select" type="checkbox" value="23" name="seat_no" />
								  <label for="seat-23" class="seat">23</label>
								  <input id="seat-24" class="seat-select" type="checkbox" value="24" name="seat_no" />
								  <label for="seat-24" class="seat">24</label>
								  <input id="seat-25" class="seat-select" type="checkbox" value="25" name="seat_no" />
								  <label for="seat-25" class="seat">25</label>
								  <input id="seat-26" class="seat-select" type="checkbox" value="26" name="seat_no" />
								  <label for="seat-26" class="seat">26</label>
								  <input id="seat-27" class="seat-select" type="checkbox" value="27" name="seat_no" />
								  <label for="seat-27" class="seat">27</label>
								  <input id="seat-28" class="seat-select" type="checkbox" value="28" name="seat_no" />
								  <label for="seat-28" class="seat">28</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-31" class="seat-select" type="checkbox" value="29" name="seat_no" />
								  <label for="seat-31" class="seat">29</label>
								  <input id="seat-32" class="seat-select" type="checkbox" value="30" name="seat_no" />
								  <label for="seat-32" class="seat">30</label>
								  <input id="seat-33" class="seat-select" type="checkbox" value="31" name="seat_no" />
								  <label for="seat-33" class="seat">31</label>
								  <input id="seat-34" class="seat-select" type="checkbox" value="32" name="seat_no" />
								  <label for="seat-34" class="seat">32</label>
								  <input id="seat-35" class="seat-select" type="checkbox" value="33" name="seat_no" />
								  <label for="seat-35" class="seat">33</label>
								  <input id="seat-36" class="seat-select" type="checkbox" value="34" name="seat_no" />
								  <label for="seat-36" class="seat">34</label>
								  <input id="seat-37" class="seat-select" type="checkbox" value="35" name="seat_no" />
								  <label for="seat-37" class="seat">35</label>
								  <input id="seat-38" class="seat-select" type="checkbox" value="36" name="seat_no" />
								  <label for="seat-38" class="seat">36</label>
								  <input id="seat-39" class="seat-select" type="checkbox" value="37" name="seat_no" />
								  <label for="seat-39" class="seat">37</label>
								  <input id="seat-40" class="seat-select" type="checkbox" value="38" name="seat_no" />
								  <label for="seat-40" class="seat">38</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-41" class="seat-select" type="checkbox" value="39" name="seat_no" />
								  <label for="seat-41" class="seat">39</label>
								  <input id="seat-42" class="seat-select" type="checkbox" value="40" name="seat_no" />
								  <label for="seat-42" class="seat">40</label>
								  <input id="seat-43" class="seat-select" type="checkbox" value="41" name="seat_no" />
								  <label for="seat-43" class="seat">41</label>
								  <input id="seat-44" class="seat-select" type="checkbox" value="42" name="seat_no" />
								  <label for="seat-44" class="seat">42</label>
								  <input id="seat-45" class="seat-select" type="checkbox" value="43" name="seat_no" />
								  <label for="seat-45" class="seat">43</label>
								  <input id="seat-46" class="seat-select" type="checkbox" value="44" name="seat_no" />
								  <label for="seat-46" class="seat">44</label>
								  <input id="seat-47" class="seat-select" type="checkbox" value="45" name="seat_no" />
								  <label for="seat-47" class="seat">45</label>
								  <input id="seat-48" class="seat-select" type="checkbox" value="46" name="seat_no" />
								  <label for="seat-48" class="seat">46</label>
								  <input id="seat-49" class="seat-select" type="checkbox" value="47" name="seat_no" />
								  <label for="seat-49" class="seat">47</label>
								  <input id="seat-50" class="seat-select" type="checkbox" value="48" name="seat_no" />
								  <label for="seat-50" class="seat">48</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-51" class="seat-select" type="checkbox" value="49" name="seat_no" />
								  <label for="seat-51" class="seat">49</label>
								  <input id="seat-52" class="seat-select" type="checkbox" value="50" name="seat_no" />
								  <label for="seat-52" class="seat">50</label>
								  <input id="seat-53" class="seat-select" type="checkbox" value="51" name="seat_no" />
								  <label for="seat-53" class="seat">51</label>
								  <input id="seat-54" class="seat-select" type="checkbox" value="52" name="seat_no" />
								  <label for="seat-54" class="seat">52</label>
								  <input id="seat-55" class="seat-select" type="checkbox" value="53" name="seat_no" />
								  <label for="seat-55" class="seat">53</label>
								  <input id="seat-56" class="seat-select" type="checkbox" value="54" name="seat_no" />
								  <label for="seat-56" class="seat">54</label>
								  <input id="seat-57" class="seat-select" type="checkbox" value="55" name="seat_no" />
								  <label for="seat-57" class="seat">55</label>
								  <input id="seat-58" class="seat-select" type="checkbox" value="56" name="seat_no" />
								  <label for="seat-58" class="seat">56</label>
								  <input id="seat-59" class="seat-select" type="checkbox" value="57" name="seat_no" />
								  <label for="seat-59" class="seat">57</label>
								  <input id="seat-60" class="seat-select" type="checkbox" value="58" name="seat_no" />
								  <label for="seat-60" class="seat">58</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-61" class="seat-select" type="checkbox" value="59" name="seat_no" />
								  <label for="seat-61" class="seat">59</label>
								  <input id="seat-62" class="seat-select" type="checkbox" value="60" name="seat_no" />
								  <label for="seat-62" class="seat">60</label>
								  <input id="seat-63" class="seat-select" type="checkbox" value="61" name="seat_no" />
								  <label for="seat-63" class="seat">61</label>
								  <input id="seat-64" class="seat-select" type="checkbox" value="62" name="seat_no" />
								  <label for="seat-64" class="seat">62</label>
								  <input id="seat-65" class="seat-select" type="checkbox" value="63" name="seat_no" />
								  <label for="seat-65" class="seat">63</label>
								  <input id="seat-66" class="seat-select" type="checkbox" value="64" name="seat_no" />
								  <label for="seat-66" class="seat">64</label>
								  <input id="seat-67" class="seat-select" type="checkbox" value="65" name="seat_no" />
								  <label for="seat-67" class="seat">65</label>
								  <input id="seat-68" class="seat-select" type="checkbox" value="66" name="seat_no" />
								  <label for="seat-68" class="seat">66</label>
								  <input id="seat-69" class="seat-select" type="checkbox" value="67" name="seat_no" />
								  <label for="seat-69" class="seat">67</label>
								  <input id="seat-70" class="seat-select" type="checkbox" value="68" name="seat_no" />
								  <label for="seat-70" class="seat">68</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-71" class="seat-select" type="checkbox" value="69" name="seat_no" />
								  <label for="seat-71" class="seat">69</label>
								  <input id="seat-72" class="seat-select" type="checkbox" value="70" name="seat_no" />
								  <label for="seat-72" class="seat">70</label>
								  <input id="seat-73" class="seat-select" type="checkbox" value="71" name="seat_no" />
								  <label for="seat-73" class="seat">71</label>
								  <input id="seat-74" class="seat-select" type="checkbox" value="72" name="seat_no" />
								  <label for="seat-74" class="seat">72</label>
								  <input id="seat-75" class="seat-select" type="checkbox" value="73" name="seat_no" />
								  <label for="seat-75" class="seat">73</label>
								  <input id="seat-76" class="seat-select" type="checkbox" value="74" name="seat_no" />
								  <label for="seat-76" class="seat">74</label>
								  <input id="seat-77" class="seat-select" type="checkbox" value="75" name="seat_no" />
								  <label for="seat-77" class="seat">75</label>
								  <input id="seat-78" class="seat-select" type="checkbox" value="76" name="seat_no" />
								  <label for="seat-78" class="seat">76</label>
								  <input id="seat-79" class="seat-select" type="checkbox" value="77" name="seat_no" />
								  <label for="seat-79" class="seat">77</label>
								  <input id="seat-80" class="seat-select" type="checkbox" value="78" name="seat_no" />
								  <label for="seat-80" class="seat">78</label>
								  </div>
								  
								  <div class="col-sm-12">
								  <input id="seat-81" class="seat-select" type="checkbox" value="79" name="seat_no" />
								  <label for="seat-81" class="seat">79</label>
								  <input id="seat-82" class="seat-select" type="checkbox" value="80" name="seat_no" />
								  <label for="seat-82" class="seat">80</label>
								  <input id="seat-83" class="seat-select" type="checkbox" value="81" name="seat_no" />
								  <label for="seat-83" class="seat">81</label>
								  <input id="seat-84" class="seat-select" type="checkbox" value="82" name="seat_no" />
								  <label for="seat-84" class="seat">82</label>
								  <input id="seat-85" class="seat-select" type="checkbox" value="83" name="seat_no" />
								  <label for="seat-85" class="seat">83</label>
								  <input id="seat-86" class="seat-select" type="checkbox" value="84" name="seat_no" />
								  <label for="seat-86" class="seat">84</label>
								  <input id="seat-87" class="seat-select" type="checkbox" value="85" name="seat_no" />
								  <label for="seat-87" class="seat">85</label>
								  <input id="seat-88" class="seat-select" type="checkbox" value="86" name="seat_no" />
								  <label for="seat-88" class="seat">86</label>
								  <input id="seat-89" class="seat-select" type="checkbox" value="87" name="seat_no" />
								  <label for="seat-89" class="seat">87</label>
								  <input id="seat-90" class="seat-select" type="checkbox" value="88" name="seat_no" />
								  <label for="seat-90" class="seat">88</label>
								  </div>
								  
								  <div class="col-sm-8 last-row">
								  <input id="seat-91" class="seat-select" type="checkbox" value="89" name="seat_no" />
								  <label for="seat-91" class="seat">89</label>
								  <input id="seat-92" class="seat-select" type="checkbox" value="90" name="seat_no" />
								  <label for="seat-92" class="seat">90</label>
								  <input id="seat-93" class="seat-select" type="checkbox" value="91" name="seat_no" />
								  <label for="seat-93" class="seat">91</label>
								  <input id="seat-94" class="seat-select" type="checkbox" value="92" name="seat_no" />
								  <label for="seat-94" class="seat">92</label>
								  <input id="seat-95" class="seat-select" type="checkbox" value="93" name="seat_no" />
								  <label for="seat-95" class="seat">93</label>
								  <input id="seat-96" class="seat-select" type="checkbox" value="94" name="seat_no" />
								  <label for="seat-96" class="seat">94</label>
								  </div>
								  <br><br><br>
								  <div class="col-sm-5">
								  	<div class="form-group">
								  	
									</div>
								  </div>
								  
								  </div>
								</section>
							
						</div>
						
				</div>
			</div>
		</form>
										<p>
										<c:forEach var="Seats" items="${Seats.insert}">										
                                        <c:param name="seat_status" value="${Seats.seat_status}" /> 
                                        <input type="button" value="show booked seat" onclick="ShowSeat()">                                                                     
                                      	</c:forEach>
										</p>
	<%-- <%@ include file ="footer.jsp" %> --%>
		<script>
		function ShowSeat(){
			document.getElementByClass("seat-select").disabled=true;
			
		}
		</script>
	<!--my javascript-->
	<script src="<%=request.getContextPath()%>/resources/js/accordion.js"></script>
	<!--/my javascript-->
		
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>