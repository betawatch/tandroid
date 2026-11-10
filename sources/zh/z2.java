package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new z2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a3 a3Var = (a3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x31Var.G;
        int i7 = x31Var.z;
        String str = (String) x31Var.l;
        boolean z10 = x31Var.e;
        h6 h6Var = a3Var.O;
        ch0 ch0Var = a3Var.c;
        y2 y2Var = a3Var.a0;
        if (y2Var == null || a3Var.W != stargiftattributepattern.document.id) {
            a3Var.W = stargiftattributepattern.document.id;
            if (y2Var != null) {
                y2Var.n(ch0Var);
            }
            y2 y2Var2 = new y2(3, a3Var.V, stargiftattributepattern.document);
            a3Var.a0 = y2Var2;
            t6.x(a3Var, y2Var2, m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ch0Var.isAttachedToWindow()) {
            a3Var.a0.a(ch0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, h6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        a3Var.j(charSequence, 0, a3Var.a0);
        a3Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new a3(i7, context, h6Var);
    }
}
