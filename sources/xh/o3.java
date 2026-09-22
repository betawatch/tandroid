package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class o3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new o3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z11 = i51Var.e;
        aj0 aj0Var = p3Var.c;
        n3 n3Var = p3Var.N;
        if (n3Var == null || p3Var.M != stargiftattributemodel.document.id) {
            p3Var.M = stargiftattributemodel.document.id;
            if (n3Var != null) {
                n3Var.o(aj0Var);
            }
            p3Var.N = new n3(3, p3Var.L, stargiftattributemodel.document);
        }
        if (aj0Var.isAttachedToWindow()) {
            p3Var.N.a(aj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, p3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        p3Var.g(charSequence, 0, p3Var.N);
        p3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new p3(context, i10, e6Var);
    }
}
