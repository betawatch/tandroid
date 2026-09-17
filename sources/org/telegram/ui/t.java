package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements lv0, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ i4 a;

    public /* synthetic */ t(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        i4 i4Var = this.a;
        i4Var.getClass();
        if (!(view instanceof i2)) {
            return false;
        }
        c4 c4Var = ((i2) view).n;
        i4Var.Z(c4Var.a.articles.get(c4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.lv0
    public void h(float[] fArr) {
        i4 i4Var = this.a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
