function validateMenuItemForm() {
    var name = document.forms["menuItemForm"]["name"].value;
    var price = document.forms["menuItemForm"]["price"].value;
    var dateOfLaunch = document.forms["menuItemForm"]["dateOfLaunch"].value;
    var category = document.forms["menuItemForm"]["category"].value;
    var regNumbers = (/^.*[0-9].*$/);
    var regSpecial = (/^.*[!#@&?].*$/);
    var regCharacters = (/^.*[a-zA-Z!#@&?].*$/);
    var submit = document.forms["menuItemForm"]["submit"].value;
    if (name == "") {
        alert("Title is required");
        return false;
    } else if (name.length < 2 || name.length > 65) {
        alert("Title should have 2 to 65 characters");
        return false;
    } else if (price.match(regCharacters)) {
        alert("Price has to be a number");
        return false;
    } else if (price == "") {
        alert("Price is required");
        return false;
    } else if (dateOfLaunch.match(regCharacters)) {
        alert("Date of Launch must contain ony numbers");
        return false;
    } else if (dateOfLaunch == "") {
        alert("Date of launch is required");
        return false;
    } else if (category == "") {
        alert("Select one Category");
        return false;
    } else {
    }

}
