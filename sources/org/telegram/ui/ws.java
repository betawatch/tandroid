package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ ws(kt ktVar, int i10) {
        this.a = i10;
        this.b = ktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                kt ktVar = this.b;
                ktVar.A.w0(null);
                org.telegram.ui.Components.lc0 lc0Var = ktVar.C;
                if (lc0Var != null) {
                    lc0Var.a();
                    ktVar.z.removeView(ktVar.C);
                    ktVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                break;
        }
    }
}
