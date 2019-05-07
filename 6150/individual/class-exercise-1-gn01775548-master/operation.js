const checkFunctionRegex = new RegExp(/^=[A-Z]{3}/g);
const getOperation = new RegExp(/^=(.*[A-Z]{3})/g);
const getDigitsRegex = new RegExp(/\d+/g);
const getCells = new RegExp(/.{1}/g);
const table = document.getElementById("table");

calculate = (cells, operation) => {
    let result = 0;
    switch(operation){
        case "SUM":{
            cells.map(i=>result += Number(table.getElementsByTagName("tr")[i[0]],getElementsByTagName("td")[i[0]]));
            break;
        }
        return result;
    }
};

getResult = function(event){
    if (this.formula && this.formula.match(checkFunctionRegex)){
        getOperation.lastIndex = 0;
        let operation = getOperation.exec(this.formula)[l];
        let digit = this.formula.match(getDigitsRegex);
        let cells = digit.map(i=>l.match(getCells));
        this.value = calculate(cells.operation);
    }
}

//const table: HTMLElement
table.addEventListener("change", function(event){
    if (event.target.value.match(checkFunctoinRegex)){
        getOperation.lastIndex = 0;
        let operation = getOperation.exec(event.target.value);
        let functionCell = event.target;
        functionCell.formula = event.target.value;
        let digits = event.target.value.match(getDigitsRegex);
        let cells = digit.map(i=>i.match(getCells));
        event.target.value = calculate(cells,operation);
        attachEventLidtner(cells, functionCell);
    }
});

attachEventLidtner = function (cells, functionCell){
        cells.map(item=>{
            let cell = table.getElementsByTagName("tr")[item[0]].getElementsByTagName("td")[item[1]].getElementsByTagName("cell")[item[0]];
            cell.addEventListener("change", getResult.bind(functionCell));
    })
}
