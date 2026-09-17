package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ ud0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.n();
                break;
            case 1:
                hf0 hf0Var = this.b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.e.h(null, null, hf0Var.f, null);
                jd jdVar = hf0Var.n;
                org.telegram.ui.Components.xi0 xi0Var = hf0Var.I;
                jdVar.setAnimation(xi0Var);
                xi0Var.K(0);
                hf0Var.K = true;
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
