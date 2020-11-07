/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2020 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.container.wildfly;

import org.codehaus.cargo.container.configuration.RuntimeConfiguration;

/**
 * Special container support for wrapping a running instance of WildFly 21.x.
 */
public class WildFly21xRemoteContainer extends WildFly20xRemoteContainer
{
    /**
     * Unique container id.
     */
    public static final String ID = "wildfly21x";

    /**
     * {@inheritDoc}
     * @see WildFly20xRemoteContainer#WildFly20xRemoteContainer(org.codehaus.cargo.container.configuration.RuntimeConfiguration)
     */
    public WildFly21xRemoteContainer(RuntimeConfiguration configuration)
    {
        super(configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName()
    {
        return "WildFly 21.x Remote";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId()
    {
        return ID;
    }
}