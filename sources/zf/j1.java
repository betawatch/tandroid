package zf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fh.e4;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.gw0;
import org.telegram.ui.qv0;
import org.telegram.ui.ta1;
import org.telegram.ui.xv0;
import yf.q2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j1 extends vk0 {
    public final /* synthetic */ k1 c;

    public j1(k1 k1Var) {
        this.c = k1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.b0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        k1 k1Var = this.c;
        if (i9 == k1Var.c0) {
            return 0;
        }
        if (i9 >= k1Var.d0 && i9 < k1Var.e0) {
            return k1Var.W();
        }
        if (i9 >= k1Var.f0 && i9 < k1Var.g0) {
            return 1;
        }
        if (i9 == k1Var.h0) {
            return 2;
        }
        if (i9 == k1Var.i0) {
            return 3;
        }
        if (i9 == 0) {
            return 4;
        }
        return i9 == k1Var.j0 ? 5 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        k1 k1Var = this.c;
        int i10 = k1Var.f0;
        if (i9 >= i10 && i9 < k1Var.g0) {
            ((qv0) view).a((gw0) k1Var.T.get(i9 - i10), i9 != k1Var.g0 - 1);
        } else {
            if (i9 < k1Var.d0 || i9 >= k1Var.e0) {
                return;
            }
            k1Var.X(view);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        b6 b6Var2;
        View view;
        b6 b6Var3;
        b6 b6Var4;
        Context context = viewGroup.getContext();
        k1 k1Var = this.c;
        View Y = k1Var.Y(context, i9);
        if (Y != null) {
            return j3.r0.s(Y, Y, -1, -2);
        }
        if (i9 == 0) {
            ta1 ta1Var = new ta1(this, context, 20);
            k1Var.o0 = ta1Var;
            ta1Var.setOrientation(1);
            View view2 = k1Var.x0;
            if (view2 == null) {
                k1Var.n0 = new dg.q(context, 1, 0, 4);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i10 = f6.Mj;
                canvas.drawColor(i0.a.d(0.5f, k1Var.getThemedColor(i10), k1Var.getThemedColor(f6.h5)));
                k1Var.n0.setBackgroundBitmap(createBitmap);
                ag.a aVar = k1Var.n0.b;
                aVar.w = i10;
                aVar.x = f6.Lj;
                aVar.b();
                ta1Var.addView(k1Var.n0, e6.q(160, 160, 1));
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) k1Var.x0.getParent()).removeView(k1Var.x0);
                }
                k1Var.V(ta1Var);
            }
            if (k1Var.J0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                k1Var.J0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = k1Var.q0;
                new PorterDuffColorFilter(num == null ? k1Var.getThemedColor(f6.v6) : num.intValue(), PorterDuff.Mode.SRC_IN);
                k1Var.K0 = new l80[2];
                int i11 = 0;
                while (i11 < 2) {
                    l80[] l80VarArr = k1Var.K0;
                    b6Var2 = ((f3) k1Var).resourcesProvider;
                    l80VarArr[i11] = new e4(context, 5, b6Var2);
                    k1Var.K0[i11].setVisibility(i11 == 0 ? 0 : 8);
                    k1Var.K0[i11].setTextSize(1, 16.0f);
                    k1Var.K0[i11].setTypeface(AndroidUtilities.bold());
                    k1Var.K0[i11].setGravity(1);
                    k1Var.K0[i11].setTextColor(k1Var.getThemedColor(f6.G6));
                    k1Var.K0[i11].setLinkTextColor(k1Var.getThemedColor(f6.J6));
                    k1Var.J0.addView(k1Var.K0[i11], e6.c(-2.0f, -1));
                    i11++;
                }
            }
            if (k1Var.J0.getParent() != null) {
                ((ViewGroup) k1Var.J0.getParent()).removeView(k1Var.J0);
            }
            ta1Var.addView(k1Var.J0, e6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (k1Var.L0 == null) {
                Context context2 = k1Var.getContext();
                b6Var = ((f3) k1Var).resourcesProvider;
                l80 l80Var = new l80(context2, b6Var);
                k1Var.L0 = l80Var;
                l80Var.setTextSize(1, 14.0f);
                k1Var.L0.setGravity(1);
                k1Var.L0.setTextColor(k1Var.getThemedColor(f6.G6));
                k1Var.L0.setLinkTextColor(k1Var.getThemedColor(f6.J6));
            }
            if (k1Var.L0.getParent() != null) {
                ((ViewGroup) k1Var.L0.getParent()).removeView(k1Var.L0);
            }
            ta1Var.addView(k1Var.L0, e6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            k1Var.Z(false);
            k1Var.m0 = new mh.f(context, 5);
            q2 q2Var = new q2(this, context, 3);
            q2Var.setClipChildren(false);
            q2Var.addView(k1Var.m0);
            q2Var.addView(ta1Var);
            dg.q qVar = k1Var.n0;
            view = q2Var;
            if (qVar != null) {
                qVar.setStarParticlesView(k1Var.m0);
                view = q2Var;
            }
        } else if (i9 == 2) {
            view = new z6(context, k1Var.getThemedColor(f6.a7), 0);
        } else if (i9 == 3) {
            view = new b0(context, 1);
        } else if (i9 == 4) {
            view = new a(context);
        } else if (i9 != 5) {
            b6Var4 = ((f3) k1Var).resourcesProvider;
            view = new xv0(this, context, b6Var4);
        } else {
            b6Var3 = ((f3) k1Var).resourcesProvider;
            dg.h0 h0Var = new dg.h0(context, b6Var3);
            h0Var.setBackground(true);
            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
            int i12 = f6.gc;
            final int i13 = 0;
            final int i14 = 1;
            h0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) { // from class: zf.i1
                public final /* synthetic */ j1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            ve.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ve.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) { // from class: zf.i1
                public final /* synthetic */ j1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            ve.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                            break;
                        default:
                            ve.e.s(this.b.c.p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                    }
                }
            })));
            view = h0Var;
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        k1Var.U(i9, view);
        return new ik0(view);
    }
}
