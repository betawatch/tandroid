package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ov0, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ j4 a;

    public /* synthetic */ u(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        j4 j4Var = this.a;
        j4Var.getClass();
        if (!(view instanceof j2)) {
            return false;
        }
        d4 d4Var = ((j2) view).n;
        j4Var.Z(d4Var.a.articles.get(d4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ov0
    public void h(float[] fArr) {
        j4 j4Var = this.a;
        fArr[0] = j4Var.I0;
        fArr[1] = j4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        j4 j4Var = this.a;
        j4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = j4Var.H) != null && p1Var.isShowing()) {
            j4Var.H.d(true);
        }
    }
}
