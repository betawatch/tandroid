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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.y9;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i1 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new i1());
    }

    public static p61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        p61 J = p61.J(i1.class);
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

    @Override // org.telegram.ui.Components.o61
    public final void attachedView(qm0 qm0Var, View view, p61 p61Var) {
        ((j1) view).d(p61Var.h, false);
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        j1 j1Var = (j1) view;
        Object obj = p61Var.G;
        boolean z11 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.t0 t0Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            g1 g1Var = j1Var.e;
            y9 y9Var = j1Var.y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.h0 != kVar) {
                y11 d12 = p7.d1(y9Var, y9Var.getImageReceiver(), d);
                j1Var.N = d12;
                d12.run();
                j1Var.N = null;
            }
            g1Var.d(null);
            g1Var.e(null);
            g1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(i6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                er[] erVarArr = new er[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, erVarArr));
                erVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(i6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) t0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).gravity = 49;
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
            boolean z12 = p61Var.e;
            Object obj2 = p61Var.H;
            j1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, p61Var.q, p61Var.r, p61Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = j1Var.h((TL_stars.SavedStarGift) obj, p61Var.q, p61Var.r);
        }
        if (p61Var.f) {
            j1Var.b(p61Var.e, z11);
        }
        j1Var.d(p61Var.h, z11);
        j1Var.d.setAlpha(p61Var.g ? 1.0f : 0.65f);
        j1Var.f.setAlpha(p61Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new j1(context, i10, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.q != p61Var2.q) {
            return false;
        }
        Object obj = p61Var.G;
        if (obj != null || p61Var2.G != null) {
            if (obj instanceof rg.k) {
                return obj == p61Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = p61Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = p61Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return p61Var.z == p61Var2.z && p61Var.e == p61Var2.e && p61Var.B == p61Var2.B && TextUtils.equals(p61Var.l, p61Var2.l);
    }
}
