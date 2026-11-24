// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
