package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.ld;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.dx0;
import org.telegram.ui.eg0;
import org.telegram.ui.gc1;
import org.telegram.ui.mx0;
import org.telegram.ui.ww0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l1 extends ul0 {
    public final /* synthetic */ m1 c;

    public l1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // org.telegram.ui.Components.ul0
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
            return m1Var.X();
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
            ((ww0) view).a((mx0) m1Var.X.get(i10 - i11), i10 != m1Var.k0 - 1);
        } else {
            if (i10 < m1Var.h0 || i10 >= m1Var.i0) {
                return;
            }
            m1Var.Y(view);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        View view;
        f6 f6Var3;
        f6 f6Var4;
        Context context = viewGroup.getContext();
        m1 m1Var = this.c;
        View Z = m1Var.Z(context, i10);
        if (Z != null) {
            return e2.j(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            gc1 gc1Var = new gc1(this, context, 17);
            m1Var.s0 = gc1Var;
            gc1Var.setOrientation(1);
            View view2 = m1Var.B0;
            if (view2 == null) {
                m1Var.r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, m1Var.getThemedColor(i11), m1Var.getThemedColor(j6.h5)));
                m1Var.r0.setBackgroundBitmap(createBitmap);
                rg.a aVar = m1Var.r0.b;
                aVar.w = i11;
                aVar.x = j6.Lj;
                aVar.b();
                gc1Var.addView(m1Var.r0, a6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) m1Var.B0.getParent()).removeView(m1Var.B0);
                }
                m1Var.W(gc1Var);
            }
            if (m1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                m1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = m1Var.u0;
                new PorterDuffColorFilter(num == null ? m1Var.getThemedColor(j6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                m1Var.O0 = new m90[2];
                int i12 = 0;
                while (i12 < 2) {
                    m90[] m90VarArr = m1Var.O0;
                    f6Var2 = ((h3) m1Var).resourcesProvider;
                    m90VarArr[i12] = new wb(context, 4, f6Var2);
                    m1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    m1Var.O0[i12].setTextSize(1, 16.0f);
                    m1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    m1Var.O0[i12].setGravity(1);
                    m1Var.O0[i12].setTextColor(m1Var.getThemedColor(j6.G6));
                    m1Var.O0[i12].setLinkTextColor(m1Var.getThemedColor(j6.J6));
                    m1Var.N0.addView(m1Var.O0[i12], a6.c(-2.0f, -1));
                    i12++;
                }
            }
            if (m1Var.N0.getParent() != null) {
                ((ViewGroup) m1Var.N0.getParent()).removeView(m1Var.N0);
            }
            gc1Var.addView(m1Var.N0, a6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (m1Var.P0 == null) {
                Context context2 = m1Var.getContext();
                f6Var = ((h3) m1Var).resourcesProvider;
                m90 m90Var = new m90(context2, f6Var);
                m1Var.P0 = m90Var;
                m90Var.setTextSize(1, 14.0f);
                m1Var.P0.setGravity(1);
                m1Var.P0.setTextColor(m1Var.getThemedColor(j6.G6));
                m1Var.P0.setLinkTextColor(m1Var.getThemedColor(j6.J6));
            }
            if (m1Var.P0.getParent() != null) {
                ((ViewGroup) m1Var.P0.getParent()).removeView(m1Var.P0);
            }
            gc1Var.addView(m1Var.P0, a6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            m1Var.a0(false);
            m1Var.q0 = new di.f(context, 5);
            ld ldVar = new ld(this, context, 27);
            ldVar.setClipChildren(false);
            ldVar.addView(m1Var.q0);
            ldVar.addView(gc1Var);
            eg0 eg0Var = m1Var.r0;
            view = ldVar;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(m1Var.q0);
                view = ldVar;
            }
        } else if (i10 == 2) {
            view = new c7(context, m1Var.getThemedColor(j6.a7), 0);
        } else if (i10 == 3) {
            view = new qn(context, 29);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            f6Var4 = ((h3) m1Var).resourcesProvider;
            view = new dx0(this, context, f6Var4);
        } else {
            f6Var3 = ((h3) m1Var).resourcesProvider;
            ug.d0 d0Var = new ug.d0(context, f6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = j6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: qg.k1
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
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: qg.k1
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
        m1Var.V(i10, view);
        return new fl0(view);
    }
}
