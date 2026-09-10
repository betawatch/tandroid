package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n3 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n3());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o3 o3Var = (o3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) v51Var.G;
        int i10 = v51Var.z;
        String str = (String) v51Var.l;
        boolean z11 = v51Var.e;
        kj0 kj0Var = o3Var.c;
        m3 m3Var = o3Var.N;
        if (m3Var == null || o3Var.M != stargiftattributemodel.document.id) {
            o3Var.M = stargiftattributemodel.document.id;
            if (m3Var != null) {
                m3Var.o(kj0Var);
            }
            o3Var.N = new m3(3, o3Var.L, stargiftattributemodel.document);
        }
        if (kj0Var.isAttachedToWindow()) {
            o3Var.N.a(kj0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, o3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        o3Var.g(charSequence, 0, o3Var.N);
        o3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new o3(context, i10, f6Var);
    }
}
