// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ut1 extends jb8 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ yv1 c;

    public ut1(yv1 yv1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = yv1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Bb(i2, arrayList, z, z2);
    }

    @Override // jb8, pb8
    public final boolean U() {
        return false;
    }

    @Override // jb8, pb8
    public final jn5 k(int i) {
        return null;
    }

    @Override // jb8, pb8
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override // jb8, pb8
    public final int E(int i, rcc rccVar) {
        return i;
    }
}
