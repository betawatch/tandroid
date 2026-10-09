package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public s80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.qm0 qm0Var = languageSelectActivity.b;
        int i10 = qm0Var.C1;
        if (i10 == -1 || (view = qm0Var.D1) == null) {
            return;
        }
        qm0Var.i1(i10, view);
        qm0Var.invalidate();
    }
}
