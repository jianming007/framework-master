package top.zhacker.core.model;

import java.util.Date;

import lombok.Getter;


/**
 * 领域事件抽象类
 * Created by zhacker.
 * Time 2018/6/30 下午5:09
 */
public abstract class BaseDomainEvent implements DomainEvent {

  /** 事件版本*/
  @Getter
  protected int eventVersion = 1;
  /** 事件时间*/
  @Getter
  protected Date OccurredOn = new Date();
}
