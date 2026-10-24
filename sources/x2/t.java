package x2;

import b2.v1;
import i2.p1;
import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final p1[] b;
    public final p[] c;
    public final v1 d;
    public final Object e;

    public t(p1[] p1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        u6.g(p1VarArr.length == pVarArr.length);
        this.b = p1VarArr;
        this.c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.e = obj;
        this.a = p1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        return tVar != null && Objects.equals(this.b[i10], tVar.b[i10]) && Objects.equals(this.c[i10], tVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
