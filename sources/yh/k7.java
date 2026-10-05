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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class k7 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new k7());
    }

    public static h61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        h61 K = h61.K(k7.class);
        K.d = i10;
        K.z = i11;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        l7 l7Var = (l7) view;
        int i10 = h61Var.z;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        org.telegram.ui.Components.p6 p6Var = l7Var.e;
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
                spannableString.setSpan(new v90(AndroidUtilities.dp(55.0f), p6Var), 0, l7Var.f.length(), 33);
            }
            charSequence2 = l7Var.f;
        }
        p6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(tr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        l7Var.h = z10;
        l7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return h61Var.z == h61Var2.z && h61Var.d == h61Var2.d && TextUtils.equals(h61Var.m, h61Var2.m);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l7(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.d == h61Var2.d;
    }
}
