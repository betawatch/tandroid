package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o3 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new o3());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u61Var.G;
        int i10 = u61Var.z;
        String str = (String) u61Var.l;
        boolean z11 = u61Var.e;
        bk0 bk0Var = p3Var.c;
        n3 n3Var = p3Var.a0;
        if (n3Var == null || p3Var.W != stargiftattributemodel.document.id) {
            p3Var.W = stargiftattributemodel.document.id;
            if (n3Var != null) {
                n3Var.o(bk0Var);
            }
            p3Var.a0 = new n3(3, p3Var.V, stargiftattributemodel.document);
        }
        if (bk0Var.isAttachedToWindow()) {
            p3Var.a0.a(bk0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, p3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        p3Var.j(charSequence, 0, p3Var.a0);
        p3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new p3(context, i10, u6Var);
    }
}
