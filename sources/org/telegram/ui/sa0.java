package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ sa0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ee0 ee0Var = this.b;
        switch (i7) {
            case 0:
                ee0Var.c0 = false;
                break;
            case 1:
                ee0Var.w0 = false;
                ee0Var.P1(true, true);
                break;
            default:
                if (ee0Var.getParentActivity() != null && !ee0Var.getParentActivity().isFinishing() && ee0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new va0(ee0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
