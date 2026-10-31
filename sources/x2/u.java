package x2;

import b2.w1;
import i2.s1;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u {
    public final int a;
    public final s1[] b;
    public final q[] c;
    public final w1 d;
    public final Object e;

    public u(s1[] s1VarArr, q[] qVarArr, w1 w1Var, Object obj) {
        t6.f(s1VarArr.length == qVarArr.length);
        this.b = s1VarArr;
        this.c = (q[]) qVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.a = s1VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        return uVar != null && Objects.equals(this.b[i10], uVar.b[i10]) && Objects.equals(this.c[i10], uVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
