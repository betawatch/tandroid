package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ sb c;

    public rb(sb sbVar, View view, s4.c1 c1Var) {
        this.c = sbVar;
        this.a = view;
        this.b = c1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.c.n;
        int measuredHeight = wbVar.E.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            int heightWithKeyboard = (wbVar.b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.E.getTop();
            float y3 = view.getY();
            lVar3 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + lVar3.getMeasuredHeight()) - wbVar.b0.getBackgroundTranslationY(), wbVar.b0.getMeasuredWidth(), wbVar.b0.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        if (lVar == null || wbVar.b0 == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y10 = view.getY();
        lVar2 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        w0Var.W((y10 + lVar2.getMeasuredHeight()) - wbVar.b0.getBackgroundTranslationY(), wbVar.b0.getBackgroundSizeY());
        return true;
    }
}
