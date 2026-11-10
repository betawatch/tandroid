package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs0 b;

    public /* synthetic */ tr0(cs0 cs0Var, int i7) {
        this.a = i7;
        this.b = cs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cs0 cs0Var = this.b;
                org.telegram.messenger.g0.h3(new tr0(cs0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = cs0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = cs0Var.L;
                    q1Var2.c6 = null;
                    q1Var2.invalidate();
                }
                vl vlVar = cs0Var.e0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    cs0Var.e0 = null;
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

    public /* synthetic */ tr0(cs0 cs0Var, boolean z9) {
        this.a = 0;
        this.b = cs0Var;
    }
}
