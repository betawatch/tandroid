// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zea extends k69 {
    public final /* synthetic */ pea a;
    public final /* synthetic */ qea b;
    public final /* synthetic */ nha c;

    public zea(nha nhaVar, pea peaVar, qea qeaVar) {
        this.c = nhaVar;
        this.a = peaVar;
        this.b = qeaVar;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        this.c.e1 = i != 0;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        nha nhaVar = this.c;
        cha[] chaVarArr = nhaVar.w1;
        qea qeaVar = this.b;
        pea peaVar = this.a;
        nhaVar.z(peaVar, (r59) recyclerView, qeaVar);
        if (i2 != 0 && ((i4 = nhaVar.n0[0].F) == 0 || i4 == 5)) {
            chaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = peaVar.F) == 0 || nha.j0(i3))) {
            nha.m1(peaVar, chaVarArr, true);
        }
        peaVar.h.M0(true);
        if (peaVar.G != null) {
            peaVar.invalidate();
        }
    }
}
