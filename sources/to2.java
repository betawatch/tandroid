// default package

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class to2 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        a aVar;
        View m;
        jla jlaVar;
        jla jlaVar2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vo2 vo2Var = (vo2) obj;
                if (i == 0) {
                    vo2Var.e = !vo2Var.d.canScrollVertically(-1);
                    vo2Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    hl.t1(((ky2) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                ow3 ow3Var = (ow3) obj;
                if (i == 0 && ow3Var.n >= 0.0f && !ow3Var.b.canScrollVertically(-1)) {
                    ow3Var.n = -1.0f;
                    break;
                }
                break;
            case 9:
                ny3 ny3Var = (ny3) obj;
                ny3Var.d0 = i == 1;
                if (i != 0) {
                    ny3Var.b0 = System.currentTimeMillis() - ny3.g0;
                }
                ny3Var.invalidate();
                break;
            case 13:
                if (i == 0) {
                    bx4 bx4Var = (bx4) obj;
                    if (bx4Var.m2) {
                        bx4Var.m2 = false;
                        break;
                    }
                }
                break;
            case 14:
                ((vy4) obj).g++;
                break;
            case 15:
                m15 m15Var = (m15) obj;
                if (i == 0) {
                    int L = hl.L(16.0f) + m15Var.o0().getBottom();
                    float f = m15Var.w;
                    d79 d79Var = m15Var.c;
                    if (f <= 0.5f) {
                        if ((d79Var.getLayoutManager() != null ? m15Var.c.getLayoutManager().m(0) : null) != null) {
                            if (m15Var.p0() + r7.getTop() < 0.0f) {
                                m15Var.c.y0(0, Math.round(m15Var.p0() + r7.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        d79Var.y0(0, m15Var.r - L, null);
                        break;
                    }
                }
                break;
            case 16:
                dc5 dc5Var = (dc5) obj;
                if (i == 0) {
                    float f2 = dc5Var.B0;
                    if (f2 >= 0.5f && f2 < 1.0f) {
                        aVar = ((e) dc5Var).actionBar;
                        int bottom = aVar.getBottom();
                        q79 layoutManager = dc5Var.N.getLayoutManager();
                        if (layoutManager != null && (m = layoutManager.m(0)) != null) {
                            dc5Var.N.y0(0, m.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f2 < 0.5f) {
                        View m2 = dc5Var.N.getLayoutManager() != null ? dc5Var.N.getLayoutManager().m(0) : null;
                        if (m2 != null && m2.getTop() < 0) {
                            dc5Var.N.y0(0, m2.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                rc5 rc5Var = (rc5) obj;
                if (i == 1) {
                    rc5Var.f.r.m();
                    hl.t1(rc5Var.f.r);
                    break;
                }
                break;
            case 18:
                if (i == 1) {
                    hl.t1(((xc5) obj).c);
                    break;
                }
                break;
            case 19:
                if (i == 1) {
                    hl.t1(((nd5) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                hs5 hs5Var = (hs5) obj;
                if (i == 1) {
                    jlaVar = ((e) hs5Var).simpleActionBar;
                    if (jlaVar.L) {
                        jlaVar2 = ((e) hs5Var).simpleActionBar;
                        hl.t1(jlaVar2.getSearchField());
                        break;
                    }
                }
                break;
            case 22:
                if (i == 1) {
                    hl.t1(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 24:
                a27 a27Var = (a27) obj;
                a27Var.f3 = i != 0;
                a27Var.g3 = i == 1;
                break;
            case 28:
                if (i == 1) {
                    hl.t1(((qi7) obj).T1.getEditText());
                    break;
                }
                break;
            case 29:
                if (i == 1) {
                    hl.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        sw3 sw3Var;
        int i3;
        sw3 sw3Var2;
        if4 if4Var;
        lt3 lt3Var;
        a aVar;
        tq3 tq3Var;
        String str;
        TLRPC.User user;
        String str2;
        byte b = this.a;
        int i4 = -1;
        boolean z = false;
        int i5 = 0;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                xo2 xo2Var = ((vo2) obj).f;
                int i6 = xo2.P1;
                xo2Var.b.invalidate();
                break;
            case 1:
                qo2 qo2Var = (qo2) obj;
                qo2Var.n.G1.b(qo2Var.d);
                break;
            case 3:
                ((ry2) obj).a1();
                break;
            case 4:
                df3 df3Var = (df3) obj;
                hy0 hy0Var = df3Var.t1;
                if (hy0Var != null) {
                    dl7 dl7Var = hy0Var.i0;
                    if (dl7Var != null && dl7Var.getTop() == hy0Var.k0) {
                        z = true;
                    }
                    df3Var.v1 = !z;
                    hy0Var.invalidate();
                    break;
                }
                break;
            case 5:
                ii3 ii3Var = (ii3) obj;
                ii3Var.invalidate();
                ii3Var.c();
                kg5 kg5Var = ii3Var.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    break;
                }
                break;
            case 6:
                hw3 hw3Var = (hw3) obj;
                fw3 fw3Var = hw3Var.c;
                zw3 zw3Var = hw3Var.r;
                int i7 = zw3.C1;
                zw3Var.b.invalidate();
                if (zw3Var.d && hw3Var.b.J1 && (sw3Var = hw3Var.d) != null && sw3Var.e != null) {
                    zw3Var.H0();
                }
                if (hw3Var.e.L0() + 7 >= fw3Var.b() - 1) {
                    fw3Var.F();
                    break;
                }
                break;
            case 7:
                ow3 ow3Var = (ow3) obj;
                nw3 nw3Var = ow3Var.c;
                dw3 dw3Var = ow3Var.b;
                zw3 zw3Var2 = ow3Var.s;
                int i8 = zw3.C1;
                zw3Var2.b.invalidate();
                if (ow3Var.n < 0.0f) {
                    i3 = ow3Var.d.H0();
                } else {
                    while (true) {
                        if (i5 < dw3Var.getChildCount()) {
                            View childAt = dw3Var.getChildAt(i5);
                            if (childAt.getY() + childAt.getHeight() > ow3Var.n + dw3Var.getPaddingTop()) {
                                dw3Var.getClass();
                                i3 = RecyclerView.S(childAt);
                            } else {
                                i5++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 == -1) {
                    }
                }
                int size = nw3Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = nw3Var.E.keyAt(size);
                        int valueAt = nw3Var.E.valueAt(size);
                        if (i3 >= keyAt) {
                            i4 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i4 >= 0) {
                    ow3Var.e.j(i4, true);
                }
                if (zw3Var2.d && dw3Var.J1 && (sw3Var2 = ow3Var.f) != null && sw3Var2.e != null) {
                    zw3Var2.H0();
                    break;
                }
                break;
            case 8:
                ly3 ly3Var = (ly3) obj;
                dy3 dy3Var = ly3Var.p1;
                if (dy3Var != null && ly3Var.q1.J1 && dy3Var.x) {
                    dy3Var.x = false;
                    dy3Var.invalidate();
                    break;
                }
                break;
            case 9:
                ny3 ny3Var = (ny3) obj;
                if (i2 != 0) {
                    ny3Var.b0 = System.currentTimeMillis() - ny3.g0;
                    ny3Var.invalidate();
                    break;
                }
                break;
            case 10:
                nf4 nf4Var = (nf4) obj;
                if (nf4Var.a.J1 && (if4Var = nf4Var.L) != null && (lt3Var = if4Var.b) != null) {
                    if (lt3Var.e) {
                        lt3Var.k(true);
                        break;
                    } else {
                        lt3Var.d();
                        break;
                    }
                }
                break;
            case 11:
                fg4 fg4Var = (fg4) obj;
                fg4Var.G.invalidate();
                fg4Var.invalidate();
                break;
            case 12:
                ((ah4) obj).G0();
                break;
            case 13:
                bx4 bx4Var = (bx4) obj;
                bx4Var.k1();
                if (bx4Var.n1.J1 && !bx4Var.m2) {
                    hl.t1(bx4Var.b);
                    break;
                }
                break;
            case 14:
                ((vy4) obj).h(i, i2);
                break;
            case 15:
                ((m15) obj).s.invalidate();
                break;
            case 16:
                dc5 dc5Var = (dc5) obj;
                ph1 ph1Var = dc5Var.A0;
                if (ph1Var == null) {
                    ph1Var = (ph1) dc5Var.C0(dc5Var.a0);
                    dc5Var.A0 = ph1Var;
                }
                int measuredHeight = ph1Var.getMeasuredHeight();
                aVar = ((e) dc5Var).actionBar;
                int measuredHeight2 = measuredHeight - aVar.getMeasuredHeight();
                float top = dc5Var.A0.getTop() * (-1);
                float f = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f), 0.0f);
                dc5Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(dc5Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                dc5Var.A0.b.setAlpha(hl.R1(1.0f, 0.0f, min));
                dc5Var.A0.f.setAlpha(hl.R1(1.0f, 0.0f, min));
                dc5Var.A0.c.setAlpha(hl.R1(0.0f, 1.0f, min2));
                float f2 = dc5Var.B0;
                ph1 ph1Var2 = dc5Var.A0;
                if (f2 >= 1.0f) {
                    ph1Var2.setTranslationY(top - f);
                    break;
                } else {
                    ph1Var2.setTranslationY(0.0f);
                    break;
                }
            case 17:
                rc5 rc5Var = (rc5) obj;
                int K0 = rc5Var.r.K0();
                View childAt2 = rc5Var.n.getChildAt(0);
                ((fm0) rc5Var.e.c).a(K0 != 0 || (childAt2 != null ? childAt2.getTop() : 0) < rc5Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (tq3Var = rc5Var.q0) != null) {
                    tq3Var.f(i, i2);
                    rc5Var.f0();
                    break;
                }
                break;
            case 20:
                ng5 ng5Var = (ng5) obj;
                if (ng5Var.a.J1) {
                    hl.t1(ng5Var.fragmentView);
                    break;
                }
                break;
            case 23:
                x46 x46Var = (x46) recyclerView.getLayoutManager();
                e17 e17Var = (e17) obj;
                v07 v07Var = e17Var.C;
                if (e17Var.x && !e17Var.w && x46Var != null) {
                    if (e17Var.f.b() - x46Var.M0() < 10) {
                        hl.r(v07Var);
                        hl.c3(v07Var);
                        break;
                    }
                }
                break;
            case 24:
                a27 a27Var = (a27) obj;
                q79 layoutManager = a27Var.getLayoutManager();
                b27 b27Var = a27Var.j3;
                u17 u17Var = b27Var.d;
                int M0 = layoutManager == u17Var ? u17Var.M0() : b27Var.c.M0();
                if ((M0 != -1 ? M0 : 0) > 0) {
                    r17 r17Var = b27Var.f;
                    if (M0 > r17Var.N0 - 5 && r17Var.v0 == 0 && (str = r17Var.t0) != null && str.length() != 0 && (user = r17Var.x0) != null && (str2 = r17Var.s0) != null) {
                        r17Var.T(true, user, str2, r17Var.t0);
                    }
                }
                boolean z2 = !a27Var.canScrollVertically(-1);
                a27Var.canScrollVertically(1);
                b27Var.n(z2);
                b27Var.b();
                break;
            case 25:
                m57 m57Var = (m57) obj;
                w81 w81Var = m57Var.b;
                gu guVar = m57Var.f;
                for (int i9 = 0; i9 < guVar.getChildCount(); i9++) {
                    View childAt3 = guVar.getChildAt(i9);
                    if (childAt3 instanceof wb2) {
                        ((wb2) childAt3).B3(w81Var.getMeasuredWidth(), w81Var.getBackgroundSizeY());
                    }
                }
                g57 g57Var = m57Var.e;
                if (g57Var != null) {
                    g57Var.v();
                    break;
                }
                break;
            case 26:
                ((q67) obj).K.invalidate();
                break;
            case 27:
                z67 z67Var = (z67) obj;
                int K02 = z67Var.h.K0();
                int abs = K02 != -1 ? Math.abs(z67Var.h.M0() - K02) + 1 : 0;
                int b2 = recyclerView.getAdapter().b();
                if (abs > 0 && !z67Var.W && !z67Var.F && !z67Var.y.isEmpty() && K02 + abs >= b2 - 5 && z67Var.E) {
                    z67Var.g0();
                    break;
                }
                break;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    private final void d(RecyclerView recyclerView, int i, int i2) {
    }
}
