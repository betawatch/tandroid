package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.cg0;
import org.telegram.ui.ex0;
import org.telegram.ui.ow0;
import org.telegram.ui.vb1;
import org.telegram.ui.vw0;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class l1 extends yl0 {
    public final /* synthetic */ m1 c;

    public l1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
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
            return m1Var.W();
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
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        m1 m1Var = this.c;
        int i11 = m1Var.j0;
        if (i10 >= i11 && i10 < m1Var.k0) {
            ((ow0) view).a((ex0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.X(view);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        View view;
        d6 d6Var3;
        d6 d6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View Y = m1Var.Y(context, i10);
        if (Y != null) {
            return e2.k(Y, Y, -1, -2);
        }
        if (i10 == 0) {
            vb1 vb1Var = new vb1(this, context, 17);
            m1Var.s0 = vb1Var;
            vb1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new cg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = i6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(i6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = m1Var.r0.b;
                aVar.w = i11;
                aVar.x = i6.Lj;
                aVar.b();
                vb1Var.addView(m1Var.r0, z5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.U(vb1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(i6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new q90[2];
                int i12 = 0;
                while (i12 < 2) {
                    q90[] q90VarArr = m1Var.O0;
                    d6Var2 = ((f3) m1Var).resourcesProvider;
                    q90VarArr[i12] = new yb(context, 4, d6Var2);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    m1Var.O0[i12].setTextColor(m1Var.getThemedColor(i6.G6));
                    m1Var.O0[i12].setLinkTextColor(m1Var.getThemedColor(i6.J6));
                    m1Var.N0.addView(m1Var.O0[i12], z5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            vb1Var.addView(m1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                d6Var = ((f3) m1Var).resourcesProvider;
                q90 q90Var = new q90(context2, d6Var);
                m1Var.P0 = q90Var;
                q90Var.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(i6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(i6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            vb1Var.addView(m1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.Z(false);
            m1Var.q0 = new ei.g(context, 5);
            j1 j1Var = new j1(this, context, 0);
            j1Var.setClipChildren(false);
            j1Var.addView(m1Var.q0);
            j1Var.addView(vb1Var);
            cg0 cg0Var = m1Var.r0;
            view = j1Var;
            if (cg0Var != null) {
                cg0Var.setStarParticlesView(m1Var.q0);
                view = j1Var;
            }
        } else if (i10 == 2) {
            view = new b7(context, m1Var.getThemedColor(i6.a7), 0);
        } else if (i10 == 3) {
            view = new k1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            d6Var4 = ((f3) m1Var).resourcesProvider;
            view = new vw0(this, context, d6Var4);
        } else {
            d6Var3 = ((f3) m1Var).resourcesProvider;
            vg.d0 d0Var = new vg.d0(context, d6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = i6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: rg.i1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            nf.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            nf.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: rg.i1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            nf.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            nf.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = d0Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        m1Var.T(i10, view);
        return new il0(view);
    }
}
