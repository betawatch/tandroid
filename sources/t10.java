// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t10 implements r11 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // r11
    public final boolean a() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                return true;
            case 5:
                return false;
        }
    }

    @Override // r11
    public final void b(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                i91 i91Var = (i91) obj;
                i91Var.R = Math.max(0.0f, (f - i91Var.S) - i91Var.Q);
                i91Var.a0();
                break;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.k0 = Math.max(0.0f, (f - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.d0();
                break;
            case 9:
                uj3 uj3Var = (uj3) obj;
                UndoView undoView = uj3Var.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uj3Var.w1 = Math.max(0.0f, (f - uj3Var.m4) - uj3Var.p4);
                    uj3Var.u5();
                    break;
                }
                break;
        }
    }

    @Override // r11
    public final void c(v21 v21Var) {
        k68 k68Var;
        switch (this.a) {
            case 14:
                if (v21Var.a == 2 && (k68Var = ((u58) this.b).y.A1) != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Y0 = false;
                    lcbVar.U();
                    break;
                }
                break;
        }
    }

    @Override // r11
    public final boolean d() {
        switch (this.a) {
            case 17:
                if (((ProfileActivity) this.b).y5 != null) {
                }
                break;
        }
        return true;
    }

    @Override // r11
    public final int e(int i) {
        int i2;
        int i3;
        mq5 mq5Var;
        ed8 ed8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((x10) obj).e.x1.getHeight();
            case 1:
                rv0 rv0Var = (rv0) obj;
                if (!(rv0Var.getParent() instanceof i22)) {
                    return 0;
                }
                i22 i22Var = (i22) rv0Var.getParent();
                return (int) ((i22Var.getSwipeOffsetY() + i22Var.getOffsetY()) - i22Var.getTopActionBarOffsetY());
            case 2:
                return 0;
            case 3:
                i91 i91Var = (i91) obj;
                i2 = i91Var.S;
                i3 = i91Var.Q;
                break;
            case 4:
                return ((wh1) obj).P.getMeasuredHeight();
            case 5:
                zu1 zu1Var = (zu1) obj;
                rq1 rq1Var = zu1Var.w;
                if (i != 1) {
                    return (i != 1313167187 || zu1Var.d1 == null) ? Math.round(zu1Var.U.getInputBubbleHeight() + hl.L(16.0f) + zu1Var.u7(h1c.c) + rq1Var.d()) : Math.round(rq1Var.d() + hl.L(62.0f));
                }
                return 0;
            case 6:
                return ((r52) obj).c.b.O() + hl.L(126.0f);
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                i2 = contactsActivity.l0;
                i3 = contactsActivity.j0;
                break;
            case 8:
                return (int) ((e53) ((tt) obj).c).u;
            case 9:
                uj3 uj3Var = (uj3) obj;
                return uj3Var.a3 != 0 ? hl.L(60.0f) + uj3Var.m4 : uj3Var.F2();
            case 10:
                return 0;
            case 11:
                i3 = ((fj6) obj).O;
                i2 = hl.L(64.0f);
                break;
            case 12:
                mq5Var = ((e) ((em6) obj)).mSystemInsets;
                i3 = mq5Var.d;
                i2 = hl.L(72.0f);
                break;
            case 13:
                lm7 lm7Var = (lm7) obj;
                return hl.L((lm7Var.r0() ? 60 : 0) + 72) + lm7Var.G;
            case 14:
                if (((u58) obj).y.h2) {
                    return 0;
                }
                return hl.L(64.0f);
            case 15:
                PhotoViewer photoViewer = ((ad8) obj).o0;
                if (!photoViewer.Q4) {
                    b6 b6Var = photoViewer.j0;
                    if (b6Var != null && b6Var.getVisibility() == 0) {
                        r6 = (int) ((photoViewer.j0.getAlpha() * photoViewer.j0.getHeight()) + 0.0f);
                    }
                    wd5 wd5Var = photoViewer.m1;
                    return (wd5Var == null || !wd5Var.c()) ? r6 : (hl.O1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) ? (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + r6) : r6;
                }
                pb8 pb8Var = photoViewer.V1;
                if (pb8Var != null) {
                    r6 = pb8Var.M.l;
                    if (pb8Var.getVisibility() == 0 && ((ed8Var = photoViewer.d) == null || !ed8Var.z())) {
                        r6 = uh9.w(12.0f, photoViewer.V1.getEditTextHeight(), r6);
                    }
                }
                jo0 jo0Var = photoViewer.Q0;
                if (jo0Var == null || jo0Var.getVisibility() != 0) {
                    return r6;
                }
                pb8 pb8Var2 = photoViewer.V1;
                return (pb8Var2 == null || !pb8Var2.M.c()) ? r6 + photoViewer.Q0.getHeight() : r6;
            case 16:
                return ((PremiumPreviewFragment) obj).p0.d;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int L = profileActivity.y5 == null ? profileActivity.P6 + profileActivity.O6 : ((int) (((hl.L(52.0f) - profileActivity.y5.getTranslationY()) - (((1.0f - profileActivity.z5[1].getAlpha()) * hl.L(72.0f)) * profileActivity.O.b0(9, false))) - (((1.0f - profileActivity.z5[0].getAlpha()) * hl.L(72.0f)) * profileActivity.O.b0(8, true)))) + profileActivity.P6 + profileActivity.O6;
                gr8 gr8Var = profileActivity.O;
                float b0 = (gr8Var == null || gr8Var.b0 == null) ? 0.0f : gr8Var.b0(14, false);
                if (b0 <= 0.0f) {
                    return L;
                }
                cga cgaVar = profileActivity.O.b0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = cgaVar.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    r6 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r5[1]) - r3[1])));
                }
                return hl.U1(Math.min(1.0f, b0), L, Math.max(L, r6));
            case 18:
                return ((z3a) obj).r.getPaddingBottom();
            case 19:
                return 0;
            case 20:
                FrameLayout frameLayout2 = ((s4b) obj).v1;
                if (frameLayout2 != null) {
                    return frameLayout2.getHeight();
                }
                return 0;
            case 21:
                i3 = ((sbb) obj).d1.getEditTextHeight();
                i2 = hl.L(12.0f);
                break;
            default:
                tzb tzbVar = (tzb) obj;
                ir8 ir8Var = tzbVar.p0;
                if (ir8Var == null || ir8Var.getVisibility() != 0) {
                    return 0;
                }
                return tzbVar.p0.getMeasuredHeight();
        }
        return i2 + i3;
    }

    @Override // r11
    public final boolean f(int i) {
        switch (this.a) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                return false;
            case 2:
                return ((py) this.b) != null;
            case 14:
                return i == 1 || i == 2 || i == 3;
        }
    }

    @Override // r11
    public final void g(v21 v21Var) {
        ol0 c;
        k68 k68Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                z11 z11Var = v21Var.e;
                zu1 zu1Var = (zu1) obj;
                jl0 c2 = zu1Var.L.c(z11Var, null, true);
                boolean z = v21Var.l;
                xu1 xu1Var = zu1Var.Ba;
                if (z) {
                    c = new ol0(xu1Var);
                    c.e = new rm0((byte) 25);
                    c.f(536870911, 536870911);
                    c.e(536870911, 536870911);
                    float N = hl.N(0.66f);
                    float N2 = hl.N(0.66f);
                    c.f = N;
                    c.h = N2;
                    c.d(TLObject.FLAG_29, TLObject.FLAG_29);
                    float L = hl.L(6.0f);
                    float L2 = hl.L(2.0f);
                    c.n = L;
                    c.r = L2;
                } else {
                    c = dtd.c(xu1Var);
                }
                c2.p(c);
                c2.r(hl.L(v21Var.l ? 24.0f : 16.0f));
                z11Var.setCustomBackground(c2);
                break;
            case 9:
                UndoView[] undoViewArr = ((uj3) obj).z0;
                UndoView undoView = undoViewArr[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    undoViewArr[0].d(2, true);
                    break;
                }
                break;
            case 10:
                z11 z11Var2 = v21Var.e;
                hw4 hw4Var = (hw4) obj;
                jl0 c3 = hw4Var.o1.c(z11Var2, null, true);
                c3.p(dtd.c(hw4Var.J0));
                c3.r(hl.L(16.0f));
                z11Var2.setCustomBackground(c3);
                break;
            case 14:
                if (v21Var.a == 2 && (k68Var = ((u58) obj).y.A1) != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Y0 = true;
                    lcbVar.U();
                    break;
                }
                break;
        }
    }

    @Override // r11
    public final int h(int i) {
        a aVar;
        int max;
        int max2;
        a aVar2;
        a aVar3;
        a aVar4;
        int i2;
        a aVar5;
        byte b = this.a;
        Object obj = this.b;
        int i3 = 0;
        switch (b) {
            case 0:
            case 1:
                return 0;
            case 2:
                if (((py) obj) == null) {
                    return hl.m;
                }
                return 0;
            case 3:
            case 4:
                return 0;
            case 5:
                int currentActionBarHeight = a.getCurrentActionBarHeight() + hl.m;
                zu1 zu1Var = (zu1) obj;
                aVar = ((e) zu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) zu1Var).actionBar;
                    int measuredHeight = aVar2.getMeasuredHeight();
                    aVar3 = ((e) zu1Var).actionBar;
                    i3 = aVar3.getTop() + measuredHeight;
                }
                max = Math.max(currentActionBarHeight, i3);
                max2 = (int) Math.max(0.0f, zu1Var.Q9);
                break;
            case 6:
            case 7:
            case 8:
                return 0;
            case 9:
                uj3 uj3Var = (uj3) obj;
                aVar4 = ((e) uj3Var).actionBar;
                if (aVar4 != null) {
                    aVar5 = ((e) uj3Var).actionBar;
                    i2 = aVar5.getMeasuredHeight();
                } else {
                    i2 = 0;
                }
                ij3 ij3Var = uj3Var.A0;
                int measuredHeight2 = i2 + ((ij3Var == null || ij3Var.getVisibility() != 0) ? 0 : uj3Var.A0.getMeasuredHeight());
                xj3 xj3Var = uj3Var.L1;
                int height = measuredHeight2 + (xj3Var != null ? xj3Var.getHeight() : 0);
                ii3 ii3Var = uj3Var.F0;
                if (ii3Var != null && uj3Var.H0) {
                    i3 = (int) ((1.0f - ii3Var.getCollapsedProgress()) * hl.L(81.0f));
                }
                return hl.L(48.0f) + height + i3;
            case 10:
                return hl.m;
            case 11:
            case 12:
            case 13:
                return 0;
            case 14:
                return hl.L(58.0f);
            case 15:
                return a.getCurrentActionBarHeight() + hl.m + ((int) (((ad8) obj).o0.W1.getAlpha() * r2.W1.getEditTextHeight()));
            case 16:
                return 0;
            case 17:
                max2 = hl.m;
                max = a.getCurrentActionBarHeight();
                break;
            case 18:
                return 0;
            case 19:
                return (int) (((f2b) obj).a + hl.L(58.0f));
            case 20:
            case 21:
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(float f) {
    }

    private final void B(float f) {
    }

    private final void C(v21 v21Var) {
    }

    private final void D(v21 v21Var) {
    }

    private final void E(v21 v21Var) {
    }

    private final void F(v21 v21Var) {
    }

    private final void G(v21 v21Var) {
    }

    private final void H(v21 v21Var) {
    }

    private final void I(v21 v21Var) {
    }

    private final void J(v21 v21Var) {
    }

    private final void K(v21 v21Var) {
    }

    private final void L(v21 v21Var) {
    }

    private final void M(v21 v21Var) {
    }

    private final void N(v21 v21Var) {
    }

    private final void O(v21 v21Var) {
    }

    private final void P(v21 v21Var) {
    }

    private final void Q(v21 v21Var) {
    }

    private final void R(v21 v21Var) {
    }

    private final void S(v21 v21Var) {
    }

    private final void T(v21 v21Var) {
    }

    private final void U(v21 v21Var) {
    }

    private final void V(v21 v21Var) {
    }

    private final void W(v21 v21Var) {
    }

    private final void X(v21 v21Var) {
    }

    private final void Y(v21 v21Var) {
    }

    private final void Z(v21 v21Var) {
    }

    private final void a0(v21 v21Var) {
    }

    private final void b0(v21 v21Var) {
    }

    private final void c0(v21 v21Var) {
    }

    private final void d0(v21 v21Var) {
    }

    private final void e0(v21 v21Var) {
    }

    private final void f0(v21 v21Var) {
    }

    private final void g0(v21 v21Var) {
    }

    private final void h0(v21 v21Var) {
    }

    private final void i(float f) {
    }

    private final void i0(v21 v21Var) {
    }

    private final void j(float f) {
    }

    private final void j0(v21 v21Var) {
    }

    private final void k(float f) {
    }

    private final void k0(v21 v21Var) {
    }

    private final void l(float f) {
    }

    private final void l0(v21 v21Var) {
    }

    private final void m(float f) {
    }

    private final void m0(v21 v21Var) {
    }

    private final void n(float f) {
    }

    private final void n0(v21 v21Var) {
    }

    private final void o(float f) {
    }

    private final void o0(v21 v21Var) {
    }

    private final void p(float f) {
    }

    private final void p0(v21 v21Var) {
    }

    private final void q(float f) {
    }

    private final void q0(v21 v21Var) {
    }

    private final void r(float f) {
    }

    private final void s(float f) {
    }

    private final void t(float f) {
    }

    private final void u(float f) {
    }

    private final void v(float f) {
    }

    private final void w(float f) {
    }

    private final void x(float f) {
    }

    private final void y(float f) {
    }

    private final void z(float f) {
    }
}
