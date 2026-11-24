// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ du4 b;

    public /* synthetic */ wt4(du4 du4Var, byte b) {
        this.a = b;
        this.b = du4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        du4 du4Var = this.b;
        switch (b) {
            case 0:
                fyc fycVar = du4Var.q1;
                j92 j92Var = du4Var.p1;
                if (j92Var != null) {
                    j92Var.d();
                }
                bu4 bu4Var = du4Var.B1;
                if (bu4Var != null) {
                    bu4Var.setTranslationY(-fycVar.d());
                }
                hn hnVar = du4Var.v1;
                if (hnVar != null) {
                    hnVar.setTranslationY(-fycVar.d());
                }
                du4Var.D0();
                break;
            case 1:
                du4Var.B1.performClick();
                break;
            case 2:
                du4Var.r1.i1();
                break;
            default:
                du4Var.dismiss();
                break;
        }
    }
}
