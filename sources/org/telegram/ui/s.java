package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements vu0, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ k4 a;

    public /* synthetic */ s(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // org.telegram.ui.vu0
    public void b(float[] fArr) {
        k4 k4Var = this.a;
        fArr[0] = k4Var.J0;
        fArr[1] = k4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        k4 k4Var = this.a;
        k4Var.getClass();
        if (!(view instanceof j2)) {
            return false;
        }
        d4 d4Var = ((j2) view).n;
        k4Var.Z(d4Var.a.articles.get(d4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        k4 k4Var = this.a;
        k4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
            k4Var.H.d(true);
        }
    }
}
