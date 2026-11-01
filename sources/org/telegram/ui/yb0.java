package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ yb0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        gf0 gf0Var = this.b;
        switch (i10) {
            case 0:
                gf0Var.c0 = false;
                break;
            case 1:
                gf0Var.w0 = false;
                gf0Var.G1(true, true);
                break;
            default:
                if (gf0Var.getParentActivity() != null && !gf0Var.getParentActivity().isFinishing() && gf0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.dd.L0(2131745966, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new bc0(gf0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
