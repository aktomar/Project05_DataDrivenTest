package DataDriven_UtilitiesFiles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DataDriven_Testcases.BaseClass;

public class Logs {

	public static final Logger logger = LogManager.getLogger(BaseClass.class);

	public static void info(String messsage) {

		logger.info(messsage);
	}

	public static void warn(String messsage) {

		logger.info(messsage);
	}

	public static void error(String messsage) {

		logger.info(messsage);
	}

	public static void debug(String messsage) {

		logger.info(messsage);
	}
}
