package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class sb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ tb c;

    public sb(tb tbVar, View view, s4.b1 b1Var) {
        this.c = tbVar;
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
        xb xbVar = this.c.n;
        int measuredHeight = xbVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            int heightWithKeyboard = (xbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - xbVar.v.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) xbVar).actionBar;
            ((org.telegram.ui.Cells.u1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - xbVar.X.getBackgroundTranslationY(), xbVar.X.getMeasuredWidth(), xbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) xbVar).actionBar;
        if (kVar == null || xbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.n2) xbVar).actionBar;
        w0Var.a0((y10 + kVar2.getMeasuredHeight()) - xbVar.X.getBackgroundTranslationY(), xbVar.X.getBackgroundSizeY());
        return true;
    }
}
