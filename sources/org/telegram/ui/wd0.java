package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ wd0(jf0 jf0Var, int i10) {
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.n();
                break;
            case 1:
                jf0 jf0Var = this.b;
                jf0Var.M = null;
                jf0Var.N = null;
                jf0Var.p(true);
                jf0Var.e.h(null, null, jf0Var.f, null);
                kd kdVar = jf0Var.n;
                org.telegram.ui.Components.yi0 yi0Var = jf0Var.I;
                kdVar.setAnimation(yi0Var);
                yi0Var.M(0);
                jf0Var.K = true;
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
