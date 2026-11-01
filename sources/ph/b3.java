package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b3 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new b3());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        c3 c3Var = (c3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b51Var.G;
        int i10 = b51Var.z;
        String str = (String) b51Var.l;
        boolean z11 = b51Var.e;
        fi0 fi0Var = c3Var.c;
        a3 a3Var = c3Var.a0;
        if (a3Var == null || c3Var.W != stargiftattributemodel.document.id) {
            c3Var.W = stargiftattributemodel.document.id;
            if (a3Var != null) {
                a3Var.n(fi0Var);
            }
            c3Var.a0 = new a3(3, c3Var.V, stargiftattributemodel.document);
        }
        if (fi0Var.isAttachedToWindow()) {
            c3Var.a0.a(fi0Var);
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
            spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        c3Var.j(charSequence, 0, c3Var.a0);
        c3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new c3(i10, context, p6Var);
    }
}
