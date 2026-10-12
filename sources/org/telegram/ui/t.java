package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements tv0, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ k4 a;

    public /* synthetic */ t(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        k4 k4Var = this.a;
        k4Var.getClass();
        if (!(view instanceof k2)) {
            return false;
        }
        e4 e4Var = ((k2) view).n;
        k4Var.Z(e4Var.a.articles.get(e4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.tv0
    public void b(float[] fArr) {
        k4 k4Var = this.a;
        fArr[0] = k4Var.I0;
        fArr[1] = k4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        k4 k4Var = this.a;
        k4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
            k4Var.H.d(true);
        }
    }
}
