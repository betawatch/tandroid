package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements bv0, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ j4 a;

    public /* synthetic */ s(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.bv0
    public void a(float[] fArr) {
        j4 j4Var = this.a;
        fArr[0] = j4Var.J0;
        fArr[1] = j4Var.u0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        j4 j4Var = this.a;
        j4Var.getClass();
        if (!(view instanceof h2)) {
            return false;
        }
        c4 c4Var = ((h2) view).n;
        j4Var.Z(c4Var.a.articles.get(c4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        j4 j4Var = this.a;
        j4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = j4Var.H) != null && o1Var.isShowing()) {
            j4Var.H.d(true);
        }
    }
}
