// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pv4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv4 b;

    public /* synthetic */ pv4(rv4 rv4Var, byte b) {
        this.a = b;
        this.b = rv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rv4 rv4Var = this.b;
        switch (b) {
            case 0:
                rv4Var.E();
                break;
            default:
                String str = "https://t.me/giftcode/" + rv4Var.h;
                uj3 uj3Var = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
                uj3Var.E2 = new u34(rv4Var, str, (byte) 4);
                rv4Var.e.presentFragment(uj3Var);
                ((sv4) rv4Var).r.dismiss();
                break;
        }
    }
}
