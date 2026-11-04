package z2;

import b8.zb;
import d2.v1;
import j$.util.Objects;
import k2.q1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final q1[] b;
    public final p[] c;
    public final v1 d;
    public final Object e;

    public t(q1[] q1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        zb.f(q1VarArr.length == pVarArr.length);
        this.b = q1VarArr;
        this.c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.e = obj;
        this.a = q1VarArr.length;
    }

    public final boolean a(t tVar, int i3) {
        return tVar != null && Objects.equals(this.b[i3], tVar.b[i3]) && Objects.equals(this.c[i3], tVar.c[i3]);
    }

    public final boolean b(int i3) {
        return this.b[i3] != null;
    }
}
