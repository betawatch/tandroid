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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tw extends f2.j0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ oy L;
    public final /* synthetic */ py M;

    public tw(py pyVar, oy oyVar) {
        this.M = pyVar;
        this.L = oyVar;
    }

    @Override // f2.j0
    public final int R0() {
        oy oyVar = this.L;
        return (oyVar.s == 0 && this.M.Z3() && oyVar.v == 2) ? 1 : 0;
    }

    @Override // f2.j0, f2.w0
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, j1Var);
                return;
            } catch (IndexOutOfBoundsException e6) {
                FileLog.e(e6);
                AndroidUtilities.runOnUIThread(new sw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(fVar, j1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            py pyVar = this.M;
            sb.append(pyVar.P1);
            sb.append(" lastUpdateAction=");
            sb.append(pyVar.v3);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // f2.j0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.w0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        oy oyVar = this.L;
        if (oyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.Q, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.a(20, this, oyVar));
            this.K.addListener(new org.telegram.ui.Components.f91(this, 15));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.pr.f);
            this.K.start();
        }
    }

    @Override // f2.j0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.py.r1(r4, r6) != false) goto L15;
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
    @Override // f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
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
        ww wwVar;
        float viewOffset;
        float f10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        py pyVar = this.M;
        UndoView[] undoViewArr = pyVar.v0;
        oy oyVar = this.L;
        ly lyVar = oyVar.a;
        int i15 = 0;
        if (!lyVar.U1) {
            boolean z11 = lyVar.getScrollState() == 1;
            if (z11 != this.J) {
                this.J = z11;
                if (!z11) {
                }
            }
            float f11 = 0.0f;
            if (i10 > 0 && pyVar.Q != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                }
                float f12 = pyVar.Q - i10;
                if (f12 < 0.0f) {
                    i15 = (int) (-f12);
                } else {
                    f11 = f12;
                }
                py.q1(pyVar, oyVar, f11);
                return super.o0(i15, fVar, j1Var);
            }
            if (pyVar.H && pyVar.U2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                }
                z4 = true;
                int paddingTop = oyVar.a.getPaddingTop();
                int dp2 = (z4 || pyVar.C3.c() || pyVar.O) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (pyVar.O && oyVar.s == 0 && !pyVar.i2 && pyVar.S2 == 0) {
                    if (pyVar.U2 == 0 && pyVar.getMessagesController().hasHiddenArchive() && oyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z4 && !pyVar.C3.c())) && i10 < 0) {
                            oyVar.a.setOverScrollMode(0);
                            L0 = oyVar.c.L0();
                            if (L0 == 0 && (m9 = oyVar.c.m(L0)) != null && m9.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z11) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z4 && z11 && !pyVar.C3.c()) {
                                        if (pyVar.K == 0.0f) {
                                            oyVar.a.setOverScrollMode(0);
                                        } else {
                                            oyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m10 = oyVar.c.m(L0);
                                    float top = ((m10.getTop() - paddingTop) / m10.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    oyVar.a.setOverScrollMode(2);
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
                                if (oyVar.s == 0) {
                                    viewOffset = ((int) oyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    oyVar.a.setViewsOffset(f10);
                                }
                                if (oyVar.s == 0) {
                                }
                                boolean z12 = z4;
                                o02 = super.o0(i12, fVar, j1Var);
                                if (o02 == 0) {
                                    py.q1(pyVar, oyVar, pyVar.Q - (pyVar.B0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m11 = oyVar.c.m(L0);
                            if (m11 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    xw xwVar = oyVar.d;
                                    if (((uf.i) xwVar.J.get(i11)).a == 0) {
                                        if (!((uf.i) xwVar.J.get(i11)).f || xwVar.G) {
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
                                if (!pyVar.C3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z4 && ((((ValueAnimator) oyVar.b.c) != null || pyVar.B0.g()) && !pyVar.C3.c() && !pyVar.O)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) oyVar.b.c) != null || pyVar.B0.g()) && !pyVar.C3.c() && !pyVar.O) {
                                    kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (oyVar.s == 0 && oyVar.a.getViewOffset() != 0.0f && i10 > 0 && z11) {
                                        viewOffset = ((int) oyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f10 = 0.0f;
                                        } else {
                                            f10 = viewOffset;
                                            i12 = 0;
                                        }
                                        oyVar.a.setViewsOffset(f10);
                                    }
                                    if (oyVar.s == 0 || oyVar.v == 0 || !pyVar.Z3() || pyVar.O) {
                                        boolean z122 = z4;
                                        o02 = super.o0(i12, fVar, j1Var);
                                        if (o02 == 0 && i10 < 0 && z11 && !pyVar.C3.c() && z122 && pyVar.q3 == 0.0f) {
                                            py.q1(pyVar, oyVar, pyVar.Q - (pyVar.B0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, fVar, j1Var);
                                    ww wwVar2 = oyVar.n;
                                    if (wwVar2 != null) {
                                        wwVar2.a = o03;
                                    }
                                    int L02 = oyVar.c.L0();
                                    View m12 = L02 == 0 ? oyVar.c.m(L02) : null;
                                    if (L02 != 0 || m12 == null || m12.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z10 = z4;
                                        pyVar.Z2 = 0L;
                                        pyVar.b3 = false;
                                        boolean z13 = oyVar.v != 2;
                                        oyVar.v = 2;
                                        if (z13 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        ww wwVar3 = oyVar.n;
                                        if (wwVar3 != null) {
                                            ValueAnimator valueAnimator = wwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.r2 r2Var = wwVar3.H;
                                            if (r2Var != null) {
                                                r2Var.removeCallbacks(wwVar3.d0);
                                            }
                                            wwVar3.x = 0.0f;
                                            wwVar3.y = false;
                                            wwVar3.e0 = false;
                                            oyVar.n.f(0.0f);
                                            oyVar.n.I = oyVar.a;
                                        }
                                    } else {
                                        boolean z14 = z4;
                                        if (pyVar.Z2 == 0) {
                                            pyVar.Z2 = System.currentTimeMillis();
                                        }
                                        if (oyVar.v == 2 && (wwVar = oyVar.n) != null) {
                                            wwVar.h();
                                        }
                                        if (z14 && !pyVar.C3.c() && !pyVar.O) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m12.getTop() - dp2) / m12.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z10 = z14;
                                        boolean z15 = top2 > 0.85f && System.currentTimeMillis() - pyVar.Z2 > 220;
                                        if (pyVar.b3 != z15) {
                                            pyVar.b3 = z15;
                                            if (oyVar.v == 2) {
                                                try {
                                                    oyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                ww wwVar4 = oyVar.n;
                                                if (wwVar4 != null) {
                                                    wwVar4.a(z15);
                                                }
                                            }
                                        }
                                        if (oyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z11) {
                                            oyVar.a.setViewsOffset(oyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (oyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        ww wwVar5 = oyVar.n;
                                        if (wwVar5 != null) {
                                            wwVar5.f(top2);
                                            oyVar.n.I = oyVar.a;
                                        }
                                    }
                                    if (m12 != null) {
                                        m12.invalidate();
                                    }
                                    if (oyVar.v == 1 && o03 == 0 && i10 < 0 && z11 && !pyVar.C3.c() && z10 && pyVar.q3 == 0.0f) {
                                        py.q1(pyVar, oyVar, pyVar.Q - (AndroidUtilities.lerp(0.2f, 0.5f, pyVar.B0.k0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (oyVar.s == 0) {
                        }
                        if (oyVar.s == 0) {
                        }
                        boolean z1222 = z4;
                        o02 = super.o0(i12, fVar, j1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
                oyVar.a.setOverScrollMode(0);
                L0 = oyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z11) {
                }
            }
            z4 = false;
            int paddingTop2 = oyVar.a.getPaddingTop();
            if (z4) {
            }
            if (pyVar.O) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            oyVar.a.setOverScrollMode(0);
            L0 = oyVar.c.L0();
            if (L0 == 0) {
            }
            if (z11) {
            }
        }
        return 0;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, j1Var, i10);
            return;
        }
        xh.o oVar = new xh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
