# Max One Provider

Ibi victu recreati et quiete, postquam abierat timor, vicos opulentos adorti equestrium  adventu cohortium, quae casu propinquabant, nec resistere planitie porrecta  conati digressi sunt retroque concedentes omne iuventutis robur relictum in sedibus acciverunt.

## Documentation

Visit [https://github.com/myxzcompagny/max-min/tree/master/max-min/org.domain.max/org.domain.max.one.provider](https://github.com/myxzcompagny/max-min/tree/master/max-min/org.domain.max/org.domain.max.one.provider).

## Source Repository

**Browse**: [https://github.com/myxzcompagny/max-min/org.domain.max/org.domain.max.one.provider](https://github.com/myxzcompagny/max-min/org.domain.max/org.domain.max.one.provider).

**Clone**: [scm:git:git@github.com:myxzcompagny/max-min.git/org.domain.max/org.domain.max.one.provider](scm:git:git@github.com:myxzcompagny/max-min.git/org.domain.max/org.domain.max.one.provider).

## Artifact Repository

Visit [https://www.myxzcompagny.com/repo](https://www.myxzcompagny.com/repo).

## Coordinates

### Maven

```xml
<dependency>
    <groupId>org.domain</groupId>
    <artifactId>org.domain.max.one.provider</artifactId>
    <version>1.0.0</version>
</dependency>
```

### OSGi

```
Bundle Symbolic Name: org.domain.max.one.provider
Version             : 1.0.0
```





## Components

### org.domain.max.two.provider.MyOtherServiceImpl2 - `enabled`, `activation = delayed`

#### Services - `scope = singleton`

|Interface name |
|--- |
| org.max.api.MyService |

#### Properties

No properties.

#### Configuration

No configuration.

---

### org.domain.max.one.basic - `enabled`, `activation = immediate`

#### Services - `scope = singleton`

|Interface name |
|--- |
| org.max.api.MyService |

#### Properties

No properties.

#### Configuration - `policy = optional`

##### Factory pid: `org.domain.max.one.basic`

|Id |`prop1` |
|--- |--- |
| Required | **true** |
| Type | **Integer** |
| Default | 4 |
| Value restriction | `min = 0` / `max = 45` |

|Id |`prop2` |
|--- |--- |
| Required | **false** |
| Type | **String** |

|Id |`prop3` |
|--- |--- |
| Required | **true** |
| Type | **String** |
| Description | Et est admodum mirum videre plebem innumeram mentibus ardore quodam infuso cum dimicationum |
| Value restriction | "ONE", "TWO" |



---

### org.domain.max.one.provider.MyServiceImpl - `not enabled`, `activation = delayed`

#### Services - `scope = singleton`

|Interface name |
|--- |
| org.max.api.MyService |

#### Properties

No properties.

#### Configuration - `factory`

* **facory name**: `org.domain.max.one.provider.factory`

---

### org.domain.max.two.provider.MyOtherServiceImpl - `enabled`, `activation = delayed`

#### Services - `scope = singleton`

|Interface name |
|--- |
| org.max.api.MyService |

#### Properties

No properties.

#### Configuration - `policy = optional`

##### Pid: `org.domain.max.two.provider.MyOtherServiceImpl`

|Id |`prop1` |
|--- |--- |
| Required | **true** |
| Type | **String** |



## Developers


* **Clement Delgrange** (cdelg) / [cde@domain.org](mailto:cde@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *developer*, *architect*
* **Sensum Abstulit** (sensum.abstulit@domain.org) / [pkt@domain.org](mailto:pkt@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *contributor*

## Licenses


**Apache License, Version 2.0**
  > Licensed under the Apache License, Version 2.0.  			You may not use this file except in compliance with the License. 			 Unless required by applicable law or agreed to in writing, 			  software distributed under the License is distributed on an AS IS BASIS, 			   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 			    See the License for the specific language governing permissions and limitations under the License.
  >
  > For more information see [https://www.apache.org/licenses/LICENSE-2.0.html](https://www.apache.org/licenses/LICENSE-2.0.html).





---
MyXZCompagny - [https://www.myxzcompagny.com/](https://www.myxzcompagny.com/)
