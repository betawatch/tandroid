// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ yw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                ox0 ox0Var = wx0Var.E;
                if (ox0Var != null) {
                    if (!bool.booleanValue()) {
                        ox0Var.Q = System.currentTimeMillis();
                        ox0Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        ox0Var.Q = System.currentTimeMillis();
                        ox0Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                gm.c3(new x30(wx0Var, (TLRPC.UserFull) obj, (byte) 21));
                break;
        }
    }
}
