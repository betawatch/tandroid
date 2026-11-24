// default package

import java.io.Closeable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yr9 implements b36, Closeable {
    public final String a;
    public final xr9 b;
    public boolean c;

    public yr9(String str, xr9 xr9Var) {
        this.a = str;
        this.b = xr9Var;
    }

    public final void a(op opVar, w26 w26Var) {
        opVar.getClass();
        w26Var.getClass();
        if (this.c) {
            dq9.m("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        w26Var.a(this);
        opVar.f(this.a, this.b.e);
    }

    @Override // b36
    public final void b(e36 e36Var, u26 u26Var) {
        if (u26Var == u26.ON_DESTROY) {
            this.c = false;
            e36Var.m().b(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
