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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new j7());
    }

    public static i51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        i51 J = i51.J(j7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        k7 k7Var = (k7) view;
        int i10 = i51Var.z;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        org.telegram.ui.Components.n6 n6Var = k7Var.e;
        TextView textView = k7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        k7Var.n = i10;
        if (!equals) {
            k7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (k7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                k7Var.f = spannableString;
                spannableString.setSpan(new h90(AndroidUtilities.dp(55.0f), n6Var), 0, k7Var.f.length(), 33);
            }
            charSequence2 = k7Var.f;
        }
        n6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(qr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        k7Var.h = z10;
        k7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.z == i51Var2.z && i51Var.d == i51Var2.d && TextUtils.equals(i51Var.m, i51Var2.m);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new k7(context, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }
}
