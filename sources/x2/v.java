package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class v {
    public final int a;
    public final n1[] b;
    public final r[] c;
    public final s1 d;
    public final Object e;

    public v(n1[] n1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        e2.d.b(n1VarArr.length == rVarArr.length);
        this.b = n1VarArr;
        this.c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = n1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        return vVar != null && Objects.equals(this.b[i10], vVar.b[i10]) && Objects.equals(this.c[i10], vVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
