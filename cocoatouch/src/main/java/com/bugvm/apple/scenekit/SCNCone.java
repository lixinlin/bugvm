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
package com.bugvm.apple.scenekit;

/*<imports>*/

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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNCone/*</name>*/ 
    extends /*<extends>*/SCNGeometry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNConePtr extends Ptr<SCNCone, SCNConePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNCone.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNCone() {}
    protected SCNCone(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "topRadius")
    public native @MachineSizedFloat double getTopRadius();
    @Property(selector = "setTopRadius:")
    public native void setTopRadius(@MachineSizedFloat double v);
    @Property(selector = "bottomRadius")
    public native @MachineSizedFloat double getBottomRadius();
    @Property(selector = "setBottomRadius:")
    public native void setBottomRadius(@MachineSizedFloat double v);
    @Property(selector = "height")
    public native @MachineSizedFloat double getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(@MachineSizedFloat double v);
    @Property(selector = "radialSegmentCount")
    public native @MachineSizedSInt long getRadialSegmentCount();
    @Property(selector = "setRadialSegmentCount:")
    public native void setRadialSegmentCount(@MachineSizedSInt long v);
    @Property(selector = "heightSegmentCount")
    public native @MachineSizedSInt long getHeightSegmentCount();
    @Property(selector = "setHeightSegmentCount:")
    public native void setHeightSegmentCount(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "coneWithTopRadius:bottomRadius:height:")
    public static native SCNCone create(@MachineSizedFloat double topRadius, @MachineSizedFloat double bottomRadius, @MachineSizedFloat double height);
    /*</methods>*/
}