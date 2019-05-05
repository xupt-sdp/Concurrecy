package com.sdp.Concurrecy.practiceConcurrecy.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:ThreadSafe
 * Package:com.sdp.Concurrecy.practiceConcurrecy.Annotations
 * Description:Everything Is
 * Possible!
 *
 * @Date:2019/5/5 22:05
 * @Author:"15029155474@163.com"
 */

/**
 *
 * 注解在不推荐的类写法上面
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface UnRecommend {
}
