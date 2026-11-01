package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements os0, org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ h4 a;

    public /* synthetic */ r(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // org.telegram.ui.os0
    public void a(float[] fArr) {
        h4 h4Var = this.a;
        fArr[0] = h4Var.J0;
        fArr[1] = h4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        h4 h4Var = this.a;
        h4Var.getClass();
        if (!(view instanceof h2)) {
            return false;
        }
        b4 b4Var = ((h2) view).n;
        h4Var.X(b4Var.a.articles.get(b4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        h4 h4Var = this.a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = h4Var.H) != null && k1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
