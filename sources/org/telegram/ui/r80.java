package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class r80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public r80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.zl0 zl0Var = languageSelectActivity.b;
        int i10 = zl0Var.E1;
        if (i10 == -1 || (view = zl0Var.F1) == null) {
            return;
        }
        zl0Var.l1(i10, view);
        zl0Var.invalidate();
    }
}
