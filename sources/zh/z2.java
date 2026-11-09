package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z2 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new z2());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a3 a3Var = (a3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y31Var.G;
        int i7 = y31Var.z;
        String str = (String) y31Var.l;
        boolean z10 = y31Var.e;
        g6 g6Var = a3Var.O;
        dh0 dh0Var = a3Var.c;
        y2 y2Var = a3Var.a0;
        if (y2Var == null || a3Var.W != stargiftattributepattern.document.id) {
            a3Var.W = stargiftattributepattern.document.id;
            if (y2Var != null) {
                y2Var.n(dh0Var);
            }
            y2 y2Var2 = new y2(3, a3Var.V, stargiftattributepattern.document);
            a3Var.a0 = y2Var2;
            s6.x(a3Var, y2Var2, l6.E8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (dh0Var.isAttachedToWindow()) {
            a3Var.a0.a(dh0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, g6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        a3Var.j(charSequence, 0, a3Var.a0);
        a3Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new a3(i7, context, g6Var);
    }
}
