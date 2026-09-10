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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zw extends s4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ vy L;
    public final /* synthetic */ wy M;

    public zw(wy wyVar, vy vyVar) {
        this.M = wyVar;
        this.L = vyVar;
    }

    @Override // s4.c0
    public final int R0() {
        vy vyVar = this.L;
        return (vyVar.s == 0 && this.M.Z3() && vyVar.v == 2) ? 1 : 0;
    }

    @Override // s4.c0, s4.o0
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new yw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            wy wyVar = this.M;
            sb2.append(wyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(wyVar.y3);
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
        vy vyVar = this.L;
        if (vyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new gg.t1(19, this, vyVar));
            this.K.addListener(new org.telegram.ui.Components.voip.v2(this, 6));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.wr.f);
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
    
        if (org.telegram.ui.wy.r1(r4, r6) != false) goto L15;
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
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        boolean z10;
        int i11;
        int L0;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i14;
        int dp;
        View m10;
        int o02;
        boolean z11;
        cx cxVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        wy wyVar = this.M;
        UndoView[] undoViewArr = wyVar.y0;
        vy vyVar = this.L;
        sy syVar = vyVar.a;
        int i15 = 0;
        if (!syVar.X1) {
            boolean z12 = syVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && wyVar.T != 0.0f) {
                lVar7 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (lVar7 != null) {
                    lVar8 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                }
                float f11 = wyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                wy.q1(wyVar, vyVar, f10);
                return super.o0(i15, eVar, z0Var);
            }
            if (wyVar.K && wyVar.X2 == 0) {
                lVar5 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (lVar5 != null) {
                    lVar6 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                }
                z10 = true;
                int paddingTop = vyVar.a.getPaddingTop();
                int dp2 = (z10 || wyVar.F3.c() || wyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (wyVar.R && vyVar.s == 0 && !wyVar.l2 && wyVar.V2 == 0) {
                    if (wyVar.X2 == 0 && wyVar.getMessagesController().hasHiddenArchive() && vyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !wyVar.F3.c())) && i10 < 0) {
                            vyVar.a.setOverScrollMode(0);
                            L0 = vyVar.c.L0();
                            if (L0 == 0 && (m10 = vyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z10 && z12 && !wyVar.F3.c()) {
                                        if (wyVar.N == 0.0f) {
                                            vyVar.a.setOverScrollMode(0);
                                        } else {
                                            vyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = vyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    vyVar.a.setOverScrollMode(2);
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
                                if (vyVar.s == 0) {
                                    viewOffset = ((int) vyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    vyVar.a.setViewsOffset(f7);
                                }
                                if (vyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i12, eVar, z0Var);
                                if (o02 == 0) {
                                    wy.q1(wyVar, vyVar, wyVar.T - (wyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = vyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    dx dxVar = vyVar.d;
                                    if (((fg.k) dxVar.M.get(i11)).a == 0) {
                                        if (!((fg.k) dxVar.M.get(i11)).f || dxVar.J) {
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
                                if (!wyVar.F3.c()) {
                                    lVar3 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                                    if (lVar3 != null) {
                                        lVar4 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) vyVar.b.c) != null || wyVar.E0.g()) && !wyVar.F3.c() && !wyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) vyVar.b.c) != null || wyVar.E0.g()) && !wyVar.F3.c() && !wyVar.R) {
                                    lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                                    if (lVar != null) {
                                        lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (vyVar.s == 0 && vyVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                        viewOffset = ((int) vyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        vyVar.a.setViewsOffset(f7);
                                    }
                                    if (vyVar.s == 0 || vyVar.v == 0 || !wyVar.Z3() || wyVar.R) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i12, eVar, z0Var);
                                        if (o02 == 0 && i10 < 0 && z12 && !wyVar.F3.c() && z132 && wyVar.t3 == 0.0f) {
                                            wy.q1(wyVar, vyVar, wyVar.T - (wyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, z0Var);
                                    cx cxVar2 = vyVar.n;
                                    if (cxVar2 != null) {
                                        cxVar2.a = o03;
                                    }
                                    int L02 = vyVar.c.L0();
                                    View m13 = L02 == 0 ? vyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        wyVar.c3 = 0L;
                                        wyVar.e3 = false;
                                        boolean z14 = vyVar.v != 2;
                                        vyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        cx cxVar3 = vyVar.n;
                                        if (cxVar3 != null) {
                                            ValueAnimator valueAnimator = cxVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.r2 r2Var = cxVar3.H;
                                            if (r2Var != null) {
                                                r2Var.removeCallbacks(cxVar3.d0);
                                            }
                                            cxVar3.x = 0.0f;
                                            cxVar3.y = false;
                                            cxVar3.e0 = false;
                                            vyVar.n.f(0.0f);
                                            vyVar.n.I = vyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (wyVar.c3 == 0) {
                                            wyVar.c3 = System.currentTimeMillis();
                                        }
                                        if (vyVar.v == 2 && (cxVar = vyVar.n) != null) {
                                            cxVar.h();
                                        }
                                        if (z15 && !wyVar.F3.c() && !wyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - wyVar.c3 > 220;
                                        if (wyVar.e3 != z16) {
                                            wyVar.e3 = z16;
                                            if (vyVar.v == 2) {
                                                try {
                                                    vyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                cx cxVar4 = vyVar.n;
                                                if (cxVar4 != null) {
                                                    cxVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (vyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z12) {
                                            vyVar.a.setViewsOffset(vyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (vyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        cx cxVar5 = vyVar.n;
                                        if (cxVar5 != null) {
                                            cxVar5.f(top2);
                                            vyVar.n.I = vyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (vyVar.v == 1 && o03 == 0 && i10 < 0 && z12 && !wyVar.F3.c() && z11 && wyVar.t3 == 0.0f) {
                                        wy.q1(wyVar, vyVar, wyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, wyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (vyVar.s == 0) {
                        }
                        if (vyVar.s == 0) {
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
                vyVar.a.setOverScrollMode(0);
                L0 = vyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = vyVar.a.getPaddingTop();
            if (z10) {
            }
            if (wyVar.R) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            vyVar.a.setOverScrollMode(0);
            L0 = vyVar.c.L0();
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
        ii.o oVar = new ii.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
