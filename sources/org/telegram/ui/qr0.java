package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.messenger.g0.g3(new qr0(zr0Var, 3));
                org.telegram.ui.Cells.r1 r1Var = zr0Var.M;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    org.telegram.ui.Cells.r1 r1Var2 = zr0Var.M;
                    r1Var2.d6 = null;
                    r1Var2.invalidate();
                }
                ul ulVar = zr0Var.f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    zr0Var.f0 = null;
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

    public /* synthetic */ qr0(zr0 zr0Var, boolean z10) {
        this.a = 0;
        this.b = zr0Var;
    }
}
