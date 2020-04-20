# org.domain.gogo

## Links

* [Source Code](https://github.com/myxzcompagny/max-min/org.domain.gogo) (clone with `scm:git:git@github.com:myxzcompagny/max-min.git/org.domain.gogo`)
* [Artifact(s)](https://www.myxzcompagny.com/repo)

## Coordinates

### Maven

```xml
<dependency>
    <groupId>org.domain</groupId>
    <artifactId>org.domain.gogo</artifactId>
    <version>1.0.0</version>
</dependency>
```

### OSGi

```
Bundle Symbolic Name: org.domain.gogo
Version             : 1.0.0
```

### Feature-Coordinate

```
"bundles": [
   {
    "id": "org.domain:org.domain.gogo:1.0.0"
   }
]
```

## Gogo Commands

### report:function1

**Synopsis**

`report:function1`

**Description**

Desciption of function1()

---

**Synopsis**

`report:function1 ARG`

**Description**

Desciption of function1(String)

**Arguments**

* `ARG`  ParameterDescription

---

**Synopsis**

`report:function1 ARG1 ARG2`

**Description**

Desciption of function(String,String)

**Arguments**

* `ARG1`  ParameterDescription x
* `ARG2`  ParameterDescriptiony

### report:function2

**Synopsis**

`report:function2`

### report:function3

**Synopsis**

`report:function3 [OPTIONS]`

**Description**

Desciption of function3

**Options**

* `--verbose, -v`  

### report:function4

**Synopsis**

`report:function4 [OPTIONS]`

**Description**

Desciption of function4

**Options**

* `--directory, -d`  

## Components

### org.domain.min.provider.MyComponent - *state = enabled, activation = immediate*

#### Services

No services.

#### Properties

|Name |Type |Value |
|--- |--- |--- |
|osgi.command.scope |String |"report" |
|osgi.command.function |String[] |["function1", "function2", "function3", "function4"] |

#### Configuration - *policy = optional*

##### Pid: `org.domain.min.provider.MyComponent`

No information available.

#### Reference bindings

No bindings.

#### OSGi-Configurator


```
/*
 * Component: org.domain.min.provider.MyComponent
 * policy:    optional
 */
"org.domain.min.provider.MyComponent":{
        //# Component properties
        /*
         * Type = String
         * Default = "report"
         */
         // "osgi.command.scope": null,

        /*
         * Type = String[]
         * Default = ["function1", "function2", "function3", "function4"]
         */
         // "osgi.command.function": null,


        //# Reference bindings
        // none

        //# ObjectClassDefinition - Attributes
        // (No PidOcd available.)
}
```

## Developers

* **Clement Delgrange** (cdelg) / [cde@domain.org](mailto:cde@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *developer*, *architect*
* **Sensum Abstulit** (sensum.abstulit@domain.org) / [pkt@domain.org](mailto:pkt@domain.org) @ [MyXZCompagny](https://www.myxzcompagny.com/) - *contributor*

## Licenses

**Apache License, Version 2.0**
  > Licensed under the Apache License, Version 2.0.  			You may not use this file except in compliance with the License. 			 Unless required by applicable law or agreed to in writing, 			  software distributed under the License is distributed on an AS IS BASIS, 			   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 			    See the License for the specific language governing permissions and limitations under the License.
  >
  > For more information see [https://www.apache.org/licenses/LICENSE-2.0.html](https://www.apache.org/licenses/LICENSE-2.0.html).