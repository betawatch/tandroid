package org.telegram.utils.twidget;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class e0 {
    public long a;

    public final void a() {
        long j3 = this.a;
        if (j3 != 0) {
            WidgetClientNative.arbiterCancel(j3);
        }
    }

    public final int b(double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7) {
        if (this.a == 0) {
            this.a = WidgetClientNative.arbiterCreate();
        }
        return WidgetClientNative.arbiterDown(this.a, d, d2, d10, z9, z10, z11, z12, i7);
    }

    public final double c() {
        long j3 = this.a;
        if (j3 == 0) {
            return -1.0d;
        }
        return WidgetClientNative.arbiterHoldDeadline(j3);
    }

    public final int d(double d, double d2, double d10) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterMove(j3, d, d2, d10);
    }

    public final void e() {
        long j3 = this.a;
        if (j3 == 0) {
            return;
        }
        WidgetClientNative.arbiterDestroy(j3);
        this.a = 0L;
    }

    public final int f(double d) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterTick(j3, d);
    }

    public final int g(double d, double d2, double d10) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterUp(j3, d, d2, d10);
    }
}
