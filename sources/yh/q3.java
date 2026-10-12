package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q3 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new q3());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        r3 r3Var = (r3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l61Var.G;
        int i10 = l61Var.z;
        String str = (String) l61Var.l;
        boolean z11 = l61Var.e;
        c6 c6Var = r3Var.F;
        bk0 bk0Var = r3Var.c;
        p3 p3Var = r3Var.N;
        if (p3Var == null || r3Var.M != stargiftattributepattern.document.id) {
            r3Var.M = stargiftattributepattern.document.id;
            if (p3Var != null) {
                p3Var.o(bk0Var);
            }
            p3 p3Var2 = new p3(3, r3Var.L, stargiftattributepattern.document);
            r3Var.N = p3Var2;
            p3Var2.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (bk0Var.isAttachedToWindow()) {
            r3Var.N.a(bk0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, c6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        r3Var.g(charSequence, 0, r3Var.N);
        r3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new r3(context, i10, c6Var);
    }
}
