// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wl8 b;

    public /* synthetic */ ul8(wl8 wl8Var, byte b) {
        this.a = b;
        this.b = wl8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wl8 wl8Var = this.b;
        switch (b) {
            case 0:
                String str = "https://t.me/giftcode/" + wl8Var.M2;
                uj3 uj3Var = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
                uj3Var.E2 = new m88(wl8Var, str, (byte) 9);
                wl8Var.r1.presentFragment(uj3Var);
                wl8Var.dismiss();
                break;
            default:
                kl8 kl8Var = new kl8(wl8Var.r1, yac.t0, null, null, null, wl8Var.J0);
                kl8Var.E2 = true;
                kl8Var.F2 = true;
                kl8Var.X1 = true;
                wl8Var.r1.showDialog(kl8Var);
                break;
        }
    }
}
