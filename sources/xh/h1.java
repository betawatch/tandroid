package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import yh.x7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h1 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new h1());
    }

    public static i51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        i51 J = i51.J(h1.class);
        J.u = 1;
        J.z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.r = z13;
        J.q = z12;
        J.t = z14;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(ll0 ll0Var, View view, i51 i51Var) {
        ((i1) view).d(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        i1 i1Var = (i1) view;
        Object obj = i51Var.G;
        boolean z11 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            g1 g1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            e1 e1Var = i1Var.e;
            u9 u9Var = i1Var.y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.h0 != kVar) {
                t01 c12 = x7.c1(u9Var, u9Var.getImageReceiver(), d);
                i1Var.N = c12;
                c12.run();
                i1Var.N = null;
            }
            e1Var.d(null);
            e1Var.e(null);
            e1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            u9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            i1Var.n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(i6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(x7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            u9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(i6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) g1Var.getLayoutParams()).gravity = 49;
            i1Var.h0 = kVar;
            i1Var.i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.b0 = false;
            i1Var.c0 = null;
            i1Var.d0 = false;
            i1Var.e0 = false;
            i1Var.f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = i51Var.e;
            Object obj2 = i51Var.H;
            i1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, i51Var.q, i51Var.r, i51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = i1Var.h((TL_stars.SavedStarGift) obj, i51Var.q, i51Var.r);
        }
        if (i51Var.f) {
            i1Var.b(i51Var.e, z11);
        }
        i1Var.d(i51Var.h, z11);
        i1Var.d.setAlpha(i51Var.g ? 1.0f : 0.65f);
        i1Var.f.setAlpha(i51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new i1(context, i10, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.q != i51Var2.q) {
            return false;
        }
        Object obj = i51Var.G;
        if (obj != null || i51Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == i51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = i51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = i51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return i51Var.z == i51Var2.z && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B && TextUtils.equals(i51Var.l, i51Var2.l);
    }
}
