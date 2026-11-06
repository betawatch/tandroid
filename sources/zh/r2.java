package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new r2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        s2 s2Var = (s2) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x31Var.G;
        int i7 = x31Var.z;
        String str = (String) x31Var.l;
        boolean z10 = x31Var.e;
        s2Var.getClass();
        ShapeDrawable L = k6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = org.telegram.messenger.g0.w1(charSequence, str, s2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        s2Var.j(charSequence, 0, L);
        s2Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        s2 s2Var = new s2(0, context, f6Var, false, false);
        s2Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        s2Var.c(k6.E8, k6.F8);
        s2Var.g(-1, PorterDuff.Mode.MULTIPLY);
        s2Var.c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        s2Var.a(2);
        s2Var.setBackground(null);
        return s2Var;
    }
}
