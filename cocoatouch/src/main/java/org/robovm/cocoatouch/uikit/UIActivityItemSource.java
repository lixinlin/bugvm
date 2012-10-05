/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIActivityItemSource_protocol/Reference/Reference.html">UIActivityItemSource Protocol Reference</a>
 *   @since Available in iOS 6.0 and later.
 * </div>
 */
@Protocol
public interface /*<name>*/ UIActivityItemSource /*</name>*/ /*<implements>*/ /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIActivityItemSource_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewController:itemForActivityType:">- (id)activityViewController:(UIActivityViewController *)activityViewController itemForActivityType:(NSString *)activityType</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("activityViewController:itemForActivityType:") @Type("id") NSObject getItem(@Type("UIActivityViewController *") UIActivityViewController activityViewController, @Type("NSString *") String activityType);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIActivityItemSource_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewControllerPlaceholderItem:">- (id)activityViewControllerPlaceholderItem:(UIActivityViewController *)activityViewController</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("activityViewControllerPlaceholderItem:") @Type("id") NSObject getPlaceholderItem(@Type("UIActivityViewController *") UIActivityViewController activityViewController);
    /*</methods>*/

}
