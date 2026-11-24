// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ym2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ym2(en2 en2Var, long j, byte b) {
        this.a = b;
        this.b = en2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                en2Var.Z(j);
                break;
            default:
                en2Var.presentFragment(mu1.U9(j));
                break;
        }
    }
}
