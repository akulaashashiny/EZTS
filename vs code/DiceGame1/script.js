function addName(){
    var p1 = document.getElementById("player1Name").value;
    var p2 = document.getElementById("player2Name").value;


    document.getElementById("p1scoretable").innerHTML = p1;
    document.getElementById("player1").innerHTML = p1;
    document.getElementById("p2scoretable").innerHTML = p2;
    document.getElementById("player2").innerHTML = p2;
   
    document.getElementById("start").disabled = true;
    document.getElementById("restart").disabled = false;
    document.getElementById("rollPlayer1").disabled = false;
}
