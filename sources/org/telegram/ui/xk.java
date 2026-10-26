package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xk extends org.telegram.ui.Components.fl0 {
    public final int[] m1;
    public ValueAnimator n1;
    public boolean o1;
    public final /* synthetic */ un p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(un unVar, un unVar2, Activity activity, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(3, i10, activity, unVar2, u6Var);
        this.p1 = unVar;
        this.m1 = new int[2];
        this.o1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.r2) this.p1).actionBar;
        org.telegram.ui.ActionBar.w0 j10 = kVar.i(null).j(28);
        if (j10 != null) {
            int[] iArr = this.m1;
            getLocationInWindow(iArr);
            float x9 = getX();
            float width = getWidth() + x9;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f7 = width2 + (dp * (z11 ? -1 : 1));
            if (z11) {
                s(f7 - x9, !this.o1);
            } else {
                s(f7 - width, !this.o1);
            }
            this.o1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        this.n1.setInterpolator(org.telegram.ui.Components.ds.h);
        this.n1.setDuration(420L);
        this.n1.start();
    }
}
