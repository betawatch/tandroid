package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        org.telegram.ui.Components.vl0 vl0Var = languageSelectActivity.b;
        int i10 = vl0Var.E1;
        if (i10 == -1 || (view = vl0Var.F1) == null) {
            return;
        }
        vl0Var.j1(i10, view);
        vl0Var.invalidate();
    }
}
