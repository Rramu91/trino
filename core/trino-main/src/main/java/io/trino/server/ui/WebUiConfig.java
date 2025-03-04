/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.server.ui;

import io.airlift.configuration.Config;

import javax.validation.constraints.Min;

public class WebUiConfig
{
    private boolean enabled = true;
    private int queryMaxDisplayLength = 10000;

    public boolean isEnabled()
    {
        return enabled;
    }

    @Config("web-ui.enabled")
    public WebUiConfig setEnabled(boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    @Config("web-ui.query.max-display-length")
    public FormWebUiConfig setQueryMaxDisplayLength(int queryMaxDisplayLength)
    {
        this.queryMaxDisplayLength = queryMaxDisplayLength;
        return this;
    }

    @Min(10)
    public int getQueryMaxDisplayLength()
    {
        return queryMaxDisplayLength;
    }
}
