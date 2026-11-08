package org.telegram.utils.twidget;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class e0 {
    public long a;

    public final void a() {
        long j3 = this.a;
        if (j3 != 0) {
            WidgetSandboxNative.arbiterCancel(j3);
        }
    }

    public final int b(double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7) {
        if (this.a == 0) {
            this.a = WidgetSandboxNative.arbiterCreate();
        }
        return WidgetSandboxNative.arbiterDown(this.a, d, d2, d10, z9, z10, z11, z12, i7);
    }

    public final double c() {
        long j3 = this.a;
        if (j3 == 0) {
            return -1.0d;
        }
        return WidgetSandboxNative.arbiterHoldDeadline(j3);
    }

    public final int d(double d, double d2, double d10) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterMove(j3, d, d2, d10);
    }

    public final void e() {
        long j3 = this.a;
        if (j3 == 0) {
            return;
        }
        WidgetSandboxNative.arbiterDestroy(j3);
        this.a = 0L;
    }

    public final int f(double d) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterTick(j3, d);
    }

    public final int g(double d, double d2, double d10) {
        long j3 = this.a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterUp(j3, d, d2, d10);
    }
}
