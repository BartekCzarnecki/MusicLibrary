<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<body>
<!--  footer -->
<footr id="footer_with_contact">
    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-12 width">
                    <div class="address">
                        <h3>Contact Us</h3>
                        <ul class="locarion_icon">
                            <li><img src="/static/icon/1.png" alt="icon" />Modrzewiowa 23, Kielczow, Poland</li>
                            <li><img src="/static/icon/2.png" alt="icon" />Phone : +48 733377780</li>
                            <li><img src="/static/icon/3.png" alt="icon" />Email : czarnecki.bart@gmail.com</li>

                        </ul>

                        <ul class="contant_icon">
                            <li><img src="/static/icon/fb.png" alt="icon" /></li>
                            <li><img src="/static/icon/tw.png" alt="icon" /></li>
                            <li><img src="/static/icon/lin(2).png" alt="icon" /></li>
                            <li><img src="/static/icon/instagram.png" alt="icon" /></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-12 width">
                    <div class="address">
                        <h3>Get In Touch</h3>
                        <form>
                            <div class="row">
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Name" type="text" name="Name">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Phone" type="text" name="Email">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus" placeholder="Email" type="text" name="Email">
                                </div>
                                <div class="col-sm-12">
                                    <textarea class="textarea" placeholder="Message" type="text" name="Message"></textarea>
                                </div>
                                <div class="col-sm-12">
                                    <button class="send">Send</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12 width">
                    <div class="address">
                        <div class="row">
                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 ">
                                <figure><img src="/static/images/music1.jpg" /></figure>
                            </div>
                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 ">
                                <figure><img src="/static/images/music2.jpg" /></figure>
                            </div>
                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 ">
                                <figure><img src="/static/images/music3.jpg" /></figure>
                            </div>
                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 ">
                                <figure><img src="/static/images/music4.jpg" /></figure>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="copyright">
            <p>© 2021 All Rights Reserved </p>
        </div>
    </div>
</footr>
<!-- end footer -->
</body>
</html>
