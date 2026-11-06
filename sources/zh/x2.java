package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new x2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        y2 y2Var = (y2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) x31Var.G;
        int i7 = x31Var.z;
        String str = (String) x31Var.l;
        boolean z10 = x31Var.e;
        ch0 ch0Var = y2Var.c;
        w2 w2Var = y2Var.a0;
        if (w2Var == null || y2Var.W != stargiftattributemodel.document.id) {
            y2Var.W = stargiftattributemodel.document.id;
            if (w2Var != null) {
                w2Var.n(ch0Var);
            }
            y2Var.a0 = new w2(3, y2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            y2Var.a0.a(ch0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, y2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        y2Var.j(charSequence, 0, y2Var.a0);
        y2Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new y2(i7, context, f6Var);
    }
}
