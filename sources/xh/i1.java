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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import yh.w7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class i1 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new i1());
    }

    public static v51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        v51 J = v51.J(i1.class);
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

    @Override // org.telegram.ui.Components.u51
    public final void attachedView(wl0 wl0Var, View view, v51 v51Var) {
        ((j1) view).d(v51Var.h, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        j1 j1Var = (j1) view;
        Object obj = v51Var.G;
        boolean z11 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            h1 h1Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            f1 f1Var = j1Var.e;
            w9 w9Var = j1Var.y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.h0 != kVar) {
                g11 c12 = w7.c1(w9Var, w9Var.getImageReceiver(), d);
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
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(h6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                pq[] pqVarArr = new pq[1];
                textView4.setText(w7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, pqVarArr));
                pqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(h6.b0(AndroidUtilities.dp(13.0f), 422810068));
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
            boolean z12 = v51Var.e;
            Object obj2 = v51Var.H;
            j1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, v51Var.q, v51Var.r, v51Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = j1Var.h((TL_stars.SavedStarGift) obj, v51Var.q, v51Var.r);
        }
        if (v51Var.f) {
            j1Var.b(v51Var.e, z11);
        }
        j1Var.d(v51Var.h, z11);
        j1Var.d.setAlpha(v51Var.g ? 1.0f : 0.65f);
        j1Var.f.setAlpha(v51Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new j1(context, i10, d6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.q != v51Var2.q) {
            return false;
        }
        Object obj = v51Var.G;
        if (obj != null || v51Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == v51Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = v51Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = v51Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return v51Var.z == v51Var2.z && v51Var.e == v51Var2.e && v51Var.B == v51Var2.B && TextUtils.equals(v51Var.l, v51Var2.l);
    }
}
