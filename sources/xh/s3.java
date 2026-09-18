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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class s3 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new s3());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x51Var.G;
        int i10 = x51Var.z;
        String str = (String) x51Var.l;
        boolean z11 = x51Var.e;
        e6 e6Var = t3Var.F;
        lj0 lj0Var = t3Var.c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.id) {
            t3Var.M = stargiftattributepattern.document.id;
            if (r3Var != null) {
                r3Var.o(lj0Var);
            }
            r3 r3Var2 = new r3(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = r3Var2;
            r3Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (lj0Var.isAttachedToWindow()) {
            t3Var.N.a(lj0Var);
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
            spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t3Var.g(charSequence, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new t3(context, i10, e6Var);
    }
}
