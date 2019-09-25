package top.zhacker.core.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 并发安全实体
 * Created by zhacker.
 * Time 2018/11/13 上午10:40
 */
@Getter
@Setter(AccessLevel.PROTECTED)
@Accessors(chain = true)
@ToString
@EqualsAndHashCode
public abstract class ConcurrencySafeEntity extends AssertionConcern {

    /** 版本*/
    private Integer version;
    /** 创建时间*/
    private Date createdAt;
    /** 结束时间*/
    private Date updatedAt;
}
