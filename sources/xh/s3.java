package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s3 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new s3());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v51Var.G;
        int i10 = v51Var.z;
        String str = (String) v51Var.l;
        boolean z11 = v51Var.e;
        d6 d6Var = t3Var.F;
        lj0 lj0Var = t3Var.c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.id) {
            t3Var.M = stargiftattributepattern.document.id;
            if (r3Var != null) {
                r3Var.o(lj0Var);
            }
            r3 r3Var2 = new r3(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = r3Var2;
            r3Var2.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (lj0Var.isAttachedToWindow()) {
            t3Var.N.a(lj0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, d6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t3Var.g(charSequence, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
