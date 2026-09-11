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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class h7 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new h7());
    }

    public static h51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        h51 J = h51.J(h7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        i7 i7Var = (i7) view;
        int i10 = h51Var.z;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        org.telegram.ui.Components.q6 q6Var = i7Var.e;
        TextView textView = i7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        i7Var.n = i10;
        if (!equals) {
            i7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (i7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                i7Var.f = spannableString;
                spannableString.setSpan(new i90(AndroidUtilities.dp(55.0f), q6Var), 0, i7Var.f.length(), 33);
            }
            charSequence2 = i7Var.f;
        }
        q6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(pr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        i7Var.h = z10;
        i7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.z == h51Var2.z && h51Var.d == h51Var2.d && TextUtils.equals(h51Var.m, h51Var2.m);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new i7(context, f6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }
}
