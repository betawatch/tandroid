package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x81 extends v4.b0 {
    public boolean I;
    public final /* synthetic */ u91 J;

    public x81(u91 u91Var) {
        this.J = u91Var;
    }

    @Override // v4.b0, v4.o0
    public final void b0(v4.w0 w0Var, v4.b1 b1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(w0Var, b1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new pu0(this, 21));
        }
    }

    @Override // v4.b0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.b0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    @Override // v4.b0, v4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int i10;
        g91 g91Var;
        gv gvVar;
        float f10;
        int i11;
        u91 u91Var = this.J;
        g91 g91Var2 = u91Var.O;
        boolean z10 = false;
        if (g91Var2.W1) {
            return 0;
        }
        boolean z11 = g91Var2.getScrollState() == 1;
        int paddingTop = u91Var.O.getPaddingTop();
        if (i7 < 0 && u91Var.y > 0 && u91Var.E == 2) {
            u91Var.O.setOverScrollMode(0);
            int L0 = u91Var.G.L0();
            if (L0 == 0) {
                View m10 = u91Var.G.m(L0);
                if (m10 != null) {
                    m10.setTranslationX(0.0f);
                }
                if (m10 != null && m10.getBottom() - paddingTop <= org.telegram.messenger.g0.L(1.0f)) {
                    L0 = 1;
                }
            }
            if (!z11) {
                View m11 = u91Var.G.m(L0);
                if (m11 != null) {
                    int v = com.google.android.gms.internal.vision.e2.v(L0, 1, org.telegram.messenger.g0.L(org.telegram.messenger.gz.p1 ? 78.0f : 72.0f) + 1, -(m11.getTop() - paddingTop));
                    if (v < Math.abs(i7)) {
                        i10 = -v;
                    }
                }
            } else if (L0 == 0) {
                View m12 = u91Var.G.m(L0);
                float top = ((m12.getTop() - paddingTop) / m12.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                u91Var.O.setOverScrollMode(2);
                i10 = (int) com.google.android.gms.internal.vision.e2.C(top, 0.25f, 0.45f, i7);
                if (i10 > -1) {
                    i10 = -1;
                }
            }
            g91Var = u91Var.O;
            if (g91Var.m3 != 0.0f && i7 > 0 && z11) {
                f10 = ((int) r14) - i7;
                if (f10 >= 0.0f) {
                    i11 = (int) f10;
                    f10 = 0.0f;
                } else {
                    i11 = 0;
                }
                g91Var.setViewsOffset(f10);
                i10 = i11;
            }
            if (u91Var.E != 0 || u91Var.y <= 0) {
                return super.o0(i10, w0Var, b1Var);
            }
            int o02 = super.o0(i10, w0Var, b1Var);
            gv gvVar2 = u91Var.x;
            if (gvVar2 != null) {
                gvVar2.a = o02;
            }
            int L02 = u91Var.G.L0();
            View m13 = L02 == 0 ? u91Var.G.m(L02) : null;
            if (m13 != null) {
                m13.setTranslationX(0.0f);
            }
            if (L02 != 0 || m13 == null || m13.getBottom() - paddingTop < org.telegram.messenger.g0.L(4.0f)) {
                u91Var.Z = 0L;
                u91Var.a0 = false;
                u91Var.E = 2;
                gv gvVar3 = u91Var.x;
                if (gvVar3 != null) {
                    ValueAnimator valueAnimator = gvVar3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    org.telegram.ui.Cells.t2 t2Var = gvVar3.H;
                    if (t2Var != null) {
                        t2Var.removeCallbacks(gvVar3.d0);
                    }
                    gvVar3.x = 0.0f;
                    gvVar3.y = false;
                    gvVar3.e0 = false;
                    u91Var.x.f(0.0f);
                    u91Var.x.I = u91Var.O;
                }
            } else {
                if (u91Var.Z == 0) {
                    u91Var.Z = System.currentTimeMillis();
                }
                if (u91Var.E == 2 && (gvVar = u91Var.x) != null) {
                    gvVar.h();
                }
                float top2 = ((m13.getTop() - paddingTop) / m13.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - u91Var.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z10 = true;
                }
                if (u91Var.a0 != z10) {
                    u91Var.a0 = z10;
                    if (u91Var.E == 2) {
                        try {
                            u91Var.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        gv gvVar4 = u91Var.x;
                        if (gvVar4 != null) {
                            gvVar4.a(z10);
                        }
                    }
                }
                if (u91Var.E == 2 && i10 - o02 != 0 && i7 < 0 && z11) {
                    float L = 1.0f - (u91Var.O.m3 / org.telegram.messenger.g0.L(72.0f));
                    g91 g91Var3 = u91Var.O;
                    g91Var3.setViewsOffset(g91Var3.m3 - ((i7 * 0.2f) * L));
                }
                gv gvVar5 = u91Var.x;
                if (gvVar5 != null) {
                    gvVar5.f(top2);
                    u91Var.x.I = u91Var.O;
                }
            }
            if (m13 != null) {
                m13.invalidate();
            }
            return o02;
        }
        i10 = i7;
        g91Var = u91Var.O;
        if (g91Var.m3 != 0.0f) {
            f10 = ((int) r14) - i7;
            if (f10 >= 0.0f) {
            }
            g91Var.setViewsOffset(f10);
            i10 = i11;
        }
        if (u91Var.E != 0) {
        }
        return super.o0(i10, w0Var, b1Var);
    }

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        if (this.J.y > 0 && i7 == 1) {
            super.v0(recyclerView, b1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }
}
