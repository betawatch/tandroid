package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements zu0, org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ n4 a;

    public /* synthetic */ v(n4 n4Var) {
        this.a = n4Var;
    }

    @Override // org.telegram.ui.zu0
    public void c(float[] fArr) {
        n4 n4Var = this.a;
        fArr[0] = n4Var.F0;
        fArr[1] = n4Var.r0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        n4 n4Var = this.a;
        n4Var.getClass();
        if (!(view instanceof m2)) {
            return false;
        }
        h4 h4Var = ((m2) view).n;
        n4Var.Z(h4Var.a.articles.get(h4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        n4 n4Var = this.a;
        n4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = n4Var.E) != null && p1Var.isShowing()) {
            n4Var.E.d(true);
        }
    }
}
