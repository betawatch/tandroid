// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
