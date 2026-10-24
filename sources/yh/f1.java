package yh;

import ai.gb;
import ai.nd;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f1 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new f1());
    }

    public static m61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        m61 J = m61.J(f1.class);
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

    @Override // org.telegram.ui.Components.l61
    public final void attachedView(mm0 mm0Var, View view, m61 m61Var) {
        ((g1) view).e(m61Var.h, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        g1 g1Var = (g1) view;
        Object obj = m61Var.G;
        boolean z11 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            rg.y1 y1Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            w9 w9Var = g1Var.y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.j0 != kVar) {
                gb d12 = nd.d1(w9Var, w9Var.getImageReceiver(), d);
                g1Var.N = d12;
                d12.run();
                g1Var.N = null;
            }
            d1Var.d(null);
            d1Var.e(null);
            d1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            g1Var.n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(k6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                xq[] xqVarArr = new xq[1];
                textView4.setText(nd.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, xqVarArr));
                xqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.s0 = 0;
            g1Var.K.setBackground(k6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) y1Var.getLayoutParams()).gravity = 49;
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
            boolean z12 = m61Var.e;
            Object obj2 = m61Var.H;
            g1Var.h(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, m61Var.q, m61Var.r, m61Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = g1Var.i((TL_stars.SavedStarGift) obj, m61Var.q, m61Var.r);
        }
        if (m61Var.f) {
            g1Var.c(m61Var.e, z11);
        }
        g1Var.e(m61Var.h, z11);
        g1Var.d.setAlpha(m61Var.g ? 1.0f : 0.65f);
        g1Var.f.setAlpha(m61Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new g1(context, i10, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.q != m61Var2.q) {
            return false;
        }
        Object obj = m61Var.G;
        if (obj != null || m61Var2.G != null) {
            if (obj instanceof sg.k) {
                return obj == m61Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = m61Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = m61Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return m61Var.z == m61Var2.z && m61Var.e == m61Var2.e && m61Var.B == m61Var2.B && TextUtils.equals(m61Var.l, m61Var2.l);
    }
}
