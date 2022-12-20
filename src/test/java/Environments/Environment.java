package Environments;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"file:${user.dir}/src/test/java/Environments/${env}.properties",
	"file:${user.dir}/src/test/java/Environments/dev.properties"
    })
public interface Environment extends Config  {
	@Key("target")
	 String gettarget();
	
	@Key("url.base")
	 String geturlBase();
	
	@Key("grid.url")
	 String getgridurl();
	
	@Key("grid.port")
	 String getgridport();
}
