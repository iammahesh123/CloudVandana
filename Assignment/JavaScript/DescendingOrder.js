function getUserInput() {
    const input = prompt("Enter a list of numbers:");
    const inputArray = input.split(' ').map(Number);
    return inputArray;
}

function sortArrayDescending(arr) {
    arr.sort(function(a, b) {
        return b - a;
    });
}

const userArray = getUserInput();

if (userArray.length === 0 || isNaN(userArray[0])) {
    console.log("Please enter a valid list of numbers.");
} else {
    sortArrayDescending(userArray);
    console.log("Sorted Array in Descending Order: " + userArray);
}
