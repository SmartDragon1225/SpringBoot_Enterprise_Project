layui.use(['layer','form'], function () {
    var form = layui.form;
    //获取所有可用部门
    get('/department/getAll',null,function (data) {
        deptSelectType('deptId',data);
        form.render();
    });
    //下拉被选中时
    form.on('select(dept)', function(data){
        if (data.value===0) {
        }else {
          get('/employee/getEmployeeNumber',{deptId:data.value},function (backData) {
              console.log(backData);
              var myChart = echarts.init(document.getElementById('main'));
              var xAxis=[];
              var series=[];
              var bseries=[];
              //坐标和数据都push到数组中
              for (var key in backData){
                  xAxis.push(key);
                  series.push(backData[key][0].number);
              }
              myChart.setOption({
                  color: ['#3398DB'],
                  tooltip : {
                      trigger: 'axis',
                      axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                          type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                      }
                  },
                  grid: {
                      left: '3%',
                      right: '4%',
                      bottom: '3%',
                      containLabel: true
                  },
                  xAxis : [
                      {
                          type : 'category',
                          data : xAxis,
                          axisTick: {
                              alignWithLabel: true
                          }
                      }
                  ],
                  yAxis : [
                      {
                          type : 'value'
                      }
                  ],
                  series : [
                      {
                          name:'员工数量',
                          type:'bar',
                          barWidth: '60%',
                          data:series
                      }
                  ]
              });
          });
        }
    });
});