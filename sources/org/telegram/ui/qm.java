package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        mk mkVar = znVar.Y;
        return mkVar == null || mkVar.getTrendingStickersAlert() == null || !znVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ij ijVar;
        rm rmVar = this.x;
        zn znVar = rmVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).n) {
            znVar.w9 = f7;
            znVar.x9 = f10;
            ai.g4 g4Var = znVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setTranslationY(f7);
                cl clVar = znVar.ab;
                if (clVar != null) {
                    clVar.setTranslationY(znVar.w9 + (znVar.o1 != null ? r2.getCurrentHeight() : 0));
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
                org.telegram.ui.Components.h60 h60Var = znVar.b3;
                if (h60Var != null) {
                    h60Var.e(f7);
                }
                ci.s6 s6Var = znVar.y2;
                if (s6Var != null) {
                    org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s6Var.b;
                    eaVar.u = f7;
                    eaVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i10);
                znVar.o9();
                znVar.r9();
            } else {
                rmVar.setNonNoveTranslation(f7);
            }
            znVar.x0.invalidate();
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
            if (pcVar != null && znVar.Yb != null) {
                pcVar.l();
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
            hk hkVar = znVar.X1;
            if (hkVar == null || (ijVar = hkVar.A0) == null) {
                return;
            }
            ijVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        zn znVar = this.x.J0;
        mk mkVar = znVar.Y;
        if (mkVar != null && (ieVar = mkVar.u0) != null) {
            ieVar.run();
            mkVar.u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = znVar.s2;
        if (i40Var == null || i40Var.getVisibility() != 0) {
            return;
        }
        znVar.s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        zn znVar = this.x.J0;
        znVar.D4 = true;
        mk mkVar = znVar.Y;
        if (mkVar != null) {
            if (z10 && (sdVar = mkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.tc tcVar = mkVar.W;
            if (tcVar != null) {
                AndroidUtilities.cancelRunOnUIThread(tcVar);
                mkVar.W.run();
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
