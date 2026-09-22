package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sf1 extends s4.j {
    public Runnable F;
    public int G;
    public final /* synthetic */ fg1 H;

    public sf1(fg1 fg1Var) {
        this.H = fg1Var;
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
        rf1 rf1Var = new rf1(this, 0);
        this.F = rf1Var;
        AndroidUtilities.runOnUIThread(rf1Var);
    }

    @Override // s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rf1 rf1Var = new rf1(this, 1);
        this.F = rf1Var;
        AndroidUtilities.runOnUIThread(rf1Var);
    }

    @Override // s4.j
    public final void z(s4.c1 c1Var) {
        fg1 fg1Var = this.H;
        View view = fg1Var.b1;
        if (view == c1Var.a) {
            view.setTranslationX(0.0f);
            jf1 jf1Var = fg1Var.O;
            if (jf1Var != null) {
                jf1Var.F.clear();
            }
            View view2 = fg1Var.b1;
            if (view2 instanceof cg1) {
                cg1 cg1Var = (cg1) view2;
                cg1Var.setTopicIcon(cg1Var.Y4);
            }
            fg1Var.b1 = null;
        }
    }
}
