package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r3 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new r3());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t61Var.G;
        int i10 = t61Var.z;
        String str = (String) t61Var.l;
        boolean z11 = t61Var.e;
        u6 u6Var = s3Var.O;
        ak0 ak0Var = s3Var.c;
        q3 q3Var = s3Var.a0;
        if (q3Var == null || s3Var.W != stargiftattributepattern.document.id) {
            s3Var.W = stargiftattributepattern.document.id;
            if (q3Var != null) {
                q3Var.o(ak0Var);
            }
            q3 q3Var2 = new q3(3, s3Var.V, stargiftattributepattern.document);
            s3Var.a0 = q3Var2;
            f7.y(s3Var, q3Var2, y6.E8, u6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ak0Var.isAttachedToWindow()) {
            s3Var.a0.a(ak0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, u6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        s3Var.j(charSequence, 0, s3Var.a0);
        s3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new s3(context, i10, u6Var);
    }
}
