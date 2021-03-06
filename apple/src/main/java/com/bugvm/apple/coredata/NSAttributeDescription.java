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
package com.bugvm.apple.coredata;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributeDescription/*</name>*/ 
    extends /*<extends>*/NSPropertyDescription/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSAttributeDescriptionPtr extends Ptr<NSAttributeDescription, NSAttributeDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSAttributeDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSAttributeDescription() {}
    protected NSAttributeDescription(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attributeType")
    public native NSAttributeType getAttributeType();
    @Property(selector = "setAttributeType:")
    public native void setAttributeType(NSAttributeType v);
    @Property(selector = "attributeValueClassName")
    public native String getAttributeValueClassName();
    @Property(selector = "setAttributeValueClassName:")
    public native void setAttributeValueClassName(String v);
    @Property(selector = "defaultValue")
    public native NSObject getDefaultValue();
    @Property(selector = "setDefaultValue:")
    public native void setDefaultValue(NSObject v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "versionHash")
    public native NSData getVersionHash();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "valueTransformerName")
    public native String getValueTransformerName();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "setValueTransformerName:")
    public native void setValueTransformerName(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "allowsExternalBinaryDataStorage")
    public native boolean allowsExternalBinaryDataStorage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setAllowsExternalBinaryDataStorage:")
    public native void setAllowsExternalBinaryDataStorage(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
