package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ xm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(xm xmVar, xm xmVar2) {
        super(xmVar2);
        this.x = xmVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        fo foVar = this.x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = foVar.getParentLayout();
        if (foVar.Pa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.m2) foVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || foVar.pa > 0 || System.currentTimeMillis() - foVar.E9 < 250) {
            return false;
        }
        if ((foVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.m2) foVar).isPaused;
        if (z12 || !foVar.N5) {
            return false;
        }
        bi.w3 w3Var = foVar.J1;
        if (w3Var != null && w3Var.isShowing()) {
            return false;
        }
        sk skVar = foVar.Y;
        return skVar == null || skVar.getTrendingStickersAlert() == null || !foVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.g20 g20Var;
        xm xmVar = this.x;
        fo foVar = xmVar.J0;
        if (foVar.getParentLayout() == null || !((ActionBarLayout) foVar.getParentLayout()).n) {
            foVar.w9 = f7;
            foVar.x9 = f10;
            bi.w3 w3Var = foVar.J1;
            if (w3Var == null || !w3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.setTranslationY(f7);
                il ilVar = foVar.bb;
                if (ilVar != null) {
                    ilVar.setTranslationY(foVar.w9 + (foVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                di.d4 d4Var = foVar.w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                di.d4 d4Var2 = foVar.v1;
                if (d4Var2 != null) {
                    d4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = foVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                foVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                foVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.u60 u60Var = foVar.b3;
                if (u60Var != null) {
                    u60Var.e(f7);
                }
                di.p6 p6Var = foVar.y2;
                if (p6Var != null) {
                    org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) p6Var.b;
                    haVar.u = f7;
                    haVar.d.invalidate();
                }
                foVar.setFragmentPanTranslationOffset(i10);
                foVar.t9();
                foVar.w9();
            } else {
                xmVar.setNonNoveTranslation(f7);
            }
            foVar.x0.invalidate();
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
            if (scVar != null && foVar.Zb != null) {
                scVar.l();
            }
            if (AndroidUtilities.isTablet() && (foVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) foVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof yy) {
                    yy yyVar = (yy) lastFragment;
                    yyVar.v1 = f7;
                    yyVar.V4();
                }
            }
            org.telegram.ui.Components.v40 v40Var = foVar.s2;
            if (v40Var != null && v40Var.getVisibility() == 0) {
                foVar.s2.f(foVar.Y.getAudioVideoButtonContainer(), false);
            }
            mk mkVar = foVar.X1;
            if (mkVar == null || (g20Var = mkVar.B0) == null) {
                return;
            }
            g20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        org.telegram.ui.Components.je jeVar;
        fo foVar = this.x.J0;
        sk skVar = foVar.Y;
        if (skVar != null && (jeVar = skVar.u0) != null) {
            jeVar.run();
            skVar.u0 = null;
        }
        org.telegram.ui.Components.v40 v40Var = foVar.s2;
        if (v40Var == null || v40Var.getVisibility() != 0) {
            return;
        }
        foVar.s2.f(foVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        fo foVar = this.x.J0;
        foVar.D4 = true;
        sk skVar = foVar.Y;
        if (skVar != null) {
            if (z10 && (tdVar = skVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                skVar.V.run();
            }
            vp vpVar = skVar.W;
            if (vpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vpVar);
                skVar.W.run();
            }
        }
        org.telegram.ui.Components.v40 v40Var = foVar.f2;
        if (v40Var != null) {
            v40Var.b(false);
        }
        di.d4 d4Var = foVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final int i() {
        xm xmVar = this.x;
        fo foVar = xmVar.J0;
        if (xmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !foVar.Y.r0()) {
            return 0;
        }
        return foVar.Y.getEmojiPadding();
    }
}
