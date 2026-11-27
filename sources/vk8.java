// default package

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vk8 implements dic {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ vk8(byte b, KeyEvent.Callback callback, Object obj) {
        this.a = b;
        this.c = callback;
        this.b = obj;
    }

    @Override // dic
    public final void a(int i) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                xk8 xk8Var = (xk8) callback;
                ArrayList arrayList = xk8Var.n1;
                if (((sl8) arrayList.get(i)).a == 0) {
                    xk8Var.H1.setTitle(ob6.M0(2131751314, null));
                    xk8Var.H1.requestLayout();
                } else if (((sl8) arrayList.get(i)).a == 14) {
                    xk8Var.H1.setTitle(ob6.M0(2131743460, null));
                    xk8Var.H1.requestLayout();
                } else if (((sl8) arrayList.get(i)).a == 40) {
                    xk8Var.H1.setTitle(ob6.M0(2131750802, null));
                    xk8Var.H1.requestLayout();
                } else if (((sl8) arrayList.get(i)).a == 28) {
                    xk8Var.H1.setTitle(ob6.M0(2131743905, null));
                    xk8Var.H1.requestLayout();
                }
                d();
                break;
            default:
                lcb lcbVar = (lcb) this.b;
                acb acbVar = (acb) callback;
                o68 currentPeerView = acbVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((ccb) acbVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    acbVar.F();
                    hcb hcbVar = lcbVar.u0;
                    if (hcbVar != null) {
                        if (i >= 3) {
                            if (i > acbVar.A0.b() - 4) {
                                lcbVar.u0.f(true);
                                break;
                            }
                        } else {
                            hcbVar.f(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                zw0 zw0Var = (zw0) this.b;
                zw0Var.b = f;
                zw0Var.c = i;
                zw0Var.invalidate();
                xk8 xk8Var = (xk8) callback;
                xk8Var.A1 = i;
                xk8Var.B1 = i2 > 0 ? i + 1 : i - 1;
                xk8Var.C1 = f;
                d();
                break;
            default:
                acb acbVar = (acb) callback;
                acbVar.J0 = i;
                acbVar.K0 = i2 > 0 ? i + 1 : i - 1;
                acbVar.L0 = f;
                long j = yac.h(acbVar.z0).n;
                int i3 = acbVar.J0;
                if (i3 >= 0 && (acbVar.y0 != null ? acbVar.x0 == j : !(i3 >= acbVar.B0.size() || ((Long) acbVar.B0.get(acbVar.J0)).longValue() != j))) {
                    ((ccb) acbVar.C0).d(1.0f - acbVar.L0);
                    break;
                } else {
                    int i4 = acbVar.K0;
                    if (i4 >= 0 && (acbVar.y0 != null ? acbVar.x0 == j : !(i4 >= acbVar.B0.size() || ((Long) acbVar.B0.get(acbVar.K0)).longValue() != j))) {
                        ((ccb) acbVar.C0).d(acbVar.L0);
                        break;
                    } else {
                        ((ccb) acbVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
        }
    }

    @Override // dic
    public final void c(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                acb acbVar = (acb) this.c;
                ((ccb) acbVar.C0).d.U();
                Runnable runnable = acbVar.H0;
                if (runnable != null && i == 0) {
                    runnable.run();
                    acbVar.H0 = null;
                }
                acbVar.G0 = i;
                lcb lcbVar = acbVar.S0;
                if (lcbVar.o0.G0 == 1) {
                    hl.r(lcbVar.b1);
                    break;
                }
                break;
        }
    }

    public final void d() {
        float f;
        byte b;
        byte b2;
        xk8 xk8Var = (xk8) this.c;
        tk8 tk8Var = xk8Var.r1;
        ArrayList arrayList = xk8Var.n1;
        byte b3 = 0;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= tk8Var.getChildCount()) {
                break;
            }
            wk8 wk8Var = (wk8) tk8Var.getChildAt(i);
            if (!xk8Var.v1 || !(wk8Var.f instanceof lk8)) {
                int i2 = wk8Var.a;
                wu7 wu7Var = wk8Var.e;
                if (i2 == xk8Var.A1) {
                    f = (-wk8Var.getMeasuredWidth()) * xk8Var.C1;
                    wu7Var.setOffset(f);
                } else if (i2 == xk8Var.B1) {
                    f = ((-wk8Var.getMeasuredWidth()) * xk8Var.C1) + wk8Var.getMeasuredWidth();
                    wu7Var.setOffset(f);
                } else {
                    wu7Var.setOffset(wk8Var.getMeasuredWidth());
                }
            }
            if (wk8Var.f instanceof lk8) {
                wk8Var.setTranslationX(-f);
                wk8Var.b.setTranslationX(f);
                wk8Var.c.setTranslationX(f);
            }
            i++;
        }
        int i3 = xk8Var.A1;
        boolean z = i3 >= 0 && i3 < arrayList.size() && ((b2 = ((sl8) arrayList.get(xk8Var.A1)).a) == 0 || b2 == 14 || b2 == 28);
        int i4 = xk8Var.B1;
        boolean z2 = i4 >= 0 && i4 < arrayList.size() && ((b = ((sl8) arrayList.get(xk8Var.B1)).a) == 0 || b == 14 || b == 28);
        if (z) {
            if (z2) {
                xk8Var.p1 = 1.0f;
                float f2 = xk8Var.C1;
                f = f2 == 0.0f ? 1.0f : f2;
                xk8Var.o1 = f;
                xk8Var.q1 = true;
            } else {
                f = 1.0f - xk8Var.C1;
                xk8Var.o1 = f;
                xk8Var.p1 = f;
                xk8Var.q1 = true;
            }
        } else if (z2) {
            f = xk8Var.C1;
            xk8Var.o1 = f;
            xk8Var.p1 = f;
            xk8Var.q1 = false;
        } else {
            xk8Var.o1 = 0.0f;
            xk8Var.p1 = 0.0f;
            xk8Var.q1 = true;
        }
        int i5 = (int) ((1.0f - f) * 255.0f);
        if (i5 != xk8Var.E1) {
            xk8Var.E1 = i5;
            xk8Var.s1.invalidate();
            hl.c3(new uk8(this, b3));
        }
    }

    private final void e(int i) {
    }
}
