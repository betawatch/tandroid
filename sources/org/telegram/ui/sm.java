package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ tm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(tm tmVar, tm tmVar2) {
        super(tmVar2);
        this.x = tmVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bo boVar = this.x.J0;
        org.telegram.ui.ActionBar.e5 parentLayout = boVar.getParentLayout();
        if (boVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) boVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.o2) boVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || boVar.pa > 0 || System.currentTimeMillis() - boVar.E9 < 250) {
            return false;
        }
        if ((boVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.o2) boVar).isPaused;
        if (z12 || !boVar.N5) {
            return false;
        }
        ai.g4 g4Var = boVar.J1;
        if (g4Var != null && g4Var.isShowing()) {
            return false;
        }
        nk nkVar = boVar.Y;
        return nkVar == null || nkVar.getTrendingStickersAlert() == null || !boVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        jj jjVar;
        tm tmVar = this.x;
        bo boVar = tmVar.J0;
        if (boVar.getParentLayout() == null || !((ActionBarLayout) boVar.getParentLayout()).n) {
            boVar.w9 = f7;
            boVar.x9 = f10;
            ai.g4 g4Var = boVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar.setTranslationY(f7);
                dl dlVar = boVar.ab;
                if (dlVar != null) {
                    dlVar.setTranslationY(boVar.w9 + (boVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.f4 f4Var = boVar.w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                ci.f4 f4Var2 = boVar.v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = boVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f11 = f7 / 2.0f;
                boVar.P.setTranslationY(f11);
                int i10 = (int) f7;
                boVar.X0.setBackgroundTranslation(i10);
                gl glVar = boVar.b3;
                if (glVar != null) {
                    glVar.t0 = f11;
                    glVar.s();
                }
                ci.s6 s6Var = boVar.y2;
                if (s6Var != null) {
                    org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) s6Var.b;
                    daVar.u = f7;
                    daVar.d.invalidate();
                }
                boVar.setFragmentPanTranslationOffset(i10);
                boVar.o9();
                boVar.r9();
            } else {
                tmVar.setNonNoveTranslation(f7);
            }
            boVar.x0.invalidate();
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
            if (ocVar != null && boVar.Yb != null) {
                ocVar.l();
            }
            if (AndroidUtilities.isTablet() && (boVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) boVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof wy) {
                    wy wyVar = (wy) lastFragment;
                    wyVar.v1 = f7;
                    wyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = boVar.s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                boVar.s2.f(boVar.Y.getAudioVideoButtonContainer(), false);
            }
            ik ikVar = boVar.X1;
            if (ikVar == null || (jjVar = ikVar.A0) == null) {
                return;
            }
            jjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        org.telegram.ui.Components.ge geVar;
        bo boVar = this.x.J0;
        nk nkVar = boVar.Y;
        if (nkVar != null && (geVar = nkVar.u0) != null) {
            geVar.run();
            nkVar.u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = boVar.s2;
        if (i40Var == null || i40Var.getVisibility() != 0) {
            return;
        }
        boVar.s2.f(boVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.qd qdVar;
        bo boVar = this.x.J0;
        boVar.D4 = true;
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            if (z10 && (qdVar = nkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                nkVar.V.run();
            }
            wh whVar = nkVar.W;
            if (whVar != null) {
                AndroidUtilities.cancelRunOnUIThread(whVar);
                nkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = boVar.f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        ci.f4 f4Var = boVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final int i() {
        tm tmVar = this.x;
        bo boVar = tmVar.J0;
        if (tmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !boVar.Y.u0()) {
            return 0;
        }
        return boVar.Y.getEmojiPadding();
    }
}
