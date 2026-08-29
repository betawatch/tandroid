package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements iu0, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ m4 a;

    public /* synthetic */ v(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        m4 m4Var = this.a;
        m4Var.getClass();
        if (!(view instanceof m2)) {
            return false;
        }
        g4 g4Var = ((m2) view).n;
        m4Var.Z(g4Var.a.articles.get(g4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.iu0
    public void h(float[] fArr) {
        m4 m4Var = this.a;
        fArr[0] = m4Var.E0;
        fArr[1] = m4Var.q0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        m4 m4Var = this.a;
        m4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = m4Var.D) != null && o1Var.isShowing()) {
            m4Var.D.d(true);
        }
    }
}
