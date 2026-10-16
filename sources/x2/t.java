package x2;

import b2.w1;
import i2.q1;
import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final q1[] b;
    public final p[] c;
    public final w1 d;
    public final Object e;

    public t(q1[] q1VarArr, p[] pVarArr, w1 w1Var, Object obj) {
        u6.g(q1VarArr.length == pVarArr.length);
        this.b = q1VarArr;
        this.c = (p[]) pVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.a = q1VarArr.length;
    }

    public final boolean a(t tVar, int i10) {
        return tVar != null && Objects.equals(this.b[i10], tVar.b[i10]) && Objects.equals(this.c[i10], tVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
