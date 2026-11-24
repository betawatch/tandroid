package org.telegram.utils.twidget;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
final class WidgetClientNative {
    public static native void arbiterCancel(long j);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j);

    public static native int arbiterDown(long j, double d, double d2, double d3, boolean z, boolean z2, boolean z3, boolean z4, int i);

    public static native double arbiterHoldDeadline(long j);

    public static native int arbiterMove(long j, double d, double d2, double d3);

    public static native int arbiterTick(long j, double d);

    public static native int arbiterUp(long j, double d, double d2, double d3);

    public static native void filterPixels(Bitmap bitmap, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr2, float f);

    public static native byte[] statPath(String str, int i, int i2, int i3, int[] iArr);
}
