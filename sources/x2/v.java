package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
