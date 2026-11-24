// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zca extends i49 {
    public final /* synthetic */ pca a;
    public final /* synthetic */ qca b;
    public final /* synthetic */ nfa c;

    public zca(nfa nfaVar, pca pcaVar, qca qcaVar) {
        this.c = nfaVar;
        this.a = pcaVar;
        this.b = qcaVar;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        this.c.e1 = i != 0;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        nfa nfaVar = this.c;
        cfa[] cfaVarArr = nfaVar.w1;
        qca qcaVar = this.b;
        pca pcaVar = this.a;
        nfaVar.z(pcaVar, (o39) recyclerView, qcaVar);
        if (i2 != 0 && ((i4 = nfaVar.n0[0].F) == 0 || i4 == 5)) {
            cfaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = pcaVar.F) == 0 || nfa.j0(i3))) {
            nfa.m1(pcaVar, cfaVarArr, true);
        }
        pcaVar.h.M0(true);
        if (pcaVar.G != null) {
            pcaVar.invalidate();
        }
    }
}
