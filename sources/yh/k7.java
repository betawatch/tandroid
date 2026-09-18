package yh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class k7 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new k7());
    }

    public static j51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        j51 J = j51.J(k7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        l7 l7Var = (l7) view;
        int i10 = j51Var.z;
        CharSequence charSequence = j51Var.l;
        CharSequence charSequence2 = j51Var.m;
        org.telegram.ui.Components.n6 n6Var = l7Var.e;
        TextView textView = l7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        l7Var.n = i10;
        if (!equals) {
            l7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (l7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                l7Var.f = spannableString;
                spannableString.setSpan(new h90(AndroidUtilities.dp(55.0f), n6Var), 0, l7Var.f.length(), 33);
            }
            charSequence2 = l7Var.f;
        }
        n6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(qr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        l7Var.h = z10;
        l7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.z == j51Var2.z && j51Var.d == j51Var2.d && TextUtils.equals(j51Var.m, j51Var2.m);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l7(context, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }
}
