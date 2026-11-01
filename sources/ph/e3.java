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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e3 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new e3());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        f3 f3Var = (f3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b51Var.G;
        int i10 = b51Var.z;
        String str = (String) b51Var.l;
        boolean z11 = b51Var.e;
        p6 p6Var = f3Var.O;
        fi0 fi0Var = f3Var.c;
        d3 d3Var = f3Var.a0;
        if (d3Var == null || f3Var.W != stargiftattributepattern.document.id) {
            f3Var.W = stargiftattributepattern.document.id;
            if (d3Var != null) {
                d3Var.n(fi0Var);
            }
            d3 d3Var2 = new d3(3, f3Var.V, stargiftattributepattern.document);
            f3Var.a0 = d3Var2;
            a7.y(f3Var, d3Var2, t6.E8, p6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fi0Var.isAttachedToWindow()) {
            f3Var.a0.a(fi0Var);
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
            spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        f3Var.j(charSequence, 0, f3Var.a0);
        f3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new f3(i10, context, p6Var);
    }
}
