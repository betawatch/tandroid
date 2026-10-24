package sg;

import ai.ae;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y90;
import org.telegram.ui.cw0;
import org.telegram.ui.jw0;
import org.telegram.ui.sw0;
import org.telegram.ui.va1;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
            return m1Var.c0();
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
            ((cw0) view).a((sw0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.d0(view);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        View view;
        g6 g6Var7;
        g6 g6Var8;
        g6 g6Var9;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View e02 = m1Var.e0(context, i10);
        if (e02 != null) {
            return k3.l(e02, e02, -1, -2);
        }
        if (i10 == 0) {
            va1 va1Var = new va1(this, context, 20);
            m1Var.s0 = va1Var;
            va1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new ae(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = k6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(k6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.r0.b;
                gVar.z = i11;
                gVar.A = k6.Lj;
                gVar.b();
                va1Var.addView(m1Var.r0, z5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.b0(va1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(k6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new y90[2];
                int i12 = 0;
                while (i12 < 2) {
                    y90[] y90VarArr = m1Var.O0;
                    g6Var4 = ((h3) m1Var).resourcesProvider;
                    y90VarArr[i12] = new xb(context, 4, g6Var4);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    y90 y90Var = m1Var.O0[i12];
                    int i13 = k6.G6;
                    g6Var5 = ((h3) m1Var).resourcesProvider;
                    r6.W(y90Var, i13, g6Var5);
                    y90 y90Var2 = m1Var.O0[i12];
                    int i14 = k6.J6;
                    g6Var6 = ((h3) m1Var).resourcesProvider;
                    r6.I(y90Var2, i14, g6Var6);
                    m1Var.N0.addView(m1Var.O0[i12], z5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            va1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                g6Var = ((h3) m1Var).resourcesProvider;
                y90 y90Var3 = new y90(context2, g6Var);
                m1Var.P0 = y90Var3;
                y90Var3.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                y90 y90Var4 = m1Var.P0;
                int i15 = k6.G6;
                g6Var2 = ((h3) m1Var).resourcesProvider;
                r6.W(y90Var4, i15, g6Var2);
                y90 y90Var5 = m1Var.P0;
                int i16 = k6.J6;
                g6Var3 = ((h3) m1Var).resourcesProvider;
                r6.I(y90Var5, i16, g6Var3);
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            va1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.g0(false);
            m1Var.q0 = new gi.f(context, 5);
            rg.y1 y1Var = new rg.y1(this, context, 5);
            y1Var.setClipChildren(false);
            y1Var.addView(m1Var.q0);
            y1Var.addView(va1Var);
            ae aeVar = m1Var.r0;
            view = y1Var;
            if (aeVar != null) {
                aeVar.setStarParticlesView(m1Var.q0);
                view = y1Var;
            }
        } else if (i10 == 2) {
            int i17 = k6.a7;
            b7 b7Var = new b7(context, m1Var.getThemedColor(i17), 0);
            g6Var7 = ((h3) m1Var).resourcesProvider;
            r6.i(i17, b7Var, g6Var7);
            view = b7Var;
        } else if (i10 == 3) {
            view = new k1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            g6Var9 = ((h3) m1Var).resourcesProvider;
            view = new jw0(this, context, g6Var9);
        } else {
            g6Var8 = ((h3) m1Var).resourcesProvider;
            wg.d0 d0Var = new wg.d0(context, g6Var8);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i18 = k6.gc;
            final int i19 = 0;
            final int i20 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i18, 0, new Runnable(this) { // from class: sg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i18, 0, new Runnable(this) { // from class: sg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = d0Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        m1Var.a0(i10, view);
        return new wl0(view);
    }
}
