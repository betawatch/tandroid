package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public u80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.ml0 ml0Var = languageSelectActivity.b;
        int i10 = ml0Var.E1;
        if (i10 == -1 || (view = ml0Var.F1) == null) {
            return;
        }
        ml0Var.j1(i10, view);
        ml0Var.invalidate();
    }
}
