package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ ra0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        de0 de0Var = this.b;
        switch (i7) {
            case 0:
                de0Var.d0 = false;
                break;
            case 1:
                de0Var.y0 = false;
                de0Var.P1(true, true);
                break;
            default:
                if (de0Var.getParentActivity() != null && !de0Var.getParentActivity().isFinishing() && de0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.N0(2131745753, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new ua0(de0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
