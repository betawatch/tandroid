package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;

    public /* synthetic */ yd0(zd0 zd0Var, int i10) {
        this.a = i10;
        this.b = zd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zd0 zd0Var = this.b;
                org.telegram.ui.Components.ei0 ei0Var = zd0Var.h;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                EditTextBoldCursor editTextBoldCursor = zd0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
