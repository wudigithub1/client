/*
 * Copyright (c) 2006-2009 Chris Smith, Shane Mc Cormack, Gregory Holmes
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.dmdirc.addons.userlevel;

import com.dmdirc.actions.interfaces.ActionComponent;
import com.dmdirc.parser.irc.ChannelClientInfo;

/**
 * Action component to retrieve a channel client's access level.
 * 
 * @author chris
 */
public class ChannelAccessLevelComponent implements ActionComponent {

    /** {@inheritDoc} */
    @Override
    public Object get(final Object argument) {
        final ChannelClientInfo ci = (ChannelClientInfo) argument;
        
        UserLevelPlugin.doChannelLevel(ci);
        
        if (ci.getMap().containsKey("level")) {
            return ci.getMap().get("level");
        } else {
            return ci.getClient().getMap().get("level");
        }
    }

    /** {@inheritDoc} */
    @Override    
    public Class appliesTo() {
        return ChannelClientInfo.class;
    }

    /** {@inheritDoc} */
    @Override    
    public Class getType() {
        return Integer.class;
    }

    /** {@inheritDoc} */
    @Override    
    public String getName() {
        return "channel access level";
    }

}
