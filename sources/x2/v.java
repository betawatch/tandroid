package x2;

import b2.s1;
import i2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v {
    public final int a;
    public final l1[] b;
    public final r[] c;
    public final s1 d;
    public final Object e;

    public v(l1[] l1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        e2.d.b(l1VarArr.length == rVarArr.length);
        this.b = l1VarArr;
        this.c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = l1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        return vVar != null && Objects.equals(this.b[i10], vVar.b[i10]) && Objects.equals(this.c[i10], vVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
