package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ re0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te0 te0Var = this.b;
                org.telegram.ui.Components.xj0 xj0Var = te0Var.h;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                EditTextBoldCursor editTextBoldCursor = te0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
