/**
 * 
 */
package com.ado.core.services.component;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Anand
 *
 */
@Repository
@Transactional
public abstract class GenericCRUDComponentImpl<Entity extends Serializable, ID extends Serializable>
		implements GenericCRUDComponent<Entity, ID> {

}
