// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vn0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ k11 c;

    public /* synthetic */ vn0(AtomicBoolean atomicBoolean, k11 k11Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = k11Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        k11 k11Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    k11Var.b();
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get() && k11Var != null) {
                    k11Var.b();
                    break;
                }
                break;
        }
    }
}
