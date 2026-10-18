package sg;

import ai.zd;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Wallet.p9;
import org.telegram.ui.aw0;
import org.telegram.ui.hw0;
import org.telegram.ui.qw0;
import org.telegram.ui.sa1;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l1 extends hm0 {
    public final /* synthetic */ m1 c;

    public l1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // org.telegram.ui.Components.hm0
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
            ((aw0) view).a((qw0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.Z(view);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        View view;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View a02 = m1Var.a0(context, i10);
        if (a02 != null) {
            return k3.l(a02, a02, -1, -2);
        }
        if (i10 == 0) {
            sa1 sa1Var = new sa1(this, context, 20);
            m1Var.s0 = sa1Var;
            sa1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new zd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = h6.Mj;
                canvas.drawColor(i0.a.f(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(h6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = m1Var.r0.b;
                gVar.z = i11;
                gVar.A = h6.Lj;
                gVar.b();
                sa1Var.addView(m1Var.r0, z5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.X(sa1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(h6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new x90[2];
                int i12 = 0;
                while (i12 < 2) {
                    x90[] x90VarArr = m1Var.O0;
                    d6Var2 = ((f3) m1Var).resourcesProvider;
                    x90VarArr[i12] = new xb(context, 4, d6Var2);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    m1Var.O0[i12].setTextColor(m1Var.getThemedColor(h6.G6));
                    m1Var.O0[i12].setLinkTextColor(m1Var.getThemedColor(h6.J6));
                    m1Var.N0.addView(m1Var.O0[i12], z5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            sa1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                d6Var = ((f3) m1Var).resourcesProvider;
                x90 x90Var = new x90(context2, d6Var);
                m1Var.P0 = x90Var;
                x90Var.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(h6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(h6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            sa1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.b0(false);
            m1Var.q0 = new gi.f(context, 5);
            p9 p9Var = new p9(this, context, 6);
            p9Var.setClipChildren(false);
            p9Var.addView(m1Var.q0);
            p9Var.addView(sa1Var);
            zd zdVar = m1Var.r0;
            view = p9Var;
            if (zdVar != null) {
                zdVar.setStarParticlesView(m1Var.q0);
                view = p9Var;
            }
        } else if (i10 == 2) {
            view = new z6(context, m1Var.getThemedColor(h6.a7), 0);
        } else if (i10 == 3) {
            view = new k1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            d6Var4 = ((f3) m1Var).resourcesProvider;
            view = new hw0(this, context, d6Var4);
        } else {
            d6Var3 = ((f3) m1Var).resourcesProvider;
            wg.d0 d0Var = new wg.d0(context, d6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = h6.gc;
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
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            pf.d.r(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
        m1Var.W(i10, view);
        return new sl0(view);
    }
}
