package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements uq0, org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ i4 a;

    public /* synthetic */ s(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.uq0
    public void a(float[] fArr) {
        i4 i4Var = this.a;
        fArr[0] = i4Var.K0;
        fArr[1] = i4Var.v0[0].b.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        i4 i4Var = this.a;
        i4Var.getClass();
        if (!(view instanceof h2)) {
            return false;
        }
        b4 b4Var = ((h2) view).n;
        i4Var.X(b4Var.a.articles.get(b4Var.b).url);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        i4 i4Var = this.a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = i4Var.I) != null && f1Var.isShowing()) {
            i4Var.I.d(true);
        }
    }
}
