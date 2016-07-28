/**
 * 
 */
package com.ado.core.services.component;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.ado.core.services.exception.ServiceException;

/**
 * @author Anand
 *
 */
public interface GenericCRUDComponent <Entity extends Serializable,ID extends Serializable>{
	
	/**
	 * @param id
	 * @return Entity
	 * @throws ServiceException
	 */
	@Transactional
	Entity get(ID id) throws ServiceException;
}
