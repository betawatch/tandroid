package yh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.z9;
import zh.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g1 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new g1());
    }

    public static m61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        m61 J = m61.J(g1.class);
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
        ((h1) view).d(m61Var.h, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        h1 h1Var = (h1) view;
        Object obj = m61Var.G;
        boolean z11 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            sg.p0 p0Var = h1Var.J;
            TextView textView = h1Var.I;
            TextView textView2 = h1Var.H;
            e1 e1Var = h1Var.e;
            z9 z9Var = h1Var.y;
            TextView textView3 = h1Var.L;
            TextView textView4 = h1Var.M;
            int d = kVar.d();
            if (h1Var.h0 != kVar) {
                v11 d12 = p7.d1(z9Var, z9Var.getImageReceiver(), d);
                h1Var.N = d12;
                d12.run();
                h1Var.N = null;
            }
            e1Var.d(null);
            e1Var.e(null);
            e1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            z9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            h1Var.n.setVisibility(8);
            h1Var.F.setVisibility(8);
            if (kVar.c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(g6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                br[] brVarArr = new br[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, brVarArr));
                brVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = h1Var.E;
            layoutParams.gravity = 49;
            z9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            h1Var.K.setBackground(g6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            h1Var.h0 = kVar;
            h1Var.i0 = null;
            h1Var.V = kVar;
            h1Var.W = null;
            h1Var.b0 = false;
            h1Var.c0 = null;
            h1Var.d0 = false;
            h1Var.e0 = false;
            h1Var.f0 = false;
            h1Var.O = null;
            h1Var.P = null;
            h1Var.c(false, false);
            h1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = m61Var.e;
            Object obj2 = m61Var.H;
            h1Var.g(starGift, z12, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, m61Var.q, m61Var.r, m61Var.t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = h1Var.h((TL_stars.SavedStarGift) obj, m61Var.q, m61Var.r);
        }
        if (m61Var.f) {
            h1Var.b(m61Var.e, z11);
        }
        h1Var.d(m61Var.h, z11);
        h1Var.d.setAlpha(m61Var.g ? 1.0f : 0.65f);
        h1Var.f.setAlpha(m61Var.g ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new h1(context, i10, c6Var);
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
