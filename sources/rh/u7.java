package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u7 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new u7());
    }

    public static a51 i(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        a51 K = a51.K(u7.class);
        K.d = i10;
        K.z = i11;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.l = cd.H(' ', "StarsCount", (int) j10);
        K.m = tL_starsTopupOption.loadingStorePrice ? null : org.telegram.messenger.u1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        v7 v7Var = (v7) view;
        int i10 = a51Var.z;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        org.telegram.ui.Components.f6 f6Var = v7Var.e;
        TextView textView = v7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        v7Var.n = i10;
        if (!equals) {
            v7Var.r.e(true, i10);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (v7Var.f == null) {
                SpannableString spannableString = new SpannableString("x");
                v7Var.f = spannableString;
                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(55.0f), f6Var), 0, v7Var.f.length(), 33);
            }
            charSequence2 = v7Var.f;
        }
        f6Var.setText(charSequence2);
        float f7 = cd.X ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * org.telegram.messenger.i0.L(2.66f)).setDuration(320L).setInterpolator(gr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * org.telegram.messenger.i0.L(2.66f));
        }
        v7Var.h = z10;
        v7Var.invalidate();
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.z == a51Var2.z && a51Var.d == a51Var2.d && TextUtils.equals(a51Var.m, a51Var2.m);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v7(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }
}
