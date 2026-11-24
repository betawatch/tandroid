// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uwb extends u46 {
    public boolean I;
    public final /* synthetic */ sxb J;

    public uwb(sxb sxbVar) {
        this.J = sxbVar;
    }

    @Override // u46, f69
    public final void a0(ki2 ki2Var, r69 r69Var) {
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (IndexOutOfBoundsException e) {
            fc4.g(e, true);
            gm.c3(new zcb(this, (byte) 20));
        }
    }

    @Override // u46
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // u46
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.J.O.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    @Override // u46, f69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int i2;
        dxb dxbVar;
        pi3 pi3Var;
        float f;
        int i3;
        View m;
        sxb sxbVar = this.J;
        dxb dxbVar2 = sxbVar.O;
        boolean z = false;
        if (dxbVar2.W1) {
            return 0;
        }
        boolean z2 = dxbVar2.getScrollState() == 1;
        int paddingTop = sxbVar.O.getPaddingTop();
        if (i < 0 && sxbVar.y > 0 && sxbVar.E == 2) {
            sxbVar.O.setOverScrollMode(0);
            int K0 = sxbVar.G.K0();
            if (K0 == 0 && (m = sxbVar.G.m(K0)) != null) {
                m.setTranslationX(0.0f);
                if (m.getBottom() - paddingTop <= gm.L(1.0f)) {
                    K0 = 1;
                }
            }
            if (!z2) {
                View m2 = sxbVar.G.m(K0);
                if (m2 != null) {
                    int h = aq1.h(K0, 1, gm.L(gda.l1 ? 78.0f : 72.0f) + 1, -(m2.getTop() - paddingTop));
                    if (h < Math.abs(i)) {
                        i2 = -h;
                    }
                }
            } else if (K0 == 0) {
                View m3 = sxbVar.G.m(K0);
                float top = ((m3.getTop() - paddingTop) / m3.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                sxbVar.O.setOverScrollMode(2);
                i2 = (int) mlb.B(top, 0.25f, 0.45f, i);
                if (i2 > -1) {
                    i2 = -1;
                }
            }
            dxbVar = sxbVar.O;
            if (dxbVar.m3 != 0.0f && i > 0 && z2) {
                f = ((int) r14) - i;
                if (f >= 0.0f) {
                    i3 = (int) f;
                    f = 0.0f;
                } else {
                    i3 = 0;
                }
                dxbVar.setViewsOffset(f);
                i2 = i3;
            }
            if (sxbVar.E != 0 || sxbVar.y <= 0) {
                return super.n0(i2, ki2Var, r69Var);
            }
            int n0 = super.n0(i2, ki2Var, r69Var);
            pi3 pi3Var2 = sxbVar.x;
            if (pi3Var2 != null) {
                pi3Var2.a = n0;
            }
            int K02 = sxbVar.G.K0();
            View m4 = K02 == 0 ? sxbVar.G.m(K02) : null;
            if (m4 != null) {
                m4.setTranslationX(0.0f);
            }
            if (K02 != 0 || m4 == null || m4.getBottom() - paddingTop < gm.L(4.0f)) {
                sxbVar.Z = 0L;
                sxbVar.a0 = false;
                sxbVar.E = (byte) 2;
                pi3 pi3Var3 = sxbVar.x;
                if (pi3Var3 != null) {
                    ValueAnimator valueAnimator = pi3Var3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hg3 hg3Var = pi3Var3.H;
                    if (hg3Var != null) {
                        hg3Var.removeCallbacks(pi3Var3.d0);
                    }
                    pi3Var3.x = 0.0f;
                    pi3Var3.y = false;
                    pi3Var3.e0 = false;
                    sxbVar.x.f(0.0f);
                    sxbVar.x.I = sxbVar.O;
                }
            } else {
                if (sxbVar.Z == 0) {
                    sxbVar.Z = System.currentTimeMillis();
                }
                if (sxbVar.E == 2 && (pi3Var = sxbVar.x) != null) {
                    pi3Var.g();
                }
                float top2 = ((m4.getTop() - paddingTop) / m4.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - sxbVar.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z = true;
                }
                if (sxbVar.a0 != z) {
                    sxbVar.a0 = z;
                    if (sxbVar.E == 2) {
                        try {
                            sxbVar.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        pi3 pi3Var4 = sxbVar.x;
                        if (pi3Var4 != null) {
                            pi3Var4.a(z);
                        }
                    }
                }
                if (sxbVar.E == 2 && i2 - n0 != 0 && i < 0 && z2) {
                    float L = 1.0f - (sxbVar.O.m3 / gm.L(72.0f));
                    dxb dxbVar3 = sxbVar.O;
                    dxbVar3.setViewsOffset(dxbVar3.m3 - ((i * 0.2f) * L));
                }
                pi3 pi3Var5 = sxbVar.x;
                if (pi3Var5 != null) {
                    pi3Var5.f(top2);
                    sxbVar.x.I = sxbVar.O;
                }
            }
            if (m4 != null) {
                m4.invalidate();
            }
            return n0;
        }
        i2 = i;
        dxbVar = sxbVar.O;
        if (dxbVar.m3 != 0.0f) {
            f = ((int) r14) - i;
            if (f >= 0.0f) {
            }
            dxbVar.setViewsOffset(f);
            i2 = i3;
        }
        if (sxbVar.E != 0) {
        }
        return super.n0(i2, ki2Var, r69Var);
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, r69Var, i);
            return;
        }
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }
}
