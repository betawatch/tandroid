package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ev0, org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ i4 a;

    public /* synthetic */ u(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.ev0
    public void b(float[] fArr) {
        i4 i4Var = this.a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        i4 i4Var = this.a;
        i4Var.getClass();
        if (!(view instanceof i2)) {
            return false;
        }
        c4 c4Var = ((i2) view).n;
        i4Var.Z(c4Var.a.articles.get(c4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        i4 i4Var = this.a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = i4Var.H) != null && m1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
