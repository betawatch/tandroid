package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uc0 b;

    public /* synthetic */ tc0(uc0 uc0Var, int i7) {
        this.a = i7;
        this.b = uc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uc0 uc0Var = this.b;
                org.telegram.ui.Components.dh0 dh0Var = uc0Var.h;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                EditTextBoldCursor editTextBoldCursor = uc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
