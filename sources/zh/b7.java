package zh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b7 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new b7());
    }

    public static l61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        l61 J = l61.J(b7.class);
        J.d = i10;
        J.z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        c7 c7Var = (c7) view;
        int i10 = l61Var.z;
        CharSequence charSequence = l61Var.l;
        CharSequence charSequence2 = l61Var.m;
        org.telegram.ui.Components.s6 s6Var = c7Var.e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.n = i10;
        if (!equals) {
            c7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f = spannableString;
                spannableString.setSpan(new ia0(AndroidUtilities.dp(55.0f), s6Var), 0, c7Var.f.length(), 33);
            }
            charSequence2 = c7Var.f;
        }
        s6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(es.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return l61Var.z == l61Var2.z && l61Var.d == l61Var2.d && TextUtils.equals(l61Var.m, l61Var2.m);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c7(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.d == l61Var2.d;
    }
}
