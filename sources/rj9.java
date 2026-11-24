// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g29 b;

    public /* synthetic */ rj9(g29 g29Var, byte b) {
        this.a = b;
        this.b = g29Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        g29 g29Var = this.b;
        switch (b) {
            case 0:
                ((ul9) g29Var.b).i.post(new kl9(g29Var, exc, (byte) 1));
                break;
            default:
                ((ul9) g29Var.b).i.post(new kl9(g29Var, exc, (byte) 0));
                break;
        }
    }
}
