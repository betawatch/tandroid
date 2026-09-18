package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class r3 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new r3());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) j51Var.G;
        int i10 = j51Var.z;
        String str = (String) j51Var.l;
        boolean z11 = j51Var.e;
        f6 f6Var = s3Var.F;
        bj0 bj0Var = s3Var.c;
        q3 q3Var = s3Var.N;
        if (q3Var == null || s3Var.M != stargiftattributepattern.document.id) {
            s3Var.M = stargiftattributepattern.document.id;
            if (q3Var != null) {
                q3Var.o(bj0Var);
            }
            q3 q3Var2 = new q3(3, s3Var.L, stargiftattributepattern.document);
            s3Var.N = q3Var2;
            q3Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (bj0Var.isAttachedToWindow()) {
            s3Var.N.a(bj0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, f6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        s3Var.g(charSequence, 0, s3Var.N);
        s3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new s3(context, i10, f6Var);
    }
}
