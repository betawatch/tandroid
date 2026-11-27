// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yv8 extends yo4 {
    public final ys9 b;
    public final po3 c;
    public final AtomicBoolean d;

    public yv8(ys9 ys9Var) {
        super(ys9Var);
        this.b = ys9Var;
        this.c = new po3();
        this.d = new AtomicBoolean(false);
    }

    @Override // yo4, x1c
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        h().a(j, i, i2, i3, w1cVar);
    }

    @Override // yo4, x1c
    public final void b(ey7 ey7Var, int i, int i2) {
        h().b(ey7Var, i, i2);
    }

    @Override // yo4, x1c
    public final int c(z63 z63Var, int i, boolean z) {
        return h().c(z63Var, i, z);
    }

    @Override // yo4, x1c
    public final void e(int i, ey7 ey7Var) {
        h().e(i, ey7Var);
    }

    @Override // yo4, x1c
    public final int f(z63 z63Var, int i, boolean z) {
        return h().f(z63Var, i, z);
    }

    public final x1c h() {
        return this.d.get() ? this.c : this.b;
    }
}
