// default package

import java.io.Closeable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pt9 implements f36, Closeable {
    public final String a;
    public final ot9 b;
    public boolean c;

    public pt9(String str, ot9 ot9Var) {
        this.a = str;
        this.b = ot9Var;
    }

    public final void a(po poVar, a36 a36Var) {
        poVar.getClass();
        a36Var.getClass();
        if (this.c) {
            grb.i("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        a36Var.a(this);
        poVar.f(this.a, this.b.e);
    }

    @Override // f36
    public final void b(i36 i36Var, y26 y26Var) {
        if (y26Var == y26.ON_DESTROY) {
            this.c = false;
            i36Var.m().b(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
