package ph;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ ea(oa oaVar, int i10) {
        this.a = i10;
        this.b = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oa oaVar = this.b;
                ma maVar = oaVar.J;
                if (maVar != null) {
                    long j10 = maVar.a;
                    if (j10 > 0) {
                        oaVar.E = j10;
                        break;
                    }
                }
                break;
            case 1:
                ia iaVar = this.b.a;
                if (iaVar != null) {
                    iaVar.C1();
                    break;
                }
                break;
            default:
                ia iaVar2 = this.b.a;
                if (iaVar2 != null) {
                    iaVar2.b0();
                    break;
                }
                break;
        }
    }
}
