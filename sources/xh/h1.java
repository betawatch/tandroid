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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import yh.x7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class h1 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new h1());
    }

    public static g61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        g61 J = g61.J(h1.class);
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

    @Override // org.telegram.ui.Components.f61
    public final void attachedView(zl0 zl0Var, View view, g61 g61Var) {
        ((i1) view).d(g61Var.h, false);
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        i1 i1Var = (i1) view;
        Object obj = g61Var.G;
        boolean z11 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.j1 j1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            f1 f1Var = i1Var.e;
            w9 w9Var = i1Var.y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.h0 != kVar) {
                r11 i12 = x7.i1(w9Var, w9Var.getImageReceiver(), d);
                i1Var.N = i12;
                i12.run();
                i1Var.N = null;
            }
            f1Var.d(null);
            f1Var.e(null);
            f1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            i1Var.n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(i6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                rq[] rqVarArr = new rq[1];
                textView4.setText(x7.d1(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, rqVarArr));
                rqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(i6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) j1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) j1Var.getLayoutParams()).gravity = 49;
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
            boolean z12 = g61Var.e;
            Object obj2 = g61Var.H;
            i1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, g61Var.q, g61Var.r, g61Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = i1Var.h((TL_stars.SavedStarGift) obj, g61Var.q, g61Var.r);
        }
        if (g61Var.f) {
            i1Var.b(g61Var.e, z11);
        }
        i1Var.d(g61Var.h, z11);
        i1Var.d.setAlpha(g61Var.g ? 1.0f : 0.65f);
        i1Var.f.setAlpha(g61Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new i1(context, i10, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.q != g61Var2.q) {
            return false;
        }
        Object obj = g61Var.G;
        if (obj != null || g61Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == g61Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = g61Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = g61Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return g61Var.z == g61Var2.z && g61Var.e == g61Var2.e && g61Var.B == g61Var2.B && TextUtils.equals(g61Var.l, g61Var2.l);
    }
}
