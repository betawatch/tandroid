package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.dd;
import bi.pb;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new y0());
    }

    public static x31 i(int i7, TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        x31 K = x31.K(y0.class);
        K.u = 1;
        K.z = i7;
        K.G = starGift;
        K.e = z9;
        K.H = Boolean.valueOf(z10);
        K.r = z12;
        K.q = z11;
        K.t = z13;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void a(pj0 pj0Var, View view, x31 x31Var) {
        ((z0) view).e(x31Var.h, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        z0 z0Var = (z0) view;
        Object obj = x31Var.G;
        boolean z10 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            v41 v41Var = z0Var.J;
            TextView textView = z0Var.I;
            TextView textView2 = z0Var.H;
            w0 w0Var = z0Var.e;
            l9 l9Var = z0Var.D;
            TextView textView3 = z0Var.L;
            TextView textView4 = z0Var.M;
            int d = jVar.d();
            if (z0Var.j0 != jVar) {
                pb f12 = dd.f1(l9Var, l9Var.getImageReceiver(), d);
                z0Var.N = f12;
                f12.run();
                z0Var.N = null;
            }
            w0Var.d(null);
            w0Var.e(null);
            w0Var.g(null);
            textView2.setText(hd.G(d, "Gift2Months", new Object[0]));
            textView.setText(hd.M0(2131744231, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            l9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            z0Var.n.setVisibility(8);
            z0Var.F.setVisibility(8);
            if (jVar.c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(k6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + hd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(dd.a1(false, hd.V(null, null, 2131747027, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = z0Var.E;
            layoutParams.gravity = 49;
            l9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            z0Var.s0 = 0;
            z0Var.K.setBackground(k6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) v41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) v41Var.getLayoutParams()).gravity = 49;
            z0Var.j0 = jVar;
            z0Var.k0 = null;
            z0Var.a0 = jVar;
            z0Var.b0 = null;
            z0Var.d0 = false;
            z0Var.e0 = null;
            z0Var.f0 = false;
            z0Var.g0 = false;
            z0Var.h0 = false;
            z0Var.Q = null;
            z0Var.R = null;
            z0Var.d(false, false);
            z0Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z11 = x31Var.e;
            Object obj2 = x31Var.H;
            z0Var.h(starGift, z11, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, x31Var.q, x31Var.r, x31Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z10 = z0Var.i((TL_stars.SavedStarGift) obj, x31Var.q, x31Var.r);
        }
        if (x31Var.f) {
            z0Var.c(x31Var.e, z10);
        }
        z0Var.e(x31Var.h, z10);
        z0Var.d.setAlpha(x31Var.g ? 1.0f : 0.65f);
        z0Var.f.setAlpha(x31Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new z0(i7, context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.q != x31Var2.q) {
            return false;
        }
        Object obj = x31Var.G;
        if (obj != null || x31Var2.G != null) {
            if (obj instanceof ug.j) {
                return obj == x31Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = x31Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = x31Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return x31Var.z == x31Var2.z && x31Var.e == x31Var2.e && x31Var.B == x31Var2.B && TextUtils.equals(x31Var.l, x31Var2.l);
    }
}
