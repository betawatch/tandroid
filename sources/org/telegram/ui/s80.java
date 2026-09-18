package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class s80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public s80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = languageSelectActivity.b;
        int i10 = wl0Var.E1;
        if (i10 == -1 || (view = wl0Var.F1) == null) {
            return;
        }
        wl0Var.j1(i10, view);
        wl0Var.invalidate();
    }
}
