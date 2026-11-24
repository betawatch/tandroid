// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class st1 extends c01 {
    public final /* synthetic */ gb2 d;
    public final /* synthetic */ wt1 e;

    public st1(wt1 wt1Var, gb2 gb2Var) {
        this.e = wt1Var;
        this.d = gb2Var;
    }

    @Override // c01
    public final void c(boolean z) {
        if (z) {
            return;
        }
        gl.d3(new ho1(this.e.a, (byte) 11), 250L);
    }

    @Override // c01
    public final void d() {
        mu1 mu1Var = this.e.a;
        gb2 gb2Var = this.d;
        mu1Var.ac = gb2Var.getMessageObject().e1();
        mu1Var.bc = 2;
        mu1Var.cc = null;
        gb2Var.invalidate();
    }
}
