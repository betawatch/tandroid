package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements su0, org.telegram.ui.Components.zl0, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ l4 a;

    public /* synthetic */ t(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        l4 l4Var = this.a;
        l4Var.getClass();
        if (!(view instanceof k2)) {
            return false;
        }
        e4 e4Var = ((k2) view).n;
        l4Var.Z(e4Var.a.articles.get(e4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.su0
    public void b(float[] fArr) {
        l4 l4Var = this.a;
        fArr[0] = l4Var.I0;
        fArr[1] = l4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        l4 l4Var = this.a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = l4Var.H) != null && m1Var.isShowing()) {
            l4Var.H.d(true);
        }
    }
}
