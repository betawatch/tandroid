package qg;

import ji.u4;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ n0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.c = null;
                u4 u4Var = q0Var.a;
                if (u4Var != null) {
                    u4Var.n();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
