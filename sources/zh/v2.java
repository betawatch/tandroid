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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new v2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        w2 w2Var = (w2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) x31Var.G;
        int i7 = x31Var.z;
        String str = (String) x31Var.l;
        boolean z10 = x31Var.e;
        ch0 ch0Var = w2Var.c;
        u2 u2Var = w2Var.a0;
        if (u2Var == null || w2Var.W != stargiftattributemodel.document.id) {
            w2Var.W = stargiftattributemodel.document.id;
            if (u2Var != null) {
                u2Var.n(ch0Var);
            }
            w2Var.a0 = new u2(3, w2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            w2Var.a0.a(ch0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, w2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w2Var.j(charSequence, 0, w2Var.a0);
        w2Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new w2(i7, context, f6Var);
    }
}
