package org.domain.min.provider;

import org.apache.felix.service.command.Descriptor;
import org.apache.felix.service.command.Parameter;
import org.osgi.service.component.annotations.Component;

@GogoCommand(scope = "report", function = { "function1", "function2", "function3" })
@Component
public class CommandComponent
{

    @Descriptor("Desciption of function1()")

    protected void function1()
    {
        // Nothing
    }

    @Descriptor("Desciption of function1(String)")

    protected void function1(@Descriptor("ParameterDescription") String x)
    {
        // Nothing
    }

    @Descriptor("Desciption of function(String,String)")

    protected void function1(@Descriptor("ParameterDescription x") String x,
        @Descriptor("ParameterDescription y") String y)
    {
        // Nothing
    }

    protected void function2()
    {
        // Nothing
    }

    @Descriptor("Desciption of function3")
    protected void function3(@Parameter(names = { "--verbose",
    "-v" }, absentValue = "false", presentValue = "true") String x)
    {
        // Nothing
    }

}
