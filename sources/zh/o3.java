package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o3 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new o3());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t61Var.G;
        int i10 = t61Var.z;
        String str = (String) t61Var.l;
        boolean z11 = t61Var.e;
        ak0 ak0Var = p3Var.c;
        n3 n3Var = p3Var.a0;
        if (n3Var == null || p3Var.W != stargiftattributemodel.document.id) {
            p3Var.W = stargiftattributemodel.document.id;
            if (n3Var != null) {
                n3Var.o(ak0Var);
            }
            p3Var.a0 = new n3(3, p3Var.V, stargiftattributemodel.document);
        }
        if (ak0Var.isAttachedToWindow()) {
            p3Var.a0.a(ak0Var);
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
            spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        p3Var.j(charSequence, 0, p3Var.a0);
        p3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new p3(context, i10, u6Var);
    }
}
