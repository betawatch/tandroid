package org.telegram.utils.twidget;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
