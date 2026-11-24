// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vm0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ c01 c;

    public /* synthetic */ vm0(AtomicBoolean atomicBoolean, c01 c01Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = c01Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        c01 c01Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    c01Var.b();
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get() && c01Var != null) {
                    c01Var.b();
                    break;
                }
                break;
        }
    }
}
