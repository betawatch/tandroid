package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements er0, org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ g4 a;

    public /* synthetic */ s(g4 g4Var) {
        this.a = g4Var;
    }

    @Override // org.telegram.ui.er0
    public void a(float[] fArr) {
        g4 g4Var = this.a;
        fArr[0] = g4Var.K0;
        fArr[1] = g4Var.v0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        g4 g4Var = this.a;
        g4Var.getClass();
        if (!(view instanceof g2)) {
            return false;
        }
        a4 a4Var = ((g2) view).n;
        g4Var.X(a4Var.a.articles.get(a4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        g4 g4Var = this.a;
        g4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = g4Var.I) != null && h1Var.isShowing()) {
            g4Var.I.d(true);
        }
    }
}
