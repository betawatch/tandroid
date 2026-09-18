package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            int heightWithKeyboard = (wbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.v.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.o2) wbVar).actionBar;
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getMeasuredWidth(), wbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) wbVar).actionBar;
        if (kVar == null || wbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.o2) wbVar).actionBar;
        w0Var.W((y10 + kVar2.getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getBackgroundSizeY());
        return true;
    }
}
