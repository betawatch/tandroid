// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uyb extends x46 {
    public boolean I;
    public final /* synthetic */ tzb J;

    public uyb(tzb tzbVar) {
        this.J = tzbVar;
    }

    @Override // x46, q79
    public final void a0(oh2 oh2Var, c89 c89Var) {
        boolean z = f11.a;
        try {
            super.a0(oh2Var, c89Var);
        } catch (IndexOutOfBoundsException e) {
            cc4.g(e, true);
            hl.c3(new s8b(this, (byte) 29));
        }
    }

    @Override // x46
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // x46
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.J.O.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    @Override // x46, q79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        int i2;
        ezb ezbVar;
        xh3 xh3Var;
        float f;
        int i3;
        View m;
        tzb tzbVar = this.J;
        ezb ezbVar2 = tzbVar.O;
        boolean z = false;
        if (ezbVar2.W1) {
            return 0;
        }
        boolean z2 = ezbVar2.getScrollState() == 1;
        int paddingTop = tzbVar.O.getPaddingTop();
        if (i < 0 && tzbVar.y > 0 && tzbVar.E == 2) {
            tzbVar.O.setOverScrollMode(0);
            int K0 = tzbVar.G.K0();
            if (K0 == 0 && (m = tzbVar.G.m(K0)) != null) {
                m.setTranslationX(0.0f);
                if (m.getBottom() - paddingTop <= hl.L(1.0f)) {
                    K0 = 1;
                }
            }
            if (!z2) {
                View m2 = tzbVar.G.m(K0);
                if (m2 != null) {
                    int h = bp1.h(K0, 1, hl.L(xea.l1 ? 78.0f : 72.0f) + 1, -(m2.getTop() - paddingTop));
                    if (h < Math.abs(i)) {
                        i2 = -h;
                    }
                }
            } else if (K0 == 0) {
                View m3 = tzbVar.G.m(K0);
                float top = ((m3.getTop() - paddingTop) / m3.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                tzbVar.O.setOverScrollMode(2);
                i2 = (int) xnb.B(top, 0.25f, 0.45f, i);
                if (i2 > -1) {
                    i2 = -1;
                }
            }
            ezbVar = tzbVar.O;
            if (ezbVar.m3 != 0.0f && i > 0 && z2) {
                f = ((int) r14) - i;
                if (f >= 0.0f) {
                    i3 = (int) f;
                    f = 0.0f;
                } else {
                    i3 = 0;
                }
                ezbVar.setViewsOffset(f);
                i2 = i3;
            }
            if (tzbVar.E != 0 || tzbVar.y <= 0) {
                return super.n0(i2, oh2Var, c89Var);
            }
            int n0 = super.n0(i2, oh2Var, c89Var);
            xh3 xh3Var2 = tzbVar.x;
            if (xh3Var2 != null) {
                xh3Var2.a = n0;
            }
            int K02 = tzbVar.G.K0();
            View m4 = K02 == 0 ? tzbVar.G.m(K02) : null;
            if (m4 != null) {
                m4.setTranslationX(0.0f);
            }
            if (K02 != 0 || m4 == null || m4.getBottom() - paddingTop < hl.L(4.0f)) {
                tzbVar.Z = 0L;
                tzbVar.a0 = false;
                tzbVar.E = (byte) 2;
                xh3 xh3Var3 = tzbVar.x;
                if (xh3Var3 != null) {
                    ValueAnimator valueAnimator = xh3Var3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    of3 of3Var = xh3Var3.H;
                    if (of3Var != null) {
                        of3Var.removeCallbacks(xh3Var3.d0);
                    }
                    xh3Var3.x = 0.0f;
                    xh3Var3.y = false;
                    xh3Var3.e0 = false;
                    tzbVar.x.f(0.0f);
                    tzbVar.x.I = tzbVar.O;
                }
            } else {
                if (tzbVar.Z == 0) {
                    tzbVar.Z = System.currentTimeMillis();
                }
                if (tzbVar.E == 2 && (xh3Var = tzbVar.x) != null) {
                    xh3Var.g();
                }
                float top2 = ((m4.getTop() - paddingTop) / m4.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - tzbVar.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z = true;
                }
                if (tzbVar.a0 != z) {
                    tzbVar.a0 = z;
                    if (tzbVar.E == 2) {
                        try {
                            tzbVar.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        xh3 xh3Var4 = tzbVar.x;
                        if (xh3Var4 != null) {
                            xh3Var4.a(z);
                        }
                    }
                }
                if (tzbVar.E == 2 && i2 - n0 != 0 && i < 0 && z2) {
                    float L = 1.0f - (tzbVar.O.m3 / hl.L(72.0f));
                    ezb ezbVar3 = tzbVar.O;
                    ezbVar3.setViewsOffset(ezbVar3.m3 - ((i * 0.2f) * L));
                }
                xh3 xh3Var5 = tzbVar.x;
                if (xh3Var5 != null) {
                    xh3Var5.f(top2);
                    tzbVar.x.I = tzbVar.O;
                }
            }
            if (m4 != null) {
                m4.invalidate();
            }
            return n0;
        }
        i2 = i;
        ezbVar = tzbVar.O;
        if (ezbVar.m3 != 0.0f) {
            f = ((int) r14) - i;
            if (f >= 0.0f) {
            }
            ezbVar.setViewsOffset(f);
            i2 = i3;
        }
        if (tzbVar.E != 0) {
        }
        return super.n0(i2, oh2Var, c89Var);
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, c89Var, i);
            return;
        }
        z46 z46Var = new z46(recyclerView.getContext(), 0);
        z46Var.a = i;
        v0(z46Var);
    }
}
