package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ rc0(sc0 sc0Var, int i7) {
        this.a = i7;
        this.b = sc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sc0 sc0Var = this.b;
                org.telegram.ui.Components.rh0 rh0Var = sc0Var.h;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
