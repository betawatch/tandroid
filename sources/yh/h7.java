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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class h7 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new h7());
    }

    public static x51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        x51 J = x51.J(h7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        i7 i7Var = (i7) view;
        int i10 = x51Var.z;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        org.telegram.ui.Components.p6 p6Var = i7Var.e;
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
                spannableString.setSpan(new q90(AndroidUtilities.dp(55.0f), p6Var), 0, i7Var.f.length(), 33);
            }
            charSequence2 = i7Var.f;
        }
        p6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(qr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        i7Var.h = z10;
        i7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.z == x51Var2.z && x51Var.d == x51Var2.d && TextUtils.equals(x51Var.m, x51Var2.m);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i7(context, e6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }
}
