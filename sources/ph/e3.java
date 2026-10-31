package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e3 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new e3());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        f3 f3Var = (f3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) a51Var.G;
        int i10 = a51Var.z;
        String str = (String) a51Var.l;
        boolean z11 = a51Var.e;
        p6 p6Var = f3Var.O;
        ei0 ei0Var = f3Var.c;
        d3 d3Var = f3Var.a0;
        if (d3Var == null || f3Var.W != stargiftattributepattern.document.id) {
            f3Var.W = stargiftattributepattern.document.id;
            if (d3Var != null) {
                d3Var.n(ei0Var);
            }
            d3 d3Var2 = new d3(3, f3Var.V, stargiftattributepattern.document);
            f3Var.a0 = d3Var2;
            a7.y(f3Var, d3Var2, t6.E8, p6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ei0Var.isAttachedToWindow()) {
            f3Var.a0.a(ei0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.i0.w1(charSequence, str, p6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        f3Var.j(charSequence, 0, f3Var.a0);
        f3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new f3(i10, context, p6Var);
    }
}
