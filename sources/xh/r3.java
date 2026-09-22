package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class r3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new r3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z11 = i51Var.e;
        e6 e6Var = s3Var.F;
        aj0 aj0Var = s3Var.c;
        q3 q3Var = s3Var.N;
        if (q3Var == null || s3Var.M != stargiftattributepattern.document.id) {
            s3Var.M = stargiftattributepattern.document.id;
            if (q3Var != null) {
                q3Var.o(aj0Var);
            }
            q3 q3Var2 = new q3(3, s3Var.L, stargiftattributepattern.document);
            s3Var.N = q3Var2;
            q3Var2.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (aj0Var.isAttachedToWindow()) {
            s3Var.N.a(aj0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, e6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        s3Var.g(charSequence, 0, s3Var.N);
        s3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new s3(context, i10, e6Var);
    }
}
