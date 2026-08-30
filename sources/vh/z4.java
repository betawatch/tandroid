package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class z4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new z4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        TL_iv.RichText richText;
        a5 a5Var = (a5) view;
        a aVar = (a) i51Var.G;
        y4 y4Var = (y4) i51Var.H;
        d1 d1Var = a5Var.r;
        a5Var.a = aVar;
        a5Var.s = y4Var;
        a5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        a5Var.c(aVar);
        if (y4Var != null) {
            richText = (TL_iv.RichText) ((x2) y4Var).a.j3.get(Long.valueOf(aVar.t));
        } else {
            richText = null;
        }
        if (String.valueOf(d1Var.getText()).equals(x5.l(richText))) {
            return;
        }
        d1Var.setTextSilently(Emoji.replaceEmoji(x5.r(richText, null, true), d1Var.getPaint().getFontMetricsInt(), false));
        d1Var.invalidateEffects();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new a5(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
