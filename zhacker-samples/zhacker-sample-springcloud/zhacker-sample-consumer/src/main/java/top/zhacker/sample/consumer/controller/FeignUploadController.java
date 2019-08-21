package top.zhacker.sample.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.zhacker.boot.aop.log.ParamLog;
import top.zhacker.sample.consumer.client.FileUploadFeignService;

@RestController
@Api(value="文件上传")
@RequestMapping("/feign")
public class FeignUploadController {

    @Autowired
    private FileUploadFeignService fileUploadFeignService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiOperation(value = "文件上传", notes = "请选择文件上传" )
    public ResponseEntity<byte[]> imageUpload(@ApiParam(value="文件上传",required = true) MultipartFile file ) throws Exception{
        return fileUploadFeignService.fileUpload(file);
    }

}
