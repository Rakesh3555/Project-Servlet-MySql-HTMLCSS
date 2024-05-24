<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <style>
        nav{
            position: sticky;
             top: 0;
            display: flex;
            background-color: rgb(70, 96, 190);
            width: 100%;
            height: 13vh;
            border-style: ridge;
            list-style-type: none;
            z-index: 1;
        }
        #MyProfile{
            position: relative;
            left: 5%;
            bottom: -40%;
            text-decoration: none;
            color: white;
        }
       
        
        #DropDown1{
            position: relative;
            left: 9%;
            bottom: -40%;
            width: 13%;
            height: max-content;
            border-radius: 4px;
            color: aliceblue;
            text-decoration: none;
        
        }
        #DropDown1:hover{
        color: black;
        cursor: pointer;
        display: block;

}
        #DropDown1:hover{
        cursor: pointer;
        color: black;
        z-index: 5;
        display: block;
}

#navbar #menu{
    display: none;
    
}

#navbar li:nth-child(2):hover #menu{
    display: block;
}
#DropDown2{
            position: relative;
            left: 8%;
            bottom: -40%;
            width: 13%;
            height: max-content;
            border-radius: 4px;
            color: aliceblue;
            text-decoration: none;
        
        }
        #DropDown2:hover{
        color: black;
        cursor: pointer;
        display: block;

}
        #DropDown2:hover{
        cursor: pointer;
        color: black;
        z-index: 5;
        display: block;
}

#navbar #menu1{
    display: none;
    
}

#navbar li:nth-child(3):hover #menu1{
    display: block;
}#DropDown3{
            position: relative;
            left: 4%;
            bottom: -40%;
            width: 13%;
            height: max-content;
            border-radius: 4px;
            color: aliceblue;
            text-decoration: none;
        
        }
        #DropDown3:hover{
        color: black;
        cursor: pointer;
        display: block;

}
        #DropDown3:hover{
        cursor: pointer;
        color: black;
        z-index: 5;
        display: block;
}

#navbar #menu2{
    display: none;
    
}

#navbar li:nth-child(4):hover #menu2{
    display: block;
}

#Log-Out{
            position: relative;
            left: 47%;
            bottom: -40%;
            text-decoration: none;
            color: white;
        }


    </style>
    <header>
        <h1 style="text-align: center;">RG-InfoTech Solution</h1>
    </header>
    <nav id="navbar">
        <a href="" id="MyProfile">My Profile</a>
        <li id="DropDown1">Apply Leave
            <ul id="menu"><br>
            <a href="PermissionLeave.jsp" style="text-decoration: none;list-style: none;"><li>Permission Leave</li><br></a>
            <a href="" style="text-decoration: none;list-style: none;"><li>Medical Leave</li><br></a>
            <a href="" style="text-decoration: none;list-style: none;"><li>Emergency leave</li><br></a>
            </ul>
        </li>
        <li id="DropDown2">Payroll
            <ul id="menu1"><br>
            <a href="" style="text-decoration: none;list-style: none;"><li>Payroll Calculator</li><br></a>
            <a href="" style="text-decoration: none;list-style: none;"><li>Payscale History</li><br></a>
            </ul>
        </li>
        <li id="DropDown3">Request Services
            <ul id="menu2"><br>
            <a href="" style="text-decoration: none;list-style: none;"><li>Flag Admin</li><br></a>
            <a href="" style="text-decoration: none;list-style: none;"><li>Benifits</li><br></a>
            </ul>
        </li>
        <a href="" id="Log-Out">Log Out</a>
    </nav>
</html>
</body>
</html>