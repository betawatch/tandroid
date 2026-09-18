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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import yh.y7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class h1 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new h1());
    }

    public static j51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        j51 J = j51.J(h1.class);
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

    @Override // org.telegram.ui.Components.i51
    public final void attachedView(ml0 ml0Var, View view, j51 j51Var) {
        ((i1) view).d(j51Var.h, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        i1 i1Var = (i1) view;
        Object obj = j51Var.G;
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
                u01 c12 = y7.c1(u9Var, u9Var.getImageReceiver(), d);
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
                textView4.setTextColor(j6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(y7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            u9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
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
            boolean z12 = j51Var.e;
            Object obj2 = j51Var.H;
            i1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, j51Var.q, j51Var.r, j51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = i1Var.h((TL_stars.SavedStarGift) obj, j51Var.q, j51Var.r);
        }
        if (j51Var.f) {
            i1Var.b(j51Var.e, z11);
        }
        i1Var.d(j51Var.h, z11);
        i1Var.d.setAlpha(j51Var.g ? 1.0f : 0.65f);
        i1Var.f.setAlpha(j51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new i1(context, i10, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.q != j51Var2.q) {
            return false;
        }
        Object obj = j51Var.G;
        if (obj != null || j51Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == j51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = j51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = j51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return j51Var.z == j51Var2.z && j51Var.e == j51Var2.e && j51Var.B == j51Var2.B && TextUtils.equals(j51Var.l, j51Var2.l);
    }
}
