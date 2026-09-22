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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.bx0;
import org.telegram.ui.dc1;
import org.telegram.ui.gg0;
import org.telegram.ui.kx0;
import org.telegram.ui.uw0;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j1 extends xl0 {
    public final /* synthetic */ k1 c;

    public j1(k1 k1Var) {
        this.c = k1Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.f0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        k1 k1Var = this.c;
        if (i10 == k1Var.g0) {
            return 0;
        }
        if (i10 >= k1Var.h0 && i10 < k1Var.i0) {
            return k1Var.X();
        }
        if (i10 >= k1Var.j0 && i10 < k1Var.k0) {
            return 1;
        }
        if (i10 == k1Var.l0) {
            return 2;
        }
        if (i10 == k1Var.m0) {
            return 3;
        }
        if (i10 == 0) {
            return 4;
        }
        return i10 == k1Var.n0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        k1 k1Var = this.c;
        int i11 = k1Var.j0;
        if (i10 >= i11 && i10 < k1Var.k0) {
            ((uw0) view).a((kx0) k1Var.X.get(i10 - i11), i10 != k1Var.k0 - 1);
        } else {
            if (i10 < k1Var.h0 || i10 >= k1Var.i0) {
                return;
            }
            k1Var.Y(view);
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
        k1 k1Var = this.c;
        View Z = k1Var.Z(context, i10);
        if (Z != null) {
            return e2.k(Z, Z, -1, -2);
        }
        if (i10 == 0) {
            dc1 dc1Var = new dc1(this, context, 17);
            k1Var.s0 = dc1Var;
            dc1Var.setOrientation(1);
            View view2 = k1Var.B0;
            if (view2 == null) {
                k1Var.r0 = new gg0(context, 1, 0, 2);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i11 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i11), k1Var.getThemedColor(j6.h5)));
                k1Var.r0.setBackgroundBitmap(createBitmap);
                sg.a aVar = k1Var.r0.b;
                aVar.w = i11;
                aVar.x = j6.Lj;
                aVar.b();
                dc1Var.addView(k1Var.r0, y5.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) k1Var.B0.getParent()).removeView(k1Var.B0);
                }
                k1Var.W(dc1Var);
            }
            if (k1Var.N0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                k1Var.N0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = k1Var.u0;
                new PorterDuffColorFilter(num == null ? k1Var.getThemedColor(j6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                k1Var.O0 = new n90[2];
                int i12 = 0;
                while (i12 < 2) {
                    n90[] n90VarArr = k1Var.O0;
                    f6Var2 = ((f3) k1Var).resourcesProvider;
                    n90VarArr[i12] = new wb(context, 4, f6Var2);
                    k1Var.O0[i12].setVisibility(i12 == 0 ? 0 : 8);
                    k1Var.O0[i12].setTextSize(1, 16.0f);
                    k1Var.O0[i12].setTypeface(AndroidUtilities.bold());
                    k1Var.O0[i12].setGravity(1);
                    k1Var.O0[i12].setTextColor(k1Var.getThemedColor(j6.G6));
                    k1Var.O0[i12].setLinkTextColor(k1Var.getThemedColor(j6.J6));
                    k1Var.N0.addView(k1Var.O0[i12], y5.c(-2.0f, -1));
                    i12++;
                }
            }
            if (k1Var.N0.getParent() != null) {
                ((ViewGroup) k1Var.N0.getParent()).removeView(k1Var.N0);
            }
            dc1Var.addView(k1Var.N0, y5.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.P0 == null) {
                Context context2 = k1Var.getContext();
                f6Var = ((f3) k1Var).resourcesProvider;
                n90 n90Var = new n90(context2, f6Var);
                k1Var.P0 = n90Var;
                n90Var.setTextSize(1, 14.0f);
                k1Var.P0.setGravity(1);
                k1Var.P0.setTextColor(k1Var.getThemedColor(j6.G6));
                k1Var.P0.setLinkTextColor(k1Var.getThemedColor(j6.J6));
            }
            if (k1Var.P0.getParent() != null) {
                ((ViewGroup) k1Var.P0.getParent()).removeView(k1Var.P0);
            }
            dc1Var.addView(k1Var.P0, y5.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.a0(false);
            k1Var.q0 = new ei.f(context, 5);
            ai.f0 f0Var = new ai.f0(this, context, 29);
            f0Var.setClipChildren(false);
            f0Var.addView(k1Var.q0);
            f0Var.addView(dc1Var);
            gg0 gg0Var = k1Var.r0;
            view = f0Var;
            if (gg0Var != null) {
                gg0Var.setStarParticlesView(k1Var.q0);
                view = f0Var;
            }
        } else if (i10 == 2) {
            view = new c7(context, k1Var.getThemedColor(j6.a7), 0);
        } else if (i10 == 3) {
            view = new i1(context, 0);
        } else if (i10 == 4) {
            view = new a(context);
        } else if (i10 != 5) {
            f6Var4 = ((f3) k1Var).resourcesProvider;
            view = new bx0(this, context, f6Var4);
        } else {
            f6Var3 = ((f3) k1Var).resourcesProvider;
            vg.d0 d0Var = new vg.d0(context, f6Var3);
            d0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i13 = j6.gc;
            final int i14 = 0;
            final int i15 = 1;
            d0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i13, 0, new Runnable(this) { // from class: rg.h1
                public final /* synthetic */ j1 b;

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
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i13, 0, new Runnable(this) { // from class: rg.h1
                public final /* synthetic */ j1 b;

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
        k1Var.V(i10, view);
        return new il0(view);
    }
}
