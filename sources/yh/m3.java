package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m3 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new m3());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) f61Var.G;
        int i10 = f61Var.z;
        String str = (String) f61Var.l;
        boolean z11 = f61Var.e;
        xj0 xj0Var = n3Var.c;
        l3 l3Var = n3Var.N;
        if (l3Var == null || n3Var.M != stargiftattributemodel.document.id) {
            n3Var.M = stargiftattributemodel.document.id;
            if (l3Var != null) {
                l3Var.o(xj0Var);
            }
            n3Var.N = new l3(3, n3Var.L, stargiftattributemodel.document);
        }
        if (xj0Var.isAttachedToWindow()) {
            n3Var.N.a(xj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, n3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        n3Var.g(charSequence, 0, n3Var.N);
        n3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new n3(context, i10, d6Var);
    }
}
