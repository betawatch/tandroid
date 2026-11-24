// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow0 b;

    public /* synthetic */ pv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                gw0 gw0Var = ow0Var.E;
                if (gw0Var != null) {
                    if (!bool.booleanValue()) {
                        gw0Var.Q = System.currentTimeMillis();
                        gw0Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        gw0Var.Q = System.currentTimeMillis();
                        gw0Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                gl.c3(new z20(ow0Var, (TLRPC.UserFull) obj, (byte) 20));
                break;
        }
    }
}
