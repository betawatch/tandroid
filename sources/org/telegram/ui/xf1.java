package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xf1 extends s4.k {
    public Runnable F;
    public int G;
    public final /* synthetic */ kg1 H;

    public xf1(kg1 kg1Var) {
        this.H = kg1Var;
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
        wf1 wf1Var = new wf1(this, 0);
        this.F = wf1Var;
        AndroidUtilities.runOnUIThread(wf1Var);
    }

    @Override // s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        wf1 wf1Var = new wf1(this, 1);
        this.F = wf1Var;
        AndroidUtilities.runOnUIThread(wf1Var);
    }

    @Override // s4.k
    public final void z(s4.b1 b1Var) {
        kg1 kg1Var = this.H;
        View view = kg1Var.b1;
        if (view == b1Var.a) {
            view.setTranslationX(0.0f);
            of1 of1Var = kg1Var.O;
            if (of1Var != null) {
                of1Var.F.clear();
            }
            View view2 = kg1Var.b1;
            if (view2 instanceof hg1) {
                hg1 hg1Var = (hg1) view2;
                hg1Var.setTopicIcon(hg1Var.c5);
            }
            kg1Var.b1 = null;
        }
    }
}
