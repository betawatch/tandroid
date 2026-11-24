// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y86 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sx5 b;
    public final /* synthetic */ h96 c;

    public /* synthetic */ y86(sx5 sx5Var, h96 h96Var, byte b) {
        this.a = b;
        this.b = sx5Var;
        this.c = h96Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h96 h96Var = this.c;
        sx5 sx5Var = this.b;
        switch (b) {
            case 0:
                sx5Var.run();
                h96Var.a();
                break;
            default:
                sx5Var.run();
                h96Var.a();
                break;
        }
    }
}
