// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ py b;

    public /* synthetic */ qn1(py pyVar, byte b) {
        this.a = b;
        this.b = pyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        py pyVar = this.b;
        switch (b) {
            case 0:
                gl.F3(pyVar);
                break;
            default:
                jd8 jd8Var = (jd8) pyVar.f2;
                gb2 gb2Var = jd8Var.n;
                if (gb2Var != null && gb2Var.getDelegate() != null) {
                    jd8Var.n.getDelegate().C1(jd8Var.n, false);
                    break;
                }
                break;
        }
    }
}
