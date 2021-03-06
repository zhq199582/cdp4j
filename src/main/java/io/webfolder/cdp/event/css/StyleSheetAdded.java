/**
 * cdp4j - Chrome DevTools Protocol for Java
 * Copyright © 2017, 2018 WebFolder OÜ (support@webfolder.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.webfolder.cdp.event.css;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.css.CSSStyleSheetHeader;

/**
 * Fired whenever an active document stylesheet is added
 */
@Domain("CSS")
@EventName("styleSheetAdded")
public class StyleSheetAdded {
    private CSSStyleSheetHeader header;

    /**
     * Added stylesheet metainfo.
     */
    public CSSStyleSheetHeader getHeader() {
        return header;
    }

    /**
     * Added stylesheet metainfo.
     */
    public void setHeader(CSSStyleSheetHeader header) {
        this.header = header;
    }
}
