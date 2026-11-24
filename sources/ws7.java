// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws7 implements xr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ws7(wt7 wt7Var, boolean z, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = z;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                it7 it7Var = wt7Var.m1;
                if (ylaVar == wt7Var.s1) {
                    wt7Var.s1 = null;
                    if (!z2) {
                        it7Var.setVisibility(8);
                        k38.e(wt7Var.v1).g();
                        it7Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                ss7 ss7Var = wt7Var.c1;
                if (ylaVar == wt7Var.l1) {
                    wt7Var.l1 = null;
                    if (!z2) {
                        ss7Var.setVisibility(8);
                    }
                    ss7Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
