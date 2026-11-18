package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ ra0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ee0 ee0Var = this.b;
        switch (i7) {
            case 0:
                ee0Var.d0 = false;
                break;
            case 1:
                ee0Var.y0 = false;
                ee0Var.P1(true, true);
                break;
            default:
                if (ee0Var.getParentActivity() != null && !ee0Var.getParentActivity().isFinishing() && ee0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745754, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ua0(ee0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
