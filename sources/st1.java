// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gl.e3(new ho1(this.e.a, (byte) 11), 250L);
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
