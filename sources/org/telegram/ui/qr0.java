package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr0 b;

    public /* synthetic */ qr0(zr0 zr0Var, int i7) {
        this.a = i7;
        this.b = zr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zr0 zr0Var = this.b;
                org.telegram.messenger.g0.h3(new qr0(zr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = zr0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = zr0Var.L;
                    q1Var2.c6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = zr0Var.e0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    zr0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ qr0(zr0 zr0Var, boolean z9) {
        this.a = 0;
        this.b = zr0Var;
    }
}
