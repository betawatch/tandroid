package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wj extends org.telegram.ui.Components.k31 {
    public final /* synthetic */ un e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(un unVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.e = unVar;
    }

    @Override // org.telegram.ui.Components.k31, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        un unVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar.q() || unVar.J9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
