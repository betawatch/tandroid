package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class h3 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new h3());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        i3 i3Var = (i3) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) j51Var.G;
        int i10 = j51Var.z;
        String str = (String) j51Var.l;
        boolean z11 = j51Var.e;
        i3Var.getClass();
        ShapeDrawable K = j6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequence = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, i3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        i3Var.g(charSequence, 0, K);
        i3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        i3 i3Var = new i3(0, context, f6Var, false, false);
        i3Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        i3Var.c(j6.v0(j6.E8, f6Var), j6.v0(j6.F8, f6Var));
        i3Var.e(-1, PorterDuff.Mode.MULTIPLY);
        i3Var.c.setTranslationX(AndroidUtilities.dp(2.0f));
        i3Var.a(2);
        i3Var.setBackground(null);
        return i3Var;
    }
}
