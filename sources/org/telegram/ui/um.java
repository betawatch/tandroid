package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class um extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ vm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(vm vmVar, vm vmVar2) {
        super(vmVar2);
        this.x = vmVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        eo eoVar = this.x.J0;
        org.telegram.ui.ActionBar.f5 parentLayout = eoVar.getParentLayout();
        if (eoVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || eoVar.pa > 0 || System.currentTimeMillis() - eoVar.E9 < 250) {
            return false;
        }
        if ((eoVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.p2) eoVar).isPaused;
        if (z12 || !eoVar.N5) {
            return false;
        }
        gg.m mVar = eoVar.J1;
        if (mVar != null && mVar.isShowing()) {
            return false;
        }
        ok okVar = eoVar.Y;
        return okVar == null || okVar.getTrendingStickersAlert() == null || !eoVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        kj kjVar;
        vm vmVar = this.x;
        eo eoVar = vmVar.J0;
        if (eoVar.getParentLayout() == null || !((ActionBarLayout) eoVar.getParentLayout()).n) {
            eoVar.w9 = f7;
            eoVar.x9 = f10;
            gg.m mVar = eoVar.J1;
            if (mVar == null || !mVar.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar.setTranslationY(f7);
                fl flVar = eoVar.bb;
                if (flVar != null) {
                    flVar.setTranslationY(eoVar.w9 + (eoVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                bi.x4 x4Var = eoVar.w1;
                if (x4Var != null) {
                    x4Var.setTranslationY(f7);
                }
                bi.x4 x4Var2 = eoVar.v1;
                if (x4Var2 != null) {
                    x4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f11 = f7 / 2.0f;
                eoVar.P.setTranslationY(f11);
                int i10 = (int) f7;
                eoVar.X0.setBackgroundTranslation(i10);
                il ilVar = eoVar.b3;
                if (ilVar != null) {
                    ilVar.t0 = f11;
                    ilVar.s();
                }
                bi.s7 s7Var = eoVar.y2;
                if (s7Var != null) {
                    org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s7Var.b;
                    eaVar.u = f7;
                    eaVar.d.invalidate();
                }
                eoVar.setFragmentPanTranslationOffset(i10);
                eoVar.o9();
                eoVar.r9();
            } else {
                vmVar.setNonNoveTranslation(f7);
            }
            eoVar.x0.invalidate();
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
            if (pcVar != null && eoVar.Zb != null) {
                pcVar.l();
            }
            if (AndroidUtilities.isTablet() && (eoVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) eoVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof wy) {
                    wy wyVar = (wy) lastFragment;
                    wyVar.v1 = f7;
                    wyVar.X4();
                }
            }
            org.telegram.ui.Components.s40 s40Var = eoVar.s2;
            if (s40Var != null && s40Var.getVisibility() == 0) {
                eoVar.s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
            }
            jk jkVar = eoVar.X1;
            if (jkVar == null || (kjVar = jkVar.A0) == null) {
                return;
            }
            kjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        eo eoVar = this.x.J0;
        ok okVar = eoVar.Y;
        if (okVar != null && (ieVar = okVar.u0) != null) {
            ieVar.run();
            okVar.u0 = null;
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.s2;
        if (s40Var == null || s40Var.getVisibility() != 0) {
            return;
        }
        eoVar.s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.qd qdVar;
        eo eoVar = this.x.J0;
        eoVar.D4 = true;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            if (z10 && (qdVar = okVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                okVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = okVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                okVar.W.run();
            }
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.f2;
        if (s40Var != null) {
            s40Var.b(false);
        }
        bi.x4 x4Var = eoVar.A1;
        if (x4Var != null) {
            x4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final int i() {
        vm vmVar = this.x;
        eo eoVar = vmVar.J0;
        if (vmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !eoVar.Y.t0()) {
            return 0;
        }
        return eoVar.Y.getEmojiPadding();
    }
}
