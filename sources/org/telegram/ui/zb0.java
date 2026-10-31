package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ zb0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        hf0 hf0Var = this.b;
        switch (i10) {
            case 0:
                hf0Var.c0 = false;
                break;
            case 1:
                hf0Var.w0 = false;
                hf0Var.F1(true, true);
                break;
            default:
                if (hf0Var.getParentActivity() != null && !hf0Var.getParentActivity().isFinishing() && hf0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131745966, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new cc0(hf0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
