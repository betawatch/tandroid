// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vs1 extends yc8 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ zu1 c;

    public vs1(zu1 zu1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = zu1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Cb(i2, arrayList, z, z2);
    }

    @Override // yc8, ed8
    public final boolean T() {
        return false;
    }

    @Override // yc8, ed8
    public final mn5 k(int i) {
        return null;
    }

    @Override // yc8, ed8
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override // yc8, ed8
    public final int D(int i, oec oecVar) {
        return i;
    }
}
