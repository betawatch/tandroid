package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m3 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new m3());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) m61Var.G;
        int i10 = m61Var.z;
        String str = (String) m61Var.l;
        boolean z11 = m61Var.e;
        bk0 bk0Var = n3Var.c;
        l3 l3Var = n3Var.a0;
        if (l3Var == null || n3Var.W != stargiftattributemodel.document.id) {
            n3Var.W = stargiftattributemodel.document.id;
            if (l3Var != null) {
                l3Var.o(bk0Var);
            }
            n3Var.a0 = new l3(3, n3Var.V, stargiftattributemodel.document);
        }
        if (bk0Var.isAttachedToWindow()) {
            n3Var.a0.a(bk0Var);
        }
        CharSequence charSequence = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, n3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        n3Var.j(charSequence, 0, n3Var.a0);
        n3Var.setChecked(z11);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new n3(context, i10, g6Var);
    }
}
