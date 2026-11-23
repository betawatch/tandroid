package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements er0, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1 {
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

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        g4 g4Var = this.a;
        g4Var.getClass();
        if (!(view instanceof g2)) {
            return false;
        }
        a4 a4Var = ((g2) view).n;
        g4Var.X(a4Var.a.articles.get(a4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g4 g4Var = this.a;
        g4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g4Var.I) != null && g1Var.isShowing()) {
            g4Var.I.d(true);
        }
    }
}
