package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.dd;
import bi.fb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.p5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f1 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new f1());
    }

    public static u61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        u61 K = u61.K(f1.class);
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

    @Override // org.telegram.ui.Components.t61
    public final void attachedView(nm0 nm0Var, View view, u61 u61Var) {
        ((g1) view).e(u61Var.h, false);
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        g1 g1Var = (g1) view;
        Object obj = u61Var.G;
        boolean z11 = false;
        if (obj instanceof tg.k) {
            tg.k kVar = (tg.k) obj;
            p5 p5Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            y9 y9Var = g1Var.y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.j0 != kVar) {
                fb b12 = dd.b1(y9Var, y9Var.getImageReceiver(), d);
                g1Var.N = b12;
                b12.run();
                g1Var.N = null;
            }
            d1Var.d(null);
            d1Var.e(null);
            d1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            g1Var.n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(y6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                zq[] zqVarArr = new zq[1];
                textView4.setText(dd.W0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, zqVarArr));
                zqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.s0 = 0;
            g1Var.K.setBackground(y6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            g1Var.j0 = kVar;
            g1Var.k0 = null;
            g1Var.a0 = kVar;
            g1Var.b0 = null;
            g1Var.d0 = false;
            g1Var.e0 = null;
            g1Var.f0 = false;
            g1Var.g0 = false;
            g1Var.h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.d(false, false);
            g1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = u61Var.e;
            Object obj2 = u61Var.H;
            g1Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, u61Var.q, u61Var.r, u61Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = g1Var.i((TL_stars.SavedStarGift) obj, u61Var.q, u61Var.r);
        }
        if (u61Var.f) {
            g1Var.c(u61Var.e, z11);
        }
        g1Var.e(u61Var.h, z11);
        g1Var.d.setAlpha(u61Var.g ? 1.0f : 0.65f);
        g1Var.f.setAlpha(u61Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new g1(context, i10, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.q != u61Var2.q) {
            return false;
        }
        Object obj = u61Var.G;
        if (obj != null || u61Var2.G != null) {
            if (obj instanceof tg.k) {
                return obj == u61Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = u61Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = u61Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return u61Var.z == u61Var2.z && u61Var.e == u61Var2.e && u61Var.B == u61Var2.B && TextUtils.equals(u61Var.l, u61Var2.l);
    }
}
