package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn0 b;

    public /* synthetic */ sn0(wn0 wn0Var, int i10) {
        this.a = i10;
        this.b = wn0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                wn0 wn0Var = this.b;
                wn0Var.a0(wn0Var.b, wn0Var.c, z10, i10);
                wn0Var.finishFragment();
                break;
            default:
                wn0 wn0Var2 = this.b;
                wn0Var2.a0(wn0Var2.b, wn0Var2.c, z10, i10);
                wn0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        wn0 wn0Var = this.b;
        wn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = wn0Var.I) != null && k1Var.isShowing()) {
            wn0Var.I.d(true);
        }
    }
}
