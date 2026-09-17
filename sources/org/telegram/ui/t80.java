package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class t80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public t80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.ll0 ll0Var = languageSelectActivity.b;
        int i10 = ll0Var.E1;
        if (i10 == -1 || (view = ll0Var.F1) == null) {
            return;
        }
        ll0Var.h1(i10, view);
        ll0Var.invalidate();
    }
}
