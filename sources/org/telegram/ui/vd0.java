package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ vd0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.n();
                break;
            case 1:
                if0 if0Var = this.b;
                if0Var.M = null;
                if0Var.N = null;
                if0Var.p(true);
                if0Var.e.h(null, null, if0Var.f, null);
                jd jdVar = if0Var.n;
                org.telegram.ui.Components.ij0 ij0Var = if0Var.I;
                jdVar.setAnimation(ij0Var);
                ij0Var.M(0);
                if0Var.K = true;
                break;
            case 2:
                this.b.K = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
