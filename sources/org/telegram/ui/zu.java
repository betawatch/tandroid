package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zu extends u4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ tw L;
    public final /* synthetic */ uw M;

    public zu(uw uwVar, tw twVar) {
        this.M = uwVar;
        this.L = twVar;
    }

    @Override // u4.b0
    public final int R0() {
        tw twVar = this.L;
        return (twVar.s == 0 && this.M.l4() && twVar.w == 2) ? 1 : 0;
    }

    @Override // u4.b0, u4.o0
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new yu(this.L, 0));
        }
    }

    @Override // u4.b0
    public final void b1(View view, View view2, int i3, int i10) {
        this.I = true;
        super.b1(view, view2, i3, i10);
        this.I = false;
    }

    @Override // u4.o0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        tw twVar = this.L;
        if (twVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ci.uc(22, this, twVar));
            this.K.addListener(new org.telegram.ui.Cells.w9(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.xq.f);
            this.K.start();
        }
    }

    @Override // u4.b0
    public final void h1(int i3, int i10) {
        if (this.I) {
            i10 -= this.L.a.getPaddingTop();
        }
        super.h1(i3, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.uw.v1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.v() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0184, code lost:
    
        if (r8.v() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r8.v() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        if (r5 > (-1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.v() == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    @Override // u4.b0, u4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        boolean z10;
        int i10;
        int i11;
        float f10;
        int L0;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i14;
        int L;
        View m10;
        int o02;
        boolean z11;
        cv cvVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        uw uwVar = this.M;
        UndoView[] undoViewArr = uwVar.z0;
        tw twVar = this.L;
        pw pwVar = twVar.a;
        int i15 = 0;
        if (!pwVar.W1) {
            boolean z12 = pwVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f12 = 0.0f;
            if (i3 > 0 && uwVar.U != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                }
                float f13 = uwVar.U - i3;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                uw.u1(uwVar, twVar, f12);
                return super.o0(i15, eVar, a1Var);
            }
            if (uwVar.L && uwVar.Z2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                }
                z10 = true;
                int paddingTop = twVar.a.getPaddingTop();
                int L2 = (z10 || uwVar.G3.c() || uwVar.S) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!uwVar.S && twVar.s == 0 && !uwVar.m2 && uwVar.X2 == 0 && uwVar.Z2 == 0) {
                    org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.az.q1) {
                        i10 = paddingTop;
                        if (messagesController.R.f(1 | 2305843009213693952L) != null && twVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z10 && !uwVar.G3.c())) && i3 < 0) {
                                f10 = 1.0f;
                                twVar.a.setOverScrollMode(0);
                                L0 = twVar.c.L0();
                                if (L0 == 0 || (m10 = twVar.c.m(L0)) == null) {
                                    i12 = 1;
                                } else {
                                    char c2 = 1;
                                    i12 = c2;
                                    if (m10.getBottom() - L2 <= org.telegram.messenger.g0.L(1.0f)) {
                                        L0 = 1;
                                        i12 = c2;
                                    }
                                }
                                if (!z12) {
                                    if (L0 == 0 && i11 != 0) {
                                        View m11 = twVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        twVar.a.setOverScrollMode(2);
                                        int B = (int) com.google.android.recaptcha.internal.a.B(top, 0.25f, 0.45f, i3);
                                        r8 = B <= -1 ? B : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z13 = i12;
                                            undoViewArr[0].d(z13 ? 1 : 0, z13);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z10 && z12 && !uwVar.G3.c()) {
                                        if (uwVar.O == 0.0f) {
                                            twVar.a.setOverScrollMode(0);
                                        } else {
                                            twVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i3 * 0.3f);
                                    }
                                    i13 = r8;
                                    if (twVar.s == 0) {
                                        viewOffset = ((int) twVar.a.getViewOffset()) - i3;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        twVar.a.setViewsOffset(f11);
                                    }
                                    if (twVar.s == 0) {
                                    }
                                    boolean z14 = z10;
                                    o02 = super.o0(i13, eVar, a1Var);
                                    if (o02 == 0) {
                                        uw.u1(uwVar, twVar, uwVar.U - (uwVar.F0.getOverScrollCoef() * i3));
                                    }
                                    return o02;
                                }
                                View m12 = twVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        dv dvVar = twVar.d;
                                        if (((kg.k) dvVar.N.get(i11)).a == 0) {
                                            if (!((kg.k) dvVar.N.get(i11)).f || dvVar.K) {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 76.0f : 70.0f);
                                            } else {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 86.0f : 91.0f);
                                            }
                                            i14 = L + 1;
                                        } else {
                                            i14 = 0;
                                        }
                                        i16 += i14;
                                        i11++;
                                    }
                                    int i17 = (-(m12.getTop() - L2)) + i16;
                                    if (!uwVar.G3.c()) {
                                        kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                        if (kVar3 != null) {
                                            kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z10 && ((((ValueAnimator) twVar.b.c) != null || uwVar.F0.g()) && !uwVar.G3.c() && !uwVar.S)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) twVar.b.c) != null || uwVar.F0.g()) && !uwVar.G3.c() && !uwVar.S) {
                                        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                        if (kVar != null) {
                                            kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i3)) {
                                        i13 = -i17;
                                        if (twVar.s == 0 && twVar.a.getViewOffset() != 0.0f && i3 > 0 && z12) {
                                            viewOffset = ((int) twVar.a.getViewOffset()) - i3;
                                            if (viewOffset >= 0.0f) {
                                                i13 = (int) viewOffset;
                                                f11 = 0.0f;
                                            } else {
                                                f11 = viewOffset;
                                                i13 = 0;
                                            }
                                            twVar.a.setViewsOffset(f11);
                                        }
                                        if (twVar.s == 0 || twVar.w == 0 || !uwVar.l4() || uwVar.S) {
                                            boolean z142 = z10;
                                            o02 = super.o0(i13, eVar, a1Var);
                                            if (o02 == 0 && i3 < 0 && z12 && !uwVar.G3.c() && z142 && uwVar.v3 == 0.0f) {
                                                uw.u1(uwVar, twVar, uwVar.U - (uwVar.F0.getOverScrollCoef() * i3));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, eVar, a1Var);
                                        cv cvVar2 = twVar.n;
                                        if (cvVar2 != null) {
                                            cvVar2.a = o03;
                                        }
                                        int L02 = twVar.c.L0();
                                        View m13 = L02 == 0 ? twVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z15 = z10;
                                            uwVar.e3 = 0L;
                                            uwVar.g3 = false;
                                            boolean z16 = twVar.w != 2;
                                            twVar.w = 2;
                                            if (z16 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.bd.M0(2131754924, null));
                                            }
                                            cv cvVar3 = twVar.n;
                                            z11 = z15;
                                            if (cvVar3 != null) {
                                                ValueAnimator valueAnimator = cvVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.t2 t2Var = cvVar3.H;
                                                if (t2Var != null) {
                                                    t2Var.removeCallbacks(cvVar3.d0);
                                                }
                                                cvVar3.x = 0.0f;
                                                cvVar3.y = false;
                                                cvVar3.e0 = false;
                                                twVar.n.f(0.0f);
                                                twVar.n.I = twVar.a;
                                                z11 = z15;
                                            }
                                        } else {
                                            if (uwVar.e3 == 0) {
                                                uwVar.e3 = System.currentTimeMillis();
                                            }
                                            if (twVar.w == 2 && (cvVar = twVar.n) != null) {
                                                cvVar.h();
                                            }
                                            if (z10 && !uwVar.G3.c() && !uwVar.S) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z17 = z10;
                                            boolean z18 = top2 > 0.85f && System.currentTimeMillis() - uwVar.e3 > 220;
                                            if (uwVar.g3 != z18) {
                                                uwVar.g3 = z18;
                                                if (twVar.w == 2) {
                                                    try {
                                                        twVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    cv cvVar4 = twVar.n;
                                                    if (cvVar4 != null) {
                                                        cvVar4.a(z18);
                                                    }
                                                }
                                            }
                                            if (twVar.w == 2 && i13 - o03 != 0 && i3 < 0 && z12) {
                                                twVar.a.setViewsOffset(org.telegram.ui.Cells.f1.A(i3, 0.2f, f10 - (twVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), twVar.a.getViewOffset()));
                                            }
                                            cv cvVar5 = twVar.n;
                                            z11 = z17;
                                            if (cvVar5 != null) {
                                                cvVar5.f(top2);
                                                twVar.n.I = twVar.a;
                                                z11 = z17;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (twVar.w == 1 && o03 == 0 && i3 < 0 && z12 && !uwVar.G3.c() && z11 && uwVar.v3 == 0.0f) {
                                            uw.u1(uwVar, twVar, uwVar.U - (org.telegram.messenger.g0.T1(0.2f, 0.5f, uwVar.F0.o0) * i3));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            i13 = i3;
                            if (twVar.s == 0) {
                            }
                            if (twVar.s == 0) {
                            }
                            boolean z1422 = z10;
                            o02 = super.o0(i13, eVar, a1Var);
                            if (o02 == 0) {
                            }
                            return o02;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        f10 = 1.0f;
                        twVar.a.setOverScrollMode(0);
                        L0 = twVar.c.L0();
                        if (L0 == 0) {
                        }
                        i12 = 1;
                        if (!z12) {
                        }
                    }
                }
                i10 = paddingTop;
                i11 = 0;
                if (i11 == 0) {
                }
                f10 = 1.0f;
                twVar.a.setOverScrollMode(0);
                L0 = twVar.c.L0();
                if (L0 == 0) {
                }
                i12 = 1;
                if (!z12) {
                }
            }
            z10 = false;
            int paddingTop2 = twVar.a.getPaddingTop();
            if (z10) {
            }
            if (!uwVar.S) {
                org.telegram.messenger.hp messagesController2 = uwVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.az.q1) {
                }
            }
            i10 = paddingTop2;
            i11 = 0;
            if (i11 == 0) {
            }
            f10 = 1.0f;
            twVar.a.setOverScrollMode(0);
            L0 = twVar.c.L0();
            if (L0 == 0) {
            }
            i12 = 1;
            if (!z12) {
            }
        }
        return 0;
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        if (this.M.l4() && i3 == 1) {
            super.v0(recyclerView, a1Var, i3);
            return;
        }
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.a = i3;
        w0(mVar);
    }
}
