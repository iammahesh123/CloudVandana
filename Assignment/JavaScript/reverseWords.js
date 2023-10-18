function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);