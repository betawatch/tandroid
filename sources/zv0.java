// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ zv0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                pw0 pw0Var = xw0Var.E;
                if (pw0Var != null) {
                    if (!bool.booleanValue()) {
                        pw0Var.Q = System.currentTimeMillis();
                        pw0Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        pw0Var.Q = System.currentTimeMillis();
                        pw0Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                hl.c3(new a30(xw0Var, (TLRPC.UserFull) obj, (byte) 20));
                break;
        }
    }
}
