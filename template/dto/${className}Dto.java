<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dto;

/**
 * @author
 * @date ${now?string("yyyy-MM-dd")}
 * @version 1.0
 */
public class ${className}Dto  {
<#list table.columns as field>
    /** ${field.remarks} */
    private ${field.javaType} ${field.sqlName};

</#list>

<#list table.columns as field>
    public ${field.javaType} get${field.sqlName?cap_first}(){
        return  this.${field.sqlName};
        }

    public void set${field.sqlName?cap_first}(${field.javaType} ${field.sqlName}){
        this.${field.sqlName} = ${field.sqlName};
        }

</#list>
}
