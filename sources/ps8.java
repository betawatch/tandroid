// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ps8 extends tm4 {
    public final gp9 b;
    public final yn3 c;
    public final AtomicBoolean d;

    public ps8(gp9 gp9Var) {
        super(gp9Var);
        this.b = gp9Var;
        this.c = new yn3();
        this.d = new AtomicBoolean(false);
    }

    @Override // tm4, wxb
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        h().a(j, i, i2, i3, vxbVar);
    }

    @Override // tm4, wxb
    public final void b(xu7 xu7Var, int i, int i2) {
        h().b(xu7Var, i, i2);
    }

    @Override // tm4, wxb
    public final int c(g63 g63Var, int i, boolean z) {
        return h().c(g63Var, i, z);
    }

    @Override // tm4, wxb
    public final void e(int i, xu7 xu7Var) {
        h().e(i, xu7Var);
    }

    @Override // tm4, wxb
    public final int f(g63 g63Var, int i, boolean z) {
        return h().f(g63Var, i, z);
    }

    public final wxb h() {
        return this.d.get() ? this.c : this.b;
    }
}
