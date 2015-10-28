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
package com.bugvm.apple.photos;

/*<imports>*/

import com.bugvm.apple.avfoundation.AVAsset;
import com.bugvm.apple.avfoundation.AVAssetExportSession;
import com.bugvm.apple.avfoundation.AVAudioMix;
import com.bugvm.apple.avfoundation.AVPlayerItem;
import com.bugvm.apple.coregraphics.CGSize;
import com.bugvm.apple.foundation.NSData;
import com.bugvm.apple.foundation.NSDictionary;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.apple.foundation.NSString;
import com.bugvm.apple.uikit.UIImage;
import com.bugvm.apple.uikit.UIImageOrientation;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.block.VoidBlock2;
import com.bugvm.objc.block.VoidBlock3;
import com.bugvm.objc.block.VoidBlock4;
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
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHImageManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHImageManagerPtr extends Ptr<PHImageManager, PHImageManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHImageManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHImageManager() {}
    protected PHImageManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="PHInvalidImageRequestID", optional=true)
    public static native int getInvalidImageRequestID();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="PHImageManagerMaximumSize", optional=true)
    public static native @ByVal
    CGSize getMaximumSize();
    
    @WeaklyLinked
    @Method(selector = "requestImageForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestImageForAsset(PHAsset asset, @ByVal CGSize targetSize, PHImageContentMode contentMode, PHImageRequestOptions options, @Block VoidBlock2<UIImage, NSDictionary<NSString, NSObject>> resultHandler);
    @WeaklyLinked
    @Method(selector = "requestImageDataForAsset:options:resultHandler:")
    public native int requestImageDataForAsset(PHAsset asset, PHImageRequestOptions options, @Block VoidBlock4<NSData, String, UIImageOrientation, NSDictionary<NSString, NSObject>> resultHandler);
    @Method(selector = "cancelImageRequest:")
    public native void cancelImageRequest(int requestID);
    @WeaklyLinked
    @Method(selector = "requestPlayerItemForVideo:options:resultHandler:")
    public native int requestPlayerItemForVideo(PHAsset asset, PHVideoRequestOptions options, @Block VoidBlock2<AVPlayerItem, NSDictionary<NSString, NSObject>> resultHandler);
    @WeaklyLinked
    @Method(selector = "requestExportSessionForVideo:options:exportPreset:resultHandler:")
    public native int requestExportSessionForVideo(PHAsset asset, PHVideoRequestOptions options, String exportPreset, @Block VoidBlock2<AVAssetExportSession, NSDictionary<NSString, NSObject>> resultHandler);
    @WeaklyLinked
    @Method(selector = "requestAVAssetForVideo:options:resultHandler:")
    public native int requestAVAssetForVideo(PHAsset asset, PHVideoRequestOptions options, @Block VoidBlock3<AVAsset, AVAudioMix, NSDictionary<NSString, NSObject>> resultHandler);
    @Method(selector = "defaultManager")
    public static native PHImageManager getDefaultManager();
    /*</methods>*/
}