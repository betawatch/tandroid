// default package

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wz3 implements oy4, h59, et9, g94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e34 b;

    public /* synthetic */ wz3(e34 e34Var, byte b) {
        this.a = b;
        this.b = e34Var;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.b.R();
    }

    @Override // et9
    public final void a(int i) {
        int i2;
        r24 r24Var;
        byte b = this.a;
        e34 e34Var = this.b;
        switch (b) {
            case 2:
                k24 k24Var = e34Var.j0;
                int i3 = e34Var.d1;
                j24 j24Var = e34Var.o0;
                m24 m24Var = e34Var.l0;
                if (i != e34Var.t0 || !j24Var.y.isEmpty()) {
                    e34Var.i0.D0();
                    e34Var.q0.k(i, 0);
                    if (i == e34Var.s0 || i == e34Var.t0) {
                        e34Var.p0.d.setText("");
                        if (i != e34Var.t0 || (i2 = j24Var.J) < 1) {
                            f24 f24Var = e34Var.u1;
                            k24Var.g1((f24Var == null || !f24Var.A()) ? 1 : 0, 0);
                        } else {
                            k24Var.g1(i2, -gm.L(4.0f));
                        }
                        if (i == e34Var.t0) {
                            ArrayList arrayList = oc7.r1(i3).x3;
                            if (!arrayList.isEmpty()) {
                                m24Var.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = oc7.r1(i3).x3;
                        e34Var.k0.H((String) arrayList2.get(i - e34Var.u0));
                        int i4 = i - e34Var.u0;
                        if (i4 > 0) {
                            m24Var.a((String) arrayList2.get(i4 - 1), true);
                        }
                        if (i - e34Var.u0 < arrayList2.size() - 1) {
                            m24Var.a((String) arrayList2.get((i - e34Var.u0) + 1), true);
                        }
                    }
                    e34Var.C(2);
                    break;
                }
                break;
            default:
                p04 p04Var = e34Var.H0;
                ArrayList arrayList3 = e34Var.e1;
                q04 q04Var = e34Var.C0;
                w24 w24Var = e34Var.z0;
                l04 l04Var = e34Var.E0;
                if (!e34Var.T0) {
                    if (i != e34Var.I1) {
                        if (p04Var != null && (r24Var = p04Var.r) != null && r24Var.getSelectedCategory() != null) {
                            p04Var.b(null, false);
                            r24Var.I1(null);
                        }
                        if (i != e34Var.G1) {
                            if (i != e34Var.H1) {
                                if (i != e34Var.J1) {
                                    int i5 = i - e34Var.F1;
                                    if (i5 < arrayList3.size()) {
                                        if (i5 >= arrayList3.size()) {
                                            i5 = arrayList3.size() - 1;
                                        }
                                        e34Var.J0 = false;
                                        l04Var.D0();
                                        e34Var.F(w24Var.E(arrayList3.get(i5)), 0);
                                        e34Var.C(0);
                                        e34Var.m(0);
                                        int i6 = e34Var.H1;
                                        if (i6 <= 0 && (i6 = e34Var.G1) <= 0) {
                                            i6 = e34Var.F1;
                                        }
                                        q04Var.k(i, i6);
                                        e34Var.Y1 = false;
                                        e34Var.Z();
                                        break;
                                    }
                                } else {
                                    l04Var.D0();
                                    e34Var.F(w24Var.E("premium"), 0);
                                    e34Var.C(0);
                                    int i7 = e34Var.J1;
                                    q04Var.k(i7, i7 > 0 ? i7 : e34Var.F1);
                                    break;
                                }
                            } else {
                                l04Var.D0();
                                e34Var.F(w24Var.E("fav"), 0);
                                e34Var.C(0);
                                int i8 = e34Var.H1;
                                q04Var.k(i8, i8 > 0 ? i8 : e34Var.F1);
                                break;
                            }
                        } else {
                            l04Var.D0();
                            e34Var.F(w24Var.E("recent"), 0);
                            e34Var.C(0);
                            int i9 = e34Var.G1;
                            q04Var.k(i9, i9 > 0 ? i9 : e34Var.F1);
                            break;
                        }
                    } else {
                        e34Var.u1.g(new d4c(e34Var.getContext(), new y04(e34Var), e34Var.y1, e34Var.z1, e34Var.A1, null, e34Var.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // h59
    public final boolean g(int i, View view) {
        String str;
        int i2;
        e34 e34Var = this.b;
        int i3 = e34Var.D1;
        int[] iArr = e34Var.E1;
        r14 r14Var = e34Var.Q;
        rx3 rx3Var = e34Var.C1;
        if (view instanceof n24) {
            n24 n24Var = (n24) view;
            if (n24Var.c) {
                View F = r14Var.F(view);
                u69 T = F != null ? r14Var.T(F) : null;
                if (T != null && T.b() <= e34Var.getRecentEmoji().size()) {
                    e34Var.u1.n();
                }
                r14Var.A1(view);
                return true;
            }
            if (n24Var.getSpan() == null && (str = (String) n24Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !n24Var.c ? (String) gw3.j.get(replace) : null;
                boolean z = bs2.a(replace, null, null) != null;
                if (z || zx3.l.contains(replace)) {
                    e34Var.S1 = n24Var;
                    e34Var.V1 = e34Var.T1;
                    e34Var.W1 = e34Var.U1;
                    if (z) {
                        replace = e34.c(replace, str2);
                    } else {
                        int indexOf = bs2.a.indexOf(str2) + 1;
                        qx3 qx3Var = rx3Var.c;
                        int[] iArr2 = qx3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            qx3Var.invalidate();
                        }
                    }
                    rx3Var.getClass();
                    qx3 qx3Var2 = rx3Var.c;
                    int i4 = rx3Var.e;
                    boolean z2 = bs2.a(replace, null, null) != null;
                    rx3Var.d = z2;
                    Drawable[] drawableArr = qx3Var2.b;
                    int[] iArr3 = qx3Var2.n;
                    qx3Var2.f = z2;
                    qx3Var2.e = replace;
                    if (z2) {
                        drawableArr[0] = bs2.a(replace, -1, -1);
                        drawableArr[1] = bs2.a(qx3Var2.e, 0, -2);
                        drawableArr[2] = bs2.a(qx3Var2.e, 1, -2);
                        drawableArr[3] = bs2.a(qx3Var2.e, 2, -2);
                        drawableArr[4] = bs2.a(qx3Var2.e, 3, -2);
                        drawableArr[5] = bs2.a(qx3Var2.e, 4, -2);
                        drawableArr[6] = bs2.a(qx3Var2.e, -2, 0);
                        drawableArr[7] = bs2.a(qx3Var2.e, -2, 1);
                        drawableArr[8] = bs2.a(qx3Var2.e, -2, 2);
                        drawableArr[9] = bs2.a(qx3Var2.e, -2, 3);
                        drawableArr[10] = bs2.a(qx3Var2.e, -2, 4);
                        Pair c = bs2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                qx3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                qx3Var2.invalidate();
                            }
                            qx3Var2.H = iArr3[0] == iArr3[1];
                        }
                        qx3Var2.J = true;
                    } else {
                        int i5 = 0;
                        while (i5 < 6) {
                            drawableArr[i5] = gw3.f(i5 != 0 ? e34.c(replace, (String) bs2.a.get(i5 - 1)) : replace);
                            i5++;
                        }
                    }
                    qx3Var2.invalidate();
                    rx3Var.setWidth(gm.L((rx3Var.d ? 3 : 0) + 30) + (i4 * 6));
                    rx3Var.setHeight(((rx3Var.d ? 2 : 1) * i4) + gm.L(rx3Var.d ? 11.66f : 15.0f));
                    int L = gm.L((rx3Var.d ? 3 : 0) + 30) + (i4 * 6);
                    int L2 = ((rx3Var.d ? 2 : 1) * i4) + gm.L(rx3Var.d ? 11.66f : 15.0f);
                    n24Var.getLocationOnScreen(iArr);
                    if (rx3Var.d) {
                        i2 = 0;
                    } else {
                        i2 = gm.L((r4 << 2) - (gm.O1() ? 5 : 1)) + (qx3Var2.n[0] * i3);
                    }
                    if (iArr[0] - i2 < gm.L(5.0f)) {
                        i2 = b10.z(5.0f, iArr[0] - i2, i2);
                    } else {
                        int i6 = (iArr[0] - i2) + L;
                        Point point = gm.q;
                        if (i6 > point.x - gm.L(5.0f)) {
                            i2 += ((iArr[0] - i2) + L) - (point.x - gm.L(5.0f));
                        }
                    }
                    int i7 = -i2;
                    int top = n24Var.getTop() < 0 ? n24Var.getTop() : 0;
                    qx3Var2.setArrowX((gm.L(gm.O1() ? 30.0f : 22.0f) - i7) + ((int) gm.N(0.5f)));
                    rx3Var.setFocusable(true);
                    rx3Var.showAsDropDown(view, i7, (((view.getMeasuredHeight() - i3) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    e34Var.h.requestDisallowInterceptTouchEvent(true);
                    r14Var.e1(true);
                    r14Var.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oy4
    public final void s(int i) {
        e34 e34Var = this.b;
        mr3 mr3Var = e34Var.k2;
        if (Build.VERSION.SDK_INT < 31 || mr3Var == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            mr3Var.h(e34Var.n2.e());
        }
        mr3Var.e(e34Var.l2, e34Var.getWidth(), e34Var.getHeight());
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
