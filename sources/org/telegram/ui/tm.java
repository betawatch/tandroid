package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class tm extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ um x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(um umVar, um umVar2) {
        super(umVar2);
        this.x = umVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        co coVar = this.x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = coVar.getParentLayout();
        if (coVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || coVar.pa > 0 || System.currentTimeMillis() - coVar.E9 < 250) {
            return false;
        }
        if ((coVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) coVar).isPaused;
        if (z12 || !coVar.N5) {
            return false;
        }
        bi.t3 t3Var = coVar.J1;
        if (t3Var != null && t3Var.isShowing()) {
            return false;
        }
        mk mkVar = coVar.Y;
        return mkVar == null || mkVar.getTrendingStickersAlert() == null || !coVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ij ijVar;
        um umVar = this.x;
        co coVar = umVar.J0;
        if (coVar.getParentLayout() == null || !((ActionBarLayout) coVar.getParentLayout()).n) {
            coVar.w9 = f7;
            coVar.x9 = f10;
            bi.t3 t3Var = coVar.J1;
            if (t3Var == null || !t3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setTranslationY(f7);
                dl dlVar = coVar.bb;
                if (dlVar != null) {
                    dlVar.setTranslationY(coVar.w9 + (coVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                di.f4 f4Var = coVar.w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                di.f4 f4Var2 = coVar.v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = coVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f11 = f7 / 2.0f;
                coVar.P.setTranslationY(f11);
                int i10 = (int) f7;
                coVar.X0.setBackgroundTranslation(i10);
                gl glVar = coVar.b3;
                if (glVar != null) {
                    glVar.t0 = f11;
                    glVar.s();
                }
                di.r6 r6Var = coVar.y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                coVar.setFragmentPanTranslationOffset(i10);
                coVar.o9();
                coVar.r9();
            } else {
                umVar.setNonNoveTranslation(f7);
            }
            coVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && coVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (coVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) coVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.v1 = f7;
                    uyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = coVar.s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                coVar.s2.f(coVar.Y.getAudioVideoButtonContainer(), false);
            }
            hk hkVar = coVar.X1;
            if (hkVar == null || (ijVar = hkVar.A0) == null) {
                return;
            }
            ijVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        co coVar = this.x.J0;
        mk mkVar = coVar.Y;
        if (mkVar != null && (ieVar = mkVar.u0) != null) {
            ieVar.run();
            mkVar.u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = coVar.s2;
        if (i40Var == null || i40Var.getVisibility() != 0) {
            return;
        }
        coVar.s2.f(coVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        co coVar = this.x.J0;
        coVar.D4 = true;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            if (z10 && (sdVar = mkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.uc ucVar = mkVar.W;
            if (ucVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ucVar);
                mkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = coVar.f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        di.f4 f4Var = coVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        um umVar = this.x;
        co coVar = umVar.J0;
        if (umVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !coVar.Y.t0()) {
            return 0;
        }
        return coVar.Y.getEmojiPadding();
    }
}
