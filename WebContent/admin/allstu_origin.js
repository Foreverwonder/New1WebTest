/**
 *
 */
function allcheck(checkbox) {

    if (checkbox.checked == true) {
        var oCheck = document.getElementsByName('check');

        for (var i = 0; i < oCheck.length; i++) {
            oCheck[i].checked = true;
        }
    } else {
        var oCheck = document.getElementsByName('check');
        for (var i = 0; i < oCheck.length; i++) {
            oCheck[i].checked = false;
        }
    }
}


function delall() {
    var allsid = new Array();
    var flag = false;
    var oCheck = document.getElementsByName('check')
    for (var i = 0; i < oCheck.length; i++) {
        if (oCheck[i].checked) {
            allsid.push(oCheck[i].value)
            flag = true
        }
    }
    if (flag == true) {
        if (confirm("您确定要删除这些记录吗?删除后将不能恢复哦!")) {
            location.href = "deleteStu?flag=all&sid=" + allsid;
            // alert(allsid)
        }

    }else {
        confirm("至少要选择一条记录")
    }
}


