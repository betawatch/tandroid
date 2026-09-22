package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class w {
    public final int a;
    public final m1[] b;
    public final s[] c;
    public final s1 d;
    public final Object e;

    public w(m1[] m1VarArr, s[] sVarArr, s1 s1Var, Object obj) {
        e2.d.b(m1VarArr.length == sVarArr.length);
        this.b = m1VarArr;
        this.c = (s[]) sVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = m1VarArr.length;
    }

    public final boolean a(w wVar, int i10) {
        return wVar != null && Objects.equals(this.b[i10], wVar.b[i10]) && Objects.equals(this.c[i10], wVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
