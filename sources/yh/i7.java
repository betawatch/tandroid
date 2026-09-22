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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class i7 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new i7());
    }

    public static y51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        y51 J = y51.J(i7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        j7 j7Var = (j7) view;
        int i10 = y51Var.z;
        CharSequence charSequence = y51Var.l;
        CharSequence charSequence2 = y51Var.m;
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
                spannableString.setSpan(new s90(AndroidUtilities.dp(55.0f), o6Var), 0, j7Var.f.length(), 33);
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

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return y51Var.z == y51Var2.z && y51Var.d == y51Var2.d && TextUtils.equals(y51Var.m, y51Var2.m);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j7(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.d == y51Var2.d;
    }
}
