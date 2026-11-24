// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz7 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a18 b;

    public /* synthetic */ xz7(a18 a18Var, byte b) {
        this.a = b;
        this.b = a18Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        a18 a18Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                vq1 vq1Var = a18Var.J;
                if (vq1Var != null) {
                    vq1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                a18Var.r = false;
                a18Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    a18Var.z0();
                    a18Var.finishFragment();
                    a18Var.H0();
                    break;
                }
                break;
        }
    }
}
