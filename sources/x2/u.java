package x2;

import a8.yb;
import b2.w1;
import i2.q1;
import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u {
    public final int a;
    public final q1[] b;
    public final q[] c;
    public final w1 d;
    public final Object e;

    public u(q1[] q1VarArr, q[] qVarArr, w1 w1Var, Object obj) {
        yb.g(q1VarArr.length == qVarArr.length);
        this.b = q1VarArr;
        this.c = (q[]) qVarArr.clone();
        this.d = w1Var;
        this.e = obj;
        this.a = q1VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        return uVar != null && Objects.equals(this.b[i10], uVar.b[i10]) && Objects.equals(this.c[i10], uVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
