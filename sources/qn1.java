// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.E3(pyVar);
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
