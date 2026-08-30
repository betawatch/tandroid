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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sw extends f2.i0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ ny L;
    public final /* synthetic */ oy M;

    public sw(oy oyVar, ny nyVar) {
        this.M = oyVar;
        this.L = nyVar;
    }

    @Override // f2.i0
    public final int R0() {
        ny nyVar = this.L;
        return (nyVar.s == 0 && this.M.Z3() && nyVar.v == 2) ? 1 : 0;
    }

    @Override // f2.i0, f2.v0
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new rw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(fVar, i1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            oy oyVar = this.M;
            sb.append(oyVar.P1);
            sb.append(" lastUpdateAction=");
            sb.append(oyVar.v3);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // f2.i0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.v0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ny nyVar = this.L;
        if (nyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.Q, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.a(20, this, nyVar));
            this.K.addListener(new org.telegram.ui.Components.f91(this, 15));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.nr.f);
            this.K.start();
        }
    }

    @Override // f2.i0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.oy.r1(r4, r6) != false) goto L15;
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
    @Override // f2.i0, f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, bf.f fVar, f2.i1 i1Var) {
        boolean z4;
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
        View m9;
        int o02;
        boolean z10;
        vw vwVar;
        float viewOffset;
        float f10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        oy oyVar = this.M;
        UndoView[] undoViewArr = oyVar.v0;
        ny nyVar = this.L;
        ky kyVar = nyVar.a;
        int i15 = 0;
        if (!kyVar.U1) {
            boolean z11 = kyVar.getScrollState() == 1;
            if (z11 != this.J) {
                this.J = z11;
                if (!z11) {
                }
            }
            float f11 = 0.0f;
            if (i10 > 0 && oyVar.Q != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                }
                float f12 = oyVar.Q - i10;
                if (f12 < 0.0f) {
                    i15 = (int) (-f12);
                } else {
                    f11 = f12;
                }
                oy.q1(oyVar, nyVar, f11);
                return super.o0(i15, fVar, i1Var);
            }
            if (oyVar.H && oyVar.U2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                }
                z4 = true;
                int paddingTop = nyVar.a.getPaddingTop();
                int dp2 = (z4 || oyVar.C3.c() || oyVar.O) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (oyVar.O && nyVar.s == 0 && !oyVar.i2 && oyVar.S2 == 0) {
                    if (oyVar.U2 == 0 && oyVar.getMessagesController().hasHiddenArchive() && nyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z4 && !oyVar.C3.c())) && i10 < 0) {
                            nyVar.a.setOverScrollMode(0);
                            L0 = nyVar.c.L0();
                            if (L0 == 0 && (m9 = nyVar.c.m(L0)) != null && m9.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z11) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z4 && z11 && !oyVar.C3.c()) {
                                        if (oyVar.K == 0.0f) {
                                            nyVar.a.setOverScrollMode(0);
                                        } else {
                                            nyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m10 = nyVar.c.m(L0);
                                    float top = ((m10.getTop() - paddingTop) / m10.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    nyVar.a.setOverScrollMode(2);
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
                                if (nyVar.s == 0) {
                                    viewOffset = ((int) nyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    nyVar.a.setViewsOffset(f10);
                                }
                                if (nyVar.s == 0) {
                                }
                                boolean z12 = z4;
                                o02 = super.o0(i12, fVar, i1Var);
                                if (o02 == 0) {
                                    oy.q1(oyVar, nyVar, oyVar.Q - (oyVar.B0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m11 = nyVar.c.m(L0);
                            if (m11 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    ww wwVar = nyVar.d;
                                    if (((tf.i) wwVar.J.get(i11)).a == 0) {
                                        if (!((tf.i) wwVar.J.get(i11)).f || wwVar.G) {
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
                                int i17 = (-(m11.getTop() - dp2)) + i16;
                                if (!oyVar.C3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z4 && ((((ValueAnimator) nyVar.b.c) != null || oyVar.B0.g()) && !oyVar.C3.c() && !oyVar.O)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) nyVar.b.c) != null || oyVar.B0.g()) && !oyVar.C3.c() && !oyVar.O) {
                                    kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (nyVar.s == 0 && nyVar.a.getViewOffset() != 0.0f && i10 > 0 && z11) {
                                        viewOffset = ((int) nyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f10 = 0.0f;
                                        } else {
                                            f10 = viewOffset;
                                            i12 = 0;
                                        }
                                        nyVar.a.setViewsOffset(f10);
                                    }
                                    if (nyVar.s == 0 || nyVar.v == 0 || !oyVar.Z3() || oyVar.O) {
                                        boolean z122 = z4;
                                        o02 = super.o0(i12, fVar, i1Var);
                                        if (o02 == 0 && i10 < 0 && z11 && !oyVar.C3.c() && z122 && oyVar.q3 == 0.0f) {
                                            oy.q1(oyVar, nyVar, oyVar.Q - (oyVar.B0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, fVar, i1Var);
                                    vw vwVar2 = nyVar.n;
                                    if (vwVar2 != null) {
                                        vwVar2.a = o03;
                                    }
                                    int L02 = nyVar.c.L0();
                                    View m12 = L02 == 0 ? nyVar.c.m(L02) : null;
                                    if (L02 != 0 || m12 == null || m12.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z10 = z4;
                                        oyVar.Z2 = 0L;
                                        oyVar.b3 = false;
                                        boolean z13 = nyVar.v != 2;
                                        nyVar.v = 2;
                                        if (z13 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        vw vwVar3 = nyVar.n;
                                        if (vwVar3 != null) {
                                            ValueAnimator valueAnimator = vwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.r2 r2Var = vwVar3.H;
                                            if (r2Var != null) {
                                                r2Var.removeCallbacks(vwVar3.d0);
                                            }
                                            vwVar3.x = 0.0f;
                                            vwVar3.y = false;
                                            vwVar3.e0 = false;
                                            nyVar.n.f(0.0f);
                                            nyVar.n.I = nyVar.a;
                                        }
                                    } else {
                                        boolean z14 = z4;
                                        if (oyVar.Z2 == 0) {
                                            oyVar.Z2 = System.currentTimeMillis();
                                        }
                                        if (nyVar.v == 2 && (vwVar = nyVar.n) != null) {
                                            vwVar.h();
                                        }
                                        if (z14 && !oyVar.C3.c() && !oyVar.O) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m12.getTop() - dp2) / m12.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z10 = z14;
                                        boolean z15 = top2 > 0.85f && System.currentTimeMillis() - oyVar.Z2 > 220;
                                        if (oyVar.b3 != z15) {
                                            oyVar.b3 = z15;
                                            if (nyVar.v == 2) {
                                                try {
                                                    nyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                vw vwVar4 = nyVar.n;
                                                if (vwVar4 != null) {
                                                    vwVar4.a(z15);
                                                }
                                            }
                                        }
                                        if (nyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z11) {
                                            nyVar.a.setViewsOffset(nyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (nyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        vw vwVar5 = nyVar.n;
                                        if (vwVar5 != null) {
                                            vwVar5.f(top2);
                                            nyVar.n.I = nyVar.a;
                                        }
                                    }
                                    if (m12 != null) {
                                        m12.invalidate();
                                    }
                                    if (nyVar.v == 1 && o03 == 0 && i10 < 0 && z11 && !oyVar.C3.c() && z10 && oyVar.q3 == 0.0f) {
                                        oy.q1(oyVar, nyVar, oyVar.Q - (AndroidUtilities.lerp(0.2f, 0.5f, oyVar.B0.k0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (nyVar.s == 0) {
                        }
                        if (nyVar.s == 0) {
                        }
                        boolean z1222 = z4;
                        o02 = super.o0(i12, fVar, i1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
                nyVar.a.setOverScrollMode(0);
                L0 = nyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z11) {
                }
            }
            z4 = false;
            int paddingTop2 = nyVar.a.getPaddingTop();
            if (z4) {
            }
            if (oyVar.O) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            nyVar.a.setOverScrollMode(0);
            L0 = nyVar.c.L0();
            if (L0 == 0) {
            }
            if (z11) {
            }
        }
        return 0;
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
