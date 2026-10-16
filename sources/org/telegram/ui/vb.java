package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ wb c;

    public vb(wb wbVar, View view, s4.b1 b1Var) {
        this.c = wbVar;
        this.a = view;
        this.b = b1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ac acVar = this.c.n;
        int measuredHeight = acVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            int heightWithKeyboard = (acVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - acVar.v.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
            ((org.telegram.ui.Cells.u1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - acVar.X.getBackgroundTranslationY(), acVar.X.getMeasuredWidth(), acVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
        if (kVar == null || acVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
        w0Var.a0((y10 + kVar2.getMeasuredHeight()) - acVar.X.getBackgroundTranslationY(), acVar.X.getBackgroundSizeY());
        return true;
    }
}
