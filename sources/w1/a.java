package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import k5.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends z {
    public final d l;
    public t m;
    public c2.t n;

    public a(d dVar) {
        this.l = dVar;
        if (dVar.a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.a = this;
    }

    @Override // androidx.lifecycle.z
    public final void f() {
        d dVar = this.l;
        dVar.b = true;
        dVar.d = false;
        dVar.c = false;
        dVar.i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.z
    public final void g() {
        this.l.b = false;
    }

    @Override // androidx.lifecycle.z
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.m = null;
        this.n = null;
    }

    public final void k() {
        t tVar = this.m;
        c2.t tVar2 = this.n;
        if (tVar == null || tVar2 == null) {
            return;
        }
        super.i(tVar2);
        d(tVar, tVar2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
