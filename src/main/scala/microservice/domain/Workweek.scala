package microservice.domain

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity
import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty
//
//@Entity
//class Workweek {
//
//  @Id
//  @GeneratedValue
//  @BeanProperty
//  var id: Long = _
//
//  @BeanProperty
//  @NotEmpty
//  var name: String = _
//
//  @BeanProperty
//  @NotEmpty
//  var address: String = _
//
//  @BeanProperty
//  @NotEmpty
//  var zip: String = _
//}
//insert into workweek(id, year, week, day) values ('1993-11-21', '1993', '48', '1');
@Entity
class Workweek {

  @Id
  @BeanProperty
  var id: String = _

  @BeanProperty
  @NotEmpty
  var year: String = _

  @BeanProperty
  @NotEmpty
  var week: String = _

  @BeanProperty
  @NotEmpty
  var day: String = _
}