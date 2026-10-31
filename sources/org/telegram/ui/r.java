package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ps0, org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ h4 a;

    public /* synthetic */ r(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // org.telegram.ui.ps0
    public void a(float[] fArr) {
        h4 h4Var = this.a;
        fArr[0] = h4Var.J0;
        fArr[1] = h4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ik0
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
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        h4 h4Var = this.a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = h4Var.H) != null && k1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
