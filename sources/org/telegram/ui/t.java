package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ku0, org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ l4 a;

    public /* synthetic */ t(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        l4 l4Var = this.a;
        l4Var.getClass();
        if (!(view instanceof l2)) {
            return false;
        }
        f4 f4Var = ((l2) view).n;
        l4Var.Z(f4Var.a.articles.get(f4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ku0
    public void h(float[] fArr) {
        l4 l4Var = this.a;
        fArr[0] = l4Var.E0;
        fArr[1] = l4Var.q0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        l4 l4Var = this.a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = l4Var.D) != null && o1Var.isShowing()) {
            l4Var.D.d(true);
        }
    }
}
