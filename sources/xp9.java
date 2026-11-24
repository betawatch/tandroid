// default package

import java.io.Closeable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xp9 implements b16, Closeable {
    public final String a;
    public final wp9 b;
    public boolean c;

    public xp9(String str, wp9 wp9Var) {
        this.a = str;
        this.b = wp9Var;
    }

    public final void a(oo ooVar, w06 w06Var) {
        ooVar.getClass();
        w06Var.getClass();
        if (this.c) {
            sc8.j("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        w06Var.a(this);
        ooVar.f(this.a, this.b.e);
    }

    @Override // b16
    public final void b(e16 e16Var, u06 u06Var) {
        if (u06Var == u06.ON_DESTROY) {
            this.c = false;
            e16Var.m().b(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
