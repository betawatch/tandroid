package sg;

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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.bx0;
import org.telegram.ui.cc1;
import org.telegram.ui.eg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n1 extends kl0 {
    public final /* synthetic */ o1 c;

    public n1(o1 o1Var) {
        this.c = o1Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.f0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        o1 o1Var = this.c;
        if (i10 == o1Var.g0) {
            return 0;
        }
        if (i10 >= o1Var.h0 && i10 < o1Var.i0) {
            return o1Var.X();
        }
        if (i10 >= o1Var.j0 && i10 < o1Var.k0) {
            return 1;
        }
        if (i10 == o1Var.l0) {
            return 2;
        }
        if (i10 == o1Var.m0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == o1Var.n0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        o1 o1Var = this.c;
        int i11 = o1Var.j0;
        if (i10 >= i11 && i10 < o1Var.k0) {
            ((uw0) view).a((kx0) o1Var.X.get(i10 - i11), i10 != o1Var.k0 - 1);
        } else {
            if (i10 < o1Var.h0 || i10 >= o1Var.i0) {
                return;
            }
            o1Var.Y(view);
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
        o1 o1Var = this.c;
        View Z = o1Var.Z(context, i10);
        if (Z != null) {
            return e2.l(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            cc1 cc1Var = new cc1(this, context, 17);
            o1Var.s0 = cc1Var;
            cc1Var.setOrientation(1);
            View view2 = o1Var.B0;
            if (view2 == null) {
                o1Var.r0 = new eg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, o1Var.getThemedColor(i11), o1Var.getThemedColor(j6.h5)));
                o1Var.r0.setBackgroundBitmap(createBitmap);
                tg.a aVar = o1Var.r0.b;
                aVar.w = i11;
                aVar.x = j6.Lj;
                aVar.b();
                cc1Var.addView(o1Var.r0, x5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) o1Var.B0.getParent()).removeView(o1Var.B0);
                }
                o1Var.W(cc1Var);
            }
            if (o1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                o1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = o1Var.u0;
                new PorterDuffColorFilter(num == null ? o1Var.getThemedColor(j6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                o1Var.O0 = new d90[2];
                int i12 = 0;
                while (i12 < 2) {
                    d90[] d90VarArr = o1Var.O0;
                    f6Var2 = ((f3) o1Var).resourcesProvider;
                    d90VarArr[i12] = new xb(context, 4, f6Var2);
                    o1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    o1Var.O0[i12].setTextSize(1, 16.0f);
                    o1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    o1Var.O0[i12].setGravity(1);
                    o1Var.O0[i12].setTextColor(o1Var.getThemedColor(j6.G6));
                    o1Var.O0[i12].setLinkTextColor(o1Var.getThemedColor(j6.J6));
                    o1Var.N0.addView(o1Var.O0[i12], x5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (o1Var.N0.getParent() != null) {
                ((ViewGroup) o1Var.N0.getParent()).removeView(o1Var.N0);
            }
            cc1Var.addView(o1Var.N0, x5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (o1Var.P0 == null) {
                Context context2 = o1Var.getContext();
                f6Var = ((f3) o1Var).resourcesProvider;
                d90 d90Var = new d90(context2, f6Var);
                o1Var.P0 = d90Var;
                d90Var.setTextSize(1, 14.0f);
                o1Var.P0.setGravity(1);
                o1Var.P0.setTextColor(o1Var.getThemedColor(j6.G6));
                o1Var.P0.setLinkTextColor(o1Var.getThemedColor(j6.J6));
            }
            if (o1Var.P0.getParent() != null) {
                ((ViewGroup) o1Var.P0.getParent()).removeView(o1Var.P0);
            }
            cc1Var.addView(o1Var.P0, x5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            o1Var.a0(false);
            o1Var.q0 = new fi.g(context, 5);
            l1 l1Var = new l1(this, context, 0);
            l1Var.setClipChildren(false);
            l1Var.addView(o1Var.q0);
            l1Var.addView(cc1Var);
            eg0 eg0Var = o1Var.r0;
            view = l1Var;
            if (eg0Var != null) {
                eg0Var.setStarParticlesView(o1Var.q0);
                view = l1Var;
            }
        } else if (i10 == 2) {
            view = new a7(context, o1Var.getThemedColor(j6.a7), 0);
        } else if (i10 == 3) {
            view = new m1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            f6Var4 = ((f3) o1Var).resourcesProvider;
            view = new bx0(this, context, f6Var4);
        } else {
            f6Var3 = ((f3) o1Var).resourcesProvider;
            wg.d0 d0Var = new wg.d0(context, f6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = j6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: sg.k1
                public final /* synthetic */ n1 b;

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
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: sg.k1
                public final /* synthetic */ n1 b;

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
        view.setLayoutParams(new s4.p0(-1, -2));
        o1Var.V(i10, view);
        return new vk0(view);
    }
}
