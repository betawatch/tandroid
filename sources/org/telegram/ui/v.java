package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements zu0, org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ l4 a;

    public /* synthetic */ v(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // org.telegram.ui.zu0
    public void c(float[] fArr) {
        l4 l4Var = this.a;
        fArr[0] = l4Var.F0;
        fArr[1] = l4Var.r0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        l4 l4Var = this.a;
        l4Var.getClass();
        if (!(view instanceof k2)) {
            return false;
        }
        f4 f4Var = ((k2) view).n;
        l4Var.Z(f4Var.a.articles.get(f4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        l4 l4Var = this.a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = l4Var.E) != null && p1Var.isShowing()) {
            l4Var.E.d(true);
        }
    }
}
