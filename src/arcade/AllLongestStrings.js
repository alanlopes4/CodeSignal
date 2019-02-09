

function allLongestStrings(inputArray) {

    var index = 0;
    var tamanho = inputArray.length;
    var maiorPalavra = inputArray[0].length;
    var palavras = [];
    palavras.push(inputArray[0]);
    if(tamanho > 1)
        for(var i = 1; i<tamanho; i++){
            var tam = inputArray[i].length;
            if(tam>maiorPalavra){
                palavras = [];
                palavras.push(inputArray[i]);
                maiorPalavra = tam;                
            }else if(tam == maiorPalavra){
                palavras.push(inputArray[i]);
            }
        }
    
    //console.log(palavras);
    return palavras;
    
}