package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;

    public /* synthetic */ ve0(xe0 xe0Var, int i10) {
        this.a = i10;
        this.b = xe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe0 xe0Var = this.b;
                org.telegram.ui.Components.ri0 ri0Var = xe0Var.h;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                EditTextBoldCursor editTextBoldCursor = xe0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
