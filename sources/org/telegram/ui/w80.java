package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w80 extends s4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public w80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.mm0 mm0Var = languageSelectActivity.b;
        int i10 = mm0Var.C1;
        if (i10 == -1 || (view = mm0Var.D1) == null) {
            return;
        }
        mm0Var.i1(i10, view);
        mm0Var.invalidate();
    }
}
