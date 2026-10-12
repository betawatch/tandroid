package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.zb;
import org.telegram.ui.ax0;
import org.telegram.ui.hx0;
import org.telegram.ui.ic1;
import org.telegram.ui.jg0;
import org.telegram.ui.qx0;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l1 extends lm0 {
    public final /* synthetic */ m1 c;

    public l1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.f0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        m1 m1Var = this.c;
        if (i10 == m1Var.g0) {
            return 0;
        }
        if (i10 >= m1Var.h0 && i10 < m1Var.i0) {
            return m1Var.Y();
        }
        if (i10 >= m1Var.j0 && i10 < m1Var.k0) {
            return 1;
        }
        if (i10 == m1Var.l0) {
            return 2;
        }
        if (i10 == m1Var.m0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == m1Var.n0 ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        m1 m1Var = this.c;
        int i11 = m1Var.j0;
        if (i10 >= i11 && i10 < m1Var.k0) {
            ((ax0) view).a((qx0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.Z(view);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        View view;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View a02 = m1Var.a0(context, i10);
        if (a02 != null) {
            return k3.l(a02, a02, -1, -2);
        }
        if (i10 == 0) {
            ic1 ic1Var = new ic1(this, context, 17);
            m1Var.s0 = ic1Var;
            ic1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new jg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = g6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(g6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.r0.b;
                gVar.z = i11;
                gVar.A = g6.Lj;
                gVar.b();
                ic1Var.addView(m1Var.r0, a6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.X(ic1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(g6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new da0[2];
                int i12 = 0;
                while (i12 < 2) {
                    da0[] da0VarArr = m1Var.O0;
                    c6Var2 = ((e3) m1Var).resourcesProvider;
                    da0VarArr[i12] = new zb(context, 4, c6Var2);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    m1Var.O0[i12].setTextColor(m1Var.getThemedColor(g6.G6));
                    m1Var.O0[i12].setLinkTextColor(m1Var.getThemedColor(g6.J6));
                    m1Var.N0.addView(m1Var.O0[i12], a6.d(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            ic1Var.addView(m1Var.N0, a6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                c6Var = ((e3) m1Var).resourcesProvider;
                da0 da0Var = new da0(context2, c6Var);
                m1Var.P0 = da0Var;
                da0Var.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(g6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(g6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            ic1Var.addView(m1Var.P0, a6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.b0(false);
            m1Var.q0 = new fi.f(context, 5);
            p0 p0Var = new p0(this, context, 2);
            p0Var.setClipChildren(false);
            p0Var.addView(m1Var.q0);
            p0Var.addView(ic1Var);
            jg0 jg0Var = m1Var.r0;
            view = p0Var;
            if (jg0Var != null) {
                jg0Var.setStarParticlesView(m1Var.q0);
                view = p0Var;
            }
        } else if (i10 == 2) {
            view = new b7(context, m1Var.getThemedColor(g6.a7), 0);
        } else if (i10 == 3) {
            view = new k1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            c6Var4 = ((e3) m1Var).resourcesProvider;
            view = new hx0(this, context, c6Var4);
        } else {
            c6Var3 = ((e3) m1Var).resourcesProvider;
            wg.d0 d0Var = new wg.d0(context, c6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = g6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: sg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            pf.d.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            pf.d.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: sg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            pf.d.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            pf.d.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = d0Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        m1Var.W(i10, view);
        return new wl0(view);
    }
}
