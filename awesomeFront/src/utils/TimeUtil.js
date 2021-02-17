const processDate = (oldDate, full) => {
    var od = new Date(oldDate)
    var year =  od.getFullYear();
    var month = od.getMonth()<9? '0' + (od.getMonth()+1) : od.getMonth()+1;
    var date = od.getDate()<10? '0' + od.getDate() : od.getDate();
    if("all" == full){
        return year + '年' + month + '月' + date + '日'
    }else if("month" == full){
        return month
    }else if("day" == full){
        return date
    }
}

export {
    processDate,
}