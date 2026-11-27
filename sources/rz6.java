// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rz6 extends asb {
    public final asb e;
    public final fo5 f;
    public final fo5 g;

    public rz6(asb asbVar, fo5 fo5Var, fo5 fo5Var2) {
        this.e = asbVar;
        this.f = fo5Var;
        this.g = fo5Var2;
    }

    @Override // asb
    public final int a(boolean z) {
        return this.e.a(z);
    }

    @Override // asb
    public final int b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        asb asbVar = this.e;
        return (!z || (obj2 = ((i99) this.g).n.get(obj)) == null) ? asbVar.b(obj) : asbVar.b(obj2);
    }

    @Override // asb
    public final int c(boolean z) {
        return this.e.c(z);
    }

    @Override // asb
    public final int e(int i, int i2, boolean z) {
        return this.e.e(i, i2, z);
    }

    @Override // asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        String str;
        String str2;
        this.e.f(i, xrbVar, z);
        if (z) {
            Object obj = xrbVar.a;
            fo5 fo5Var = this.g;
            if (obj != null && (str2 = (String) fo5Var.get(obj)) != null) {
                xrbVar.a = str2;
            }
            Object obj2 = xrbVar.b;
            if (obj2 != null && (str = (String) fo5Var.get(obj2)) != null) {
                xrbVar.b = str;
            }
        }
        return xrbVar;
    }

    @Override // asb
    public final int h() {
        return this.e.h();
    }

    @Override // asb
    public final int k(int i, int i2, boolean z) {
        return this.e.k(i, i2, z);
    }

    @Override // asb
    public final Object l(int i) {
        Object l = this.e.l(i);
        String str = (String) this.g.get(l);
        return str == null ? l : str;
    }

    @Override // asb
    public final zrb m(int i, zrb zrbVar, long j) {
        String str;
        this.e.m(i, zrbVar, j);
        Object obj = zrbVar.a;
        if (obj != null && (str = (String) this.f.get(obj)) != null) {
            zrbVar.a = str;
        }
        return zrbVar;
    }

    @Override // asb
    public final int o() {
        return this.e.o();
    }
}
