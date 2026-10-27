package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.qd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.iw0;
import org.telegram.ui.pw0;
import org.telegram.ui.yw0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l1 extends mm0 {
    public final /* synthetic */ m1 c;

    public l1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.f0;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        m1 m1Var = this.c;
        int i11 = m1Var.j0;
        if (i10 >= i11 && i10 < m1Var.k0) {
            ((iw0) view).a((yw0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.d0(view);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        View view;
        u6 u6Var7;
        u6 u6Var8;
        u6 u6Var9;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View e02 = m1Var.e0(context, i10);
        if (e02 != null) {
            return ic.a.n(e02, e02, -1, -2);
        }
        if (i10 == 0) {
            za1 za1Var = new za1(this, context, 21);
            m1Var.s0 = za1Var;
            za1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new qd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = y6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(y6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                ug.g gVar = m1Var.r0.b;
                gVar.z = i11;
                gVar.A = y6.Lj;
                gVar.b();
                za1Var.addView(m1Var.r0, kb1.u(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.b0(za1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(y6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new aa0[2];
                int i12 = 0;
                while (i12 < 2) {
                    aa0[] aa0VarArr = m1Var.O0;
                    u6Var4 = ((k3) m1Var).resourcesProvider;
                    aa0VarArr[i12] = new xb(context, 4, u6Var4);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    aa0 aa0Var = m1Var.O0[i12];
                    int i13 = y6.G6;
                    u6Var5 = ((k3) m1Var).resourcesProvider;
                    f7.V(aa0Var, i13, u6Var5);
                    aa0 aa0Var2 = m1Var.O0[i12];
                    int i14 = y6.J6;
                    u6Var6 = ((k3) m1Var).resourcesProvider;
                    f7.H(aa0Var2, i14, u6Var6);
                    m1Var.N0.addView(m1Var.O0[i12], kb1.g(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            za1Var.addView(m1Var.N0, kb1.t(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                u6Var = ((k3) m1Var).resourcesProvider;
                aa0 aa0Var3 = new aa0(context2, u6Var);
                m1Var.P0 = aa0Var3;
                aa0Var3.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                aa0 aa0Var4 = m1Var.P0;
                int i15 = y6.G6;
                u6Var2 = ((k3) m1Var).resourcesProvider;
                f7.V(aa0Var4, i15, u6Var2);
                aa0 aa0Var5 = m1Var.P0;
                int i16 = y6.J6;
                u6Var3 = ((k3) m1Var).resourcesProvider;
                f7.H(aa0Var5, i16, u6Var3);
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            za1Var.addView(m1Var.P0, kb1.t(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.g0(false);
            m1Var.q0 = new hi.e(context, 5);
            p5 p5Var = new p5(this, context, 7);
            p5Var.setClipChildren(false);
            p5Var.addView(m1Var.q0);
            p5Var.addView(za1Var);
            qd qdVar = m1Var.r0;
            view = p5Var;
            if (qdVar != null) {
                qdVar.setStarParticlesView(m1Var.q0);
                view = p5Var;
            }
        } else if (i10 == 2) {
            int i17 = y6.a7;
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, m1Var.getThemedColor(i17), 0);
            u6Var7 = ((k3) m1Var).resourcesProvider;
            f7.i(i17, f7Var, u6Var7);
            view = f7Var;
        } else if (i10 == 3) {
            view = new k1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            u6Var9 = ((k3) m1Var).resourcesProvider;
            view = new pw0(this, context, u6Var9);
        } else {
            u6Var8 = ((k3) m1Var).resourcesProvider;
            xg.d0 d0Var = new xg.d0(context, u6Var8);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i18 = y6.gc;
            final int i19 = 0;
            final int i20 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i18, 0, new Runnable(this) { // from class: tg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            qf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            qf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i18, 0, new Runnable(this) { // from class: tg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            qf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            qf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = d0Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        m1Var.a0(i10, view);
        return new wl0(view);
    }
}
