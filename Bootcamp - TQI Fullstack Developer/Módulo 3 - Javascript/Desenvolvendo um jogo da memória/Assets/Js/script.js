const cards = document.querySelectorAll('.card');

let hasFlipedCard = false;
let firstCard, secondCard;
let lockBoard = false;

function flipCard(){
    this.classList.add('flip');

    if(!hasFlipedCard){
        hasFlipedCard = true;
        firstCard = this;
        return;
    }

    secondCard = this;
    hasFlipedCard = false;
    checkForMath();
}

function checkForMath(){
    if(firstCard.dataset.card == secondCard.dataset.card){
        disableCards();
        return;
    }else{
        unflipCard();
    }
}

function disableCards(){
    firstCard.removeEventListener('click', flipCard)
    secondCard.removeEventListener('click', flipCard)
}

function unflipCard(){
    setTimeout(() => {
        firstCard.classList.remove('flip');
        secondCard.classList.remove('flip');
    }, 1500);
}

cards.forEach((card) => {
    card.addEventListener('click', flipCard);
}) 

