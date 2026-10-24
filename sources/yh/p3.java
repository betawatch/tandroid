package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class p3 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new p3());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) m61Var.G;
        int i10 = m61Var.z;
        String str = (String) m61Var.l;
        boolean z11 = m61Var.e;
        g6 g6Var = q3Var.O;
        bk0 bk0Var = q3Var.c;
        o3 o3Var = q3Var.a0;
        if (o3Var == null || q3Var.W != stargiftattributepattern.document.id) {
            q3Var.W = stargiftattributepattern.document.id;
            if (o3Var != null) {
                o3Var.o(bk0Var);
            }
            o3 o3Var2 = new o3(3, q3Var.V, stargiftattributepattern.document);
            q3Var.a0 = o3Var2;
            r6.z(q3Var, o3Var2, k6.E8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (bk0Var.isAttachedToWindow()) {
            q3Var.a0.a(bk0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, g6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        q3Var.j(charSequence, 0, q3Var.a0);
        q3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new q3(context, i10, g6Var);
    }
}
