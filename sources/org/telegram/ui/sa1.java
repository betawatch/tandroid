package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sa1 extends s4.a0 {
    public boolean I;
    public final /* synthetic */ pb1 J;

    public sa1(pb1 pb1Var) {
        this.J = pb1Var;
    }

    @Override // s4.a0, s4.n0
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.a;
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new wv0(this, 23));
        }
    }

    @Override // s4.a0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.a0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // s4.a0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        cb1 cb1Var;
        kw kwVar;
        float f7;
        int i12;
        pb1 pb1Var = this.J;
        cb1 cb1Var2 = pb1Var.N;
        boolean z10 = false;
        if (cb1Var2.V1) {
            return 0;
        }
        boolean z11 = cb1Var2.getScrollState() == 1;
        int paddingTop = pb1Var.N.getPaddingTop();
        if (i10 < 0 && pb1Var.y > 0 && pb1Var.D == 2) {
            pb1Var.N.setOverScrollMode(0);
            int L0 = pb1Var.F.L0();
            if (L0 == 0) {
                View m10 = pb1Var.F.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.i0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = pb1Var.F.m(L0);
                if (m11 != null) {
                    int e = i0.a.e(L0, 1, org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (e < Math.abs(i10)) {
                        i11 = -e;
                    }
                }
            } else if (L0 == 0) {
                View m12 = pb1Var.F.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                pb1Var.N.setOverScrollMode(2);
                i11 = (int) c3.i0.D(top, 0.25f, 0.45f, i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            }
            cb1Var = pb1Var.N;
            if (cb1Var.l3 != 0.0f && i10 > 0 && z11) {
                f7 = ((int) r14) - i10;
                if (f7 >= 0.0f) {
                    i12 = (int) f7;
                    f7 = 0.0f;
                } else {
                    i12 = 0;
                }
                cb1Var.setViewsOffset(f7);
                i11 = i12;
            }
            if (pb1Var.D != 0 || pb1Var.y <= 0) {
                return super.o0(i11, eVar, z0Var);
            }
            int o02 = super.o0(i11, eVar, z0Var);
            kw kwVar2 = pb1Var.x;
            if (kwVar2 != null) {
                kwVar2.a = o02;
            }
            int L02 = pb1Var.F.L0();
            View m13 = L02 == 0 ? pb1Var.F.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.i0.L(4.0f)) {
                pb1Var.Y = 0L;
                pb1Var.Z = false;
                pb1Var.D = 2;
                kw kwVar3 = pb1Var.x;
                if (kwVar3 != null) {
                    ValueAnimator valueAnimator = kwVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.v2 v2Var = kwVar3.H;
                    if (v2Var != null) {
                        v2Var.removeCallbacks(kwVar3.d0);
                    }
                    kwVar3.x = 0.0f;
                    kwVar3.y = false;
                    kwVar3.e0 = false;
                    pb1Var.x.f(0.0f);
                    pb1Var.x.I = pb1Var.N;
                }
            } else {
                if (pb1Var.Y == 0) {
                    pb1Var.Y = System.currentTimeMillis();
                }
                if (pb1Var.D == 2 && (kwVar = pb1Var.x) != null) {
                    kwVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - pb1Var.Y;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (pb1Var.Z != z10) {
                    pb1Var.Z = z10;
                    if (pb1Var.D == 2) {
                        try {
                            pb1Var.N.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        kw kwVar4 = pb1Var.x;
                        if (kwVar4 != null) {
                            kwVar4.a(z10);
                        }
                    }
                }
                if (pb1Var.D == 2 && i11 - o02 != 0 && i10 < 0 && z11) {
                    float L = 1.0f - (pb1Var.N.l3 / org.telegram.messenger.i0.L(72.0f));
                    cb1 cb1Var3 = pb1Var.N;
                    cb1Var3.setViewsOffset(cb1Var3.l3 - ((i10 * 0.2f) * L));
                }
                kw kwVar5 = pb1Var.x;
                if (kwVar5 != null) {
                    kwVar5.f(top2);
                    pb1Var.x.I = pb1Var.N;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i11 = i10;
        cb1Var = pb1Var.N;
        if (cb1Var.l3 != 0.0f) {
            f7 = ((int) r14) - i10;
            if (f7 >= 0.0f) {
            }
            cb1Var.setViewsOffset(f7);
            i11 = i12;
        }
        if (pb1Var.D != 0) {
        }
        return super.o0(i11, eVar, z0Var);
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.y > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }
}
