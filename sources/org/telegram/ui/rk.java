package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.uj0 {
    public final int[] h1;
    public ValueAnimator i1;
    public boolean j1;
    public final /* synthetic */ qn k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(qn qnVar, qn qnVar2, Activity activity, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(3, i9, activity, qnVar2, b6Var);
        this.k1 = qnVar;
        this.h1 = new int[2];
        this.j1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i9, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.o2) this.k1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.h1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f10 = width2 + (dp * (z11 ? -1 : 1));
            if (z11) {
                s(f10 - x10, !this.j1);
            } else {
                s(f10 - width, !this.j1);
            }
            this.j1 = false;
        }
    }

    public final void s(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f10);
        this.i1 = ofFloat;
        ofFloat.addUpdateListener(new f3(this, 6));
        this.i1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.i1.setDuration(420L);
        this.i1.start();
    }
}
