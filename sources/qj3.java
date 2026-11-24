// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vj3 b;

    public /* synthetic */ qj3(vj3 vj3Var, byte b) {
        this.a = b;
        this.b = vj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vj3 vj3Var = this.b;
        switch (b) {
            case 0:
                vj3Var.X(false);
                break;
            default:
                vj3Var.O(true);
                break;
        }
    }
}
