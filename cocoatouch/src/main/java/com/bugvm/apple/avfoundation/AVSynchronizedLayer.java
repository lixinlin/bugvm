/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package com.bugvm.apple.avfoundation;

/*<imports>*/

import com.bugvm.apple.coreanimation.CALayer;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass
@WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSynchronizedLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSynchronizedLayerPtr extends Ptr<AVSynchronizedLayer, AVSynchronizedLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSynchronizedLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSynchronizedLayer() {}
    protected AVSynchronizedLayer(SkipInit skipInit) { super(skipInit); }
    public AVSynchronizedLayer(AVPlayerItem playerItem) { super(create(playerItem)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "playerItem")
    public native AVPlayerItem getPlayerItem();
    @Property(selector = "setPlayerItem:")
    public native void setPlayerItem(AVPlayerItem v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "synchronizedLayerWithPlayerItem:")
    protected static native @Pointer long create(AVPlayerItem playerItem);
    /*</methods>*/
}