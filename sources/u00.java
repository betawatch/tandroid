// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.p;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u00 implements zob {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // zob
    public final void a(float f) {
        byte b = this.a;
    }

    @Override // zob
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((j20) obj).F0();
                break;
            case 1:
                df3 df3Var = ((z61) obj).a0;
                if (df3Var != null) {
                    df3Var.s0(aob.w0(null, aob.h5, false));
                    break;
                }
                break;
            case 2:
                ((zu1) obj).xb();
                break;
            case 3:
                ((s42) obj).P();
                break;
            case 4:
                ((ed2) obj).h.f();
                break;
            case 5:
                p pVar = (p) obj;
                s7 s7Var = pVar.J;
                s7Var.setIconColor(aob.v0(aob.G6, pVar.e0));
                aob.A1(aob.v0(aob.I5, pVar.e0), s7Var.getBackground());
                s7Var.O(aob.v0(aob.E8, pVar.e0), false);
                s7Var.O(aob.v0(aob.F8, pVar.e0), true);
                s7Var.I(aob.v0(aob.G8, pVar.e0));
                break;
            case 6:
                uj3 uj3Var = (uj3) obj;
                bj3 bj3Var = uj3Var.D0;
                if (bj3Var != null) {
                    s6 actionMode = bj3Var.getActionMode();
                    if (actionMode != null) {
                        yob.h(aob.w8, uj3Var.getResourceProvider(), actionMode);
                    }
                    s7 speedItem = uj3Var.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uj3Var.getThemedColor(aob.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 7:
                ((m15) obj).x0();
                break;
            case 8:
                ((yr5) obj).Z(true);
                break;
            case 9:
                ((qh6) obj).P1();
                break;
            case 10:
                ((ck6) obj).c0();
                break;
            case 11:
                ((z67) obj).b0();
                break;
            case 12:
                ((h48) obj).J0();
                break;
            case 13:
                ((ui8) obj).I0();
                break;
            case 14:
                ((PremiumPreviewFragment) obj).z0();
                break;
            case 15:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).G3();
                break;
            case 16:
                ((n49) obj).b.f();
                break;
            case 17:
                kx9 kx9Var = ((bj3) obj).A0;
                if (kx9Var != null) {
                    kx9Var.setTextColor(aob.w0(null, aob.y8, false));
                    break;
                }
                break;
            case 18:
                ((Runnable) obj).run();
                break;
            case 19:
                ((w1b) obj).r0();
                break;
            case 20:
                ((s4b) obj).S0(false);
                break;
            case 21:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                for (int i = 0; i < themeActivity.b.getChildCount(); i++) {
                    View childAt = themeActivity.b.getChildAt(i);
                    if (childAt instanceof pr) {
                        ((pr) childAt).getAdapter().f();
                    } else if (childAt instanceof j38) {
                        ((j38) childAt).updateColors();
                    }
                }
                for (int i2 = 0; i2 < themeActivity.b.getCachedChildCount(); i2++) {
                    View Q = themeActivity.b.Q(i2);
                    if (Q instanceof pr) {
                        ((pr) Q).getAdapter().f();
                    } else if (Q instanceof j38) {
                        ((j38) Q).updateColors();
                    }
                }
                for (int i3 = 0; i3 < themeActivity.b.getHiddenChildCount(); i3++) {
                    View X = themeActivity.b.X(i3);
                    if (X instanceof pr) {
                        ((pr) X).getAdapter().f();
                    } else if (X instanceof j38) {
                        ((j38) X).updateColors();
                    }
                }
                for (int i4 = 0; i4 < themeActivity.b.getAttachedScrapChildCount(); i4++) {
                    View P = themeActivity.b.P(i4);
                    if (P instanceof pr) {
                        ((pr) P).getAdapter().f();
                    } else if (P instanceof j38) {
                        ((j38) P).updateColors();
                    }
                }
                break;
            case 22:
                ((pqb) obj).S0();
                break;
            case 23:
                ((axb) obj).Y();
                break;
            default:
                ((d6c) obj).d();
                break;
        }
    }

    private final void A(float f) {
    }

    private final void c(float f) {
    }

    private final void d(float f) {
    }

    private final void e(float f) {
    }

    private final void f(float f) {
    }

    private final void g(float f) {
    }

    private final void h(float f) {
    }

    private final void i(float f) {
    }

    private final void j(float f) {
    }

    private final void k(float f) {
    }

    private final void l(float f) {
    }

    private final void m(float f) {
    }

    private final void n(float f) {
    }

    private final void o(float f) {
    }

    private final void p(float f) {
    }

    private final void q(float f) {
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
