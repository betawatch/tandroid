// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd4 b;

    public /* synthetic */ sc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                pd4Var.o0();
                break;
            default:
                pd4Var.n0();
                break;
        }
    }
}
