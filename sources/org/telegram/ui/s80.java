package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
