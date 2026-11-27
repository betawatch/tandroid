// default package

import java.io.Closeable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
