package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b1 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new b1());
    }

    public static a51 i(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        a51 K = a51.K(b1.class);
        K.u = 1;
        K.z = i10;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.r = z13;
        K.q = z12;
        K.t = z14;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void a(tk0 tk0Var, View view, a51 a51Var) {
        ((c1) view).e(a51Var.h, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        c1 c1Var = (c1) view;
        Object obj = a51Var.G;
        boolean z11 = false;
        if (obj instanceof kg.m) {
            kg.m mVar = (kg.m) obj;
            org.telegram.ui.Components.voip.i0 i0Var = c1Var.J;
            TextView textView = c1Var.I;
            TextView textView2 = c1Var.H;
            z0 z0Var = c1Var.e;
            g9 g9Var = c1Var.D;
            TextView textView3 = c1Var.L;
            TextView textView4 = c1Var.M;
            int d = mVar.d();
            if (c1Var.j0 != mVar) {
                d01 e12 = h8.e1(g9Var, g9Var.getImageReceiver(), d);
                c1Var.N = e12;
                e12.run();
                c1Var.N = null;
            }
            z0Var.d(null);
            z0Var.e(null);
            z0Var.g(null);
            textView2.setText(cd.G(d, "Gift2Months", new Object[0]));
            textView.setText(cd.L0(2131744255, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            g9Var.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            c1Var.n.setVisibility(8);
            c1Var.F.setVisibility(8);
            if (mVar.c == null && mVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(t6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + cd.E(mVar.g(), ','));
                spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                dq[] dqVarArr = new dq[1];
                textView4.setText(h8.Z0(false, cd.V(null, null, 2131747043, spannableStringBuilder), 0.48f, dqVarArr));
                dqVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = c1Var.E;
            layoutParams.gravity = 49;
            g9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(mVar.c());
            c1Var.s0 = 0;
            c1Var.K.setBackground(t6.d0(org.telegram.messenger.i0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(130.0f);
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            c1Var.j0 = mVar;
            c1Var.k0 = null;
            c1Var.a0 = mVar;
            c1Var.b0 = null;
            c1Var.d0 = false;
            c1Var.e0 = null;
            c1Var.f0 = false;
            c1Var.g0 = false;
            c1Var.h0 = false;
            c1Var.Q = null;
            c1Var.R = null;
            c1Var.d(false, false);
            c1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = a51Var.e;
            Object obj2 = a51Var.H;
            c1Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, a51Var.q, a51Var.r, a51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = c1Var.i((TL_stars.SavedStarGift) obj, a51Var.q, a51Var.r);
        }
        if (a51Var.f) {
            c1Var.c(a51Var.e, z11);
        }
        c1Var.e(a51Var.h, z11);
        c1Var.d.setAlpha(a51Var.g ? 1.0f : 0.65f);
        c1Var.f.setAlpha(a51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new c1(i10, context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.q != a51Var2.q) {
            return false;
        }
        Object obj = a51Var.G;
        if (obj != null || a51Var2.G != null) {
            if (obj instanceof kg.m) {
                return obj == a51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = a51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = a51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return a51Var.z == a51Var2.z && a51Var.e == a51Var2.e && a51Var.B == a51Var2.B && TextUtils.equals(a51Var.l, a51Var2.l);
    }
}
