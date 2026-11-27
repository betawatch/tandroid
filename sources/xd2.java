// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oe2 b;

    public /* synthetic */ xd2(oe2 oe2Var, byte b) {
        this.a = b;
        this.b = oe2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oe2 oe2Var = this.b;
        switch (b) {
            case 0:
                oe2Var.q1.f();
                break;
            case 1:
                oe2Var.F0(true);
                break;
            case 2:
                zu1 zu1Var = oe2Var.u1;
                e d0 = w1b.d0(zu1Var.getMessagesController().M0(Long.valueOf(-zu1Var.a())), true);
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                d0.setResourceProvider(zu1Var.getResourceProvider());
                bg0Var.c = new kc((byte) 23);
                bg0Var.d = new xd2(oe2Var, (byte) 3);
                bg0Var.b = new xd2(oe2Var, (byte) 4);
                bg0Var.e = true;
                oe2Var.Q1 = d0;
                zu1Var.showAsSheet(d0, bg0Var);
                break;
            case 3:
                oe2Var.J0();
                break;
            case 4:
                oe2Var.Q1 = null;
                break;
            case 5:
                oe2Var.J0();
                break;
            case 6:
                oe2Var.Q1 = null;
                break;
            default:
                oe2Var.N1.c(oe2Var.z1);
                break;
        }
    }
}
