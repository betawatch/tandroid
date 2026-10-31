package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nl0 b;

    public /* synthetic */ se(org.telegram.ui.Components.nl0 nl0Var, int i10) {
        this.a = i10;
        this.b = nl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.nl0 nl0Var = this.b;
                if (!nl0Var.M) {
                    nl0Var.M = true;
                    nl0Var.c(new org.telegram.ui.Components.ll0(nl0Var, 0), false);
                    nl0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
