package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xw extends s4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ ty L;
    public final /* synthetic */ uy M;

    public xw(uy uyVar, ty tyVar) {
        this.M = uyVar;
        this.L = tyVar;
    }

    @Override // s4.c0
    public final int R0() {
        ty tyVar = this.L;
        return (tyVar.s == 0 && this.M.Z3() && tyVar.v == 2) ? 1 : 0;
    }

    @Override // s4.c0, s4.o0
    public final void b0(pf.e eVar, s4.z0 z0Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new ww(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            uy uyVar = this.M;
            sb2.append(uyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(uyVar.y3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // s4.c0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.o0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ty tyVar = this.L;
        if (tyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.m0(22, this, tyVar));
            this.K.addListener(new org.telegram.ui.Components.k61(this, 19));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.pr.f);
            this.K.start();
        }
    }

    @Override // s4.c0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.uy.r1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.s() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016d, code lost:
    
        if (r8.s() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c3, code lost:
    
        if (r8.s() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0248, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.s() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027a  */
    @Override // s4.c0, s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        boolean z10;
        int i11;
        int L0;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i14;
        int dp;
        View m10;
        int o02;
        boolean z11;
        ax axVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        uy uyVar = this.M;
        UndoView[] undoViewArr = uyVar.y0;
        ty tyVar = this.L;
        qy qyVar = tyVar.a;
        int i15 = 0;
        if (!qyVar.X1) {
            boolean z12 = qyVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && uyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                }
                float f11 = uyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                uy.q1(uyVar, tyVar, f10);
                return super.o0(i15, eVar, z0Var);
            }
            if (uyVar.K && uyVar.X2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                }
                z10 = true;
                int paddingTop = tyVar.a.getPaddingTop();
                int dp2 = (z10 || uyVar.F3.c() || uyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (uyVar.R && tyVar.s == 0 && !uyVar.l2 && uyVar.V2 == 0) {
                    if (uyVar.X2 == 0 && uyVar.getMessagesController().hasHiddenArchive() && tyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !uyVar.F3.c())) && i10 < 0) {
                            tyVar.a.setOverScrollMode(0);
                            L0 = tyVar.c.L0();
                            if (L0 == 0 && (m10 = tyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z10 && z12 && !uyVar.F3.c()) {
                                        if (uyVar.N == 0.0f) {
                                            tyVar.a.setOverScrollMode(0);
                                        } else {
                                            tyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = tyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    tyVar.a.setOverScrollMode(2);
                                    i13 = (int) ((0.45f - (top * 0.25f)) * i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].e(1, true);
                                    }
                                }
                                i12 = i13;
                                if (tyVar.s == 0) {
                                    viewOffset = ((int) tyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    tyVar.a.setViewsOffset(f7);
                                }
                                if (tyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i12, eVar, z0Var);
                                if (o02 == 0) {
                                    uy.q1(uyVar, tyVar, uyVar.T - (uyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = tyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    bx bxVar = tyVar.d;
                                    if (((hg.k) bxVar.M.get(i11)).a == 0) {
                                        if (!((hg.k) bxVar.M.get(i11)).f || bxVar.J) {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                                        } else {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                                        }
                                        i14 = dp + 1;
                                    } else {
                                        i14 = 0;
                                    }
                                    i16 += i14;
                                    i11++;
                                }
                                int i17 = (-(m12.getTop() - dp2)) + i16;
                                if (!uyVar.F3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) tyVar.b.c) != null || uyVar.E0.g()) && !uyVar.F3.c() && !uyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) tyVar.b.c) != null || uyVar.E0.g()) && !uyVar.F3.c() && !uyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (tyVar.s == 0 && tyVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                        viewOffset = ((int) tyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        tyVar.a.setViewsOffset(f7);
                                    }
                                    if (tyVar.s == 0 || tyVar.v == 0 || !uyVar.Z3() || uyVar.R) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i12, eVar, z0Var);
                                        if (o02 == 0 && i10 < 0 && z12 && !uyVar.F3.c() && z132 && uyVar.t3 == 0.0f) {
                                            uy.q1(uyVar, tyVar, uyVar.T - (uyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, z0Var);
                                    ax axVar2 = tyVar.n;
                                    if (axVar2 != null) {
                                        axVar2.a = o03;
                                    }
                                    int L02 = tyVar.c.L0();
                                    View m13 = L02 == 0 ? tyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        uyVar.c3 = 0L;
                                        uyVar.e3 = false;
                                        boolean z14 = tyVar.v != 2;
                                        tyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        ax axVar3 = tyVar.n;
                                        if (axVar3 != null) {
                                            ValueAnimator valueAnimator = axVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.r2 r2Var = axVar3.H;
                                            if (r2Var != null) {
                                                r2Var.removeCallbacks(axVar3.d0);
                                            }
                                            axVar3.x = 0.0f;
                                            axVar3.y = false;
                                            axVar3.e0 = false;
                                            tyVar.n.f(0.0f);
                                            tyVar.n.I = tyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (uyVar.c3 == 0) {
                                            uyVar.c3 = System.currentTimeMillis();
                                        }
                                        if (tyVar.v == 2 && (axVar = tyVar.n) != null) {
                                            axVar.h();
                                        }
                                        if (z15 && !uyVar.F3.c() && !uyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - uyVar.c3 > 220;
                                        if (uyVar.e3 != z16) {
                                            uyVar.e3 = z16;
                                            if (tyVar.v == 2) {
                                                try {
                                                    tyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                ax axVar4 = tyVar.n;
                                                if (axVar4 != null) {
                                                    axVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (tyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z12) {
                                            tyVar.a.setViewsOffset(tyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (tyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        ax axVar5 = tyVar.n;
                                        if (axVar5 != null) {
                                            axVar5.f(top2);
                                            tyVar.n.I = tyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (tyVar.v == 1 && o03 == 0 && i10 < 0 && z12 && !uyVar.F3.c() && z11 && uyVar.t3 == 0.0f) {
                                        uy.q1(uyVar, tyVar, uyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, uyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (tyVar.s == 0) {
                        }
                        if (tyVar.s == 0) {
                        }
                        boolean z1322 = z10;
                        o02 = super.o0(i12, eVar, z0Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
                tyVar.a.setOverScrollMode(0);
                L0 = tyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = tyVar.a.getPaddingTop();
            if (z10) {
            }
            if (uyVar.R) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            tyVar.a.setOverScrollMode(0);
            L0 = tyVar.c.L0();
            if (L0 == 0) {
            }
            if (z12) {
            }
        }
        return 0;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ki.p pVar = new ki.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }
}
