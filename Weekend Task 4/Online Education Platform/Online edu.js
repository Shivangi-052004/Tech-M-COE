function validateForm() {
  let isValid = true;
  let name = document.getElementById("name").value.trim();
  let email = document.getElementById("email").value.trim();
  let phone = document.getElementById("phone").value.trim();
  let course = document.getElementById("course").value;

  document.getElementById("nameError").innerText = name
    ? ""
    : "Name is required";
  document.getElementById("emailError").innerText = email
    ? ""
    : "Email is required";
  document.getElementById("phoneError").innerText = phone
    ? ""
    : "Phone number is required";
  document.getElementById("courseError").innerText = course
    ? ""
    : "Please select a course";

  if (!name || !email || !phone || !course) {
    isValid = false;
  }

  if (isValid) {
    alert("You have enrolled successfully");
    document.getElementById("enrollmentForm").reset();
  }
}

function enroll(courseName) {
  alert("You have enrolled in " + courseName + "!");
  window.location.href = "Enroll.html"; // Redirects to Enroll.html
}
