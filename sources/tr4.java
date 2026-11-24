// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr4 b;

    public /* synthetic */ tr4(wr4 wr4Var, byte b) {
        this.a = b;
        this.b = wr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wr4 wr4Var = this.b;
        switch (b) {
            case 0:
                wr4Var.dismiss();
                break;
            default:
                wr4Var.E0();
                break;
        }
    }
}
