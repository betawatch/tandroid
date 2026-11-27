// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v17 extends zo {
    public final /* synthetic */ b27 c;

    public v17(b27 b27Var) {
        this.c = b27Var;
    }

    @Override // zo
    public final int i(int i) {
        b27 b27Var = this.c;
        r17 r17Var = b27Var.f;
        if (i == 0) {
            return 100;
        }
        int i2 = i - 1;
        Object J = r17Var.J(i2);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (r17Var.I() != null || r17Var.V != null) {
            i = i2;
        }
        u17 u17Var = b27Var.d;
        u17Var.z1();
        return u17Var.R.get(i);
    }
}
