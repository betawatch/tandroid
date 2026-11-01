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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v2 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new v2());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        w2 w2Var = (w2) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b51Var.G;
        int i10 = b51Var.z;
        String str = (String) b51Var.l;
        boolean z11 = b51Var.e;
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
            spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        w2Var.j(charSequence, 0, L);
        w2Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
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
