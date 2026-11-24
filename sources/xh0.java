// default package

import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
