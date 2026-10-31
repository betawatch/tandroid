package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lt b;

    public /* synthetic */ ws(lt ltVar, int i10) {
        this.a = i10;
        this.b = ltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                lt ltVar = this.b;
                ltVar.A.w0(null);
                org.telegram.ui.Components.lc0 lc0Var = ltVar.C;
                if (lc0Var != null) {
                    lc0Var.a();
                    ltVar.z.removeView(ltVar.C);
                    ltVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                break;
        }
    }
}
