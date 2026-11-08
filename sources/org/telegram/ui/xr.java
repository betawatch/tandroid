package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks b;

    public /* synthetic */ xr(ks ksVar, int i7) {
        this.a = i7;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                ks ksVar = this.b;
                ksVar.A.w0(null);
                org.telegram.ui.Components.sb0 sb0Var = ksVar.C;
                if (sb0Var != null) {
                    sb0Var.a();
                    ksVar.z.removeView(ksVar.C);
                    ksVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                break;
        }
    }
}
