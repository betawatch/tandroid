package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd0 b;

    public /* synthetic */ xd0(yd0 yd0Var, int i10) {
        this.a = i10;
        this.b = yd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yd0 yd0Var = this.b;
                org.telegram.ui.Components.fi0 fi0Var = yd0Var.h;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                EditTextBoldCursor editTextBoldCursor = yd0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
