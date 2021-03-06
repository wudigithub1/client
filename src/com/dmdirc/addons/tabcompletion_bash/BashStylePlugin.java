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

package com.dmdirc.addons.tabcompletion_bash;

import com.dmdirc.plugins.Plugin;
import com.dmdirc.ui.input.TabCompleter;
import com.dmdirc.ui.input.tabstyles.TabCompletionStyle;
import com.dmdirc.ui.interfaces.InputWindow;

public class BashStylePlugin extends Plugin {
    
    /** {@inheritDoc} */
    @Override
    public void onLoad() {
        // Do nothing
    }

    /** {@inheritDoc} */
    @Override
    public void onUnload() {
        // Do nothing
    }

    /**
     * Retrieves a new instance of the Bash tab completion style.
     * 
     * @param completer The tab completer the instance is for
     * @param window The window the instance is for
     * @return A relevant TabCompletionStyle
     */
    public TabCompletionStyle getCompletionStyle(final TabCompleter completer,
            final InputWindow window) {
        return new BashStyle(completer, window);
    }
    
}