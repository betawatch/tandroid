package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
