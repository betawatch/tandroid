package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements lu0, org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ m4 a;

    public /* synthetic */ u(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        m4 m4Var = this.a;
        m4Var.getClass();
        if (!(view instanceof m2)) {
            return false;
        }
        g4 g4Var = ((m2) view).n;
        m4Var.Z(g4Var.a.articles.get(g4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.lu0
    public void h(float[] fArr) {
        m4 m4Var = this.a;
        fArr[0] = m4Var.E0;
        fArr[1] = m4Var.q0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        m4 m4Var = this.a;
        m4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = m4Var.D) != null && n1Var.isShowing()) {
            m4Var.D.d(true);
        }
    }
}
