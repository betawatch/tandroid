package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qm extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ rm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(rm rmVar, rm rmVar2) {
        super(rmVar2);
        this.x = rmVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        zn znVar = this.x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        if (znVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || znVar.pa > 0 || System.currentTimeMillis() - znVar.E9 < 250) {
            return false;
        }
        if ((znVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) znVar).isPaused;
        if (z12 || !znVar.N5) {
            return false;
        }
        ai.g4 g4Var = znVar.J1;
        if (g4Var != null && g4Var.isShowing()) {
            return false;
        }
        lk lkVar = znVar.Y;
        return lkVar == null || lkVar.getTrendingStickersAlert() == null || !znVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        hj hjVar;
        rm rmVar = this.x;
        zn znVar = rmVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).n) {
            znVar.w9 = f7;
            znVar.x9 = f10;
            ai.g4 g4Var = znVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setTranslationY(f7);
                bl blVar = znVar.ab;
                if (blVar != null) {
                    blVar.setTranslationY(znVar.w9 + (znVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.f4 f4Var = znVar.w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                ci.f4 f4Var2 = znVar.v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                znVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                znVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.f60 f60Var = znVar.b3;
                if (f60Var != null) {
                    f60Var.f(f7);
                }
                ci.s6 s6Var = znVar.y2;
                if (s6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) s6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i10);
                znVar.o9();
                znVar.r9();
            } else {
                rmVar.setNonNoveTranslation(f7);
            }
            znVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && znVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.v1 = f7;
                    uyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = znVar.s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                znVar.s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
            }
            gk gkVar = znVar.X1;
            if (gkVar == null || (hjVar = gkVar.A0) == null) {
                return;
            }
            hjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        zn znVar = this.x.J0;
        lk lkVar = znVar.Y;
        if (lkVar != null && (ieVar = lkVar.u0) != null) {
            ieVar.run();
            lkVar.u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = znVar.s2;
        if (i40Var == null || i40Var.getVisibility() != 0) {
            return;
        }
        znVar.s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        zn znVar = this.x.J0;
        znVar.D4 = true;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            if (z10 && (rdVar = lkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                lkVar.V.run();
            }
            org.telegram.ui.Components.zd zdVar = lkVar.W;
            if (zdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zdVar);
                lkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = znVar.f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        ci.f4 f4Var = znVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        rm rmVar = this.x;
        zn znVar = rmVar.J0;
        if (rmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !znVar.Y.t0()) {
            return 0;
        }
        return znVar.Y.getEmojiPadding();
    }
}
