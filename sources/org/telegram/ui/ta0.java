package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ ta0(fe0 fe0Var, int i7) {
        this.a = i7;
        this.b = fe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fe0 fe0Var = this.b;
        switch (i7) {
            case 0:
                fe0Var.c0 = false;
                break;
            case 1:
                fe0Var.w0 = false;
                fe0Var.P1(true, true);
                break;
            default:
                if (fe0Var.getParentActivity() != null && !fe0Var.getParentActivity().isFinishing() && fe0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new wa0(fe0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
