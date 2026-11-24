// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pd2 implements pmb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd2 b;

    public /* synthetic */ pd2(qd2 qd2Var, byte b) {
        this.a = b;
        this.b = qd2Var;
    }

    @Override // pmb
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        qd2 qd2Var = this.b;
        switch (b) {
            case 0:
                xd2 xd2Var = qd2Var.a;
                xd2Var.R1.I();
                xd2Var.dismiss();
                break;
            default:
                xd2 xd2Var2 = qd2Var.a;
                xd2Var2.R1.I();
                xd2Var2.dismiss();
                break;
        }
    }
}
