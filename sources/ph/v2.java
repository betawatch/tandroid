package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new v2());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        w2 w2Var = (w2) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) a51Var.G;
        int i10 = a51Var.z;
        String str = (String) a51Var.l;
        boolean z11 = a51Var.e;
        w2Var.getClass();
        ShapeDrawable L = t6.L(org.telegram.messenger.i0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.i0.w1(charSequence, str, w2Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w2Var.j(charSequence, 0, L);
        w2Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        w2 w2Var = new w2(0, context, p6Var, false, false);
        w2Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        w2Var.c(t6.E8, t6.F8);
        w2Var.g(-1, PorterDuff.Mode.MULTIPLY);
        w2Var.c.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        w2Var.a(2);
        w2Var.setBackground(null);
        return w2Var;
    }
}
