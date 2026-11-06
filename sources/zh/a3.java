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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a3 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new a3());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        b3 b3Var = (b3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x31Var.G;
        int i7 = x31Var.z;
        String str = (String) x31Var.l;
        boolean z10 = x31Var.e;
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
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        b3Var.j(charSequence, 0, b3Var.a0);
        b3Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new b3(i7, context, f6Var);
    }
}
