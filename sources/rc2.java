// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zc2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ rc2(zc2 zc2Var, long j, byte b) {
        this.a = b;
        this.b = zc2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        zc2 zc2Var = this.b;
        switch (b) {
            case 0:
                zc2Var.n = j;
                zc2Var.r = true;
                zc2Var.c0();
                break;
            default:
                zc2Var.h0(j);
                break;
        }
    }
}
