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
package com.bugvm.apple.uikit;

/*<imports>*/

import com.bugvm.apple.coregraphics.CGPoint;
import com.bugvm.apple.coregraphics.CGRect;
import com.bugvm.apple.foundation.*;
import com.bugvm.objc.ObjCRuntime;
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
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWindow/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeDidBecomeVisible(final VoidBlock1<UIWindow> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeVisibleNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIWindow) a.getObject());
                }
            });
        }
        public static NSObject observeDidBecomeHidden(final VoidBlock1<UIWindow> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeHiddenNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIWindow) a.getObject());
                }
            });
        }
        public static NSObject observeDidBecomeKey(final VoidBlock1<UIWindow> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeKeyNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIWindow) a.getObject());
                }
            });
        }
        public static NSObject observeDidResignKey(final VoidBlock1<UIWindow> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidResignKeyNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIWindow) a.getObject());
                }
            });
        }
        public static NSObject observeKeyboardWillShow(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardWillShowNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
        public static NSObject observeKeyboardDidShow(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardDidShowNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
        public static NSObject observeKeyboardWillHide(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardWillHideNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
        public static NSObject observeKeyboardDidHide(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardDidHideNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeKeyboardWillChangeFrame(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardWillChangeFrameNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeKeyboardDidChangeFrame(final VoidBlock1<UIKeyboardAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(KeyboardDidChangeFrameNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke(new UIKeyboardAnimation(a.getUserInfo()));
                }
            });
        }
    }
    /*<ptr>*/public static class UIWindowPtr extends Ptr<UIWindow, UIWindowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWindow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIWindow() {}
    protected UIWindow(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    
    public UIWindow(CGRect frame) {
        super(frame);
    }
    
    /*<properties>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "screen")
    public native UIScreen getScreen();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "setScreen:")
    public native void setScreen(UIScreen v);
    @Property(selector = "windowLevel")
    public native @MachineSizedFloat double getWindowLevel();
    @Property(selector = "setWindowLevel:")
    public native void setWindowLevel(@MachineSizedFloat double v);
    @Property(selector = "isKeyWindow")
    public native boolean isKeyWindow();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "setRootViewController:")
    public native void setRootViewController(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIWindowDidBecomeVisibleNotification", optional=true)
    public static native NSString DidBecomeVisibleNotification();
    @GlobalValue(symbol="UIWindowDidBecomeHiddenNotification", optional=true)
    public static native NSString DidBecomeHiddenNotification();
    @GlobalValue(symbol="UIWindowDidBecomeKeyNotification", optional=true)
    public static native NSString DidBecomeKeyNotification();
    @GlobalValue(symbol="UIWindowDidResignKeyNotification", optional=true)
    public static native NSString DidResignKeyNotification();
    @GlobalValue(symbol="UIKeyboardWillShowNotification", optional=true)
    public static native NSString KeyboardWillShowNotification();
    @GlobalValue(symbol="UIKeyboardDidShowNotification", optional=true)
    public static native NSString KeyboardDidShowNotification();
    @GlobalValue(symbol="UIKeyboardWillHideNotification", optional=true)
    public static native NSString KeyboardWillHideNotification();
    @GlobalValue(symbol="UIKeyboardDidHideNotification", optional=true)
    public static native NSString KeyboardDidHideNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIKeyboardWillChangeFrameNotification", optional=true)
    public static native NSString KeyboardWillChangeFrameNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIKeyboardDidChangeFrameNotification", optional=true)
    public static native NSString KeyboardDidChangeFrameNotification();
    
    @Method(selector = "becomeKeyWindow")
    public native void becomeKeyWindow();
    @Method(selector = "resignKeyWindow")
    public native void resignKeyWindow();
    @Method(selector = "makeKeyWindow")
    public native void makeKeyWindow();
    @Method(selector = "makeKeyAndVisible")
    public native void makeKeyAndVisible();
    @Method(selector = "sendEvent:")
    public native void sendEvent(UIEvent event);
    @Method(selector = "convertPoint:toWindow:")
    public native @ByVal
    CGPoint convertPointToWindow(@ByVal CGPoint point, UIWindow window);
    @Method(selector = "convertPoint:fromWindow:")
    public native @ByVal CGPoint convertPointFromWindow(@ByVal CGPoint point, UIWindow window);
    @Method(selector = "convertRect:toWindow:")
    public native @ByVal CGRect convertRectToWindow(@ByVal CGRect rect, UIWindow window);
    @Method(selector = "convertRect:fromWindow:")
    public native @ByVal CGRect convertRectFromWindow(@ByVal CGRect rect, UIWindow window);
    /*</methods>*/
}