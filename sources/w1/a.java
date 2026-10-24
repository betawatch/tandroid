package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends z {
    public final d l;
    public t m;
    public b2.t n;

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
        b2.t tVar2 = this.n;
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
