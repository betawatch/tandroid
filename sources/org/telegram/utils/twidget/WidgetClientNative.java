package org.telegram.utils.twidget;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
final class WidgetClientNative {
    public static native void arbiterCancel(long j3);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j3);

    public static native int arbiterDown(long j3, double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7);

    public static native double arbiterHoldDeadline(long j3);

    public static native int arbiterMove(long j3, double d, double d2, double d10);

    public static native int arbiterTick(long j3, double d);

    public static native int arbiterUp(long j3, double d, double d2, double d10);

    public static native void filterPixels(Bitmap bitmap, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr2, float f10);
}
