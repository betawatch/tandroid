// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yp1 implements uc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yp1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // uc7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = ((aq1) obj).b;
                if (i > 0 && mu1Var.getParentActivity() != null) {
                    u21.b0(mu1Var).m(this.b ? t21.H : t21.J, i, 0, 0, mu1Var.Ba).j();
                    break;
                }
                break;
            default:
                zp1 zp1Var = (zp1) obj;
                mu1 mu1Var2 = zp1Var.b.b;
                if (i < 50) {
                    mu1Var2.xa(mu1Var2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = mu1Var2.e;
                    TLRPC.User user = mu1Var2.f;
                    boolean z = this.b;
                    ij.r(mu1Var2, true, chat, user, false, false, false, z, new rh1(zp1Var, z));
                    break;
                }
        }
    }
}
