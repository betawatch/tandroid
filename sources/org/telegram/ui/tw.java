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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tw extends s4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ py L;
    public final /* synthetic */ qy M;

    public tw(qy qyVar, py pyVar) {
        this.M = qyVar;
        this.L = pyVar;
    }

    @Override // s4.c0
    public final int R0() {
        py pyVar = this.L;
        return (pyVar.s == 0 && this.M.Z3() && pyVar.v == 2) ? 1 : 0;
    }

    @Override // s4.c0, s4.o0
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new sw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            qy qyVar = this.M;
            sb2.append(qyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(qyVar.y3);
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
        py pyVar = this.L;
        if (pyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ai.x(21, this, pyVar));
            this.K.addListener(new org.telegram.ui.Components.q81(this, 17));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.rr.f);
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
    
        if (org.telegram.ui.qy.r1(r4, r6) != false) goto L15;
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i14;
        int dp;
        View m10;
        int o02;
        boolean z11;
        ww wwVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        qy qyVar = this.M;
        UndoView[] undoViewArr = qyVar.y0;
        py pyVar = this.L;
        my myVar = pyVar.a;
        int i15 = 0;
        if (!myVar.X1) {
            boolean z12 = myVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && qyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                }
                float f11 = qyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                qy.q1(qyVar, pyVar, f10);
                return super.o0(i15, eVar, z0Var);
            }
            if (qyVar.K && qyVar.X2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                }
                z10 = true;
                int paddingTop = pyVar.a.getPaddingTop();
                int dp2 = (z10 || qyVar.F3.c() || qyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (qyVar.R && pyVar.s == 0 && !qyVar.l2 && qyVar.V2 == 0) {
                    if (qyVar.X2 == 0 && qyVar.getMessagesController().hasHiddenArchive() && pyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !qyVar.F3.c())) && i10 < 0) {
                            pyVar.a.setOverScrollMode(0);
                            L0 = pyVar.c.L0();
                            if (L0 == 0 && (m10 = pyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z10 && z12 && !qyVar.F3.c()) {
                                        if (qyVar.N == 0.0f) {
                                            pyVar.a.setOverScrollMode(0);
                                        } else {
                                            pyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = pyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    pyVar.a.setOverScrollMode(2);
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
                                if (pyVar.s == 0) {
                                    viewOffset = ((int) pyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    pyVar.a.setViewsOffset(f7);
                                }
                                if (pyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i12, eVar, z0Var);
                                if (o02 == 0) {
                                    qy.q1(qyVar, pyVar, qyVar.T - (qyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = pyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    xw xwVar = pyVar.d;
                                    if (((gg.k) xwVar.M.get(i11)).a == 0) {
                                        if (!((gg.k) xwVar.M.get(i11)).f || xwVar.J) {
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
                                if (!qyVar.F3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) pyVar.b.c) != null || qyVar.E0.g()) && !qyVar.F3.c() && !qyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) pyVar.b.c) != null || qyVar.E0.g()) && !qyVar.F3.c() && !qyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (pyVar.s == 0 && pyVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                        viewOffset = ((int) pyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        pyVar.a.setViewsOffset(f7);
                                    }
                                    if (pyVar.s == 0 || pyVar.v == 0 || !qyVar.Z3() || qyVar.R) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i12, eVar, z0Var);
                                        if (o02 == 0 && i10 < 0 && z12 && !qyVar.F3.c() && z132 && qyVar.t3 == 0.0f) {
                                            qy.q1(qyVar, pyVar, qyVar.T - (qyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, z0Var);
                                    ww wwVar2 = pyVar.n;
                                    if (wwVar2 != null) {
                                        wwVar2.a = o03;
                                    }
                                    int L02 = pyVar.c.L0();
                                    View m13 = L02 == 0 ? pyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        qyVar.c3 = 0L;
                                        qyVar.e3 = false;
                                        boolean z14 = pyVar.v != 2;
                                        pyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        ww wwVar3 = pyVar.n;
                                        if (wwVar3 != null) {
                                            ValueAnimator valueAnimator = wwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.s2 s2Var = wwVar3.H;
                                            if (s2Var != null) {
                                                s2Var.removeCallbacks(wwVar3.d0);
                                            }
                                            wwVar3.x = 0.0f;
                                            wwVar3.y = false;
                                            wwVar3.e0 = false;
                                            pyVar.n.f(0.0f);
                                            pyVar.n.I = pyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (qyVar.c3 == 0) {
                                            qyVar.c3 = System.currentTimeMillis();
                                        }
                                        if (pyVar.v == 2 && (wwVar = pyVar.n) != null) {
                                            wwVar.h();
                                        }
                                        if (z15 && !qyVar.F3.c() && !qyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - qyVar.c3 > 220;
                                        if (qyVar.e3 != z16) {
                                            qyVar.e3 = z16;
                                            if (pyVar.v == 2) {
                                                try {
                                                    pyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                ww wwVar4 = pyVar.n;
                                                if (wwVar4 != null) {
                                                    wwVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (pyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z12) {
                                            pyVar.a.setViewsOffset(pyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (pyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        ww wwVar5 = pyVar.n;
                                        if (wwVar5 != null) {
                                            wwVar5.f(top2);
                                            pyVar.n.I = pyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (pyVar.v == 1 && o03 == 0 && i10 < 0 && z12 && !qyVar.F3.c() && z11 && qyVar.t3 == 0.0f) {
                                        qy.q1(qyVar, pyVar, qyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, qyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (pyVar.s == 0) {
                        }
                        if (pyVar.s == 0) {
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
                pyVar.a.setOverScrollMode(0);
                L0 = pyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = pyVar.a.getPaddingTop();
            if (z10) {
            }
            if (qyVar.R) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            pyVar.a.setOverScrollMode(0);
            L0 = pyVar.c.L0();
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
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
