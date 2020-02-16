/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newQualifies;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author Mobile Apps
 */

@Retention(RUNTIME)
@Target({FIELD, PARAMETER, METHOD, TYPE})
@Qualifier
public @interface OnlineServiceQuery {

}
