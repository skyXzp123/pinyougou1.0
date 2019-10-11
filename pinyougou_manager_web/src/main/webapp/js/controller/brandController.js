//品牌控制层
app.controller('brandController', function ($scope, $controller, brandService) {

    //共享$scope
    $controller('baseController', {$scope: $scope})

    //读取列表数据绑定到表单
    $scope.findPage = function (page, rows) {

        brandService.findPage(page, rows).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        )
    };
    //保存
    $scope.save = function () {
        //定义一个方法名
        var methodName = "addTbBrand";
        //有id判断
        if ($scope.entity.id != null) {
            methodName = "updateTbBrand";
        }
        brandService.save(methodName, $scope.entity).success(
            function (response) {
                if (response.success) {
                    //重新查询
                    $scope.reloadList();//重新加载
                } else {
                    alert(response.message);
                }
            }
        )
    }
    //回调
    $scope.findOne = function (id) {
        brandService.findOne(id).success(
            function (response) {
                $scope.entity = response;
            }
        )
    }

    //删除
    $scope.delete = function () {
        brandService.delete($scope.selectIds).success(
            function (response) {
                if (response.success) {
                    $scope.reloadList();//刷新列表
                } else {
                    alert(response.message);
                }
            }
        )
    }
    $scope.searchEntity = {};//定义为空

    //条件查询
    $scope.search = function (page, rows) {
        brandService.search(page, rows, $scope.searchEntity).success(
            function (response) {
                //总记录数
                $scope.paginationConf.totalItems = response.total;
                //给列表变量赋值
                $scope.list = response.rows;
            }
        )
    }
});