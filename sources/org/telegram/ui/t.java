package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements mv0, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ h4 a;

    public /* synthetic */ t(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        h4 h4Var = this.a;
        h4Var.getClass();
        if (!(view instanceof h2)) {
            return false;
        }
        b4 b4Var = ((h2) view).n;
        h4Var.Z(b4Var.a.articles.get(b4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.mv0
    public void g(float[] fArr) {
        h4 h4Var = this.a;
        fArr[0] = h4Var.I0;
        fArr[1] = h4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        h4 h4Var = this.a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = h4Var.H) != null && n1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
