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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class s3 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new s3());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h61Var.G;
        int i10 = h61Var.z;
        String str = (String) h61Var.l;
        boolean z11 = h61Var.e;
        d6 d6Var = t3Var.F;
        nj0 nj0Var = t3Var.c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.id) {
            t3Var.M = stargiftattributepattern.document.id;
            if (r3Var != null) {
                r3Var.o(nj0Var);
            }
            r3 r3Var2 = new r3(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = r3Var2;
            r3Var2.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (nj0Var.isAttachedToWindow()) {
            t3Var.N.a(nj0Var);
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
            spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t3Var.g(charSequence, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
