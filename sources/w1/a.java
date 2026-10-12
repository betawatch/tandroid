package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.u;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a extends z {
    public final d l;
    public t m;
    public u n;

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
        u uVar = this.n;
        if (tVar == null || uVar == null) {
            return;
        }
        super.i(uVar);
        d(tVar, uVar);
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
