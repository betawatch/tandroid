package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc0 b;

    public /* synthetic */ vc0(wc0 wc0Var, int i7) {
        this.a = i7;
        this.b = wc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wc0 wc0Var = this.b;
                org.telegram.ui.Components.ch0 ch0Var = wc0Var.h;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                EditTextBoldCursor editTextBoldCursor = wc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
