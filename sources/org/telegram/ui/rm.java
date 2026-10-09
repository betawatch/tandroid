package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ sm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(sm smVar, sm smVar2) {
        super(smVar2);
        this.x = smVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        zn znVar = this.x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        if (znVar.Pa) {
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
        if ((znVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) znVar).isPaused;
        if (z12 || !znVar.N5) {
            return false;
        }
        ai.h4 h4Var = znVar.J1;
        if (h4Var != null && h4Var.isShowing()) {
            return false;
        }
        ok okVar = znVar.Y;
        return okVar == null || okVar.getTrendingStickersAlert() == null || !znVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.k20 k20Var;
        sm smVar = this.x;
        zn znVar = smVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).n) {
            znVar.w9 = f7;
            znVar.x9 = f10;
            ai.h4 h4Var = znVar.J1;
            if (h4Var == null || !h4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setTranslationY(f7);
                el elVar = znVar.bb;
                if (elVar != null) {
                    elVar.setTranslationY(znVar.w9 + (znVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.d4 d4Var = znVar.w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                ci.d4 d4Var2 = znVar.v1;
                if (d4Var2 != null) {
                    d4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                znVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                znVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.y60 y60Var = znVar.b3;
                if (y60Var != null) {
                    y60Var.e(f7);
                }
                ci.r6 r6Var = znVar.y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) r6Var.b;
                    iaVar.u = f7;
                    iaVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i10);
                znVar.t9();
                znVar.w9();
            } else {
                smVar.setNonNoveTranslation(f7);
            }
            znVar.x0.invalidate();
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
            if (tcVar != null && znVar.Zb != null) {
                tcVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ty) {
                    ty tyVar = (ty) lastFragment;
                    tyVar.v1 = f7;
                    tyVar.U4();
                }
            }
            org.telegram.ui.Components.z40 z40Var = znVar.s2;
            if (z40Var != null && z40Var.getVisibility() == 0) {
                znVar.s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
            }
            ik ikVar = znVar.X1;
            if (ikVar == null || (k20Var = ikVar.B0) == null) {
                return;
            }
            k20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.le leVar;
        zn znVar = this.x.J0;
        ok okVar = znVar.Y;
        if (okVar != null && (leVar = okVar.u0) != null) {
            leVar.run();
            okVar.u0 = null;
        }
        org.telegram.ui.Components.z40 z40Var = znVar.s2;
        if (z40Var == null || z40Var.getVisibility() != 0) {
            return;
        }
        znVar.s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.vd vdVar;
        zn znVar = this.x.J0;
        znVar.D4 = true;
        ok okVar = znVar.Y;
        if (okVar != null) {
            if (z10 && (vdVar = okVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                okVar.V.run();
            }
            org.telegram.ui.Components.ea eaVar = okVar.W;
            if (eaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eaVar);
                okVar.W.run();
            }
        }
        org.telegram.ui.Components.z40 z40Var = znVar.f2;
        if (z40Var != null) {
            z40Var.b(false);
        }
        ci.d4 d4Var = znVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        sm smVar = this.x;
        zn znVar = smVar.J0;
        if (smVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !znVar.Y.r0()) {
            return 0;
        }
        return znVar.Y.getEmojiPadding();
    }
}
