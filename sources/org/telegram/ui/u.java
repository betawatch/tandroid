package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements nv0, org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ i4 a;

    public /* synthetic */ u(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.nv0
    public void b(float[] fArr) {
        i4 i4Var = this.a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.gm0
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

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
