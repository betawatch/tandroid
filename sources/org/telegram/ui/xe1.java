package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xe1 extends f2.l {
    public Runnable F;
    public int G;
    public final /* synthetic */ kf1 H;

    public xe1(kf1 kf1Var) {
        this.H = kf1Var;
    }

    @Override // f2.l
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

    @Override // f2.l
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        we1 we1Var = new we1(this, 0);
        this.F = we1Var;
        AndroidUtilities.runOnUIThread(we1Var);
    }

    @Override // f2.l, f2.t0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        we1 we1Var = new we1(this, 1);
        this.F = we1Var;
        AndroidUtilities.runOnUIThread(we1Var);
    }

    @Override // f2.l
    public final void z(f2.l1 l1Var) {
        kf1 kf1Var = this.H;
        View view = kf1Var.Y0;
        if (view == l1Var.a) {
            view.setTranslationX(0.0f);
            ne1 ne1Var = kf1Var.L;
            if (ne1Var != null) {
                ne1Var.C.clear();
            }
            View view2 = kf1Var.Y0;
            if (view2 instanceof hf1) {
                hf1 hf1Var = (hf1) view2;
                hf1Var.setTopicIcon(hf1Var.V4);
            }
            kf1Var.Y0 = null;
        }
    }
}
