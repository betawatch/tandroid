// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tub extends t26 {
    public boolean I;
    public final /* synthetic */ qvb J;

    public tub(qvb qvbVar) {
        this.J = qvbVar;
    }

    @Override // t26, d49
    public final void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = w01.a;
        try {
            super.a0(wg2Var, p49Var);
        } catch (IndexOutOfBoundsException e) {
            fa4.g(e, true);
            gl.d3(new cib(this, (byte) 12));
        }
    }

    @Override // t26
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // t26
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.J.O.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    @Override // t26, d49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        int i2;
        cvb cvbVar;
        dh3 dh3Var;
        float f;
        int i3;
        View m;
        qvb qvbVar = this.J;
        cvb cvbVar2 = qvbVar.O;
        boolean z = false;
        if (cvbVar2.W1) {
            return 0;
        }
        boolean z2 = cvbVar2.getScrollState() == 1;
        int paddingTop = qvbVar.O.getPaddingTop();
        if (i < 0 && qvbVar.y > 0 && qvbVar.E == 2) {
            qvbVar.O.setOverScrollMode(0);
            int K0 = qvbVar.G.K0();
            if (K0 == 0 && (m = qvbVar.G.m(K0)) != null) {
                m.setTranslationX(0.0f);
                if (m.getBottom() - paddingTop <= gl.L(1.0f)) {
                    K0 = 1;
                }
            }
            if (!z2) {
                View m2 = qvbVar.G.m(K0);
                if (m2 != null) {
                    int h = oo1.h(K0, 1, gl.L(gba.m1 ? 78.0f : 72.0f) + 1, -(m2.getTop() - paddingTop));
                    if (h < Math.abs(i)) {
                        i2 = -h;
                    }
                }
            } else if (K0 == 0) {
                View m3 = qvbVar.G.m(K0);
                float top = ((m3.getTop() - paddingTop) / m3.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                qvbVar.O.setOverScrollMode(2);
                i2 = (int) yjb.B(top, 0.25f, 0.45f, i);
                if (i2 > -1) {
                    i2 = -1;
                }
            }
            cvbVar = qvbVar.O;
            if (cvbVar.m3 != 0.0f && i > 0 && z2) {
                f = ((int) r14) - i;
                if (f >= 0.0f) {
                    i3 = (int) f;
                    f = 0.0f;
                } else {
                    i3 = 0;
                }
                cvbVar.setViewsOffset(f);
                i2 = i3;
            }
            if (qvbVar.E != 0 || qvbVar.y <= 0) {
                return super.n0(i2, wg2Var, p49Var);
            }
            int n0 = super.n0(i2, wg2Var, p49Var);
            dh3 dh3Var2 = qvbVar.x;
            if (dh3Var2 != null) {
                dh3Var2.a = n0;
            }
            int K02 = qvbVar.G.K0();
            View m4 = K02 == 0 ? qvbVar.G.m(K02) : null;
            if (m4 != null) {
                m4.setTranslationX(0.0f);
            }
            if (K02 != 0 || m4 == null || m4.getBottom() - paddingTop < gl.L(4.0f)) {
                qvbVar.Z = 0L;
                qvbVar.a0 = false;
                qvbVar.E = (byte) 2;
                dh3 dh3Var3 = qvbVar.x;
                if (dh3Var3 != null) {
                    ValueAnimator valueAnimator = dh3Var3.z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ue3 ue3Var = dh3Var3.H;
                    if (ue3Var != null) {
                        ue3Var.removeCallbacks(dh3Var3.d0);
                    }
                    dh3Var3.x = 0.0f;
                    dh3Var3.y = false;
                    dh3Var3.e0 = false;
                    qvbVar.x.f(0.0f);
                    qvbVar.x.I = qvbVar.O;
                }
            } else {
                if (qvbVar.Z == 0) {
                    qvbVar.Z = System.currentTimeMillis();
                }
                if (qvbVar.E == 2 && (dh3Var = qvbVar.x) != null) {
                    dh3Var.g();
                }
                float top2 = ((m4.getTop() - paddingTop) / m4.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                long currentTimeMillis = System.currentTimeMillis() - qvbVar.Z;
                if (top2 > 0.85f && currentTimeMillis > 220) {
                    z = true;
                }
                if (qvbVar.a0 != z) {
                    qvbVar.a0 = z;
                    if (qvbVar.E == 2) {
                        try {
                            qvbVar.O.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        dh3 dh3Var4 = qvbVar.x;
                        if (dh3Var4 != null) {
                            dh3Var4.a(z);
                        }
                    }
                }
                if (qvbVar.E == 2 && i2 - n0 != 0 && i < 0 && z2) {
                    float L = 1.0f - (qvbVar.O.m3 / gl.L(72.0f));
                    cvb cvbVar3 = qvbVar.O;
                    cvbVar3.setViewsOffset(cvbVar3.m3 - ((i * 0.2f) * L));
                }
                dh3 dh3Var5 = qvbVar.x;
                if (dh3Var5 != null) {
                    dh3Var5.f(top2);
                    qvbVar.x.I = qvbVar.O;
                }
            }
            if (m4 != null) {
                m4.invalidate();
            }
            return n0;
        }
        i2 = i;
        cvbVar = qvbVar.O;
        if (cvbVar.m3 != 0.0f) {
            f = ((int) r14) - i;
            if (f >= 0.0f) {
            }
            cvbVar.setViewsOffset(f);
            i2 = i3;
        }
        if (qvbVar.E != 0) {
        }
        return super.n0(i2, wg2Var, p49Var);
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, p49Var, i);
            return;
        }
        v26 v26Var = new v26(recyclerView.getContext(), 0);
        v26Var.a = i;
        v0(v26Var);
    }
}
