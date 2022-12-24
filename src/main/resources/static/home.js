const riskButton = document.getElementById("risk_button");
const riskTable = document.getElementById("risk-table");


const riskWaterButton = document.getElementById("risk_water_button");
const riskWaterTable = document.getElementById("risk-water-table");
const riskLossesTable = document.getElementById("risk-losses-table");

const damageButton = document.getElementById("damage_button");
const damageTable = document.getElementById("damage-table");

const lossesTable = document.getElementById("losses-table");
const lossesButton = document.getElementById("losses_button");

riskTable.style = "display: none";
let riskTableStatus = false;
riskWaterTable.style = "display: none";
let riskWaterTableStatus = false;
damageTable.style = "display: none";
let damageTableStatus = false;
lossesTable.style = "display: none";
let lossesTableStatus = false;

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

damageButton.addEventListener("click", () => {
    if(!damageTableStatus){
        damageTable.style = "display: block";
        damageTableStatus = true;
    }
    else {
        damageTable.style = "display: none";
        damageTableStatus = false;
    }
});

lossesButton.addEventListener("click", () => {
    if(!lossesTableStatus){
        lossesTable.style = "display: block";
        lossesTableStatus = true;
    }
    else {
        lossesTable.style = "display: none";
        lossesTableStatus = false;
    }
});