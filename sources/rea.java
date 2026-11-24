// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rea extends yp {
    public final /* synthetic */ pea c;
    public final /* synthetic */ nha d;

    public rea(nha nhaVar, pea peaVar) {
        this.d = nhaVar;
        this.c = peaVar;
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
    @Override // yp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i) {
        nha nhaVar = this.d;
        int[] iArr = nhaVar.p1;
        dga dgaVar = nhaVar.R;
        pea peaVar = this.c;
        int i2 = iArr[nha.j0(peaVar.F) ? 1 : 0];
        y59 adapter = peaVar.h.getAdapter();
        ufa ufaVar = nhaVar.K;
        if (adapter != ufaVar) {
            int x1 = nhaVar.x1(peaVar.h.getAdapter());
            sea seaVar = peaVar.h;
            if (x1 == -1) {
                if (seaVar.getAdapter() != dgaVar) {
                    i2 = peaVar.x.J;
                } else if (peaVar.h.getAdapter() == dgaVar && nhaVar.w1[5].a.isEmpty()) {
                    i2 = peaVar.x.J;
                } else {
                    qea qeaVar = peaVar.x;
                    qeaVar.z1();
                    i2 = qeaVar.R.get(i);
                }
            }
        }
        return Math.min(i2, peaVar.x.J);
    }
}
