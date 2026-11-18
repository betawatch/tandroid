package org.telegram.utils.twidget;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
final class WidgetClientNative {
    public static native void arbiterCancel(long j3);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j3);

    public static native int arbiterDown(long j3, double d, double d2, double d10, boolean z10, boolean z11, boolean z12, boolean z13, int i7);

    public static native double arbiterHoldDeadline(long j3);

    public static native int arbiterMove(long j3, double d, double d2, double d10);

    public static native int arbiterTick(long j3, double d);

    public static native int arbiterUp(long j3, double d, double d2, double d10);

    public static native void filterPixels(Bitmap bitmap, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr2, float f10);
}
