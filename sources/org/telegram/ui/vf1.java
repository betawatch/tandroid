package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vf1 extends s4.j {
    public Runnable F;
    public int G;
    public final /* synthetic */ ig1 H;

    public vf1(ig1 ig1Var) {
        this.H = ig1Var;
    }

    @Override // s4.j
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

    @Override // s4.j
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F = null;
        }
        uf1 uf1Var = new uf1(this, 0);
        this.F = uf1Var;
        AndroidUtilities.runOnUIThread(uf1Var);
    }

    @Override // s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        uf1 uf1Var = new uf1(this, 1);
        this.F = uf1Var;
        AndroidUtilities.runOnUIThread(uf1Var);
    }

    @Override // s4.j
    public final void z(s4.c1 c1Var) {
        ig1 ig1Var = this.H;
        View view = ig1Var.b1;
        if (view == c1Var.a) {
            view.setTranslationX(0.0f);
            mf1 mf1Var = ig1Var.O;
            if (mf1Var != null) {
                mf1Var.F.clear();
            }
            View view2 = ig1Var.b1;
            if (view2 instanceof fg1) {
                fg1 fg1Var = (fg1) view2;
                fg1Var.setTopicIcon(fg1Var.Y4);
            }
            ig1Var.b1 = null;
        }
    }
}
