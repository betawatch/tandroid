package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        zl0Var.k1(i10, view);
        zl0Var.invalidate();
    }
}
