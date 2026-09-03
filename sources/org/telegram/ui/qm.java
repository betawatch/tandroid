package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qm extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ rm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(rm rmVar, rm rmVar2) {
        super(rmVar2);
        this.x = rmVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        boolean z4;
        boolean z10;
        boolean z11;
        zn znVar = this.x.G0;
        org.telegram.ui.ActionBar.e5 parentLayout = znVar.getParentLayout();
        if (znVar.La) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
        if (z10 || AndroidUtilities.isInMultiwindow || parentLayout == null || znVar.ma > 0 || System.currentTimeMillis() - znVar.B9 < 250) {
            return false;
        }
        if ((znVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.p2) znVar).isPaused;
        if (z11 || !znVar.K5) {
            return false;
        }
        nh.t2 t2Var = znVar.G1;
        if (t2Var != null && t2Var.isShowing()) {
            return false;
        }
        lk lkVar = znVar.V;
        return lkVar == null || lkVar.getTrendingStickersAlert() == null || !znVar.V.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        gj gjVar;
        rm rmVar = this.x;
        zn znVar = rmVar.G0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).n) {
            znVar.t9 = f10;
            znVar.u9 = f11;
            nh.t2 t2Var = znVar.G1;
            if (t2Var == null || !t2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                kVar.setTranslationY(f10);
                cl clVar = znVar.Ya;
                if (clVar != null) {
                    clVar.setTranslationY(znVar.t9 + (znVar.l1 != null ? r2.getCurrentHeight() : 0));
                }
                ph.f3 f3Var = znVar.t1;
                if (f3Var != null) {
                    f3Var.setTranslationY(f10);
                }
                ph.f3 f3Var2 = znVar.s1;
                if (f3Var2 != null) {
                    f3Var2.setTranslationY(f10);
                }
                FrameLayout frameLayout = znVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f12 = f10 / 2.0f;
                znVar.M.setTranslationY(f12);
                int i10 = (int) f10;
                znVar.U0.setBackgroundTranslation(i10);
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.q0 = f12;
                    flVar.s();
                }
                eg.i0 i0Var = znVar.v2;
                if (i0Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.b;
                    x9Var.u = f10;
                    x9Var.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i10);
                znVar.o9();
                znVar.r9();
            } else {
                rmVar.setNonNoveTranslation(f10);
            }
            znVar.u0.invalidate();
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null && znVar.Wb != null) {
                icVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof qy) {
                    qy qyVar = (qy) lastFragment;
                    qyVar.s1 = f10;
                    qyVar.X4();
                }
            }
            org.telegram.ui.Components.l40 l40Var = znVar.p2;
            if (l40Var != null && l40Var.getVisibility() == 0) {
                znVar.p2.f(znVar.V.getAudioVideoButtonContainer(), false);
            }
            fk fkVar = znVar.U1;
            if (fkVar == null || (gjVar = fkVar.x0) == null) {
                return;
            }
            gjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        zn znVar = this.x.G0;
        lk lkVar = znVar.V;
        if (lkVar != null && (ydVar = lkVar.r0) != null) {
            ydVar.run();
            lkVar.r0 = null;
        }
        org.telegram.ui.Components.l40 l40Var = znVar.p2;
        if (l40Var == null || l40Var.getVisibility() != 0) {
            return;
        }
        znVar.p2.f(znVar.V.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        org.telegram.ui.Components.id idVar;
        zn znVar = this.x.G0;
        znVar.A4 = true;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            if (z4 && (idVar = lkVar.S) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                lkVar.S.run();
            }
            np npVar = lkVar.T;
            if (npVar != null) {
                AndroidUtilities.cancelRunOnUIThread(npVar);
                lkVar.T.run();
            }
        }
        org.telegram.ui.Components.l40 l40Var = znVar.c2;
        if (l40Var != null) {
            l40Var.b(false);
        }
        ph.f3 f3Var = znVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final int i() {
        rm rmVar = this.x;
        zn znVar = rmVar.G0;
        if (rmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !znVar.V.t0()) {
            return 0;
        }
        return znVar.V.getEmojiPadding();
    }
}
