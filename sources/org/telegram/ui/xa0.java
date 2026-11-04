package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;

    public /* synthetic */ xa0(nc0 nc0Var, int i3) {
        this.a = i3;
        this.b = nc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.M.m();
                break;
            case 1:
                nc0 nc0Var = this.b;
                nc0Var.N = null;
                nc0Var.O = null;
                nc0Var.o(true);
                nc0Var.e.j(null, null, nc0Var.f, null);
                xc xcVar = nc0Var.n;
                org.telegram.ui.Components.ch0 ch0Var = nc0Var.J;
                xcVar.setAnimation(ch0Var);
                ch0Var.M(0);
                nc0Var.L = true;
                break;
            case 2:
                this.b.L = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
