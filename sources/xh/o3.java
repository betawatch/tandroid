package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class o3 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new o3());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) j51Var.G;
        int i10 = j51Var.z;
        String str = (String) j51Var.l;
        boolean z11 = j51Var.e;
        bj0 bj0Var = p3Var.c;
        n3 n3Var = p3Var.N;
        if (n3Var == null || p3Var.M != stargiftattributemodel.document.id) {
            p3Var.M = stargiftattributemodel.document.id;
            if (n3Var != null) {
                n3Var.o(bj0Var);
            }
            p3Var.N = new n3(3, p3Var.L, stargiftattributemodel.document);
        }
        if (bj0Var.isAttachedToWindow()) {
            p3Var.N.a(bj0Var);
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
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        p3Var.g(charSequence, 0, p3Var.N);
        p3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new p3(context, i10, f6Var);
    }
}
