// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class q9a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ taa b;

    public /* synthetic */ q9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                taaVar.v2 = true;
                no4 no4Var = taaVar.t2;
                no4Var.r.setText("");
                gl.E3(no4Var.r);
                break;
            default:
                am6 am6Var = new am6((byte) 21);
                if (!taaVar.d) {
                    am6Var.run();
                    break;
                } else {
                    no4 no4Var2 = taaVar.t2;
                    if (no4Var2 != null) {
                        gl.t1(no4Var2.r);
                    }
                    gl.d3(am6Var, 300L);
                    break;
                }
        }
    }
}
