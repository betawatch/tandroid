package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yf1 extends s4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ lg1 H;

    public yf1(lg1 lg1Var) {
        this.H = lg1Var;
    }

    @Override // s4.k
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().setAnimationInProgress(this.G, null, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.F = null;
            }
        }
    }

    @Override // s4.k
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        xf1 xf1Var = new xf1(this, 0);
        this.F = xf1Var;
        AndroidUtilities.runOnUIThread(xf1Var);
    }

    @Override // s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        xf1 xf1Var = new xf1(this, 1);
        this.F = xf1Var;
        AndroidUtilities.runOnUIThread(xf1Var);
    }

    @Override // s4.k
    public final void z(s4.b1 b1Var) {
        lg1 lg1Var = this.H;
        View view = lg1Var.b1;
        if (view == b1Var.a) {
            view.setTranslationX(0.0f);
            pf1 pf1Var = lg1Var.O;
            if (pf1Var != null) {
                pf1Var.F.clear();
            }
            View view2 = lg1Var.b1;
            if (view2 instanceof ig1) {
                ig1 ig1Var = (ig1) view2;
                ig1Var.setTopicIcon(ig1Var.c5);
            }
            lg1Var.b1 = null;
        }
    }
}
