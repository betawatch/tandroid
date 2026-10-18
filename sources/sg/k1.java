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
import org.telegram.ui.aw0;
import org.telegram.ui.hw0;
import org.telegram.ui.qw0;
import org.telegram.ui.sa1;
import rg.n2;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k1 extends hm0 {
    public final /* synthetic */ l1 c;

    public k1(l1 l1Var) {
        this.c = l1Var;
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        l1 l1Var = this.c;
        int i11 = l1Var.j0;
        if (i10 >= i11 && i10 < l1Var.k0) {
            ((aw0) view).a((qw0) l1Var.X.get(i10 - i11), i10 != l1Var.k0 - 1);
        } else {
            if (i10 < l1Var.h0 || i10 >= l1Var.i0) {
                return;
            }
            l1Var.Z(view);
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
        l1 l1Var = this.c;
        View a02 = l1Var.a0(context, i10);
        if (a02 != null) {
            return k3.l(a02, a02, -1, -2);
        }
        if (i10 == 0) {
            sa1 sa1Var = new sa1(this, context, 20);
            l1Var.s0 = sa1Var;
            sa1Var.setOrientation(1);
            View view2 = l1Var.B0;
            if (view2 == null) {
                l1Var.r0 = new zd(context, 1, 0, 3);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = h6.Mj;
                canvas.drawColor(i0.a.f(0.5f, l1Var.getThemedColor(i11), l1Var.getThemedColor(h6.h5)));
                l1Var.r0.setBackgroundBitmap(createBitmap);
                tg.g gVar = l1Var.r0.b;
                gVar.z = i11;
                gVar.A = h6.Lj;
                gVar.b();
                sa1Var.addView(l1Var.r0, z5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) l1Var.B0.getParent()).removeView(l1Var.B0);
                }
                l1Var.X(sa1Var);
            }
            if (l1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                l1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = l1Var.u0;
                new PorterDuffColorFilter(num == null ? l1Var.getThemedColor(h6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                l1Var.O0 = new x90[2];
                int i12 = 0;
                while (i12 < 2) {
                    x90[] x90VarArr = l1Var.O0;
                    d6Var2 = ((f3) l1Var).resourcesProvider;
                    x90VarArr[i12] = new xb(context, 4, d6Var2);
                    l1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    l1Var.O0[i12].setTextSize(1, 16.0f);
                    l1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    l1Var.O0[i12].setGravity(1);
                    l1Var.O0[i12].setTextColor(l1Var.getThemedColor(h6.G6));
                    l1Var.O0[i12].setLinkTextColor(l1Var.getThemedColor(h6.J6));
                    l1Var.N0.addView(l1Var.O0[i12], z5.d(-2.0f, -1));
                    i12++;
                }
            }
            if (l1Var.N0.getParent() != null) {
                ((ViewGroup) l1Var.N0.getParent()).removeView(l1Var.N0);
            }
            sa1Var.addView(l1Var.N0, z5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (l1Var.P0 == null) {
                Context context2 = l1Var.getContext();
                d6Var = ((f3) l1Var).resourcesProvider;
                x90 x90Var = new x90(context2, d6Var);
                l1Var.P0 = x90Var;
                x90Var.setTextSize(1, 14.0f);
                l1Var.P0.setGravity(1);
                l1Var.P0.setTextColor(l1Var.getThemedColor(h6.G6));
                l1Var.P0.setLinkTextColor(l1Var.getThemedColor(h6.J6));
            }
            if (l1Var.P0.getParent() != null) {
                ((ViewGroup) l1Var.P0.getParent()).removeView(l1Var.P0);
            }
            sa1Var.addView(l1Var.P0, z5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            l1Var.b0(false);
            l1Var.q0 = new gi.f(context, 5);
            n2 n2Var = new n2(this, context, 4);
            n2Var.setClipChildren(false);
            n2Var.addView(l1Var.q0);
            n2Var.addView(sa1Var);
            zd zdVar = l1Var.r0;
            view = n2Var;
            if (zdVar != null) {
                zdVar.setStarParticlesView(l1Var.q0);
                view = n2Var;
            }
        } else if (i10 == 2) {
            view = new z6(context, l1Var.getThemedColor(h6.a7), 0);
        } else if (i10 == 3) {
            view = new j1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            d6Var4 = ((f3) l1Var).resourcesProvider;
            view = new hw0(this, context, d6Var4);
        } else {
            d6Var3 = ((f3) l1Var).resourcesProvider;
            wg.d0 d0Var = new wg.d0(context, d6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = h6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: sg.i1
                public final /* synthetic */ k1 b;

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
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: sg.i1
                public final /* synthetic */ k1 b;

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
        l1Var.W(i10, view);
        return new sl0(view);
    }
}
