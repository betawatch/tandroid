// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class te1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf1 b;

    public /* synthetic */ te1(nf1 nf1Var, byte b) {
        this.a = b;
        this.b = nf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nf1 nf1Var = this.b;
        switch (b) {
            case 0:
                nf1Var.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                nf1Var.h1();
                nf1Var.I0 = null;
                break;
            case 1:
                nf1Var.Z0(false);
                nf1Var.F.f();
                break;
            default:
                nf1Var.Y0();
                break;
        }
    }
}
