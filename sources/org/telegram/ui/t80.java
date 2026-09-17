package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
