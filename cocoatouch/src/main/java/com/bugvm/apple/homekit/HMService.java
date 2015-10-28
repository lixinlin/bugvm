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
package com.bugvm.apple.homekit;

/*<imports>*/

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.apple.foundation.NSUUID;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
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
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMServicePtr extends Ptr<HMService, HMServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMService() {}
    protected HMService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessory")
    public native HMAccessory getAccessory();
    @Property(selector = "serviceType")
    public native HMServiceType getServiceType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "associatedServiceType")
    public native HMServiceType getAssociatedServiceType();
    @Property(selector = "characteristics")
    public native NSArray<HMCharacteristic> getCharacteristics();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isUserInteractive")
    public native boolean isUserInteractive();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updateAssociatedServiceType:completionHandler:")
    public native void updateAssociatedServiceType(HMServiceType serviceType, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}