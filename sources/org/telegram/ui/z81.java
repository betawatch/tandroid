package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z81 extends v4.c0 {
    public boolean I;
    public final /* synthetic */ w91 J;

    public z81(w91 w91Var) {
        this.J = w91Var;
    }

    @Override // v4.c0, v4.p0
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.a;
        try {
            super.b0(x0Var, c1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new qu0(this, 21));
        }
    }

    @Override // v4.c0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.c0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // v4.c0, v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        i91 i91Var;
        iv ivVar;
        float f10;
        int i11;
        w91 w91Var = this.J;
        i91 i91Var2 = w91Var.O;
        boolean z10 = false;
        if (i91Var2.W1) {
            return 0;
        }
        boolean z11 = i91Var2.getScrollState() == 1;
        int paddingTop = w91Var.O.getPaddingTop();
        if (i7 < 0 && w91Var.y > 0 && w91Var.E == 2) {
            w91Var.O.setOverScrollMode(0);
            int L0 = w91Var.G.L0();
            if (L0 == 0) {
                View m10 = w91Var.G.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.g0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = w91Var.G.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.vision.e2.v(L0, 1, org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i7)) {
                        i10 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = w91Var.G.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                w91Var.O.setOverScrollMode(2);
                i10 = (int) com.google.android.gms.internal.vision.e2.C(top, 0.25f, 0.45f, i7);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            i91Var = w91Var.O;
            if (i91Var.m3 != 0.0f && i7 > 0 && z11) {
                f10 = ((int) r14) - i7;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                i91Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (w91Var.E != 0 || w91Var.y <= 0) {
                return super.o0(i10, x0Var, c1Var);
            }
            int o02 = super.o0(i10, x0Var, c1Var);
            iv ivVar2 = w91Var.x;
            if (ivVar2 != null) {
                ivVar2.a = o02;
            }
            int L02 = w91Var.G.L0();
            View m13 = L02 == 0 ? w91Var.G.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.g0.L(4.0f)) {
                w91Var.Z = 0L;
                w91Var.a0 = false;
                w91Var.E = 2;
                iv ivVar3 = w91Var.x;
                if (ivVar3 != null) {
                    ValueAnimator valueAnimator = ivVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.u2 u2Var = ivVar3.H;
                    if (u2Var != null) {
                        u2Var.removeCallbacks(ivVar3.d0);
                    }
                    ivVar3.x = 0.0f;
                    ivVar3.y = false;
                    ivVar3.e0 = false;
                    w91Var.x.f(0.0f);
                    w91Var.x.I = w91Var.O;
                }
            } else {
                if (w91Var.Z == 0) {
                    w91Var.Z = System.currentTimeMillis();
                }
                if (w91Var.E == 2 && (ivVar = w91Var.x) != null) {
                    ivVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - w91Var.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (w91Var.a0 != z10) {
                    w91Var.a0 = z10;
                    if (w91Var.E == 2) {
                        try {
                            w91Var.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        iv ivVar4 = w91Var.x;
                        if (ivVar4 != null) {
                            ivVar4.a(z10);
                        }
                    }
                }
                if (w91Var.E == 2 && i10 - o02 != 0 && i7 < 0 && z11) {
                    float L = 1.0f - (w91Var.O.m3 / org.telegram.messenger.g0.L(72.0f));
                    i91 i91Var3 = w91Var.O;
                    i91Var3.setViewsOffset(i91Var3.m3 - ((i7 * 0.2f) * L));
                }
                iv ivVar5 = w91Var.x;
                if (ivVar5 != null) {
                    ivVar5.f(top2);
                    w91Var.x.I = w91Var.O;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i7;
        i91Var = w91Var.O;
        if (i91Var.m3 != 0.0f) {
            f10 = ((int) r14) - i7;
            if (f10 >= 0.0f) {
            }
            i91Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (w91Var.E != 0) {
        }
        return super.o0(i10, x0Var, c1Var);
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        if (this.J.y > 0 && i7 == 1) {
            super.v0(recyclerView, c1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }
}
