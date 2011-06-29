/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.binding;

import org.hibernate.metamodel.MetadataSources;
import org.hibernate.metamodel.source.internal.MetadataImpl;

/**
 * Basic tests of {@code hbm.xml} binding code
 *
 * @author Steve Ebersole
 */
public class BasicHbmBindingTests extends AbstractBasicBindingTests {
	public MetadataImpl addSourcesForSimpleEntityBinding(MetadataSources sources) {
		sources.addResource( "org/hibernate/metamodel/binding/SimpleEntity.hbm.xml" );
		return (MetadataImpl) sources.buildMetadata();
	}

	public MetadataImpl addSourcesForSimpleVersionedEntityBinding(MetadataSources sources) {
		sources.addResource( "org/hibernate/metamodel/binding/SimpleVersionedEntity.hbm.xml" );
		return (MetadataImpl) sources.buildMetadata();
	}

	public MetadataImpl addSourcesForManyToOne(MetadataSources sources) {
		sources.addResource( "org/hibernate/metamodel/binding/ManyToOneEntity.hbm.xml" );
		sources.addResource( "org/hibernate/metamodel/binding/SimpleEntity.hbm.xml" );
		return (MetadataImpl) sources.buildMetadata();
	}
}