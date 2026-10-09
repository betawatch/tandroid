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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ww extends s4.d0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ sy L;
    public final /* synthetic */ ty M;

    public ww(ty tyVar, sy syVar) {
        this.M = tyVar;
        this.L = syVar;
    }

    @Override // s4.d0
    public final int R0() {
        sy syVar = this.L;
        return (syVar.s == 0 && this.M.W3() && syVar.v == 2) ? 1 : 0;
    }

    @Override // s4.d0, s4.p0
    public final void b0(pf.e eVar, s4.a1 a1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, a1Var);
                return;
            } catch (IndexOutOfBoundsException e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new vw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            ty tyVar = this.M;
            sb2.append(tyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(tyVar.y3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // s4.d0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.p0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        sy syVar = this.L;
        if (syVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ai.x(21, this, syVar));
            this.K.addListener(new org.telegram.ui.Components.i91(this, 17));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.hs.f);
            this.K.start();
        }
    }

    @Override // s4.d0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.ty.o1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.t() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016e, code lost:
    
        if (r8.t() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c4, code lost:
    
        if (r8.t() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x024a, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.t() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    @Override // s4.d0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        boolean z10;
        boolean z11;
        int i11;
        int L0;
        boolean z12;
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
        boolean z13;
        zw zwVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        ty tyVar = this.M;
        UndoView[] undoViewArr = tyVar.y0;
        sy syVar = this.L;
        py pyVar = syVar.a;
        int i15 = 0;
        if (!pyVar.V1) {
            boolean z14 = pyVar.getScrollState() == 1;
            if (z14 != this.J) {
                this.J = z14;
                if (!z14) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && tyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                }
                float f11 = tyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                ty.n1(tyVar, syVar, f10);
                return super.o0(i15, eVar, a1Var);
            }
            if (tyVar.K && tyVar.X2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                }
                z10 = true;
                int paddingTop = syVar.a.getPaddingTop();
                int dp2 = (z10 || tyVar.F3.c() || tyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (tyVar.R && syVar.s == 0 && !tyVar.l2 && tyVar.V2 == 0) {
                    z11 = true;
                    if (tyVar.X2 == 0 && tyVar.getMessagesController().hasHiddenArchive() && syVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !tyVar.F3.c())) && i10 < 0) {
                            syVar.a.setOverScrollMode(0);
                            L0 = syVar.c.L0();
                            z12 = z11;
                            if (L0 == 0 && (m10 = syVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = z12 ? 1 : 0;
                            }
                            if (z14) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == z12 && i11 != 0) || L0 == 0) && z10 && z14 && !tyVar.F3.c()) {
                                        if (tyVar.N == 0.0f) {
                                            syVar.a.setOverScrollMode(0);
                                        } else {
                                            syVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = syVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    syVar.a.setOverScrollMode(2);
                                    i13 = (int) com.google.android.gms.internal.vision.e2.B(top, 0.25f, 0.45f, i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].e(z12 ? 1 : 0, z12);
                                    }
                                }
                                i12 = i13;
                                if (syVar.s == 0) {
                                    viewOffset = ((int) syVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    syVar.a.setViewsOffset(f7);
                                }
                                if (syVar.s == 0) {
                                }
                                boolean z15 = z10;
                                o02 = super.o0(i12, eVar, a1Var);
                                if (o02 == 0) {
                                    ty.n1(tyVar, syVar, tyVar.T - (tyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = syVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    ax axVar = syVar.d;
                                    if (((gg.k) axVar.M.get(i11)).a == 0) {
                                        if (!((gg.k) axVar.M.get(i11)).f || axVar.J) {
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
                                if (!tyVar.F3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) syVar.b.c) != null || tyVar.E0.g()) && !tyVar.F3.c() && !tyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) syVar.b.c) != null || tyVar.E0.g()) && !tyVar.F3.c() && !tyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (syVar.s == 0 && syVar.a.getViewOffset() != 0.0f && i10 > 0 && z14) {
                                        viewOffset = ((int) syVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        syVar.a.setViewsOffset(f7);
                                    }
                                    if (syVar.s == 0 || syVar.v == 0 || !tyVar.W3() || tyVar.R) {
                                        boolean z152 = z10;
                                        o02 = super.o0(i12, eVar, a1Var);
                                        if (o02 == 0 && i10 < 0 && z14 && !tyVar.F3.c() && z152 && tyVar.t3 == 0.0f) {
                                            ty.n1(tyVar, syVar, tyVar.T - (tyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, a1Var);
                                    zw zwVar2 = syVar.n;
                                    if (zwVar2 != null) {
                                        zwVar2.a = o03;
                                    }
                                    int L02 = syVar.c.L0();
                                    View m13 = L02 == 0 ? syVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        boolean z16 = z10;
                                        tyVar.c3 = 0L;
                                        tyVar.e3 = false;
                                        boolean z17 = syVar.v != 2;
                                        syVar.v = 2;
                                        if (z17 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        zw zwVar3 = syVar.n;
                                        z13 = z16;
                                        if (zwVar3 != null) {
                                            ValueAnimator valueAnimator = zwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.s2 s2Var = zwVar3.H;
                                            if (s2Var != null) {
                                                s2Var.removeCallbacks(zwVar3.d0);
                                            }
                                            zwVar3.x = 0.0f;
                                            zwVar3.y = false;
                                            zwVar3.e0 = false;
                                            syVar.n.f(0.0f);
                                            syVar.n.I = syVar.a;
                                            z13 = z16;
                                        }
                                    } else {
                                        boolean z18 = z10;
                                        if (tyVar.c3 == 0) {
                                            tyVar.c3 = System.currentTimeMillis();
                                        }
                                        if (syVar.v == 2 && (zwVar = syVar.n) != null) {
                                            zwVar.h();
                                        }
                                        if (z18 && !tyVar.F3.c() && !tyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        boolean z19 = z18;
                                        boolean z20 = top2 > 0.85f && System.currentTimeMillis() - tyVar.c3 > 220;
                                        if (tyVar.e3 != z20) {
                                            tyVar.e3 = z20;
                                            if (syVar.v == 2) {
                                                try {
                                                    syVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                zw zwVar4 = syVar.n;
                                                if (zwVar4 != null) {
                                                    zwVar4.a(z20);
                                                }
                                            }
                                        }
                                        if (syVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z14) {
                                            syVar.a.setViewsOffset(syVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (syVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        zw zwVar5 = syVar.n;
                                        z13 = z19;
                                        if (zwVar5 != null) {
                                            zwVar5.f(top2);
                                            syVar.n.I = syVar.a;
                                            z13 = z19;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (syVar.v == 1 && o03 == 0 && i10 < 0 && z14 && !tyVar.F3.c() && z13 && tyVar.t3 == 0.0f) {
                                        ty.n1(tyVar, syVar, tyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, tyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (syVar.s == 0) {
                        }
                        if (syVar.s == 0) {
                        }
                        boolean z1522 = z10;
                        o02 = super.o0(i12, eVar, a1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                } else {
                    z11 = true;
                }
                i11 = 0;
                if (i11 == 0) {
                }
                syVar.a.setOverScrollMode(0);
                L0 = syVar.c.L0();
                z12 = z11;
                if (L0 == 0) {
                    L0 = z12 ? 1 : 0;
                }
                if (z14) {
                }
            }
            z10 = false;
            int paddingTop2 = syVar.a.getPaddingTop();
            if (z10) {
            }
            if (tyVar.R) {
            }
            z11 = true;
            i11 = 0;
            if (i11 == 0) {
            }
            syVar.a.setOverScrollMode(0);
            L0 = syVar.c.L0();
            z12 = z11;
            if (L0 == 0) {
            }
            if (z14) {
            }
        }
        return 0;
    }

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        if (this.M.W3() && i10 == 1) {
            super.v0(recyclerView, a1Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
