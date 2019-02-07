/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function matrixElementsSum(matrix) {

    var linhas = matrix.length;
    var colunas = matrix[0].length;
    var soma = 0; 
    for(var i=0; i<linhas; i++){
        for(var j=0;j<colunas;j++){
           if(i == 0){
               if(matrix[i][j] != 0)
                    soma += matrix[i][j];
               else
                   matrix[i][j] = 'x';
           }
            else{
                if(matrix[i][j] != 0){
                    if(matrix[i-1][j] != 'x')
                        soma +=matrix[i][j];
                    else
                        matrix[i][j] = 'x';
                }else{
                    matrix[i][j] = 'x';
                }   
            }
        }
    }
     
    return soma;
}

