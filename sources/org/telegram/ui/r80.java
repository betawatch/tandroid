package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
