package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.yl0 yl0Var = languageSelectActivity.b;
        int i10 = yl0Var.E1;
        if (i10 == -1 || (view = yl0Var.F1) == null) {
            return;
        }
        yl0Var.j1(i10, view);
        yl0Var.invalidate();
    }
}
