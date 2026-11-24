// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rca extends yo {
    public final /* synthetic */ pca c;
    public final /* synthetic */ nfa d;

    public rca(nfa nfaVar, pca pcaVar) {
        this.d = nfaVar;
        this.c = pcaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r4.getAdapter().d(r9) != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r4.d(r9) == 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r1 = 1;
     */
    @Override // yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i) {
        nfa nfaVar = this.d;
        int[] iArr = nfaVar.p1;
        dea deaVar = nfaVar.R;
        pca pcaVar = this.c;
        int i2 = iArr[nfa.j0(pcaVar.F) ? 1 : 0];
        w39 adapter = pcaVar.h.getAdapter();
        uda udaVar = nfaVar.K;
        if (adapter != udaVar) {
            int x1 = nfaVar.x1(pcaVar.h.getAdapter());
            sca scaVar = pcaVar.h;
            if (x1 == -1) {
                if (scaVar.getAdapter() != deaVar) {
                    i2 = pcaVar.x.J;
                } else if (pcaVar.h.getAdapter() == deaVar && nfaVar.w1[5].a.isEmpty()) {
                    i2 = pcaVar.x.J;
                } else {
                    qca qcaVar = pcaVar.x;
                    qcaVar.z1();
                    i2 = qcaVar.R.get(i);
                }
            }
        }
        return Math.min(i2, pcaVar.x.J);
    }
}
