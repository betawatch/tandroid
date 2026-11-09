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
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x0 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new x0());
    }

    public static y31 i(int i7, TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        y31 K = y31.K(x0.class);
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

    @Override // org.telegram.ui.Components.x31
    public final void a(qj0 qj0Var, View view, y31 y31Var) {
        ((y0) view).e(y31Var.h, false);
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        y0 y0Var = (y0) view;
        Object obj = y31Var.G;
        boolean z10 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            w41 w41Var = y0Var.J;
            TextView textView = y0Var.I;
            TextView textView2 = y0Var.H;
            v0 v0Var = y0Var.e;
            l9 l9Var = y0Var.D;
            TextView textView3 = y0Var.L;
            TextView textView4 = y0Var.M;
            int d = jVar.d();
            if (y0Var.j0 != jVar) {
                pb f12 = dd.f1(l9Var, l9Var.getImageReceiver(), d);
                y0Var.N = f12;
                f12.run();
                y0Var.N = null;
            }
            v0Var.d(null);
            v0Var.e(null);
            v0Var.g(null);
            textView2.setText(id.G(d, "Gift2Months", new Object[0]));
            textView.setText(id.M0(2131744230, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            l9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            y0Var.n.setVisibility(8);
            y0Var.F.setVisibility(8);
            if (jVar.c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(l6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + id.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(dd.a1(false, id.V(null, null, 2131747028, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = y0Var.E;
            layoutParams.gravity = 49;
            l9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            y0Var.s0 = 0;
            y0Var.K.setBackground(l6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) w41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) w41Var.getLayoutParams()).gravity = 49;
            y0Var.j0 = jVar;
            y0Var.k0 = null;
            y0Var.a0 = jVar;
            y0Var.b0 = null;
            y0Var.d0 = false;
            y0Var.e0 = null;
            y0Var.f0 = false;
            y0Var.g0 = false;
            y0Var.h0 = false;
            y0Var.Q = null;
            y0Var.R = null;
            y0Var.d(false, false);
            y0Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z11 = y31Var.e;
            Object obj2 = y31Var.H;
            y0Var.h(starGift, z11, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, y31Var.q, y31Var.r, y31Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z10 = y0Var.i((TL_stars.SavedStarGift) obj, y31Var.q, y31Var.r);
        }
        if (y31Var.f) {
            y0Var.c(y31Var.e, z10);
        }
        y0Var.e(y31Var.h, z10);
        y0Var.d.setAlpha(y31Var.g ? 1.0f : 0.65f);
        y0Var.f.setAlpha(y31Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new y0(i7, context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.q != y31Var2.q) {
            return false;
        }
        Object obj = y31Var.G;
        if (obj != null || y31Var2.G != null) {
            if (obj instanceof ug.j) {
                return obj == y31Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = y31Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = y31Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return y31Var.z == y31Var2.z && y31Var.e == y31Var2.e && y31Var.B == y31Var2.B && TextUtils.equals(y31Var.l, y31Var2.l);
    }
}
