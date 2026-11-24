// default package

import java.util.Collections;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class xh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ci0 b;

    public /* synthetic */ xh0(ci0 ci0Var, byte b) {
        this.a = b;
        this.b = ci0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ci0 ci0Var = this.b;
        switch (b) {
            case 0:
                ci0Var.getClass();
                try {
                    ci0Var.o(Collections.singletonList(ci0.k), new yh0(ci0Var, (byte) 0));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                ci0Var.q();
                break;
        }
    }
}
