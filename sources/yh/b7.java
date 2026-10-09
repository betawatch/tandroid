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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b7 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new b7());
    }

    public static p61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        p61 J = p61.J(b7.class);
        J.d = i10;
        J.z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        J.m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        c7 c7Var = (c7) view;
        int i10 = p61Var.z;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        org.telegram.ui.Components.r6 r6Var = c7Var.e;
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
                spannableString.setSpan(new ja0(AndroidUtilities.dp(55.0f), r6Var), 0, c7Var.f.length(), 33);
            }
            charSequence2 = c7Var.f;
        }
        r6Var.setText(charSequence2);
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(hs.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return p61Var.z == p61Var2.z && p61Var.d == p61Var2.d && TextUtils.equals(p61Var.m, p61Var2.m);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c7(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }
}
