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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r3 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new r3());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u61Var.G;
        int i10 = u61Var.z;
        String str = (String) u61Var.l;
        boolean z11 = u61Var.e;
        u6 u6Var = s3Var.O;
        bk0 bk0Var = s3Var.c;
        q3 q3Var = s3Var.a0;
        if (q3Var == null || s3Var.W != stargiftattributepattern.document.id) {
            s3Var.W = stargiftattributepattern.document.id;
            if (q3Var != null) {
                q3Var.o(bk0Var);
            }
            q3 q3Var2 = new q3(3, s3Var.V, stargiftattributepattern.document);
            s3Var.a0 = q3Var2;
            f7.y(s3Var, q3Var2, y6.E8, u6Var, PorterDuff.Mode.SRC_IN);
        }
        if (bk0Var.isAttachedToWindow()) {
            s3Var.a0.a(bk0Var);
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
            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        s3Var.j(charSequence, 0, s3Var.a0);
        s3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s3(context, i10, u6Var);
    }
}
