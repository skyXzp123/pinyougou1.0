//品牌服务层
app.service('brandService', function ($http) {
    //读取列表数据绑定到表单
    this.findPage = function (page, rows) {
        return $http.get('../brand/findPage.do?page=' + page + '&rows=' + rows);
    }

    this.save = function (methodName, entity) {
        return $http.post('../brand/' + methodName + '.do', entity);
    }

    this.findOne = function (id) {
        return $http.get('../brand/findOne.do?id=' + id);
    }

    this.delete = function (ids) {
        return $http.get('../brand/deleteTbBrand.do?ids=' + ids);
    }

    this.search = function (page, rows, searchEntity) {
        return $http.post('../brand/search.do?page=' + page + "&rows=" + rows, searchEntity);
    }

    this.brandList = function () {
        return $http.get('../brand/brandList.do');
    }
})