/**
 *        __       __               __ 
 *   ____/ /_ ____/ /______ _ ___  / /_
 *  / __  / / ___/ __/ ___/ / __ `/ __/
 * / /_/ / (__  ) / / /  / / /_/ / / 
 * \__,_/_/____/_/ /_/  /_/\__, /_/ 
 *                           / / 
 *                           \/ 
 * http://distriqt.com
 *
 * @file   		IEventDispatcher.java
 * @brief  		
 * @author 		"Michael Archbold (ma&#64;distriqt.com)"
 * @created		03/07/2015
 */
package com.distriqt.extension.memory.util;

public interface IEventDispatcher
{
	
	void dispatchEvent( String code, String data );
	
}
