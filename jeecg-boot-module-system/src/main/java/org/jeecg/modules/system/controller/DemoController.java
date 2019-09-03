package org.jeecg.modules.system.controller;


import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.system.entity.SysDepart;
import org.jeecg.modules.system.service.ISysDepartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/my/jee/")
public class DemoController {

    @Resource
    private ISysDepartService departService;

    @GetMapping("list")
    public Result<List<SysDepart>> deptList() {
        Result<List<SysDepart>> result = new Result();
        List<SysDepart> list = departService.list(null);
        result.setResult(list);
        result.setSuccess(true);
        return result;
    }
}
