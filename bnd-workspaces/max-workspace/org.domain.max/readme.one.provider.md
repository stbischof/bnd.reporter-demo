# Max One Provider

Ibi victu recreati et quiete,postquam abierat timor,vicos opulentos adorti equestriumadventu cohortium,quae casu propinquabant,nec resistere planitie porrecta conati digressi sunt retroque concedentes omne iuventutis robur relictum in sedibus acciverunt.

## Links

* [Documentation](https://github.com/myxzcompagny/max-min/tree/master/max-min)
* [Source Code](https://github.com/myxzcompagny/max-min) (clone with `scm:git:git@github.com:myxzcompagny/max-min.git`)
* [Artifact(s)](https://www.myxzcompagny.com/repo)

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
Version             : 1.0.0.202003231845
```

## Components

### org.domain.max.one.basic - *state = enabled, activation = immediate*

#### Services - *scope = singleton*

|Interface name |
|--- |
|org.domain.max.api.MyService |

#### Properties

No properties.

#### Configuration - *policy = optional*

##### Factory Pid: `org.domain.max.one.basic`

|Attribute |Value |
|--- |--- |
|Id |`prop1` |
|Required |**true** |
|Type |**Integer** |
|Default |4 |
|Value range |`max = 45` |

|Attribute |Value |
|--- |--- |
|Id |`prop2` |
|Required |**false** |
|Type |**String** |

|Attribute |Value |
|--- |--- |
|Id |`prop3` |
|Required |**true** |
|Type |**String** |
|Description |Et est admodum mirum videre plebem innumeram mentibus ardore quodam infuso cum dimicationum |
|Value range |"ONE", "TWO" |

---

### org.domain.max.one.provider.MyServiceImpl - *state = not enabled, activation = delayed*

#### Services - *scope = singleton*

|Interface name |
|--- |
|org.domain.max.api.MyService |

#### Properties

No properties.

#### Configuration - *factory*

Factory name: `org.domain.max.one.provider.factory`

## Developers

* **Clement Delgrange** (cdelg) / [cde@domain.org](mailto:cde@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *developer*, *architect*
* **Sensum Abstulit** / [sensum.abstulit@domain.org](mailto:sensum.abstulit@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *contributor*
* **Caput Enim** / [caput.enim@domain.org](mailto:caput.enim@domain.org)

## Licenses

**Apache License, Version 2.0**
  > Licensed under the Apache License, Version 2.0. You may not use this file except in compliance with the License. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an AS IS BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
  >
  > For more information see [https://www.apache.org/licenses/LICENSE-2.0.html](https://www.apache.org/licenses/LICENSE-2.0.html).

## Copyright

MyXZCompagny 2018

---
MyXZCompagny - [https://www.myxzcompagny.com/](https://www.myxzcompagny.com/)