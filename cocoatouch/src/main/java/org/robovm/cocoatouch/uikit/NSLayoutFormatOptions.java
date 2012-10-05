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


public enum NSLayoutFormatOptions {
    AlignAllLeft(NSLayoutAttribute.Left.value()),
    AlignAllRight(NSLayoutAttribute.Right.value()),
    AlignAllTop(NSLayoutAttribute.Top.value()),
    AlignAllBottom(NSLayoutAttribute.Bottom.value()),
    AlignAllLeading(NSLayoutAttribute.Leading.value()),
    AlignAllTrailing(NSLayoutAttribute.Trailing.value()),
    AlignAllCenterX(NSLayoutAttribute.CenterX.value()),
    AlignAllCenterY(NSLayoutAttribute.CenterY.value()),
    AlignAllBaseline(NSLayoutAttribute.Baseline.value()),
    AlignmentMask(0xFF),
    DirectionLeadingToTrailing(0 << 8),
    DirectionLeftToRight(1 << 8),
    DirectionRightToLeft(2 << 8),
    DirectionMask(0x3 << 8);

    private final int n;

    private NSLayoutFormatOptions(int n) { this.n = n; }
    public int value() { return n; }
    public static NSLayoutFormatOptions fromValue(int n) {
        for (NSLayoutFormatOptions v : values()) {
            if (n == v.value()) {
                return v;
            }
        }
        throw new IllegalArgumentException("Unknown NSLayoutFormatOptions value: " + n);
    }
}
