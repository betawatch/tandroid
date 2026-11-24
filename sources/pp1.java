// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pp1 extends c01 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ gb2 f;
    public final /* synthetic */ mu1 g;

    public /* synthetic */ pp1(mu1 mu1Var, int i, gb2 gb2Var, byte b) {
        this.d = b;
        this.g = mu1Var;
        this.e = i;
        this.f = gb2Var;
    }

    @Override // c01
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gl.d3(new eg((Object) this, this.e, (byte) 15), 240L);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    gl.d3(new eg((Object) this, this.e, (byte) 18), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    gl.d3(new eg((Object) this, this.e, (byte) 19), 240L);
                    break;
                }
                break;
        }
    }

    @Override // c01
    public final void d() {
        byte b = this.d;
        gb2 gb2Var = this.f;
        int i = this.e;
        mu1 mu1Var = this.g;
        switch (b) {
            case 0:
                mu1Var.ac = i;
                mu1Var.bc = 6;
                gb2Var.invalidate();
                break;
            case 1:
                mu1Var.ac = i;
                mu1Var.bc = 5;
                mu1Var.dc = null;
                gb2Var.invalidate();
                break;
            default:
                mu1Var.ac = i;
                mu1Var.bc = 7;
                gb2Var.invalidate();
                break;
        }
    }
}
