package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ se0(ue0 ue0Var, int i9) {
        this.a = i9;
        this.b = ue0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ue0 ue0Var = this.b;
                org.telegram.ui.Components.pi0 pi0Var = ue0Var.h;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                EditTextBoldCursor editTextBoldCursor = ue0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
