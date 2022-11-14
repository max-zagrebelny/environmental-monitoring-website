const riskButton = document.getElementById("risk_button");
const riskTable = document.getElementById("risk-table");

const riskWaterButton = document.getElementById("risk_water_button");
const riskWaterTable = document.getElementById("risk-water-table");

riskTable.style = "display: none";
let riskTableStatus = false;
riskWaterTable.style = "display: none";
let riskWaterTableStatus = false;

riskButton.addEventListener("click", () => {
    if(!riskTableStatus){
        riskTable.style = "display: block";
        riskTableStatus = true;
    }
    else {
        riskTable.style = "display: none";
         riskTableStatus = false;
    }
});

riskWaterButton.addEventListener("click", () => {
    if(!riskWaterTableStatus){
        riskWaterTable.style = "display: block";
        riskWaterTableStatus = true;
    }
    else {
        riskWaterTable.style = "display: none";
        riskWaterTableStatus = false;
    }
});