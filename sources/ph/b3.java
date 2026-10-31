package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b3 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new b3());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        c3 c3Var = (c3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) a51Var.G;
        int i10 = a51Var.z;
        String str = (String) a51Var.l;
        boolean z11 = a51Var.e;
        ei0 ei0Var = c3Var.c;
        a3 a3Var = c3Var.a0;
        if (a3Var == null || c3Var.W != stargiftattributemodel.document.id) {
            c3Var.W = stargiftattributemodel.document.id;
            if (a3Var != null) {
                a3Var.n(ei0Var);
            }
            c3Var.a0 = new a3(3, c3Var.V, stargiftattributemodel.document);
        }
        if (ei0Var.isAttachedToWindow()) {
            c3Var.a0.a(ei0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.i0.w1(charSequence, str, c3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        c3Var.j(charSequence, 0, c3Var.a0);
        c3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new c3(i10, context, p6Var);
    }
}
