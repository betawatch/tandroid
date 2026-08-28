package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x70 extends f2.n {
    public final /* synthetic */ LanguageSelectActivity F;

    public x70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.n
    public final void P(f2.q1 q1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.wk0 wk0Var = languageSelectActivity.b;
        int i9 = wk0Var.A1;
        if (i9 == -1 || (view = wk0Var.B1) == null) {
            return;
        }
        wk0Var.i1(i9, view);
        wk0Var.invalidate();
    }
}
