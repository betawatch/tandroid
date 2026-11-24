// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class st4 implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ st4(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.b(f / 1000.0f);
                break;
            default:
                vt4Var.b(Math.max(0.0f, f / 1000.0f));
                break;
        }
    }
}
