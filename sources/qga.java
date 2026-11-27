// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qga extends v79 {
    public final /* synthetic */ gga a;
    public final /* synthetic */ hga b;
    public final /* synthetic */ eja c;

    public qga(eja ejaVar, gga ggaVar, hga hgaVar) {
        this.c = ejaVar;
        this.a = ggaVar;
        this.b = hgaVar;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        this.c.e1 = i != 0;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        eja ejaVar = this.c;
        tia[] tiaVarArr = ejaVar.w1;
        hga hgaVar = this.b;
        gga ggaVar = this.a;
        ejaVar.z(ggaVar, (d79) recyclerView, hgaVar);
        if (i2 != 0 && ((i4 = ejaVar.n0[0].F) == 0 || i4 == 5)) {
            tiaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = ggaVar.F) == 0 || eja.j0(i3))) {
            eja.m1(ggaVar, tiaVarArr, true);
        }
        ggaVar.h.N0(true);
        if (ggaVar.G != null) {
            ggaVar.invalidate();
        }
    }
}
