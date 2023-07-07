const signUpBtn = document.getElementById("signUp");
const signInBtn = document.getElementById("signIn");
const container = document.querySelector(".container");

signUpBtn.addEventListener("click", () => {
  container.classList.add("right-panel-active");
  signUpBtn.val(1);
  signInBtn.val(0);
});
signInBtn.addEventListener("click", () => {
  container.classList.remove("right-panel-active");
  signInBtn.val(1);
  signUpBtn.val(0);
});