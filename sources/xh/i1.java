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
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import yh.w7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class i1 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new i1());
    }

    public static y51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        y51 J = y51.J(i1.class);
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

    @Override // org.telegram.ui.Components.x51
    public final void attachedView(yl0 yl0Var, View view, y51 y51Var) {
        ((j1) view).d(y51Var.h, false);
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        j1 j1Var = (j1) view;
        Object obj = y51Var.G;
        boolean z11 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            h1 h1Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            f1 f1Var = j1Var.e;
            v9 v9Var = j1Var.y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.h0 != kVar) {
                j11 c12 = w7.c1(v9Var, v9Var.getImageReceiver(), d);
                j1Var.N = c12;
                c12.run();
                j1Var.N = null;
            }
            f1Var.d(null);
            f1Var.e(null);
            f1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            v9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(j6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(w7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            v9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            j1Var.h0 = kVar;
            j1Var.i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.b0 = false;
            j1Var.c0 = null;
            j1Var.d0 = false;
            j1Var.e0 = false;
            j1Var.f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = y51Var.e;
            Object obj2 = y51Var.H;
            j1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, y51Var.q, y51Var.r, y51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = j1Var.h((TL_stars.SavedStarGift) obj, y51Var.q, y51Var.r);
        }
        if (y51Var.f) {
            j1Var.b(y51Var.e, z11);
        }
        j1Var.d(y51Var.h, z11);
        j1Var.d.setAlpha(y51Var.g ? 1.0f : 0.65f);
        j1Var.f.setAlpha(y51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new j1(context, i10, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.q != y51Var2.q) {
            return false;
        }
        Object obj = y51Var.G;
        if (obj != null || y51Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == y51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = y51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = y51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return y51Var.z == y51Var2.z && y51Var.e == y51Var2.e && y51Var.B == y51Var2.B && TextUtils.equals(y51Var.l, y51Var2.l);
    }
}
