package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ as0 b;

    public /* synthetic */ qr0(as0 as0Var, int i7) {
        this.a = i7;
        this.b = as0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                as0 as0Var = this.b;
                org.telegram.messenger.g0.g3(new qr0(as0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = as0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = as0Var.M;
                    q1Var2.d6 = null;
                    q1Var2.invalidate();
                }
                ul ulVar = as0Var.f0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    as0Var.f0 = null;
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

    public /* synthetic */ qr0(as0 as0Var, boolean z10) {
        this.a = 0;
        this.b = as0Var;
    }
}
