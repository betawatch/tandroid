// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um2 implements vc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gk7 e;

    public /* synthetic */ um2(gk7 gk7Var, hd hdVar, long j, boolean z, byte b) {
        this.a = b;
        this.e = gk7Var;
        this.b = hdVar;
        this.c = j;
        this.d = z;
    }

    @Override // vc7
    public final void run(long j) {
        byte b = this.a;
        boolean z = this.d;
        long j2 = this.c;
        hd hdVar = this.b;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                xm2 xm2Var = (xm2) gk7Var;
                hdVar.dismiss();
                if (j != 0) {
                    xm2Var.b = -j;
                    xm2Var.c = xm2Var.getMessagesController().K0(Long.valueOf(j));
                    xm2Var.Z(j2, z);
                    break;
                }
                break;
            default:
                eo2 eo2Var = (eo2) gk7Var;
                hdVar.dismiss();
                if (j != 0) {
                    eo2Var.F0(na7.q1(eo2Var.a).K0(Long.valueOf(j)), j2, z);
                    break;
                }
                break;
        }
    }
}
