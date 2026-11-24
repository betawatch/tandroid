// default package

import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ xi0(cj0 cj0Var, byte b) {
        this.a = b;
        this.b = cj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cj0 cj0Var = this.b;
        switch (b) {
            case 0:
                cj0Var.getClass();
                try {
                    cj0Var.o(Collections.singletonList(cj0.k), new yi0(cj0Var, (byte) 0));
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                cj0Var.q();
                break;
        }
    }
}
