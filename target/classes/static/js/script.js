document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('addToCart').addEventListener('click', function() {
        alert('Order placed');
    });
});

//document.addEventListener('DOMContentLoaded', function() {
//    const loginForm = document.getElementById('loginForm');
//
//    loginForm.addEventListener('submit', function(event) {
//        event.preventDefault();
//
//        const username = document.getElementById('username').value;
//        const password = document.getElementById('password').value;
//
//        // Perform validation (example)
//        if (username === 'user' && password === 'password') {
//            alert('Login successful!');
//        } else {
//            alert('Invalid username or password');
//        }
//    });
//});

document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('registrationForm');

    loginForm.addEventListener('submit', function(event) {
//        event.preventDefault();

        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;

        // Perform validation (example)
//        if (username === 'user' && password === 'password') {
//            alert('Login successful!');
//        } else {
//            alert('Invalid username or password');
//        }
    });
});
