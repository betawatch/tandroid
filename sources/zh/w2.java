package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w2 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new w2());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        x2 x2Var = (x2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) y31Var.G;
        int i7 = y31Var.z;
        String str = (String) y31Var.l;
        boolean z10 = y31Var.e;
        dh0 dh0Var = x2Var.c;
        v2 v2Var = x2Var.a0;
        if (v2Var == null || x2Var.W != stargiftattributemodel.document.id) {
            x2Var.W = stargiftattributemodel.document.id;
            if (v2Var != null) {
                v2Var.n(dh0Var);
            }
            x2Var.a0 = new v2(3, x2Var.V, stargiftattributemodel.document);
        }
        if (dh0Var.isAttachedToWindow()) {
            x2Var.a0.a(dh0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, x2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        x2Var.j(charSequence, 0, x2Var.a0);
        x2Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new x2(i7, context, g6Var);
    }
}
