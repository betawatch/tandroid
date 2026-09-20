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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class i7 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new i7());
    }

    public static w51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        w51 J = w51.J(i7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        j7 j7Var = (j7) view;
        int i10 = w51Var.z;
        CharSequence charSequence = w51Var.l;
        CharSequence charSequence2 = w51Var.m;
        org.telegram.ui.Components.o6 o6Var = j7Var.e;
        TextView textView = j7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        j7Var.n = i10;
        if (!equals) {
            j7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (j7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                j7Var.f = spannableString;
                spannableString.setSpan(new p90(AndroidUtilities.dp(55.0f), o6Var), 0, j7Var.f.length(), 33);
            }
            charSequence2 = j7Var.f;
        }
        o6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(qr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        j7Var.h = z10;
        j7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return w51Var.z == w51Var2.z && w51Var.d == w51Var2.d && TextUtils.equals(w51Var.m, w51Var2.m);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j7(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }
}
