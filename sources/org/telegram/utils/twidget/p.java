package org.telegram.utils.twidget;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class p {
    public long a;

    public final void a() {
        long j = this.a;
        if (j != 0) {
            WidgetClientNative.arbiterCancel(j);
        }
    }

    public final int b(double d, double d2, double d3, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        long j = this.a;
        if (j == 0) {
            j = WidgetClientNative.arbiterCreate();
            this.a = j;
        }
        return WidgetClientNative.arbiterDown(j, d, d2, d3, z, z2, z3, z4, i);
    }

    public final double c() {
        long j = this.a;
        if (j == 0) {
            return -1.0d;
        }
        return WidgetClientNative.arbiterHoldDeadline(j);
    }

    public final int d(double d, double d2, double d3) {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterMove(j, d, d2, d3);
    }

    public final void e() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        WidgetClientNative.arbiterDestroy(j);
        this.a = 0L;
    }

    public final int f(double d) {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterTick(j, d);
    }

    public final int g(double d, double d2, double d3) {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterUp(j, d, d2, d3);
    }
}
