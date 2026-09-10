package xh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l7 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new l7());
    }

    public static v51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        v51 J = v51.J(l7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        m7 m7Var = (m7) view;
        int i10 = v51Var.z;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        org.telegram.ui.Components.o6 o6Var = m7Var.e;
        TextView textView = m7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        m7Var.n = i10;
        if (!equals) {
            m7Var.r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (m7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                m7Var.f = spannableString;
                spannableString.setSpan(new r90(AndroidUtilities.dp(55.0f), o6Var), 0, m7Var.f.length(), 33);
            }
            charSequence2 = m7Var.f;
        }
        o6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(wr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        m7Var.h = z10;
        m7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.z == v51Var2.z && v51Var.d == v51Var2.d && TextUtils.equals(v51Var.m, v51Var2.m);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m7(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }
}
