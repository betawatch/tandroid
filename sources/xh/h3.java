package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new h3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        i3 i3Var = (i3) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z11 = i51Var.e;
        i3Var.getClass();
        ShapeDrawable K = i6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, i3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        i3Var.g(charSequence, 0, K);
        i3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        i3 i3Var = new i3(0, context, e6Var, false, false);
        i3Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        i3Var.c(i6.v0(i6.E8, e6Var), i6.v0(i6.F8, e6Var));
        i3Var.e(-1, PorterDuff.Mode.MULTIPLY);
        i3Var.c.setTranslationX(AndroidUtilities.dp(2.0f));
        i3Var.a(2);
        i3Var.setBackground(null);
        return i3Var;
    }
}
