package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class v {
    public final int a;
    public final m1[] b;
    public final r[] c;
    public final s1 d;
    public final Object e;

    public v(m1[] m1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        e2.d.b(m1VarArr.length == rVarArr.length);
        this.b = m1VarArr;
        this.c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = m1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        return vVar != null && Objects.equals(this.b[i10], vVar.b[i10]) && Objects.equals(this.c[i10], vVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
