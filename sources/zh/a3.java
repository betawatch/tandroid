package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new a3());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        b3 b3Var = (b3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) r31Var.G;
        int i7 = r31Var.z;
        String str = (String) r31Var.l;
        boolean z10 = r31Var.e;
        f6 f6Var = b3Var.O;
        ch0 ch0Var = b3Var.c;
        z2 z2Var = b3Var.a0;
        if (z2Var == null || b3Var.W != stargiftattributepattern.document.id) {
            b3Var.W = stargiftattributepattern.document.id;
            if (z2Var != null) {
                z2Var.n(ch0Var);
            }
            z2 z2Var2 = new z2(3, b3Var.V, stargiftattributepattern.document);
            b3Var.a0 = z2Var2;
            r6.y(b3Var, z2Var2, k6.E8, f6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ch0Var.isAttachedToWindow()) {
            b3Var.a0.a(ch0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, f6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        b3Var.j(charSequence, 0, b3Var.a0);
        b3Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new b3(i7, context, f6Var);
    }
}
