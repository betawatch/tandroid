package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                org.telegram.ui.Components.ch0 ch0Var = sc0Var.h;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
