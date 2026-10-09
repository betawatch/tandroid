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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.bx0;
import org.telegram.ui.dc1;
import org.telegram.ui.eg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k1 extends pm0 {
    public final /* synthetic */ l1 c;

    public k1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.f0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        l1 l1Var = this.c;
        if (i10 == l1Var.g0) {
            return 0;
        }
        if (i10 >= l1Var.h0 && i10 < l1Var.i0) {
            return l1Var.Y();
        }
        if (i10 >= l1Var.j0 && i10 < l1Var.k0) {
            return 1;
        }
        if (i10 == l1Var.l0) {
            return 2;
        }
        if (i10 == l1Var.m0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == l1Var.n0 ? 5 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.a;
        l1 l1Var = this.c;
        int i11 = l1Var.j0;
        if (i10 >= i11 && i10 < l1Var.k0) {
            ((uw0) view).a((kx0) l1Var.X.get(i10 - i11), i10 != l1Var.k0 - 1);
        } else {
            if (i10 < l1Var.h0 || i10 >= l1Var.i0) {
                return;
            }
            l1Var.Z(view);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        View view;
        e6 e6Var3;
        e6 e6Var4;
        Context context = viewGroup.getContext();
        l1 l1Var = this.c;
        View a02 = l1Var.a0(context, i10);
        if (a02 != null) {
            return e2.k(a02, a02, -1, -2);
        }
        if (i10 == 0) {
            dc1 dc1Var = new dc1(this, context, 17);
            l1Var.s0 = dc1Var;
            dc1Var.setOrientation(1);
            View view2 = l1Var.B0;
            if (view2 == null) {
                l1Var.r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = i6.Mj;
                canvas.drawColor(i0.a.d(0.5f, l1Var.getThemedColor(i11), l1Var.getThemedColor(i6.h5)));
                l1Var.r0.setBackgroundBitmap(createBitmap);
                sg.g gVar = l1Var.r0.b;
                gVar.z = i11;
                gVar.A = i6.Lj;
                gVar.b();
                dc1Var.addView(l1Var.r0, x5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) l1Var.B0.getParent()).removeView(l1Var.B0);
                }
                l1Var.X(dc1Var);
            }
            if (l1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                l1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = l1Var.u0;
                new PorterDuffColorFilter(num == null ? l1Var.getThemedColor(i6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                l1Var.O0 = new ea0[2];
                int i12 = 0;
                while (i12 < 2) {
                    ea0[] ea0VarArr = l1Var.O0;
                    e6Var2 = ((f3) l1Var).resourcesProvider;
                    ea0VarArr[i12] = new ac(context, 4, e6Var2);
                    l1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    l1Var.O0[i12].setTextSize(1, 16.0f);
                    l1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    l1Var.O0[i12].setGravity(1);
                    l1Var.O0[i12].setTextColor(l1Var.getThemedColor(i6.G6));
                    l1Var.O0[i12].setLinkTextColor(l1Var.getThemedColor(i6.J6));
                    l1Var.N0.addView(l1Var.O0[i12], x5.d(-2.0f, -1));
                    i12++;
                }
            }
            if (l1Var.N0.getParent() != null) {
                ((ViewGroup) l1Var.N0.getParent()).removeView(l1Var.N0);
            }
            dc1Var.addView(l1Var.N0, x5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (l1Var.P0 == null) {
                Context context2 = l1Var.getContext();
                e6Var = ((f3) l1Var).resourcesProvider;
                ea0 ea0Var = new ea0(context2, e6Var);
                l1Var.P0 = ea0Var;
                ea0Var.setTextSize(1, 14.0f);
                l1Var.P0.setGravity(1);
                l1Var.P0.setTextColor(l1Var.getThemedColor(i6.G6));
                l1Var.P0.setLinkTextColor(l1Var.getThemedColor(i6.J6));
            }
            if (l1Var.P0.getParent() != null) {
                ((ViewGroup) l1Var.P0.getParent()).removeView(l1Var.P0);
            }
            dc1Var.addView(l1Var.P0, x5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            l1Var.b0(false);
            l1Var.q0 = new ei.f(context, 5);
            t0 t0Var = new t0(this, context, 1);
            t0Var.setClipChildren(false);
            t0Var.addView(l1Var.q0);
            t0Var.addView(dc1Var);
            eg0 eg0Var = l1Var.r0;
            view = t0Var;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(l1Var.q0);
                view = t0Var;
            }
        } else if (i10 == 2) {
            view = new b7(context, l1Var.getThemedColor(i6.a7), 0);
        } else if (i10 == 3) {
            view = new j1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            e6Var4 = ((f3) l1Var).resourcesProvider;
            view = new bx0(this, context, e6Var4);
        } else {
            e6Var3 = ((f3) l1Var).resourcesProvider;
            vg.d0 d0Var = new vg.d0(context, e6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = i6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: rg.i1
                public final /* synthetic */ k1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            of.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            of.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: rg.i1
                public final /* synthetic */ k1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            of.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            of.f.s(this.b.c.t0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = d0Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        l1Var.W(i10, view);
        return new am0(view);
    }
}
