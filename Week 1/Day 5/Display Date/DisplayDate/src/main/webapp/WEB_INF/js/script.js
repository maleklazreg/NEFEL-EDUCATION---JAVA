window.onload = function() {
    if (window.location.pathname === "/date") {
        alert("localhost:8080 says\nThis is the date template");
    } else if (window.location.pathname === "/time") {
        alert("localhost:8080 says\nThis is the time template");
    }
};