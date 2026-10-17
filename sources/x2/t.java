package x2;

import b2.v1;
import i2.o1;
import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final o1[] b;
    public final p[] c;
    public final v1 d;
    public final Object e;

    public t(o1[] o1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        u6.g(o1VarArr.length == pVarArr.length);
        this.b = o1VarArr;
        this.c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.e = obj;
        this.a = o1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        return tVar != null && Objects.equals(this.b[i10], tVar.b[i10]) && Objects.equals(this.c[i10], tVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
