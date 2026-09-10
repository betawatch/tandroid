package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.Components.vl0 vl0Var = languageSelectActivity.b;
        int i10 = vl0Var.E1;
        if (i10 == -1 || (view = vl0Var.F1) == null) {
            return;
        }
        vl0Var.h1(i10, view);
        vl0Var.invalidate();
    }
}
