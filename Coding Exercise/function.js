
 var table_Data = [ { first_name : 'Rose',
                     last_name  : 'Tyler',
                     home       : 'Earth' },
                   { first_name : 'Zoe',
                     last_name  : 'Heriot',
                     home       : 'Space Station W3'},
                   { first_name : 'Jo',
                     last_name  : 'Grant',
                     home       : 'Earth'},
                   { first_name : 'Leela',
                     last_name  : null,
                     home       : 'Unspecified'},
                   { first_name : 'Romana',
                     last_name  : null,
                     home       : 'Gallifrey'},
                   { first_name : 'Clara',
                     last_name  : 'Oswald',
                     home       : 'Earth'},
                   { first_name : 'Adric',
                     last_name  : null,
                     home       : 'Alzarius'},
                   { first_name : 'Susan',
                     last_name  : 'Foreman',
                     home       : 'Gallifrey'} ];
    var k = '<tbody>'
    for(i = 0;i < table_Data.length; i++){
        k+= '<tr>';
        k+= '<td>' + table_Data[i].first_name + '</td>';
        k+= '<td>' + table_Data[i].last_name + '</td>';
        k+= '<td>' + table_Data[i].home + '</td>';
        k+= '</tr>';
    }
    k+='</tbody>';
    document.getElementById('tableData').innerHTML = k;

