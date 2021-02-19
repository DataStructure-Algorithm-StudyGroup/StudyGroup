const strings = ['a', 'b','c', 'd'];
//4*4 = 16 bytes of storage

//push
strings.push('e'); //O(1)

//pop
strings.pop(); //O(1)
strings.pop(); //O(1)

//console.log(strings);

//Create an Array class to demo the Array functionality

class customArray {
    constructor() {
        this.length = 0;
        this.data = {};
    }

    count() {
        return this.length;
    }

    get(index) {
        console.log(this.data);
        return this.data[index];
    }

    push(item) {
        this.data[this.length] = item;
        this.length++;
        return item;
    }

    pop() {
        delete this.data[this.length-1];
        this.length--;
    }

    deleteAtIndex(index) {
        const item = this.data[index];
        this.shiftItems(index);
        return item;
    }

    shiftItems(index){
        for(let i = index; i < this.length-1;i++){
            this.data[i] = this.data[i+1];
        }
        delete this.data[this.length-1];
        this.length--;
    }
}
/*
let simpleArr = new myArray();
console.log('Entire array:',simpleArr);
simpleArr.push('e');
console.log('Entire array:',simpleArr);
simpleArr.pop();
console.log('Test..', simpleArr.get(1));
console.log('Entire array:',simpleArr);
*/

const myArray = new customArray();
myArray.push('hi');
myArray.push('you');
myArray.push('!');
myArray.pop();
console.log(myArray);

myArray.deleteAtIndex(0);
myArray.push('you');
myArray.push('are');
myArray.push('nice');
myArray.shiftItems(0);
console.log(myArray);
console.log(myArray.count());


