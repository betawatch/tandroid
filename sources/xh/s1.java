package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ s1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e2 e2Var = this.b.D;
                if (e2Var != null) {
                    if (!bool.booleanValue()) {
                        e2Var.P = System.currentTimeMillis();
                        e2Var.x("secondary_button_pressed", null);
                        break;
                    } else {
                        e2Var.P = System.currentTimeMillis();
                        e2Var.x("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new vh.r0(24, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
