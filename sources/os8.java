// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class os8 implements mz4, wy4 {
    public final ll0 a;

    public os8(ll0 ll0Var) {
        this.a = ll0Var;
    }

    @Override // wy4
    public final int a() {
        return ((wy4) b()).a();
    }

    public final mz4 b() {
        lz4 f = vy4.f();
        boolean z = f.a;
        ll0 ll0Var = this.a;
        return !z ? ll0Var.c : (!f.b || Build.VERSION.SDK_INT < 33) ? ll0Var.b : ll0Var.a;
    }

    @Override // wy4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((wy4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override // mz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override // wy4
    public final int f() {
        return ((wy4) b()).f();
    }

    @Override // wy4
    public final int g() {
        return ((wy4) b()).g();
    }

    @Override // wy4
    public final boolean h() {
        mz4 b = b();
        return (b instanceof wy4) && ((wy4) b).h();
    }
}
