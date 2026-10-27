package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.e1 b;
    public final /* synthetic */ sb c;

    public rb(sb sbVar, View view, s4.e1 e1Var) {
        this.c = sbVar;
        this.a = view;
        this.b = e1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.c.n;
        int measuredHeight = wbVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            int heightWithKeyboard = (wbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.v.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.r2) wbVar).actionBar;
            ((org.telegram.ui.Cells.s1) view).d4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getMeasuredWidth(), wbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.r2) wbVar).actionBar;
        if (kVar == null || wbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.r2) wbVar).actionBar;
        v0Var.Y((y10 + kVar2.getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getBackgroundSizeY());
        return true;
    }
}
