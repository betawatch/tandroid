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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class s3 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new s3());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y51Var.G;
        int i10 = y51Var.z;
        String str = (String) y51Var.l;
        boolean z11 = y51Var.e;
        f6 f6Var = t3Var.F;
        nj0 nj0Var = t3Var.c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.id) {
            t3Var.M = stargiftattributepattern.document.id;
            if (r3Var != null) {
                r3Var.o(nj0Var);
            }
            r3 r3Var2 = new r3(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = r3Var2;
            r3Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (nj0Var.isAttachedToWindow()) {
            t3Var.N.a(nj0Var);
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
            spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        t3Var.g(charSequence, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new t3(context, i10, f6Var);
    }
}
