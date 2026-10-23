package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne0 b;

    public /* synthetic */ zc0(ne0 ne0Var, int i10) {
        this.a = i10;
        this.b = ne0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.m();
                break;
            case 1:
                ne0 ne0Var = this.b;
                ne0Var.M = null;
                ne0Var.N = null;
                ne0Var.p(true);
                ne0Var.e.h(null, null, ne0Var.f, null);
                jd jdVar = ne0Var.n;
                org.telegram.ui.Components.vj0 vj0Var = ne0Var.I;
                jdVar.setAnimation(vj0Var);
                vj0Var.M(0);
                ne0Var.K = true;
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
